// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


// If this structure is modified, Doc/includes/typestruct.h should be updated
// as well.
@Name("_typeobject") @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyTypeObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyTypeObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyTypeObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyTypeObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyTypeObject position(long position) {
        return (PyTypeObject)super.position(position);
    }
    @Override public PyTypeObject getPointer(long i) {
        return new PyTypeObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyVarObject ob_base(); public native PyTypeObject ob_base(PyVarObject setter);
    public native @Cast("const char*") BytePointer tp_name(); public native PyTypeObject tp_name(BytePointer setter); /* For printing, in format "<module>.<name>" */
    public native @Cast("Py_ssize_t") long tp_basicsize(); public native PyTypeObject tp_basicsize(long setter);
    public native @Cast("Py_ssize_t") long tp_itemsize(); public native PyTypeObject tp_itemsize(long setter); /* For allocation */

    /* Methods to implement standard operations */

    public native destructor tp_dealloc(); public native PyTypeObject tp_dealloc(destructor setter);
    public native @Cast("Py_ssize_t") long tp_vectorcall_offset(); public native PyTypeObject tp_vectorcall_offset(long setter);
    public native getattrfunc tp_getattr(); public native PyTypeObject tp_getattr(getattrfunc setter);
    public native setattrfunc tp_setattr(); public native PyTypeObject tp_setattr(setattrfunc setter);
    public native PyAsyncMethods tp_as_async(); public native PyTypeObject tp_as_async(PyAsyncMethods setter); /* formerly known as tp_compare (Python 2)
                                    or tp_reserved (Python 3) */
    public native reprfunc tp_repr(); public native PyTypeObject tp_repr(reprfunc setter);

    /* Method suites for standard classes */

    public native PyNumberMethods tp_as_number(); public native PyTypeObject tp_as_number(PyNumberMethods setter);
    public native PySequenceMethods tp_as_sequence(); public native PyTypeObject tp_as_sequence(PySequenceMethods setter);
    public native PyMappingMethods tp_as_mapping(); public native PyTypeObject tp_as_mapping(PyMappingMethods setter);

    /* More standard operations (here for binary compatibility) */

    public native hashfunc tp_hash(); public native PyTypeObject tp_hash(hashfunc setter);
    public native ternaryfunc tp_call(); public native PyTypeObject tp_call(ternaryfunc setter);
    public native reprfunc tp_str(); public native PyTypeObject tp_str(reprfunc setter);
    public native getattrofunc tp_getattro(); public native PyTypeObject tp_getattro(getattrofunc setter);
    public native setattrofunc tp_setattro(); public native PyTypeObject tp_setattro(setattrofunc setter);

    /* Functions to access object as input/output buffer */
    public native PyBufferProcs tp_as_buffer(); public native PyTypeObject tp_as_buffer(PyBufferProcs setter);

    /* Flags to define presence of optional/expanded features */
    public native @Cast("unsigned long") long tp_flags(); public native PyTypeObject tp_flags(long setter);

    public native @Cast("const char*") BytePointer tp_doc(); public native PyTypeObject tp_doc(BytePointer setter); /* Documentation string */

    /* Assigned meaning in release 2.0 */
    /* call function for all accessible objects */
    public native traverseproc tp_traverse(); public native PyTypeObject tp_traverse(traverseproc setter);

    /* delete references to contained objects */
    public native inquiry tp_clear(); public native PyTypeObject tp_clear(inquiry setter);

    /* Assigned meaning in release 2.1 */
    /* rich comparisons */
    public native richcmpfunc tp_richcompare(); public native PyTypeObject tp_richcompare(richcmpfunc setter);

    /* weak reference enabler */
    public native @Cast("Py_ssize_t") long tp_weaklistoffset(); public native PyTypeObject tp_weaklistoffset(long setter);

    /* Iterators */
    public native getiterfunc tp_iter(); public native PyTypeObject tp_iter(getiterfunc setter);
    public native iternextfunc tp_iternext(); public native PyTypeObject tp_iternext(iternextfunc setter);

    /* Attribute descriptor and subclassing stuff */
    public native PyMethodDef tp_methods(); public native PyTypeObject tp_methods(PyMethodDef setter);
    public native PyMemberDef tp_members(); public native PyTypeObject tp_members(PyMemberDef setter);
    public native PyGetSetDef tp_getset(); public native PyTypeObject tp_getset(PyGetSetDef setter);
    // Strong reference on a heap type, borrowed reference on a static type
    public native PyTypeObject tp_base(); public native PyTypeObject tp_base(PyTypeObject setter);
    public native PyObject tp_dict(); public native PyTypeObject tp_dict(PyObject setter);
    public native descrgetfunc tp_descr_get(); public native PyTypeObject tp_descr_get(descrgetfunc setter);
    public native descrsetfunc tp_descr_set(); public native PyTypeObject tp_descr_set(descrsetfunc setter);
    public native @Cast("Py_ssize_t") long tp_dictoffset(); public native PyTypeObject tp_dictoffset(long setter);
    public native initproc tp_init(); public native PyTypeObject tp_init(initproc setter);
    public native allocfunc tp_alloc(); public native PyTypeObject tp_alloc(allocfunc setter);
    public native newfunc tp_new(); public native PyTypeObject tp_new(newfunc setter);
    public native freefunc tp_free(); public native PyTypeObject tp_free(freefunc setter); /* Low-level free-memory routine */
    public native inquiry tp_is_gc(); public native PyTypeObject tp_is_gc(inquiry setter); /* For PyObject_IS_GC */
    public native PyObject tp_bases(); public native PyTypeObject tp_bases(PyObject setter);
    public native PyObject tp_mro(); public native PyTypeObject tp_mro(PyObject setter); /* method resolution order */
    public native PyObject tp_cache(); public native PyTypeObject tp_cache(PyObject setter); /* no longer used */
    public native Pointer tp_subclasses(); public native PyTypeObject tp_subclasses(Pointer setter);  /* for static builtin types this is an index */
    public native PyObject tp_weaklist(); public native PyTypeObject tp_weaklist(PyObject setter); /* not used for static builtin types */
    public native destructor tp_del(); public native PyTypeObject tp_del(destructor setter);

    /* Type attribute cache version tag. Added in version 2.6 */
    public native @Cast("unsigned int") int tp_version_tag(); public native PyTypeObject tp_version_tag(int setter);

    public native destructor tp_finalize(); public native PyTypeObject tp_finalize(destructor setter);
    public native vectorcallfunc tp_vectorcall(); public native PyTypeObject tp_vectorcall(vectorcallfunc setter);

    /* bitset of which type-watchers care about this type */
    public native @Cast("unsigned char") byte tp_watched(); public native PyTypeObject tp_watched(byte setter);
    public native @Cast("uint16_t") short tp_versions_used(); public native PyTypeObject tp_versions_used(short setter);
}
