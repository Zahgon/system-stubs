package uk.org.webcompere.systemstubs.stream.output;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

/**
 * TapStream is a {@link ByteArrayOutputStream} that satisfies the {@link Output}
 * interface too.
 */
public class TapStream extends ByteArrayOutputStream implements Output<TapStream> {

    @Override
    public String getText() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public TapStream getOutputStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
