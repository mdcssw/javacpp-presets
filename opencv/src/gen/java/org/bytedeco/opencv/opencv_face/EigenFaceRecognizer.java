// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;


@Namespace("cv::face") @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class EigenFaceRecognizer extends BasicFaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EigenFaceRecognizer(Pointer p) { super(p); }
    /** Downcast constructor. */
    public EigenFaceRecognizer(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::face::EigenFaceRecognizer*>") void allocate(Algorithm pointer);

    /**
    @param num_components The number of components (read: Eigenfaces) kept for this Principal
    Component Analysis. As a hint: There's no rule how many components (read: Eigenfaces) should be
    kept for good reconstruction capabilities. It is based on your input data, so experiment with the
    number. Keeping 80 components should almost always be sufficient.
    @param threshold The threshold applied in the prediction.
    <p>
    ### Notes:
    <p>
    -   Training and prediction must be done on grayscale images, use cvtColor to convert between the
        color spaces.
    -   **THE EIGENFACES METHOD MAKES THE ASSUMPTION, THAT THE TRAINING AND TEST IMAGES ARE OF EQUAL
        SIZE.** (caps-lock, because I got so many mails asking for this). You have to make sure your
        input data has the correct shape, else a meaningful exception is thrown. Use resize to resize
        the images.
    -   This model does not support updating.
    <p>
    ### Model internal data:
    <p>
    -   num_components see EigenFaceRecognizer::create.
    -   threshold see EigenFaceRecognizer::create.
    -   eigenvalues The eigenvalues for this Principal Component Analysis (ordered descending).
    -   eigenvectors The eigenvectors for this Principal Component Analysis (ordered by their
        eigenvalue).
    -   mean The sample mean calculated from the training data.
    -   projections The projections of the training data.
    -   labels The threshold applied in the prediction. If the distance to the nearest neighbor is
        larger than the threshold, this method returns -1.
     */
    public static native @Ptr EigenFaceRecognizer create(int num_components/*=0*/, double threshold/*=DBL_MAX*/);
    public static native @Ptr EigenFaceRecognizer create();
}
