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


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class mt19937_engine extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mt19937_engine(Pointer p) { super(p); }


  // NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
  public mt19937_engine(@Cast("uint64_t") long seed/*=5489*/) { super((Pointer)null); allocate(seed); }
  private native void allocate(@Cast("uint64_t") long seed/*=5489*/);
  public mt19937_engine() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByVal mt19937_data_pod data();

  public native void set_data(@Const @ByRef mt19937_data_pod data);

  public native @Cast("uint64_t") long seed();

  public native @Cast("bool") boolean is_valid();

  public native @Cast("uint32_t") @Name("operator ()") int apply();

}
