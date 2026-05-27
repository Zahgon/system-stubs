package uk.org.webcompere.systemstubs.internal;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.*;
import static java.util.stream.Collectors.toSet;

/**
 * Plugs into the boot loader to provide an alternative implementation to ProcessEnvironment
 * controllable at test time.
 */
public class ProcessEnvironmentInterceptor {

    private static Map<String, String> CURRENT_ENVIRONMENT_VARIABLES = new HashMap<>();

    @SuppressFBWarnings("URF_UNREAD_FIELD")
    private static Map<String, String> theEnvironment;

    /**
     * For use by the EnvironmentMocker - this overwrites the effective environment variables that the system
     * appears to have.
     * @param env the environment variable map to use - this is kept by reference and so is mutable
     */
    @SuppressFBWarnings("EI_EXPOSE_STATIC_REP2")
    public static void setEnv(Map<String, String> env) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * The equivalent of <code>getenv</code> in the original ProcessEnvironment, assuming that
     * mocking is "turned on"
     * @return the current effective environment
     */
    @SuppressFBWarnings("MS_EXPOSE_REP")
    public static Map<String, String> getenv() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get a single environment variable
     * @param name name of the variable
     * @return the value or null
     */
    public static String getenv(String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Reads the environment variables as does getenv - a different part of
     * ProcessEnvironment that we're stubbing
     * @return the environment map
     */
    public static Map<String, String> environment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Ripped from the JDK implementation
     * @param m the map to convert
     * @return string representation
     */
    public static String toEnvironmentBlock(Map<String, String> m) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Convert the requested environment variables to a Nix format
     * @param m the map of variables
     * @param envc the target array to receive the size
     * @return the byte array of environment variables
     */
    // code taken from the original in ProcessEnvironment
    @SuppressFBWarnings({ "PZLA_PREFER_ZERO_LENGTH_ARRAYS", "DM_DEFAULT_ENCODING" })
    public static byte[] toEnvironmentBlock(Map<String, String> m, int[] envc) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static Map<String, String> filterNulls(Map<String, String> currentMockedEnvironment) {
        var nullsToRemove = currentMockedEnvironment.entrySet().stream().filter(entry -> entry.getValue() == null).map(Map.Entry::getKey).collect(toSet());
        nullsToRemove.forEach(currentMockedEnvironment::remove);
        return currentMockedEnvironment;
    }

    @SuppressFBWarnings("SE_COMPARATOR_SHOULD_BE_SERIALIZABLE")
    private static final class NameComparator implements Comparator<String> {

        public int compare(String s1, String s2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public static int compareNames(String s1, String s2) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    // add the environment variable to the child, if it exists in parent
    private static void addToEnvIfSet(StringBuilder sb, String name) {
        String s = getenv().get(name);
        if (s != null) {
            addToEnv(sb, name, s);
        }
    }

    private static void addToEnv(StringBuilder sb, String name, String val) {
        sb.append(name).append('=').append(val).append('\u0000');
    }
}
