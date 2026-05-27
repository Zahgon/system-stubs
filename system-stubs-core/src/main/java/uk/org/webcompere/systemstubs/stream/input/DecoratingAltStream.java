package uk.org.webcompere.systemstubs.stream.input;

import java.io.IOException;
import java.io.InputStream;

/**
 * Decorates one stream by delegating to another
 */
public class DecoratingAltStream extends AltInputStream {

    private InputStream decoratee;

    /**
     * Construct the stream with the decoratee
     * @param decoratee the input stream that will be read from
     */
    public DecoratingAltStream(InputStream decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean contains(Class<? extends InputStream> stream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
