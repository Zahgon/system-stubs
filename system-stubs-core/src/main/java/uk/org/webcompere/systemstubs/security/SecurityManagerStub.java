package uk.org.webcompere.systemstubs.security;

import uk.org.webcompere.systemstubs.resource.SingularTestResource;
import java.util.concurrent.Callable;

/**
 * Switch the security manager for an alternative
 * @since 1.0.0
 */
public class SecurityManagerStub<T extends SecurityManager> extends SingularTestResource {

    private SecurityManager originalSecurityManager;

    private T securityManager;

    /**
     * Default constructor for subclasses that will provide a create method on the fly
     */
    public SecurityManagerStub() {
        this(null);
    }

    /**
     * Construct with the security manager to substitute. If null, then one will be created using
     * the factory method at setup time.
     * @param securityManager a security manager to use while active
     */
    public SecurityManagerStub(T securityManager) {
        this.securityManager = securityManager;
    }

    /**
     * Get the security manager that this class uses when active
     * @return the security manager
     */
    public T getSecurityManager() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Called if we need to wipe the current security manager
     */
    protected void clearSecurityManager() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set the current security manager
     * @param securityManager the manager to set
     */
    public void setSecurityManager(T securityManager) {
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

    /**
     * Override to create a specific security manager
     * @return a new security manager - can be null
     */
    protected T createSecurityManager() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Overridden to notice the abort exception that marks exit tests and others where we
     * want to tap into a stop in processing to find the exit code etc.
     * @param callable the callable to execute
     * @param <R> return type
     * @return the result of the callable or null if there was an early abort
     * @throws Exception on exceptions that are not {@link AbortExecutionException}
     */
    @Override
    public <R> R execute(Callable<R> callable) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
