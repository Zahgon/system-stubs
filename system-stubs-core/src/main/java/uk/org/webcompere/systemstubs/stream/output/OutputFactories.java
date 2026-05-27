package uk.org.webcompere.systemstubs.stream.output;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.stream.Stream;
import static uk.org.webcompere.systemstubs.stream.output.Output.fromStream;

/**
 * Common output scenarios, creating an output factory or output.
 */
public class OutputFactories {

    /**
     * Construct an output made of multiple others with no dependency on the previous output stream
     * @param first the first output to multiplex
     * @param others the others
     * @return an {@link Output} which multiplexes
     */
    public static Output<MultiplexOutput> ofMultiple(Output<?> first, Output<?>... others) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Construct an output made of multiple others with no dependency on the previous output stream
     * @param first the first output to multiplex
     * @param others the others
     * @return an {@link Output} which multiplexes
     */
    public static OutputFactory<MultiplexOutput> ofMultiple(OutputFactory<?> first, OutputFactory<?>... others) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Construct a multiplexed output made of the provided outputs, adding the original stream on the end.
     * @param first the first output to multiplex
     * @param others the others
     * @return an {@link OutputFactory} which produces a multiplexed output, which includes the previous setting for
     *      the <code>System.out</code> or <code>System.err</code> allowing a tap alongside the original
     */
    public static OutputFactory<MultiplexOutput> ofMultiplePlusOriginal(OutputFactory<?> first, OutputFactory<?>... others) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Construct a multiplexed output made of the provided outputs, adding the original stream on the end.
     * @param first the first output to multiplex
     * @param others the others
     * @return an {@link OutputFactory} which produces a multiplexed output, which includes the previous setting for
     *      the <code>System.out</code> or <code>System.err</code> allowing a tap alongside the original
     */
    public static OutputFactory<MultiplexOutput> ofMultiplePlusOriginal(Output<?> first, Output<?>... others) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Tap an output while still using the original output
     * @return an {@link OutputFactory} which performs a tap
     */
    public static OutputFactory<MultiplexOutput> tapAndOutput() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Write to file when the output is active, closing it when it's deactivated
     * @param file the target file for writing to
     */
    public static OutputFactory<FileOutputStream> writeToFile(File file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
