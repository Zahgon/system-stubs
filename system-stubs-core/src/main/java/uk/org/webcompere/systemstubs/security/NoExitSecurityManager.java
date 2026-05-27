package uk.org.webcompere.systemstubs.security;

import java.io.FileDescriptor;
import java.net.InetAddress;
import java.security.Permission;

/**
 * A {@code NoExitSecurityManager} throws a {@link AbortExecutionException}
 * exception whenever {@link #checkExit(int)} is called. All other method
 * calls are delegated to the original security manager.
 * @since 1.0.0
 */
public class NoExitSecurityManager extends SecurityManager {

    private final SecurityManager originalSecurityManager;

    private Integer statusOfFirstExitCall = null;

    public NoExitSecurityManager(SecurityManager originalSecurityManager) {
        this.originalSecurityManager = originalSecurityManager;
    }

    @Override
    public void checkExit(int status) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isCheckExitCalled() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Validate that a system exit was called. Throws an AssertionError if not
     * @return the exit code
     */
    public int checkSystemExit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get the exit code if there was one
     * @return the exit code
     */
    public Integer getExitCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private int getStatusOfFirstCheckExitCall() {
        if (isCheckExitCalled()) {
            return statusOfFirstExitCall;
        }
        throw new IllegalStateException("checkExit(int) has not been called.");
    }

    @Override
    public Object getSecurityContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkPermission(Permission perm) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkPermission(Permission perm, Object context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkCreateClassLoader() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkAccess(Thread t) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkAccess(ThreadGroup g) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkExec(String cmd) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkLink(String lib) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkRead(FileDescriptor fd) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkRead(String file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkRead(String file, Object context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkWrite(FileDescriptor fd) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkWrite(String file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkDelete(String file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkConnect(String host, int port) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkConnect(String host, int port, Object context) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkListen(int port) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkAccept(String host, int port) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkMulticast(InetAddress maddr) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkMulticast(InetAddress maddr, byte ttl) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkPropertiesAccess() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkPropertyAccess(String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkPrintJobAccess() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkPackageAccess(String pkg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkPackageDefinition(String pkg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkSetFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void checkSecurityAccess(String target) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ThreadGroup getThreadGroup() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
