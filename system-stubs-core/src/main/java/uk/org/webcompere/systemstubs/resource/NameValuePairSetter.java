package uk.org.webcompere.systemstubs.resource;

import java.util.Map;
import java.util.Properties;

/**
 * The general interface of something that can set name value pairs on itself
 * @param <T> the final type of the class which provides this
 */
public interface NameValuePairSetter<T extends NameValuePairSetter<T>> {

    /**
     * Set a name value pair
     * @param name the name
     * @param value the value
     * @return <code>this</code> for fluent calling
     */
    T set(String name, String value);

    /**
     * Set many name value pairs at once
     * @param nameValuePairs an even number of inputs, whose {@link Object#toString()} is used for each name/value
     * @return <code>this</code> for fluent calling
     */
    @SuppressWarnings("unchecked")
    default T set(Object... nameValuePairs) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Set from a collection of properties. Use with {@link PropertySource#fromFile} for example.
     * @param properties a map of values, or {@link Properties} object
     * @return <code>this</code> for fluent calling
     */
    @SuppressWarnings("unchecked")
    default T set(Map<Object, Object> properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Remove one of the name value pairs
     * @param name the name
     * @return <code>this</code> for fluent calling
     */
    T remove(String name);
}
