package uk.org.webcompere.systemstubs.stream.output;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * A composite output which directs to multiple targets. It reads text from only the first. It is, itself
 * an {@link OutputStream}
 */
public class MultiplexOutput extends OutputStream implements Output<MultiplexOutput> {

    private Output<?>[] outputs;

    /**
     * Construct with a variable number of outputs to multiplex to
     * @param first the first output
     * @param others additional outputs
     */
    public MultiplexOutput(Output<?> first, Output<?>... others) {
        outputs = Stream.concat(Stream.of(first), Arrays.stream(others)).toArray(Output[]::new);
    }

    @Override
    public void write(int b) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getText() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void close() throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void closeOutput() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public MultiplexOutput getOutputStream() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
