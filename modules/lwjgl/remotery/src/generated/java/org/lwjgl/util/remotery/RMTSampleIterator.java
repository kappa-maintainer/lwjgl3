/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Struct to hold iterator info.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct rmtSampleIterator {
 *     rmtSample * sample;
 *     rmtSample * initial;
 * }</code></pre>
 */
@NativeType("struct rmtSampleIterator")
public class RMTSampleIterator extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SAMPLE,
        INITIAL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SAMPLE = layout.offsetof(0);
        INITIAL = layout.offsetof(1);
    }

    /**
     * Creates a {@code RMTSampleIterator} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTSampleIterator(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sample} field. */
    @NativeType("rmtSample *")
    public long sample() { return nsample(address()); }

    // -----------------------------------

    /** Returns a new {@code RMTSampleIterator} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTSampleIterator malloc() {
        return wrap(RMTSampleIterator.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code RMTSampleIterator} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTSampleIterator calloc() {
        return wrap(RMTSampleIterator.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code RMTSampleIterator} instance allocated with {@link BufferUtils}. */
    public static RMTSampleIterator create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(RMTSampleIterator.class, memAddress(container), container);
    }

    /** Returns a new {@code RMTSampleIterator} instance for the specified memory address. */
    public static RMTSampleIterator create(long address) {
        return wrap(RMTSampleIterator.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RMTSampleIterator createSafe(long address) {
        return address == NULL ? null : wrap(RMTSampleIterator.class, address);
    }

    /**
     * Returns a new {@code RMTSampleIterator} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSampleIterator malloc(MemoryStack stack) {
        return wrap(RMTSampleIterator.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code RMTSampleIterator} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTSampleIterator calloc(MemoryStack stack) {
        return wrap(RMTSampleIterator.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    // -----------------------------------

    /** Unsafe version of {@link #sample}. */
    public static long nsample(long struct) { return memGetAddress(struct + RMTSampleIterator.SAMPLE); }
    public static long ninitial(long struct) { return memGetAddress(struct + RMTSampleIterator.INITIAL); }

}