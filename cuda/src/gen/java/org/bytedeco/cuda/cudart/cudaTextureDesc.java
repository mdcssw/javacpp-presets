// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA texture descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaTextureDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaTextureDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaTextureDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaTextureDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaTextureDesc position(long position) {
        return (cudaTextureDesc)super.position(position);
    }
    @Override public cudaTextureDesc getPointer(long i) {
        return new cudaTextureDesc((Pointer)this).offsetAddress(i);
    }

    /**
     * Texture address mode for up to 3 dimensions
     */
    public native @Cast("cudaTextureAddressMode") int addressMode(int i); public native cudaTextureDesc addressMode(int i, int setter);
    @MemberGetter public native @Cast("cudaTextureAddressMode*") IntPointer addressMode();
    /**
     * Texture filter mode
     */
    public native @Cast("cudaTextureFilterMode") int filterMode(); public native cudaTextureDesc filterMode(int setter);
    /**
     * Texture read mode
     */
    public native @Cast("cudaTextureReadMode") int readMode(); public native cudaTextureDesc readMode(int setter);
    /**
     * Perform sRGB->linear conversion during texture read
     */
    public native int sRGB(); public native cudaTextureDesc sRGB(int setter);
    /**
     * Texture Border Color
     */
    public native float borderColor(int i); public native cudaTextureDesc borderColor(int i, float setter);
    @MemberGetter public native FloatPointer borderColor();
    /**
     * Indicates whether texture reads are normalized or not
     */
    public native int normalizedCoords(); public native cudaTextureDesc normalizedCoords(int setter);
    /**
     * Limit to the anisotropy ratio
     */
    public native @Cast("unsigned int") int maxAnisotropy(); public native cudaTextureDesc maxAnisotropy(int setter);
    /**
     * Mipmap filter mode
     */
    public native @Cast("cudaTextureFilterMode") int mipmapFilterMode(); public native cudaTextureDesc mipmapFilterMode(int setter);
    /**
     * Offset applied to the supplied mipmap level
     */
    public native float mipmapLevelBias(); public native cudaTextureDesc mipmapLevelBias(float setter);
    /**
     * Lower end of the mipmap level range to clamp access to
     */
    public native float minMipmapLevelClamp(); public native cudaTextureDesc minMipmapLevelClamp(float setter);
    /**
     * Upper end of the mipmap level range to clamp access to
     */
    public native float maxMipmapLevelClamp(); public native cudaTextureDesc maxMipmapLevelClamp(float setter);
    /**
     * Disable any trilinear filtering optimizations.
     */
    public native int disableTrilinearOptimization(); public native cudaTextureDesc disableTrilinearOptimization(int setter);
    /**
     * Enable seamless cube map filtering.
     */
    public native int seamlessCubemap(); public native cudaTextureDesc seamlessCubemap(int setter);
}
