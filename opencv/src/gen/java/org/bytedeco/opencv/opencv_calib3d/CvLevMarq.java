// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_calib3d;

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

import static org.bytedeco.opencv.global.opencv_calib3d.*;
 // extern "C"

//////////////////////////////////////////////////////////////////////////////////////////
@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_calib3d.class)
public class CvLevMarq extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvLevMarq(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvLevMarq(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvLevMarq position(long position) {
        return (CvLevMarq)super.position(position);
    }
    @Override public CvLevMarq getPointer(long i) {
        return new CvLevMarq((Pointer)this).offsetAddress(i);
    }

    public CvLevMarq() { super((Pointer)null); allocate(); }
    private native void allocate();
    public CvLevMarq( int nparams, int nerrs, @ByVal(nullValue = "CvTermCriteria(cvTermCriteria(CV_TERMCRIT_EPS+CV_TERMCRIT_ITER,30,DBL_EPSILON))") CvTermCriteria criteria,
                  @Cast("bool") boolean completeSymmFlag/*=false*/ ) { super((Pointer)null); allocate(nparams, nerrs, criteria, completeSymmFlag); }
    private native void allocate( int nparams, int nerrs, @ByVal(nullValue = "CvTermCriteria(cvTermCriteria(CV_TERMCRIT_EPS+CV_TERMCRIT_ITER,30,DBL_EPSILON))") CvTermCriteria criteria,
                  @Cast("bool") boolean completeSymmFlag/*=false*/ );
    public CvLevMarq( int nparams, int nerrs ) { super((Pointer)null); allocate(nparams, nerrs); }
    private native void allocate( int nparams, int nerrs );
    public native void init( int nparams, int nerrs, @ByVal(nullValue = "CvTermCriteria(cvTermCriteria(CV_TERMCRIT_EPS+CV_TERMCRIT_ITER,30,DBL_EPSILON))") CvTermCriteria criteria,
                  @Cast("bool") boolean completeSymmFlag/*=false*/ );
    public native void init( int nparams, int nerrs );
    public native @Cast("bool") boolean update( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat J, @ByPtrRef CvMat err );
    public native @Cast("bool") boolean updateAlt( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat JtJ, @ByPtrRef CvMat JtErr, @ByPtrRef DoublePointer errNorm );
    public native @Cast("bool") boolean updateAlt( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat JtJ, @ByPtrRef CvMat JtErr, @ByPtrRef DoubleBuffer errNorm );
    public native @Cast("bool") boolean updateAlt( @Const @ByPtrRef CvMat param, @ByPtrRef CvMat JtJ, @ByPtrRef CvMat JtErr, @ByPtrRef double[] errNorm );

    public native void clear();
    public native void step();
    /** enum CvLevMarq:: */
    public static final int DONE = 0, STARTED = 1, CALC_J = 2, CHECK_ERR = 3;

    public native @Ptr CvMat mask(); public native CvLevMarq mask(CvMat setter);
    public native @Ptr CvMat prevParam(); public native CvLevMarq prevParam(CvMat setter);
    public native @Ptr CvMat param(); public native CvLevMarq param(CvMat setter);
    public native @Ptr CvMat J(); public native CvLevMarq J(CvMat setter);
    public native @Ptr CvMat err(); public native CvLevMarq err(CvMat setter);
    public native @Ptr CvMat JtJ(); public native CvLevMarq JtJ(CvMat setter);
    public native @Ptr CvMat JtJN(); public native CvLevMarq JtJN(CvMat setter);
    public native @Ptr CvMat JtErr(); public native CvLevMarq JtErr(CvMat setter);
    public native @Ptr CvMat JtJV(); public native CvLevMarq JtJV(CvMat setter);
    public native @Ptr CvMat JtJW(); public native CvLevMarq JtJW(CvMat setter);
    public native double prevErrNorm(); public native CvLevMarq prevErrNorm(double setter);
    public native double errNorm(); public native CvLevMarq errNorm(double setter);
    public native int lambdaLg10(); public native CvLevMarq lambdaLg10(int setter);
    public native @ByRef CvTermCriteria criteria(); public native CvLevMarq criteria(CvTermCriteria setter);
    public native int state(); public native CvLevMarq state(int setter);
    public native int iters(); public native CvLevMarq iters(int setter);
    public native @Cast("bool") boolean completeSymmFlag(); public native CvLevMarq completeSymmFlag(boolean setter);
    public native int solveMethod(); public native CvLevMarq solveMethod(int setter);
}
