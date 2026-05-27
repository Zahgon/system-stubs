package uk.org.webcompere.systemstubs.resource;

/**
 * Adds reference counting to the {@link TestResource} interface in case something tries to perform
 * multiple setup or teardown calls on the same resource. Promises only a single instance of the
 * set up at a time.
 * @since 1.0.0
 */
public abstract class SingularTestResource implements TestResource {

    private int refCount = 0;

    @Override
    public void setup() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void teardown() throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Subclass overrides this to provide actual setup
     * @throws Exception on setup error
     */
    protected abstract void doSetup() throws Exception;

    /**
     * Subclass overrides this to provide actual cleanup
     * @throws Exception on clean up error
     */
    protected abstract void doTeardown() throws Exception;

    protected boolean isActive() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
