/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * See {@link VkCopyBufferInfo2}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkCopyBufferInfo2KHR {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBuffer srcBuffer;
 *     VkBuffer dstBuffer;
 *     uint32_t regionCount;
 *     {@link VkBufferCopy2 VkBufferCopy2} const * pRegions;
 * }</code></pre>
 */
public class VkCopyBufferInfo2KHR extends VkCopyBufferInfo2 {

    protected VkCopyBufferInfo2KHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkCopyBufferInfo2KHR create(long address, @Nullable ByteBuffer container) {
        return new VkCopyBufferInfo2KHR(address, container);
    }

    /**
     * Creates a {@code VkCopyBufferInfo2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkCopyBufferInfo2KHR(ByteBuffer container) {
        super(container);
    }

    /** Sets the specified value to the {@code sType} field. */
    @Override
    public VkCopyBufferInfo2KHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2} value to the {@code sType} field. */
    @Override
    public VkCopyBufferInfo2KHR sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2); }
    /** Sets the specified value to the {@code pNext} field. */
    @Override
    public VkCopyBufferInfo2KHR pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code srcBuffer} field. */
    @Override
    public VkCopyBufferInfo2KHR srcBuffer(@NativeType("VkBuffer") long value) { nsrcBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code dstBuffer} field. */
    @Override
    public VkCopyBufferInfo2KHR dstBuffer(@NativeType("VkBuffer") long value) { ndstBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkBufferCopy2.Buffer} to the {@code pRegions} field. */
    @Override
    public VkCopyBufferInfo2KHR pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) { npRegions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    @Override
    public VkCopyBufferInfo2KHR set(
        int sType,
        long pNext,
        long srcBuffer,
        long dstBuffer,
        VkBufferCopy2.Buffer pRegions
    ) {
        sType(sType);
        pNext(pNext);
        srcBuffer(srcBuffer);
        dstBuffer(dstBuffer);
        pRegions(pRegions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkCopyBufferInfo2KHR set(VkCopyBufferInfo2KHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkCopyBufferInfo2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkCopyBufferInfo2KHR malloc() {
        return new VkCopyBufferInfo2KHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferInfo2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkCopyBufferInfo2KHR calloc() {
        return new VkCopyBufferInfo2KHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkCopyBufferInfo2KHR} instance allocated with {@link BufferUtils}. */
    public static VkCopyBufferInfo2KHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCopyBufferInfo2KHR(memAddress(container), container);
    }

    /** Returns a new {@code VkCopyBufferInfo2KHR} instance for the specified memory address. */
    public static VkCopyBufferInfo2KHR create(long address) {
        return new VkCopyBufferInfo2KHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyBufferInfo2KHR createSafe(long address) {
        return address == NULL ? null : new VkCopyBufferInfo2KHR(address, null);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2KHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2KHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2KHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2KHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkCopyBufferInfo2KHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2KHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkCopyBufferInfo2KHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkCopyBufferInfo2KHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferInfo2KHR malloc(MemoryStack stack) {
        return new VkCopyBufferInfo2KHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkCopyBufferInfo2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkCopyBufferInfo2KHR calloc(MemoryStack stack) {
        return new VkCopyBufferInfo2KHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2KHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkCopyBufferInfo2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkCopyBufferInfo2KHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** An array of {@link VkCopyBufferInfo2KHR} structs. */
    public static class Buffer extends VkCopyBufferInfo2.Buffer {

        private static final VkCopyBufferInfo2KHR ELEMENT_FACTORY = VkCopyBufferInfo2KHR.create(-1L);

        /**
         * Creates a new {@code VkCopyBufferInfo2KHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkCopyBufferInfo2KHR#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkCopyBufferInfo2KHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Sets the specified value to the {@code sType} field. */
        @Override
        public VkCopyBufferInfo2KHR.Buffer sType(@NativeType("VkStructureType") int value) { VkCopyBufferInfo2KHR.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2 STRUCTURE_TYPE_COPY_BUFFER_INFO_2} value to the {@code sType} field. */
        @Override
        public VkCopyBufferInfo2KHR.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2); }
        /** Sets the specified value to the {@code pNext} field. */
        @Override
        public VkCopyBufferInfo2KHR.Buffer pNext(@NativeType("void const *") long value) { VkCopyBufferInfo2KHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code srcBuffer} field. */
        @Override
        public VkCopyBufferInfo2KHR.Buffer srcBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferInfo2KHR.nsrcBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code dstBuffer} field. */
        @Override
        public VkCopyBufferInfo2KHR.Buffer dstBuffer(@NativeType("VkBuffer") long value) { VkCopyBufferInfo2KHR.ndstBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkBufferCopy2.Buffer} to the {@code pRegions} field. */
        @Override
        public VkCopyBufferInfo2KHR.Buffer pRegions(@NativeType("VkBufferCopy2 const *") VkBufferCopy2.Buffer value) { VkCopyBufferInfo2KHR.npRegions(address(), value); return this; }

    }

}