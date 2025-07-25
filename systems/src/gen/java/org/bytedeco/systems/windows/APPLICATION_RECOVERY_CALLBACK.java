// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// #endif // (_WIN32_WINNT >=0x0601)

//
// Application restart and data recovery callback
//
@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class APPLICATION_RECOVERY_CALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    APPLICATION_RECOVERY_CALLBACK(Pointer p) { super(p); }
    protected APPLICATION_RECOVERY_CALLBACK() { allocate(); }
    private native void allocate();
    public native @Cast("DWORD") int call(@Cast("PVOID") Pointer pvParameter);
}
