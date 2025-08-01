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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Softplus ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies softplus over a given input.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.Softplus to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::SoftplusOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Softplus model(SoftplusOptions().beta(0.24).threshold(42.42));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftplusImpl extends SoftplusImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftplusImpl(Pointer p) { super(p); }

  public SoftplusImpl(@Const @ByRef(nullValue = "torch::nn::SoftplusOptions{}") SoftplusOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::SoftplusImpl>") private native void allocate(@Const @ByRef(nullValue = "torch::nn::SoftplusOptions{}") SoftplusOptions options_);
  public SoftplusImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::SoftplusImpl>") private native void allocate();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Softplus} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef SoftplusOptions options(); public native SoftplusImpl options(SoftplusOptions setter);
}
