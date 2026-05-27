package uk.org.webcompere.systemstubs.stream;

import uk.org.webcompere.systemstubs.ThrowingRunnable;
import uk.org.webcompere.systemstubs.resource.SingularTestResource;
import uk.org.webcompere.systemstubs.stream.input.*;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.System.setIn;

/**
 * A stub that defines the text provided by {@code System.in}. The methods
 * {@link #andExceptionThrownOnInputEnd(IOException)} and
 * {@link #andExceptionThrownOnInputEnd(RuntimeException)} can be used to
 * simulate a {@code System.in} that throws an exception.
 * The specified behaviour of {@code System.in} is applied to an
 * arbitrary piece of code that is provided to {@link #execute(ThrowingRunnable)}.
 * @since 1.0.0
 */
public class SystemIn extends SingularTestResource {

    private InputStream originalIn;

    private AltInputStream altInputStream;

    /**
     * Default constructor for use by reflection
     */
    public SystemIn() {
        this(new String[0]);
    }

    /**
     * Construct with the lines of text to provide as input
     * @param lines lines provided as input using {@link LinesAltStream}
     */
    public SystemIn(String... lines) {
        this(new LinesAltStream(lines));
    }

    /**
     * Construct with a specific input stream - e.g. a FileInputStream
     * @param inputStream the input stream to route to System in
     */
    public SystemIn(InputStream inputStream) {
        this(new DecoratingAltStream(inputStream));
    }

    /**
     * Construct with an {@link AltInputStream} - e.g. a {@link TextAltStream}
     * or custom provider of input.
     * @param altInputStream the stream ot use
     */
    public SystemIn(AltInputStream altInputStream) {
        this.altInputStream = altInputStream;
    }

    /**
     * Fluent setter to set the input stream
     * @param inputStream stream to use
     * @return <code>this</code> for fluent use
     */
    public SystemIn setInputStream(InputStream inputStream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Fluent setter to set the input stream
     * @param altInputStream stream to use
     * @return <code>this</code> for fluent use
     */
    public SystemIn setInputStream(AltInputStream altInputStream) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets an exception that is thrown after the text is read.
     * @param exception the {@code IOException} to be thrown.
     * @return the {@code SystemInStub} itself.
     * @throws IllegalStateException if a {@code RuntimeException} was
     *     already set by {@link #andExceptionThrownOnInputEnd(RuntimeException)}
     */
    public SystemIn andExceptionThrownOnInputEnd(IOException exception) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets an exception that is thrown after the text is read.
     * @param exception the {@code RuntimeException} to be thrown.
     * @return the {@code SystemInStub} itself.
     * @throws IllegalStateException if an {@code IOException} was already
     *     set by {@link #andExceptionThrownOnInputEnd(IOException)}
     */
    public SystemIn andExceptionThrownOnInputEnd(RuntimeException exception) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void doSetup() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void doTeardown() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
