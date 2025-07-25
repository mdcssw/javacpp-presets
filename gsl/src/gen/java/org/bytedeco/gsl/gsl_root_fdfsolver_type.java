// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_root_fdfsolver_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_root_fdfsolver_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_root_fdfsolver_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_root_fdfsolver_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_root_fdfsolver_type position(long position) {
        return (gsl_root_fdfsolver_type)super.position(position);
    }
    @Override public gsl_root_fdfsolver_type getPointer(long i) {
        return new gsl_root_fdfsolver_type((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native gsl_root_fdfsolver_type name(BytePointer setter);
    public native @Cast("size_t") long size(); public native gsl_root_fdfsolver_type size(long setter);
    public static class Set_Pointer_gsl_function_fdf_DoublePointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Set_Pointer_gsl_function_fdf_DoublePointer(Pointer p) { super(p); }
        protected Set_Pointer_gsl_function_fdf_DoublePointer() { allocate(); }
        private native void allocate();
        public native int call(Pointer state, gsl_function_fdf f, DoublePointer root);
    }
    public native Set_Pointer_gsl_function_fdf_DoublePointer set(); public native gsl_root_fdfsolver_type set(Set_Pointer_gsl_function_fdf_DoublePointer setter);
    public static class Iterate_Pointer_gsl_function_fdf_DoublePointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Iterate_Pointer_gsl_function_fdf_DoublePointer(Pointer p) { super(p); }
        protected Iterate_Pointer_gsl_function_fdf_DoublePointer() { allocate(); }
        private native void allocate();
        public native int call(Pointer state, gsl_function_fdf f, DoublePointer root);
    }
    public native Iterate_Pointer_gsl_function_fdf_DoublePointer iterate(); public native gsl_root_fdfsolver_type iterate(Iterate_Pointer_gsl_function_fdf_DoublePointer setter);
  }
