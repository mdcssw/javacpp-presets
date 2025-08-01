// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \addtogroup ximgproc_filters
 *  \{
<p>
/** \brief  Applies Ridge Detection Filter to an input image.
Implements Ridge detection similar to the one in [Mathematica](http://reference.wolfram.com/language/ref/RidgeFilter.html)
using the eigen values from the Hessian Matrix of the input image using Sobel Derivatives.
Additional refinement can be done using Skeletonization and Binarization. Adapted from \cite segleafvein and \cite M_RF
<p>
*/
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class RidgeDetectionFilter extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RidgeDetectionFilter(Pointer p) { super(p); }
    /** Downcast constructor. */
    public RidgeDetectionFilter(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::ximgproc::RidgeDetectionFilter*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(RidgeDetectionFilter pointer);

    /**
    \brief Create pointer to the Ridge detection filter.
    @param ddepth  Specifies output image depth. Defualt is CV_32FC1
    @param dx Order of derivative x, default is 1
    @param dy  Order of derivative y, default is 1
    @param ksize Sobel kernel size , default is 3
    @param out_dtype Converted format for output, default is CV_8UC1
    @param scale Optional scale value for derivative values, default is 1
    @param delta  Optional bias added to output, default is 0
    @param borderType Pixel extrapolation method, default is BORDER_DEFAULT
    @see Sobel, threshold, getStructuringElement, morphologyEx.( for additional refinement)
    */
    public static native @Ptr RidgeDetectionFilter create(int ddepth/*=CV_32FC1*/, int dx/*=1*/, int dy/*=1*/, int ksize/*=3*/, int out_dtype/*=CV_8UC1*/, double scale/*=1*/, double delta/*=0*/, int borderType/*=cv::BORDER_DEFAULT*/);
    public static native @Ptr RidgeDetectionFilter create();
    /**
    \brief Apply Ridge detection filter on input image.
    @param _img InputArray as supported by Sobel. img can be 1-Channel or 3-Channels.
    @param out OutputAray of structure as RidgeDetectionFilter::ddepth. Output image with ridges.
    */
    public native void getRidgeFilteredImage(@ByVal Mat _img, @ByVal Mat out);
    public native void getRidgeFilteredImage(@ByVal UMat _img, @ByVal UMat out);
    public native void getRidgeFilteredImage(@ByVal GpuMat _img, @ByVal GpuMat out);
}
