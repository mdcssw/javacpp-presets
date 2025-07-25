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

@Name("std::vector<std::unique_ptr<torch::autograd::FunctionPostHook> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FunctionPostHookVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionPostHookVector(Pointer p) { super(p); }
    public FunctionPostHookVector()       { allocate();  }
    private native void allocate();


    public boolean empty() { return size() == 0; }
    public native long size();

    public FunctionPostHook front() { return get(0); }
    public FunctionPostHook back() { return get(size() - 1); }
    @Index(function = "at") public native @UniquePtr FunctionPostHook get(@Cast("size_t") long i);

    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @UniquePtr @Const FunctionPostHook get();
    }
}

