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
 * nvmlSystemRegisterEventRequest
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlSystemRegisterEventRequest_v1_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlSystemRegisterEventRequest_v1_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlSystemRegisterEventRequest_v1_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlSystemRegisterEventRequest_v1_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlSystemRegisterEventRequest_v1_t position(long position) {
        return (nvmlSystemRegisterEventRequest_v1_t)super.position(position);
    }
    @Override public nvmlSystemRegisterEventRequest_v1_t getPointer(long i) {
        return new nvmlSystemRegisterEventRequest_v1_t((Pointer)this).offsetAddress(i);
    }

    /** the API version number */
    public native @Cast("unsigned int") int version(); public native nvmlSystemRegisterEventRequest_v1_t version(int setter);
    /** Bitmask of \ref nvmlEventType to record
     *  For example eventTypes = (nvmlEventTypeBind | nvmlEventTypeUnbind)
     *  to listen to both Bind and Unbind events. */
    public native @Cast("unsigned long long") long eventTypes(); public native nvmlSystemRegisterEventRequest_v1_t eventTypes(long setter);
    /** Set to which add new event types */
    public native nvmlSystemEventSet_st set(); public native nvmlSystemRegisterEventRequest_v1_t set(nvmlSystemEventSet_st setter);
}
