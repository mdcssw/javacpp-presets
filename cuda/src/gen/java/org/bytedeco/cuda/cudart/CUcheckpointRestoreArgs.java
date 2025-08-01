// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA checkpoint optional restore arguments
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUcheckpointRestoreArgs extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUcheckpointRestoreArgs() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUcheckpointRestoreArgs(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUcheckpointRestoreArgs(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUcheckpointRestoreArgs position(long position) {
        return (CUcheckpointRestoreArgs)super.position(position);
    }
    @Override public CUcheckpointRestoreArgs getPointer(long i) {
        return new CUcheckpointRestoreArgs((Pointer)this).offsetAddress(i);
    }

    /** Reserved for future use, must be zeroed */
    public native @Cast("cuuint64_t") long reserved(int i); public native CUcheckpointRestoreArgs reserved(int i, long setter);
    @MemberGetter public native @Cast("cuuint64_t*") LongPointer reserved();
}
