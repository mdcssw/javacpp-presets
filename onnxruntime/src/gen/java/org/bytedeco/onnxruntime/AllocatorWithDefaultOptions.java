// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;
  // namespace detail

/** \brief Wrapper around ::OrtAllocator default instance that is owned by Onnxruntime
 *
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class AllocatorWithDefaultOptions extends AllocatorWithDefaultOptionsImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorWithDefaultOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocatorWithDefaultOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AllocatorWithDefaultOptions position(long position) {
        return (AllocatorWithDefaultOptions)super.position(position);
    }
    @Override public AllocatorWithDefaultOptions getPointer(long i) {
        return new AllocatorWithDefaultOptions((Pointer)this).offsetAddress(i);
    }

  public AllocatorWithDefaultOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
}
