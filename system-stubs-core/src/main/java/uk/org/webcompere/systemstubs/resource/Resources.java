package uk.org.webcompere.systemstubs.resource;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * Helper functions for test resources
 */
public class Resources {

    /**
     * Use the execute around idiom with multiple resources
     * @param resources the resources to wrap around the test, in the order to set them up
     * @param <T> the return type
     * @return an {@link Executable} with the {@link Executable#execute} methods on it
     */
    public static <T> Executable with(TestResource... resources) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The execute-around idiom. Prepares a resource, runs the resources and then cleans up. The resources
     * are set up in the order of declaration and tidied in reverse order. Any failure during set up results in
     * a corresponding teardown operation, just in case, but only for those resources that have been set up so far.
     * @param callable the item to run
     * @param resources the resources to set up
     * @throws Exception on error
     */
    public static <T> T execute(Callable<T> callable, TestResource... resources) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Clean up all of the resources provided, tolerating exceptions in any of them and throwing
     * at the end if necessary
     * @param resourcesSetUp the list of resources in the order to clean them up
     * @throws Exception on the first teardown error
     */
    public static void executeCleanup(List<TestResource> resourcesSetUp) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
