// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_saliency;

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

import static org.bytedeco.opencv.global.opencv_saliency.*;


/************************************ Static Saliency Base Class ************************************/
@Namespace("cv::saliency") @Properties(inherit = org.bytedeco.opencv.presets.opencv_saliency.class)
public class StaticSaliency extends Saliency {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StaticSaliency(Pointer p) { super(p); }
    /** Downcast constructor. */
    public StaticSaliency(Saliency pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::saliency::StaticSaliency*>") void allocate(Saliency pointer);
    /** Downcast constructor. */
    public StaticSaliency(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::saliency::StaticSaliency*>") void allocate(Algorithm pointer);
    public Saliency asSaliency() { return asSaliency(this); }
    @Namespace public static native @Name("static_cast<cv::saliency::Saliency*>") Saliency asSaliency(StaticSaliency pointer);


    /** \brief This function perform a binary map of given saliency map. This is obtained in this
    way:
    <p>
    In a first step, to improve the definition of interest areas and facilitate identification of
    targets, a segmentation by clustering is performed, using *K-means algorithm*. Then, to gain a
    binary representation of clustered saliency map, since values of the map can vary according to
    the characteristics of frame under analysis, it is not convenient to use a fixed threshold. So,
    *Otsu's algorithm* is used, which assumes that the image to be thresholded contains two classes
    of pixels or bi-modal histograms (e.g. foreground and back-ground pixels); later on, the
    algorithm calculates the optimal threshold separating those two classes, so that their
    intra-class variance is minimal.
    <p>
    @param _saliencyMap the saliency map obtained through one of the specialized algorithms
    @param _binaryMap the binary map
     */
  public native @Cast("bool") boolean computeBinaryMap( @ByVal Mat _saliencyMap, @ByVal Mat _binaryMap );
  public native @Cast("bool") boolean computeBinaryMap( @ByVal UMat _saliencyMap, @ByVal UMat _binaryMap );
  public native @Cast("bool") boolean computeBinaryMap( @ByVal GpuMat _saliencyMap, @ByVal GpuMat _binaryMap );

}
