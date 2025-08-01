// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cupti;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.cupti.*;


/**
 * \brief The activity record for global/device functions.
 *
 * This activity records function name and corresponding module
 * information.
 * (CUPTI_ACTIVITY_KIND_FUNCTION).
 */
@Properties(inherit = org.bytedeco.cuda.presets.cupti.class)
public class CUpti_ActivityFunction extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUpti_ActivityFunction() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUpti_ActivityFunction(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUpti_ActivityFunction(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUpti_ActivityFunction position(long position) {
        return (CUpti_ActivityFunction)super.position(position);
    }
    @Override public CUpti_ActivityFunction getPointer(long i) {
        return new CUpti_ActivityFunction((Pointer)this).offsetAddress(i);
    }

  /**
   * The activity record kind, must be CUPTI_ACTIVITY_KIND_FUNCTION.
   */
  public native @Cast("CUpti_ActivityKind") int kind(); public native CUpti_ActivityFunction kind(int setter);

  /**
  * ID to uniquely identify the record
  */
  public native @Cast("uint32_t") int id(); public native CUpti_ActivityFunction id(int setter);

  /**
   * The ID of the context where the function is launched.
   */
  public native @Cast("uint32_t") int contextId(); public native CUpti_ActivityFunction contextId(int setter);

  /**
   * The module ID in which this global/device function is present.
   */
  public native @Cast("uint32_t") int moduleId(); public native CUpti_ActivityFunction moduleId(int setter);

  /**
   * The function's unique symbol index in the module.
   */
  public native @Cast("uint32_t") int functionIndex(); public native CUpti_ActivityFunction functionIndex(int setter);

// #ifdef CUPTILP64
  /**
   * Undefined. Reserved for internal use.
   */
  public native @Cast("uint32_t") int pad(); public native CUpti_ActivityFunction pad(int setter);
// #endif

  /**
   * The name of the function. This name is shared across all activity
   * records representing the same kernel, and so should not be
   * modified.
   */
  public native @Cast("const char*") BytePointer name(); public native CUpti_ActivityFunction name(BytePointer setter);
}
