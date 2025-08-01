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


/** Options for {@code torch::nn::functional::multi_head_attention_forward} */
@Namespace("torch::nn::functional") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiheadAttentionForwardFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiheadAttentionForwardFuncOptions(Pointer p) { super(p); }

  public MultiheadAttentionForwardFuncOptions(
        @Cast("int64_t") long embed_dim_to_check,
        @Cast("int64_t") long num_heads,
        @ByVal Tensor in_proj_weight,
        @ByVal Tensor in_proj_bias,
        @ByVal Tensor bias_k,
        @ByVal Tensor bias_v,
        @Cast("bool") boolean add_zero_attn,
        double dropout_p,
        @ByVal Tensor out_proj_weight,
        @ByVal Tensor out_proj_bias) { super((Pointer)null); allocate(embed_dim_to_check, num_heads, in_proj_weight, in_proj_bias, bias_k, bias_v, add_zero_attn, dropout_p, out_proj_weight, out_proj_bias); }
  private native void allocate(
        @Cast("int64_t") long embed_dim_to_check,
        @Cast("int64_t") long num_heads,
        @ByVal Tensor in_proj_weight,
        @ByVal Tensor in_proj_bias,
        @ByVal Tensor bias_k,
        @ByVal Tensor bias_v,
        @Cast("bool") boolean add_zero_attn,
        double dropout_p,
        @ByVal Tensor out_proj_weight,
        @ByVal Tensor out_proj_bias);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer embed_dim_to_check();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_heads();
  public native @ByRef @NoException(true) Tensor in_proj_weight();
  public native @ByRef @NoException(true) Tensor in_proj_bias();
  public native @ByRef @NoException(true) Tensor bias_k();
  public native @ByRef @NoException(true) Tensor bias_v();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer add_zero_attn();
  public native @ByRef @NoException(true) DoublePointer dropout_p();
  public native @ByRef @NoException(true) Tensor out_proj_weight();
  public native @ByRef @NoException(true) Tensor out_proj_bias();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer training();
  public native @ByRef @NoException(true) Tensor key_padding_mask();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer need_weights();
  public native @ByRef @NoException(true) Tensor attn_mask();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer use_separate_proj_weight();
  public native @ByRef @NoException(true) Tensor q_proj_weight();
  public native @ByRef @NoException(true) Tensor k_proj_weight();
  public native @ByRef @NoException(true) Tensor v_proj_weight();
  public native @ByRef @NoException(true) Tensor static_k();
  public native @ByRef @NoException(true) Tensor static_v();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer average_attn_weights();
}
