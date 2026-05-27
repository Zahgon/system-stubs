package uk.org.webcompere.systemstubs;

import uk.org.webcompere.systemstubs.exception.WrappedThrowable;
import java.util.concurrent.Callable;

/**
 * Code that can be executed by one of the methods of {@link SystemStubs}.
 * This code may throw an {@link Exception}. Therefore we cannot use
 * {@link Runnable}.
 * @since 1.0.0
 */
public interface ThrowingRunnable {

    /**
     * Execute the action.
     *
     * @throws Exception the action may throw an arbitrary exception.
     */
    void run() throws Throwable;

    /**
     * Convert this to a Callable
     * @return a {@link Callable} which executes this
     */
    default Callable<Void> asCallable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Convert a lambda of type runnable to Callable
     * @param runnable a runnable that can be converted
     * @return a {@link Callable}
     * @since 1.0.0
     */
    static Callable<Void> asCallable(ThrowingRunnable runnable) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
