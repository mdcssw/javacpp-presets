// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// Try to match a list of inputs and keyword 'attributes' to this
// schema. Return the flat list of positional inputs to the call or
// `std::nullopt` on failure (`failure_messages` contains a good error
// report in this case)

@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MatchedSchema extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MatchedSchema() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MatchedSchema(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatchedSchema(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MatchedSchema position(long position) {
        return (MatchedSchema)super.position(position);
    }
    @Override public MatchedSchema getPointer(long i) {
        return new MatchedSchema((Pointer)this).offsetAddress(i);
    }

  public native @ByRef ValueVector inputs(); public native MatchedSchema inputs(ValueVector setter);
  public native @ByRef TypeVector return_types(); public native MatchedSchema return_types(TypeVector setter);
  public native @ByRef @Cast("c10::OptNameList*") StringVectorOptional return_field_names(); public native MatchedSchema return_field_names(StringVectorOptional setter);
  public native @StdString BytePointer schema_name(); public native MatchedSchema schema_name(BytePointer setter);
}
