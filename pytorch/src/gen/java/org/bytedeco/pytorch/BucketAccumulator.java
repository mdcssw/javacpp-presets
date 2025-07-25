// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// Local accumulator type for a single bucket.
@Namespace("c10d") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BucketAccumulator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BucketAccumulator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BucketAccumulator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BucketAccumulator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BucketAccumulator position(long position) {
        return (BucketAccumulator)super.position(position);
    }
    @Override public BucketAccumulator getPointer(long i) {
        return new BucketAccumulator((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @Cast("std::vector<size_t>*") SizeTVector indices(); public native BucketAccumulator indices(SizeTVector setter);
  public native @Cast("size_t") long size(); public native BucketAccumulator size(long setter);
  public native @Cast("size_t") long size_limit(); public native BucketAccumulator size_limit(long setter);
}
