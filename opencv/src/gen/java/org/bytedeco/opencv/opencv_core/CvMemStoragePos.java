// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvMemStoragePos extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvMemStoragePos() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvMemStoragePos(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvMemStoragePos(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvMemStoragePos position(long position) {
        return (CvMemStoragePos)super.position(position);
    }
    @Override public CvMemStoragePos getPointer(long i) {
        return new CvMemStoragePos((Pointer)this).offsetAddress(i);
    }

    public native CvMemBlock top(); public native CvMemStoragePos top(CvMemBlock setter);
    public native int free_space(); public native CvMemStoragePos free_space(int setter);
}
