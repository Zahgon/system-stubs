package uk.org.webcompere.systemstubs.stream.input;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;
import static java.lang.System.lineSeparator;

/**
 * Monitor a stream and throw an exception if a read operation occurs after the last
 * character of the stream. This slices the buffer into segments with whole lines in, to avoid
 * read-ahead scanners from hitting the error too soon. Decorator/chain of responsibility pattern.
 */
public class ThrowAtEndStream extends DecoratingAltStream {

    private IOException ioException;

    private RuntimeException runtimeException;

    /**
     * Construct to decorate another stream
     * @param decoratee real source of the bytes
     * @param ioException the {@link IOException} to throw when running out of data
     */
    @SuppressFBWarnings("EI_EXPOSE_REP2")
    public ThrowAtEndStream(AltInputStream decoratee, IOException ioException) {
        super(decoratee);
        this.ioException = Objects.requireNonNull(ioException);
    }

    /**
     * Construct to decorate another stream
     * @param decoratee real source of the bytes
     * @param runtimeException the {@link RuntimeException} to throw when running out of data
     */
    @SuppressFBWarnings("EI_EXPOSE_REP2")
    public ThrowAtEndStream(AltInputStream decoratee, RuntimeException runtimeException) {
        super(decoratee);
        this.runtimeException = Objects.requireNonNull(runtimeException);
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read(byte[] buffer, int offset, int len) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int readNextLine(byte[] buffer, int offset, int len) throws IOException {
        byte[] lineSeparator = lineSeparator().getBytes(Charset.defaultCharset());
        int writeLocation = offset;
        while ((writeLocation - offset) < len) {
            int next = read();
            if (next == -1) {
                return writeLocation == offset ? -1 : writeLocation - offset;
            }
            buffer[writeLocation] = (byte) (next & 0xff);
            writeLocation++;
            if (reachedLineEnd(buffer, offset, writeLocation, lineSeparator)) {
                break;
            }
        }
        return writeLocation - offset;
    }

    private boolean reachedLineEnd(byte[] buffer, int bufferStart, int bufferEnd, byte[] lineSeparator) {
        if (bufferEnd - bufferStart < lineSeparator.length) {
            return false;
        }
        for (int i = 0; i < lineSeparator.length; i++) {
            if (buffer[(bufferEnd - lineSeparator.length) + i] != lineSeparator[i]) {
                return false;
            }
        }
        return true;
    }

    private void throwException() throws IOException {
        if (ioException != null) {
            throw ioException;
        }
        throw runtimeException;
    }
}
