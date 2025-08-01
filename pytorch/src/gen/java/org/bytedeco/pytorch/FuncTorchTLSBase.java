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


// NOTE [functorch TLS in pytorch/pytorch]
//
// functorch lives out-of-tree. However, it has some TLS that needs to be
// propagated. The solution for that is we store a pointer to the TLS
// inside pytorch/pytorch and extend FuncTorchTLSBase inside functorch to
// include whatever functorch needs.
//
// We need to store a pointer due to the indirection:
// inside functorch, we will create a subclass of FunctorchTLSBase called
// FuncTorchTLSImpl that actually contains metadata, like the DynamicLayerStack.
// FuncTorchTLSBase doesn't have any metadata because it hasn't been defined
// yet.
//
// Here in pytorch/pytorch, we will pass around FuncTorchTLSBase*, but inside
// functorch, we will assign a FuncTorchTLSImpl* to the FunctorchTLSBase*.
// We can't directly pass around FunctorchTLSBase (without a pointer) because
// FuncTorchTLSImpl does not fit inside a FuncTorchTLSBase by virtue of having
// more elements.
@Namespace("at::functorch") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FuncTorchTLSBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FuncTorchTLSBase(Pointer p) { super(p); }

  public native @UniquePtr FuncTorchTLSBase deepcopy();

  public native @Cast("int64_t") long checkSupportsSingleLevelAutogradFunction();
  public native void checkSupportsCppAutogradFunction();
  public native void checkSupportsInplaceRequiresGrad();
  public native void checkSupportsRetainGrad();
}
