// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _longobject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _longobject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _longobject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _longobject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _longobject position(long position) {
        return (_longobject)super.position(position);
    }
    @Override public _longobject getPointer(long i) {
        return new _longobject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native _longobject ob_base(PyObject setter);
    public native @ByRef _PyLongValue long_value(); public native _longobject long_value(_PyLongValue setter);
}
