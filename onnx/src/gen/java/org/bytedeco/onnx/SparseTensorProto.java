// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class SparseTensorProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseTensorProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SparseTensorProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SparseTensorProto position(long position) {
        return (SparseTensorProto)super.position(position);
    }
    @Override public SparseTensorProto getPointer(long i) {
        return new SparseTensorProto((Pointer)this).offsetAddress(i);
    }

  public SparseTensorProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SparseTensorProto(@Const @ByRef SparseTensorProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SparseTensorProto from);

  public native @ByRef @Name("operator =") SparseTensorProto put(@Const @ByRef SparseTensorProto from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef SparseTensorProto default_instance();
  public static native @Const SparseTensorProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(SparseTensorProto other);
  public native void UnsafeArenaSwap(SparseTensorProto other);

  // implements Message ----------------------------------------------

  public native SparseTensorProto New(Arena arena/*=nullptr*/);
  public native SparseTensorProto New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SparseTensorProto from);
  public native void MergeFrom(@Const @ByRef SparseTensorProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::SparseTensorProto:: */
  public static final int
    kDimsFieldNumber = 3,
    kValuesFieldNumber = 1,
    kIndicesFieldNumber = 2;
  // repeated int64 dims = 3;
  public native int dims_size();
  public native void clear_dims();
  public native @Cast("int64_t") long dims(int index);
  public native void set_dims(int index, @Cast("int64_t") long value);
  public native void add_dims(@Cast("int64_t") long value);

  // optional .onnx.TensorProto values = 1;
  public native @Cast("bool") boolean has_values();
  public native void clear_values();
  public native @Const @ByRef TensorProto values();
  public native TensorProto release_values();
  public native TensorProto mutable_values();
  public native void set_allocated_values(TensorProto values);
  public native void unsafe_arena_set_allocated_values(
        TensorProto values);
  public native TensorProto unsafe_arena_release_values();

  // optional .onnx.TensorProto indices = 2;
  public native @Cast("bool") boolean has_indices();
  public native void clear_indices();
  public native @Const @ByRef TensorProto indices();
  public native TensorProto release_indices();
  public native TensorProto mutable_indices();
  public native void set_allocated_indices(TensorProto indices);
  public native void unsafe_arena_set_allocated_indices(
        TensorProto indices);
  public native TensorProto unsafe_arena_release_indices();
}
