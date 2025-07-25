// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief This class is used to perform the non-linear non-constrained minimization of a function,
<p>
defined on an {@code n}-dimensional Euclidean space, using the **Nelder-Mead method**, also known as
**downhill simplex method**. The basic idea about the method can be obtained from
<http://en.wikipedia.org/wiki/Nelder-Mead_method>.
<p>
It should be noted, that this method, although deterministic, is rather a heuristic and therefore
may converge to a local minima, not necessary a global one. It is iterative optimization technique,
which at each step uses an information about the values of a function evaluated only at {@code n+1}
points, arranged as a *simplex* in {@code n}-dimensional space (hence the second name of the method). At
each step new point is chosen to evaluate function at, obtained value is compared with previous
ones and based on this information simplex changes it's shape , slowly moving to the local minimum.
Thus this method is using *only* function values to make decision, on contrary to, say, Nonlinear
Conjugate Gradient method (which is also implemented in optim).
<p>
Algorithm stops when the number of function evaluations done exceeds termcrit.maxCount, when the
function values at the vertices of simplex are within termcrit.epsilon range or simplex becomes so
small that it can enclosed in a box with termcrit.epsilon sides, whatever comes first, for some
defined by user positive integer termcrit.maxCount and positive non-integer termcrit.epsilon.
<p>
\note DownhillSolver is a derivative of the abstract interface
cv::MinProblemSolver, which in turn is derived from the Algorithm interface and is used to
encapsulate the functionality, common to all non-linear optimization algorithms in the optim
module.
<p>
\note term criteria should meet following condition:
<pre>{@code
    termcrit.type == (TermCriteria::MAX_ITER + TermCriteria::EPS) && termcrit.epsilon > 0 && termcrit.maxCount > 0
}</pre>
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class DownhillSolver extends MinProblemSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DownhillSolver(Pointer p) { super(p); }

    /** \brief Returns the initial step that will be used in downhill simplex algorithm.
    <p>
    @param step Initial step that will be used in algorithm. Note, that although corresponding setter
    accepts column-vectors as well as row-vectors, this method will return a row-vector.
    @see DownhillSolver::setInitStep
     */
    public native void getInitStep(@ByVal Mat step);
    public native void getInitStep(@ByVal UMat step);
    public native void getInitStep(@ByVal GpuMat step);

    /** \brief Sets the initial step that will be used in downhill simplex algorithm.
    <p>
    Step, together with initial point (given in DownhillSolver::minimize) are two {@code n}-dimensional
    vectors that are used to determine the shape of initial simplex. Roughly said, initial point
    determines the position of a simplex (it will become simplex's centroid), while step determines the
    spread (size in each dimension) of a simplex. To be more precise, if {@code s,x_0\in\mathbb{R}^n} are
    the initial step and initial point respectively, the vertices of a simplex will be:
    {@code v_0:=x_0-\frac{1}{2} s} and {@code v_i:=x_0+s_i} for {@code i=1,2,\dots,n} where {@code s_i} denotes
    projections of the initial step of *n*-th coordinate (the result of projection is treated to be
    vector given by {@code s_i:=e_i\cdot\left<e_i\cdot s\right>}, where {@code e_i} form canonical basis)
    <p>
    @param step Initial step that will be used in algorithm. Roughly said, it determines the spread
    (size in each dimension) of an initial simplex.
     */
    public native void setInitStep(@ByVal Mat step);
    public native void setInitStep(@ByVal UMat step);
    public native void setInitStep(@ByVal GpuMat step);

    /** \brief This function returns the reference to the ready-to-use DownhillSolver object.
    <p>
    All the parameters are optional, so this procedure can be called even without parameters at
    all. In this case, the default values will be used. As default value for terminal criteria are
    the only sensible ones, MinProblemSolver::setFunction() and DownhillSolver::setInitStep()
    should be called upon the obtained object, if the respective parameters were not given to
    create(). Otherwise, the two ways (give parameters to createDownhillSolver() or miss them out
    and call the MinProblemSolver::setFunction() and DownhillSolver::setInitStep()) are absolutely
    equivalent (and will drop the same errors in the same way, should invalid input be detected).
    @param f Pointer to the function that will be minimized, similarly to the one you submit via
    MinProblemSolver::setFunction.
    @param initStep Initial step, that will be used to construct the initial simplex, similarly to the one
    you submit via MinProblemSolver::setInitStep.
    @param termcrit Terminal criteria to the algorithm, similarly to the one you submit via
    MinProblemSolver::setTermCriteria.
     */
    public static native @Ptr DownhillSolver create(@Ptr Function f/*=cv::Ptr<cv::MinProblemSolver::Function>()*/,
                                          @ByVal(nullValue = "cv::InputArray(cv::Mat_<double>(1,1,0.0))") Mat initStep,
                                          @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)") TermCriteria termcrit);
    public static native @Ptr DownhillSolver create();
    public static native @Ptr DownhillSolver create(@Ptr Function f/*=cv::Ptr<cv::MinProblemSolver::Function>()*/,
                                          @ByVal(nullValue = "cv::InputArray(cv::Mat_<double>(1,1,0.0))") UMat initStep,
                                          @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)") TermCriteria termcrit);
    public static native @Ptr DownhillSolver create(@Ptr Function f/*=cv::Ptr<cv::MinProblemSolver::Function>()*/,
                                          @ByVal(nullValue = "cv::InputArray(cv::Mat_<double>(1,1,0.0))") GpuMat initStep,
                                          @ByVal(nullValue = "cv::TermCriteria(cv::TermCriteria::MAX_ITER+cv::TermCriteria::EPS,5000,0.000001)") TermCriteria termcrit);
}
