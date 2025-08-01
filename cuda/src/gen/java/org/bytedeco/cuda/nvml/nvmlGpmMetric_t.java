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
 * GPM metric information.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpmMetric_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGpmMetric_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGpmMetric_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpmMetric_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGpmMetric_t position(long position) {
        return (nvmlGpmMetric_t)super.position(position);
    }
    @Override public nvmlGpmMetric_t getPointer(long i) {
        return new nvmlGpmMetric_t((Pointer)this).offsetAddress(i);
    }

    /**  IN: NVML_GPM_METRIC_? define of which metric to retrieve */
    public native @Cast("unsigned int") int metricId(); public native nvmlGpmMetric_t metricId(int setter);
    /**  OUT: Status of this metric. If this is nonzero, then value is not valid */
    public native @Cast("nvmlReturn_t") int nvmlReturn(); public native nvmlGpmMetric_t nvmlReturn(int setter);
    /**  OUT: Value of this metric. Is only valid if nvmlReturn is 0 (NVML_SUCCESS) */
    public native double value(); public native nvmlGpmMetric_t value(double setter);
        @Name("metricInfo.shortName") public native @Cast("char*") BytePointer metricInfo_shortName(); public native nvmlGpmMetric_t metricInfo_shortName(BytePointer setter);
        @Name("metricInfo.longName") public native @Cast("char*") BytePointer metricInfo_longName(); public native nvmlGpmMetric_t metricInfo_longName(BytePointer setter);
        @Name("metricInfo.unit") public native @Cast("char*") BytePointer metricInfo_unit(); public native nvmlGpmMetric_t metricInfo_unit(BytePointer setter);
}
