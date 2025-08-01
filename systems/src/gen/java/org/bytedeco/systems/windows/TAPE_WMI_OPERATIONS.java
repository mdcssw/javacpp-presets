// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TAPE_WMI_OPERATIONS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TAPE_WMI_OPERATIONS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TAPE_WMI_OPERATIONS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TAPE_WMI_OPERATIONS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TAPE_WMI_OPERATIONS position(long position) {
        return (TAPE_WMI_OPERATIONS)super.position(position);
    }
    @Override public TAPE_WMI_OPERATIONS getPointer(long i) {
        return new TAPE_WMI_OPERATIONS((Pointer)this).offsetAddress(i);
    }

   public native @Cast("DWORD") int Method(); public native TAPE_WMI_OPERATIONS Method(int setter);
   public native @Cast("DWORD") int DataBufferSize(); public native TAPE_WMI_OPERATIONS DataBufferSize(int setter);
   public native @Cast("PVOID") Pointer DataBuffer(); public native TAPE_WMI_OPERATIONS DataBuffer(Pointer setter);
}
