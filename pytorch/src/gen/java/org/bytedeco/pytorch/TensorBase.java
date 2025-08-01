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


// NOTE: [Tensor vs. TensorBase]
//
// Tensor, being the central data structure in PyTorch, gets used and
// it's header included almost everywhere. Unfortunately this means
// every time an operator signature is updated or changed in
// native_functions.yaml, you (and every other PyTorch developer) need
// to recompile all of ATen and it's dependencies.
//
// TensorBase aims to break up these header dependencies, and improve
// incremental build times for all PyTorch developers. TensorBase
// represents a reference counted handle to TensorImpl, exactly the
// same as Tensor. However, TensorBase doesn't have code generated
// methods in it's API and thus no dependence on native_functions.yaml.
//
// Usage tips
// ----------
// - You can `#define TORCH_ASSERT_NO_OPERATORS` at the top of a .cpp
//   or .cu file to ensure it has no header dependencies on
//   native_functions.yaml (direct or indirect).
// - Tensor inherits from TensorBase, so functions taking
//   `const TensorBase &` are callable with Tensor as well.
// - TensorBase can be converted to tensor with `Tensor(tensor_base)`,
//   but this requires a reference-count bump. OptionalTensorRef on
//   the other hand can materialize a `const Tensor &` without
//   touching the reference-count.
@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorBase extends AbstractTensor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorBase(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorBase(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorBase position(long position) {
        return (TensorBase)super.position(position);
    }
    @Override public TensorBase getPointer(long i) {
        return new TensorBase((Pointer)this).offsetAddress(i);
    }

  public TensorBase() { super((Pointer)null); allocate(); }
  private native void allocate();
  // This constructor should not be used by end users and is an implementation
  // detail invoked by autogenerated code.
  
  public TensorBase(@Const @ByRef TensorBase arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef TensorBase arg0);
  // Creates a new wrapper from TensorImpl. Intentionally a free method because
  // it should be used with care. Checks necessary invariants
  public static native @ByVal TensorBase wrap_tensor_impl(
        @IntrusivePtr("c10::TensorImpl,c10::UndefinedTensorImpl") @Cast({"", "c10::intrusive_ptr<c10::TensorImpl,c10::UndefinedTensorImpl>&"}) TensorImpl tensor_impl);

  public native @Cast("int64_t") long dim();
  public native @Cast("int64_t") long storage_offset();

  public native @ByVal TensorBase contiguous(MemoryFormat memory_format/*=c10::MemoryFormat::Contiguous*/);
  public native @ByVal TensorBase contiguous();
  public native @ByVal TensorBase contiguous(@Cast("c10::MemoryFormat") byte memory_format/*=c10::MemoryFormat::Contiguous*/);

  /** Should be used if *this can reasonably be expected to be contiguous and
   *  performance is important.
   *  Compared to contiguous, it saves a reference count
   *  increment/decrement if *this is already contiguous, at the cost
   *  in all cases of an extra pointer of stack usage, an extra branch
   *  to access, and an extra branch at destruction time. */
  

  // Use .contiguous() instead. Trying to borrow from a prvalue
  // will only lead to trouble and dangling references.
  

  public native @Const @ByRef TensorBase fill_(@Const @ByRef Scalar scalar);
  public native @Const @ByRef TensorBase zero_();

  public native @ByVal TensorBase to(@ByVal(nullValue = "at::TensorOptions{}") TensorOptions options, @Cast("bool") boolean non_blocking/*=false*/, @Cast("bool") boolean copy/*=false*/, @ByVal(nullValue = "std::optional<at::MemoryFormat>(std::nullopt)") MemoryFormatOptional memory_format);
  public native @ByVal TensorBase to();

  public native @Cast("bool") boolean is_complex();

  public native @Cast("bool") boolean is_floating_point();

  public native @Cast("bool") boolean is_signed();

  public native @ByVal SymInt sym_size(@Cast("int64_t") long dim);

  public native @ByVal SymInt sym_stride(@Cast("int64_t") long dim);

  public native @Cast("int64_t") long size(@Cast("int64_t") long dim);

  public native @Cast("int64_t") long stride(@Cast("int64_t") long dim);

  public native TensorImpl unsafeGetTensorImpl();
  public native TensorImpl unsafeReleaseTensorImpl();
  public native @IntrusivePtr("c10::TensorImpl,c10::UndefinedTensorImpl") @Cast({"", "c10::intrusive_ptr<c10::TensorImpl,c10::UndefinedTensorImpl>&"}) TensorImpl getIntrusivePtr();

  public native @IntrusivePtr("c10::TensorImpl,c10::UndefinedTensorImpl") @Cast({"", "c10::intrusive_ptr<c10::TensorImpl,c10::UndefinedTensorImpl>&"}) TensorImpl unsafeReleaseIntrusivePtr();

  public native @Cast("bool") boolean defined();

  public native void reset();

// #if defined (_MSC_VER)
  public native @ByRef @Name("operator =") TensorBase put(@Const @ByRef TensorBase x);
// #else
// #endif

  // Ban assignment to rvalues, since at::Tensor (weirdly) performs a deep copy here
  
  

  public native @Cast("bool") @NoException(true) boolean is_same(@Const @ByRef TensorBase other);
  public native @Cast("size_t") @NoException(true) long use_count();
  public native @Cast("size_t") @NoException(true) long weak_use_count();

  public native @StdString String toString();

  public native @ByVal LongArrayRef sizes();
  public native @ByVal SymIntArrayRef sym_sizes();
  public native @ByVal SymIntArrayRef sym_strides();
  public native @ByVal LongArrayRef strides();
  // See impl::get_opt_names in ATen/NamedTensor.h for docs.
  public native @ByVal DimnameListOptional opt_names();
  // See impl::get_names in ATen/NamedTensor.h for docs.
  public native @ByVal DimnameArrayRef names();
  public native @Cast("int64_t") long ndimension();

  public native @Cast("bool") boolean is_contiguous(@ByVal(nullValue = "at::MemoryFormat::Contiguous") MemoryFormat memory_format);
  public native @Cast("bool") boolean is_contiguous();

  public native @Cast("bool") boolean is_non_overlapping_and_dense();

  public native @ByVal MemoryFormat suggest_memory_format(
        @Cast("bool") boolean channels_last_strides_exact_match/*=false*/);
  public native @ByVal MemoryFormat suggest_memory_format();

  // Total bytes consumed by the "view" of elements of the array.  Does not
  // include size of metadata.  The number reported here does not necessarily
  // correspond to the true physical memory consumed by a tensor; instead,
  // it reports the memory the tensor would take *if* it were contiguous.
  // Defined to be numel() * itemsize()
  public native @Cast("size_t") long nbytes();

  public native @ByVal SymInt sym_nbytes();

  public native @Cast("int64_t") long numel();

  public native @ByVal SymInt sym_numel();

  public native @ByVal SymInt sym_storage_offset();

  // Length of one array element in bytes.  This is the traditional
  // Numpy naming.
  public native @Cast("size_t") long itemsize();

  // Same as itemsize().  This is the PyTorch naming.
  public native @Cast("int64_t") long element_size();

  public native @ByVal DispatchKeySet key_set();
  public native ScalarType scalar_type();
  public native @Cast("bool") boolean has_storage();
  public native @Const @ByRef Storage storage();
  public native @Cast("bool") boolean is_alias_of(@Const @ByRef TensorBase other);

  // Move the storage backend to shm based
  // to enable memory sharing across processes.
  //
  // NB1: the ideal behavior of this API still requires further discussion
  // but for now we are inclined to keep it consistent with existing THP behavior
  // https://github.com/pytorch/pytorch/blob/4dca9bde0552afc67b5b74f4a0696fe6055709c4/torch/storage.py#L196-L212
  // so we don't assert on anything here and rely on caller knowing
  // what it's doing.
  //
  // NB2: this currently provides Linux fd based shm support only
  // to simplify the storage lifetime management logic in ATen
  // and similarly for now we are not adding support for file system based
  // shm support like in THP due to additional GC manager support needed
  // to prevent leaks.
  // As such, calling this from non supported systems (e.g. Windows) would fail.
  public native void share_memory_();

  public native @Cast("bool") boolean _is_zerotensor();

  public native void _set_zero(@Cast("bool") boolean _zero);

  public native @Cast("bool") boolean is_conj();

  // sets the conjugate bit of a tensor.
  // NOTE: Conjugate bit is supposed to be a read-only field. Only change this, if you are sure
  // that's what you want. Changing this might lead to incorrect behavior since conjugation is
  // a lazy operation and we rely on this bit to determine if a conjugation needs to be materialized.
  public native void _set_conj(@Cast("bool") boolean conjugate);

  public native @Cast("bool") boolean is_neg();

  // sets the negative bit of a tensor.
  // NOTE: Negative bit is supposed to be a read-only field. Only change this, if you are sure
  // that's what you want. Changing this might lead to incorrect behavior since we rely on this
  // bit to determine if a negation needs to be materialized.
  public native void _set_neg(@Cast("bool") boolean negative);

  /** Returns a {@code Tensor}'s layout. */
  public native Layout layout();

  /** Returns a {@code Tensor}'s dtype ({@code TypeMeta}). */
  public native @ByVal TypeMeta dtype();

  /** Returns a {@code Tensor}'s device. */
  public native @ByVal Device device();

  /** Returns a {@code Tensor}'s device index. */
  

  /** Returns if a {@code Tensor} has CPU backend. */
  public native @Cast("bool") boolean is_cpu();

  /** Returns if a {@code Tensor} has CUDA backend. */
  public native @Cast("bool") boolean is_cuda();

  /** Returns if a {@code Tensor} has IPU backend. */
  public native @Cast("bool") boolean is_ipu();

  /** Returns if a {@code Tensor} has XPU backend. */
  public native @Cast("bool") boolean is_xpu();

  /** Returns if a {@code Tensor} has XLA backend. */
  public native @Cast("bool") boolean is_xla();

  /** Returns if a {@code Tensor} has MTIA backend. */
  public native @Cast("bool") boolean is_mtia();

  /** Returns if a {@code Tensor} has HPU backend. */
  public native @Cast("bool") boolean is_hpu();

  /** Returns if a {@code Tensor} has Lazy backend. */
  public native @Cast("bool") boolean is_lazy();

  /** Returns if a {@code Tensor} has HIP backend. */
  public native @Cast("bool") boolean is_hip();

  /** Returns if a {@code Tensor} has VE backend. */
  public native @Cast("bool") boolean is_ve();

  /** Returns if a {@code Tensor} has PrivateUse1 backend. */
  public native @Cast("bool") boolean is_privateuseone();

  /** Returns if a {@code Tensor} has sparse backend. */
  public native @Cast("bool") boolean is_sparse();

  /** Returns is a {@code Tensor} has a sparse CSR backend. */
  public native @Cast("bool") boolean is_sparse_csr();

  /** Returns if a {@code Tensor} is mkldnn tensor. */
  public native @Cast("bool") boolean is_mkldnn();

  /** Returns if a {@code Tensor} is mps tensor. */
  public native @Cast("bool") boolean is_mps();

  /** Returns if a {@code Tensor} is maia tensor. */
  public native @Cast("bool") boolean is_maia();

  /** Returns if a {@code Tensor} is vulkan tensor. */
  public native @Cast("bool") boolean is_vulkan();

  /** Returns if a {@code Tensor} is metal tensor. */
  public native @Cast("bool") boolean is_metal();

  /** Returns if a {@code Tensor} has quantized backend. */
  public native @Cast("bool") boolean is_quantized();

  /** Returns if a {@code Tensor} is a meta tensor.  Meta tensors can
   *  also have other designations. */
  public native @Cast("bool") boolean is_meta();

  /** Returns if a {@code Tensor} is an inference tensor. */
  public native @Cast("bool") boolean is_inference();

  // Returns if a `Tensor` is a NestedTensor.
  public native @Cast("bool") boolean is_nested();

  /** If a tensor is a quantized tensor, returns its quantizer
   *  TODO: it's not in native_functions.yaml yet as it's not exposed to python */
  public native @IntrusivePtr("at::Quantizer") @Cast({"", "c10::intrusive_ptr<at::Quantizer>&"}) Quantizer quantizer();

  /** Returns if a {@code Tensor} has any dimension names */
  public native @Cast("bool") boolean has_names();

  /** Returns a {@code Tensor}'s dimension names data structure */

  public native NamedTensorMeta get_named_tensor_meta();

  /** Returns the {@code TensorOptions} corresponding to this {@code Tensor}. Defined in
   *  TensorOptions.h. */
  public native @ByVal TensorOptions options();

  public native @Const Pointer const_data_ptr();

  public native Pointer mutable_data_ptr();

  // TODO(#97856) Make this return a const pointer. This currently
  //              returns a non-const pointer because of the large
  //              number of clients that we still want to audit before
  //              migrating to mutable_data_ptr().
  public native Pointer data_ptr();

  // Legacy interface during the migration to indicate that a callsite
  // has not been audited for mutability.
  //
  // Do not add new uses of this, use const_data_ptr() if possible,
  // mutable_data_ptr() otherwise.
  //
  // TODO(#97856) Make this return a const pointer. This is currently
  //              const because of the vast number of clients that
  //              rely on this.
  public native @Cast("bool*") @Name("data_ptr<bool>") BoolPointer data_ptr_bool();
  public native @Name("data_ptr<int8_t>") BytePointer data_ptr_char();
  public native @Cast("uint8_t*") @Name("data_ptr<uint8_t>") BytePointer data_ptr_byte();
  public native @Name("data_ptr<int16_t>") ShortPointer data_ptr_short();
  public native @Name("data_ptr<int>") IntPointer data_ptr_int();
  public native @Cast("int64_t*") @Name("data_ptr<int64_t>") LongPointer data_ptr_long();
  public native @Name("data_ptr<float>") FloatPointer data_ptr_float();
  public native @Name("data_ptr<double>") DoublePointer data_ptr_double();

  // Purposely not defined here to avoid inlining
  public native void print();

  // Return a `TensorAccessor` for CPU `Tensor`s. You have to specify scalar type and
  // dimension.
  

  // Return a `GenericPackedTensorAccessor` for CUDA `Tensor`s. You have to specify scalar type and
  // dimension. You can optionally specify RestrictPtrTraits as a template parameter to
  // cast the data pointer to a __restrict__ pointer.
  // In order to use this, your CUDA kernel has to take a corresponding GenericPackedTensorAccessor
  // as an argument.
  
  
  

  // ~~~~~ Autograd API ~~~~~

  /** \fn bool is_leaf() const;
   * 
   *  All Tensors that have {@code requires_grad()} which is {@code }false{@code } will be leaf Tensors by convention.
   * 
   *  For Tensors that have {@code requires_grad()} which is {@code }true{@code }, they will be leaf Tensors if they were
   *  created by the user. This means that they are not the result of an operation and so
   *  {@code grad_fn()} is {@code nullptr}.
   * 
   *  Only leaf Tensors will have their {@code grad()} populated during a call to {@code backward()}.
   *  To get {@code grad()} populated for non-leaf Tensors, you can use {@code retain_grad()}.
   * 
   *  Example:
   *  <pre>{@code
   *  auto a = torch::rand(10, torch::requires_grad());
   *  std::cout << a.is_leaf() << std::endl; // prints `true`
   * 
   *  auto b = torch::rand(10, torch::requires_grad()).to(torch::kCUDA);
   *  std::cout << b.is_leaf() << std::endl; // prints `false`
   *  // b was created by the operation that cast a cpu Tensor into a cuda Tensor
   * 
   *  auto c = torch::rand(10, torch::requires_grad()) + 2;
   *  std::cout << c.is_leaf() << std::endl; // prints `false`
   *  // c was created by the addition operation
   * 
   *  auto d = torch::rand(10).cuda();
   *  std::cout << d.is_leaf() << std::endl; // prints `true`
   *  // d does not require gradients and so has no operation creating it (that is tracked by the autograd engine)
   * 
   *  auto e = torch::rand(10).cuda().requires_grad_();
   *  std::cout << e.is_leaf() << std::endl; // prints `true`
   *  // e requires gradients and has no operations creating it
   * 
   *  auto f = torch::rand(10, torch::device(torch::kCUDA).requires_grad(true));
   *  std::cout << f.is_leaf() << std::endl; // prints `true`
   *  // f requires grad, has no operation creating it
   *  }</pre>
   <p>
   *  \fn void backward(const Tensor & gradient={}, std::optional<bool> retain_graph=std::nullopt, bool create_graph=false, std::optional<TensorList> inputs=std::nullopt) const;
   * 
   *  Computes the gradient of current tensor with respect to graph leaves.
   * 
   *  The graph is differentiated using the chain rule. If the tensor is
   *  non-scalar (i.e. its data has more than one element) and requires
   *  gradient, the function additionally requires specifying {@code }gradient{@code }.
   *  It should be a tensor of matching type and location, that contains
   *  the gradient of the differentiated function w.r.t. this Tensor.
   * 
   *  This function accumulates gradients in the leaves - you might need to
   *  zero them before calling it.
   * 
   *  @param gradient Gradient w.r.t. the
   *      tensor. If it is a tensor, it will be automatically converted
   *      to a Tensor that does not require grad unless {@code }create_graph{@code } is True.
   *      None values can be specified for scalar Tensors or ones that
   *      don't require grad. If a None value would be acceptable then
   *      this argument is optional.
   *  @param retain_graph If {@code }false{@code }, the graph used to compute
   *      the grads will be freed. Note that in nearly all cases setting
   *      this option to True is not needed and often can be worked around
   *      in a much more efficient way. Defaults to the value of
   *      {@code }create_graph{@code }.
   *  @param create_graph If {@code }true{@code }, graph of the derivative will
   *      be constructed, allowing to compute higher order derivative
   *      products. Defaults to {@code }false{@code }.
   *  @param inputs Inputs w.r.t. which the gradient will be accumulated into
   *      {@code }at::Tensor::grad{@code }. All other Tensors will be ignored. If not
   *      provided, the gradient is accumulated into all the leaf Tensors
   *      that were used to compute the current tensor.
   *      When inputs are provided and a given input is not a leaf,
   *      the current implementation will call its grad_fn (even though it is not strictly needed to get this gradients).
   *      It is an implementation detail on which the user should not rely.
   *      See https://github.com/pytorch/pytorch/pull/60521#issuecomment-867061780 for more details.
   <p>
   *  \fn Tensor detach() const;
   * 
   *  Returns a new Tensor, detached from the current graph.
   *  The result will never require gradient.
   <p>
   *  \fn Tensor & detach_() const;
   * 
   *  Detaches the Tensor from the graph that created it, making it a leaf.
   *  Views cannot be detached in-place.
   <p>
   *  \fn void retain_grad() const;
   * 
   *  Enables this Tensor to have their :attr:{@code grad} populated during
   *  :func:{@code backward}. This is a no-op for leaf tensors.
   <p>
   *  \fn bool retains_grad() const;
   * 
   *  Is {@code }true{@code } if this Tensor is non-leaf and its :attr:{@code grad} is enabled to be
   *  populated during :func:{@code backward}, {@code }false{@code } otherwise. */

  public native @Const @ByRef TensorBase set_requires_grad(@Cast("bool") boolean requires_grad);
  public native @Cast("bool") boolean requires_grad();

  // The Forward AD API functions below are low level and are not to be used by end
  // users who should use the API provided in torch/csrc/autograd.h

  /** This function returns the forward gradient for this Tensor at the given level. */
  

  /** This function can be used to set the value of the forward grad.
   *  Note that the given new_grad might not be used directly if it has different
   *  metadata (size/stride/storage offset) compared to this Tensor. In that case,
   *  new_grad content will be copied into a new Tensor */
  

  /** NOTE: This is similar to the legacy {@code .data()} function on {@code Variable}, and is intended
   *  to be used from functions that need to access the {@code Variable}'s equivalent {@code Tensor}
   *  (i.e. {@code Tensor} that shares the same storage and tensor metadata with the {@code Variable}).
   * 
   *  One notable difference with the legacy {@code .data()} function is that changes to the
   *  returned {@code Tensor}'s tensor metadata (e.g. sizes / strides / storage / storage_offset)
   *  will not update the original {@code Variable}, due to the fact that this function
   *  shallow-copies the {@code Variable}'s underlying TensorImpl. */
  
  ///
  public native @ByVal TensorBase tensor_data();

  /** NOTE: {@code var.variable_data()} in C++ has the same semantics as {@code tensor.data}
   *  in Python, which create a new {@code Variable} that shares the same storage and
   *  tensor metadata with the original {@code Variable}, but with a completely new
   *  autograd history.
   * 
   *  NOTE: If we change the tensor metadata (e.g. sizes / strides /
   *  storage / storage_offset) of a variable created from {@code var.variable_data()}, those
   *  changes will not update the original variable {@code var}. In {@code .variable_data()}, we set
   *  {@code allow_tensor_metadata_change_} to false to make such changes explicitly illegal,
   *  in order to prevent users from changing metadata of {@code var.variable_data()}
   *  and expecting the original variable {@code var} to also be updated. */
  
  ///
  public native @ByVal TensorBase variable_data();

  // Gradient Node and Edges
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /** Gets the gradient function of the {@code Variable}. If this is a leaf variable,
   *  the pointer returned will be null.
   * 
   *  For View Variables:
   *  Gets the up-to-date grad_fn. If the shared data or base was modified, we
   *  re-create the grad_fn to express the up-to-date view relationship between
   *  this and the base Variable. */
  public native @SharedPtr Node grad_fn();

  // Hooks
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
  ///
  ///
  ///

  /** Registers a backward hook.
   * 
   *  The hook will be called every time a gradient with respect to the Tensor is computed.
   *  The hook should have one of the following signature:
   *  <pre>{@code
   *  hook(TensorBase grad) -> TensorBase
   *  }</pre>
   *  <pre>{@code
   *  hook(TensorBase grad) -> void
   *  }</pre>
   *  The hook should not modify its argument, but it can optionally return a new gradient
   *  which will be used in place of {@code grad}.
   * 
   *  This function returns the index of the hook in the list which can be used to remove hook.
   * 
   *  Example:
   *  <pre>{@code
   *  auto v = torch::tensor({0., 0., 0.}, torch::requires_grad());
   *  auto h = v.register_hook([](torch::Tensor grad){ return grad * 2; }); // double the gradient
   *  v.backward(torch::tensor({1., 2., 3.}));
   *  // This prints:
   *  // ```
   *  //  2
   *  //  4
   *  //  6
   *  // [ CPUFloatType{3} ]
   *  // ```
   *  std::cout << v.grad() << std::endl;
   *  v.remove_hook(h);  // removes the hook
   *  }</pre> */
  public native @Name("register_hook<std::function<void(at::TensorBase)> >") int register_hook(@ByRef(true) VoidTensorHook hook);
  public native @Name("register_hook<std::function<at::TensorBase(at::TensorBase)> >") int register_hook(@ByRef(true) TensorTensorHook hook);

  /** Remove hook at given position */
  public native void remove_hook(@Cast("unsigned") int pos);

  // Variable methods
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public native @Cast("bool") boolean is_leaf();

  public native @Cast("int64_t") long output_nr();

  public native void set_data(@Const @ByRef TensorBase new_data);

  public native @ByVal TensorBase data();

  public native @Cast("int64_t") long _version();

  public native void retain_grad();

  public native @Cast("bool") boolean retains_grad();

  public native @Const @ByRef TensorBase requires_grad_(@Cast("bool") boolean _requires_grad/*=true*/);
  public native @Const @ByRef TensorBase requires_grad_();

  // View Variables
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  /** Returns true if this {@code Variable} is a view of another {@code Variable}. */
  public native @Cast("bool") boolean is_view();

  /** Returns the {@code Variable} that this {@code Variable} is a view of. If this
   *  {@code Variable} is not a view, throw a {@code std::runtime_error}. */
  public native @Const @ByRef TensorBase _base();

  // Miscellaneous
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public native @StdString BytePointer name();
}
