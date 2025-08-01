// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FunctionBodyBuildContextImpl extends FunctionBodyBuildContext {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionBodyBuildContextImpl(Pointer p) { super(p); }

  // Input_types: use a default TypeProto for missing types. We use a different convention
  // here (from FunctionBodyBuildContext) to simplify python interoperability.
  // The default value for input_types is included only for backward compatibility.
  // It can be used for functions that do not depend on the type-context, but
  // will not be sufficient for functions that do use the type-context.
  public FunctionBodyBuildContextImpl(@Const @ByRef NodeProto node_proto, @StdVector TypeProto input_types/*={}*/) { super((Pointer)null); allocate(node_proto, input_types); }
  private native void allocate(@Const @ByRef NodeProto node_proto, @StdVector TypeProto input_types/*={}*/);
  public FunctionBodyBuildContextImpl(@Const @ByRef NodeProto node_proto) { super((Pointer)null); allocate(node_proto); }
  private native void allocate(@Const @ByRef NodeProto node_proto);

  public native @Const AttributeProto getAttribute(@StdString BytePointer name);
  public native @Const AttributeProto getAttribute(@StdString String name);

  public native @Cast("bool") boolean hasInput(int inputIndex);

  public native @Cast("bool") boolean hasOutput(int inputIndex);

  public native @Const TypeProto getInputType(int inputIndex);

  public native @ByRef StringAttributeProtoMap attributesByName_(); public native FunctionBodyBuildContextImpl attributesByName_(StringAttributeProtoMap setter);

  public native @ByRef NodeProto node_proto_(); public native FunctionBodyBuildContextImpl node_proto_(NodeProto setter);
  public native @StdVector TypeProto input_types_(); public native FunctionBodyBuildContextImpl input_types_(TypeProto setter);
}
