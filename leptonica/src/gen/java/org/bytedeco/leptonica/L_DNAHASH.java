// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


@Name("L_DnaHash") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_DNAHASH extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_DNAHASH() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_DNAHASH(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_DNAHASH(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_DNAHASH position(long position) {
        return (L_DNAHASH)super.position(position);
    }
    @Override public L_DNAHASH getPointer(long i) {
        return new L_DNAHASH((Pointer)this).offsetAddress(i);
    }

    public native @Cast("l_int32") int nbuckets(); public native L_DNAHASH nbuckets(int setter);
    /** initial size of each dna that is made  */
    public native @Cast("l_int32") int initsize(); public native L_DNAHASH initsize(int setter);
    /** array of L_Dna                       */
    public native L_DNA dna(int i); public native L_DNAHASH dna(int i, L_DNA setter);
    public native @Cast("L_Dna**") PointerPointer dna(); public native L_DNAHASH dna(PointerPointer setter);
}
