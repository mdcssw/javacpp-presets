// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/** \brief Class implementing VGG (Oxford Visual Geometry Group) descriptor trained end to end
using "Descriptor Learning Using Convex Optimisation" (DLCO) aparatus described in \cite Simonyan14.
<p>
@param desc type of descriptor to use, VGG::VGG_120 is default (120 dimensions float)
Available types are VGG::VGG_120, VGG::VGG_80, VGG::VGG_64, VGG::VGG_48
@param isigma gaussian kernel value for image blur (default is 1.4f)
@param img_normalize use image sample intensity normalization (enabled by default)
@param use_orientation sample patterns using keypoints orientation, enabled by default
@param scale_factor adjust the sampling window of detected keypoints to 64.0f (VGG sampling window)
6.25f is default and fits for KAZE, SURF detected keypoints window ratio
6.75f should be the scale for SIFT detected keypoints window ratio
5.00f should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints window ratio
0.75f should be the scale for ORB keypoints ratio
<p>
@param dsc_normalize clamp descriptors to 255 and convert to uchar CV_8UC1 (disabled by default)
 <p>
 */
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class VGG extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VGG(Pointer p) { super(p); }
    /** Downcast constructor. */
    public VGG(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::xfeatures2d::VGG*>") void allocate(Algorithm pointer);


    /** enum cv::xfeatures2d::VGG:: */
    public static final int
        VGG_120 = 100, VGG_80 = 101, VGG_64 = 102, VGG_48 = 103;

    public static native @Ptr VGG create( int desc/*=cv::xfeatures2d::VGG::VGG_120*/, float isigma/*=1.4f*/,
                                        @Cast("bool") boolean img_normalize/*=true*/, @Cast("bool") boolean use_scale_orientation/*=true*/,
                                        float scale_factor/*=6.25f*/, @Cast("bool") boolean dsc_normalize/*=false*/ );
    public static native @Ptr VGG create( );

    public native @Str @Override BytePointer getDefaultName();

    public native void setSigma(float isigma);
    public native float getSigma();

    public native void setUseNormalizeImage(@Cast("const bool") boolean img_normalize);
    public native @Cast("bool") boolean getUseNormalizeImage();

    public native void setUseScaleOrientation(@Cast("const bool") boolean use_scale_orientation);
    public native @Cast("bool") boolean getUseScaleOrientation();

    public native void setScaleFactor(float scale_factor);
    public native float getScaleFactor();

    public native void setUseNormalizeDescriptor(@Cast("const bool") boolean dsc_normalize);
    public native @Cast("bool") boolean getUseNormalizeDescriptor();
}
