// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Contains the power management limit
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlPowerValue_v2_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlPowerValue_v2_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlPowerValue_v2_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlPowerValue_v2_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlPowerValue_v2_t position(long position) {
        return (nvmlPowerValue_v2_t)super.position(position);
    }
    @Override public nvmlPowerValue_v2_t getPointer(long i) {
        return new nvmlPowerValue_v2_t((Pointer)this).offsetAddress(i);
    }

    /** Structure format version (must be 1) */
    public native @Cast("unsigned int") int version(); public native nvmlPowerValue_v2_t version(int setter);
    /** [in]  Device type: GPU or Total Module */
    public native @Cast("nvmlPowerScopeType_t") byte powerScope(); public native nvmlPowerValue_v2_t powerScope(byte setter);
    /** [out] Power value to retrieve or set in milliwatts */
    public native @Cast("unsigned int") int powerValueMw(); public native nvmlPowerValue_v2_t powerValueMw(int setter);
}
