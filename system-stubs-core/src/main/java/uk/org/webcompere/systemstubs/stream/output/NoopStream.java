package uk.org.webcompere.systemstubs.stream.output;

import java.io.OutputStream;

/**
 * An {@link Output} that discards anything written to it. It can be used to mute
 * <code>System.err</code> for example.
 */
public class NoopStream extends OutputStream implements Output<NoopStream> {

    @Override
    public void write(int b) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public NoopStream getOutputStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
