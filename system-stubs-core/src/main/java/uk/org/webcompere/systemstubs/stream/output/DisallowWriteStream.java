package uk.org.webcompere.systemstubs.stream.output;

import java.io.OutputStream;

/**
 * An {@link Output} that throws an {@link AssertionError} if anything is written.
 * @since 1.0.0
 */
public class DisallowWriteStream extends OutputStream implements Output<DisallowWriteStream> {

    @Override
    public void write(int b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DisallowWriteStream getOutputStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
