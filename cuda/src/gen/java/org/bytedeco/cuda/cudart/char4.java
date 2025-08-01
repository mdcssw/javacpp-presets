// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class char4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public char4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public char4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public char4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public char4 position(long position) {
        return (char4)super.position(position);
    }
    @Override public char4 getPointer(long i) {
        return new char4((Pointer)this).offsetAddress(i);
    }

    public native byte x(); public native char4 x(byte setter);
    public native byte y(); public native char4 y(byte setter);
    public native byte z(); public native char4 z(byte setter);
    public native byte w(); public native char4 w(byte setter);
}
