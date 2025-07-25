// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.cminpack.global;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

public class cminpackl extends org.bytedeco.cminpack.presets.cminpackl {
    static { Loader.load(); }

// Parsed from cminpack.h

/* Header file for cminpack, by Frederic Devernay.
   The documentation for all functions can be found in the file
   minpack-documentation.txt from the distribution, or in the source
   code of each function. */

// #ifndef __CMINPACK_H__
// #define __CMINPACK_H__

/* The default floating-point type is "double" for C/C++ and "float" for CUDA,
   but you can change this by defining one of the following symbols when
   compiling the library, and before including cminpack.h when using it:
   __cminpack_long_double__ for long double (requires compiler support)
   __cminpack_double__ for double
   __cminpack_float__ for float
   __cminpack_half__ for half from the OpenEXR library (in this case, you must
                     compile cminpack with a C++ compiler)
*/
// #ifdef __cminpack_long_double__
// #endif

// #ifdef __cminpack_double__
// #define __cminpack_real__ double
// #endif

// #ifdef __cminpack_float__
// #endif

// #ifdef __cminpack_half__
// #endif

// #ifdef __cplusplus
// #endif /* __cplusplus */

//  #define CMINPACK_EXPORT

// #if defined(__CUDA_ARCH__) || defined(__CUDACC__)
// #else
// #define __cminpack_attr__
// #ifndef __cminpack_real__
// #endif
// #define __cminpack_type_fcn_nn__        typedef int (*cminpack_func_nn)
// #define __cminpack_type_fcnder_nn__     typedef int (*cminpack_funcder_nn)
// #define __cminpack_type_fcn_mn__        typedef int (*cminpack_func_mn)
// #define __cminpack_type_fcnder_mn__     typedef int (*cminpack_funcder_mn)
// #define __cminpack_type_fcnderstr_mn__  typedef int (*cminpack_funcderstr_mn)
// #define __cminpack_decl_fcn_nn__        cminpack_func_nn fcn_nn,
// #define __cminpack_decl_fcnder_nn__     cminpack_funcder_nn fcnder_nn,
// #define __cminpack_decl_fcn_mn__        cminpack_func_mn fcn_mn,
// #define __cminpack_decl_fcnder_mn__     cminpack_funcder_mn fcnder_mn,
// #define __cminpack_decl_fcnderstr_mn__  cminpack_funcderstr_mn fcnderstr_mn,
// #define __cminpack_param_fcn_nn__       fcn_nn,
// #define __cminpack_param_fcnder_nn__    fcnder_nn,
// #define __cminpack_param_fcn_mn__       fcn_mn,
// #define __cminpack_param_fcnder_mn__    fcnder_mn,
// #define __cminpack_param_fcnderstr_mn__ fcnderstr_mn,
// #endif

// #ifdef __cminpack_double__
// #define __cminpack_func__(func) func
// #define __cminpack_blas__(func) d ## func ## _
// #define __cminpack_lapack__(func) d ## func
// #endif

// #ifdef __cminpack_long_double__
// #endif

// #ifdef __cminpack_float__
// #endif

// #ifdef __cminpack_half__
// #endif

/* Declarations for minpack */

/* Function types: */
/* The first argument can be used to store extra function parameters, thus */
/* avoiding the use of global variables. */
/* the iflag parameter is input-only (with respect to the FORTRAN */
/*  version), the output iflag value is the return value of the function. */
/* If iflag=0, the function shoulkd just print the current values (see */
/* the nprint parameters below). */
  
/* for hybrd1 and hybrd: */
/*         calculate the functions at x and */
/*         return this vector in fvec. */
/* return a negative value to terminate hybrd1/hybrd */
public static class cminpack_func_nn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_func_nn(Pointer p) { super(p); }
    protected cminpack_func_nn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int n, @Const DoublePointer x, DoublePointer fvec, int iflag );
}

/* for hybrj1 and hybrj */
/*         if iflag = 1 calculate the functions at x and */
/*         return this vector in fvec. do not alter fjac. */
/*         if iflag = 2 calculate the jacobian at x and */
/*         return this matrix in fjac. do not alter fvec. */
/* return a negative value to terminate hybrj1/hybrj */
public static class cminpack_funcder_nn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_funcder_nn(Pointer p) { super(p); }
    protected cminpack_funcder_nn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int n, @Const DoublePointer x, DoublePointer fvec, DoublePointer fjac,
                                  int ldfjac, int iflag );
}

/* for lmdif1 and lmdif */
/*         calculate the functions at x and */
/*         return this vector in fvec. */
/*         if iflag = 1 the result is used to compute the residuals. */
/*         if iflag = 2 the result is used to compute the Jacobian by finite differences. */
/*         Jacobian computation requires exactly n function calls with iflag = 2. */
/* return a negative value to terminate lmdif1/lmdif */
public static class cminpack_func_mn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_func_mn(Pointer p) { super(p); }
    protected cminpack_func_mn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int m, int n, @Const DoublePointer x, DoublePointer fvec,
                               int iflag );
}

/* for lmder1 and lmder */
/*         if iflag = 1 calculate the functions at x and */
/*         return this vector in fvec. do not alter fjac. */
/*         if iflag = 2 calculate the jacobian at x and */
/*         return this matrix in fjac. do not alter fvec. */
/* return a negative value to terminate lmder1/lmder */
public static class cminpack_funcder_mn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_funcder_mn(Pointer p) { super(p); }
    protected cminpack_funcder_mn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int m, int n, @Const DoublePointer x, DoublePointer fvec,
                                  DoublePointer fjac, int ldfjac, int iflag );
}

/* for lmstr1 and lmstr */
/*         if iflag = 1 calculate the functions at x and */
/*         return this vector in fvec. */
/*         if iflag = i calculate the (i-1)-st row of the */
/*         jacobian at x and return this vector in fjrow. */
/* return a negative value to terminate lmstr1/lmstr */
public static class cminpack_funcderstr_mn extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    cminpack_funcderstr_mn(Pointer p) { super(p); }
    protected cminpack_funcderstr_mn() { allocate(); }
    private native void allocate();
    public native int call(Pointer p, int m, int n, @Const DoublePointer x, DoublePointer fvec,
                                     DoublePointer fjrow, int iflag );
}






/* MINPACK functions: */
/* the info parameter was removed from most functions: the return */
/* value of the function is used instead. */
/* The argument 'p' can be used to store extra function parameters, thus */
/* avoiding the use of global variables. You can also think of it as a */
/* 'this' pointer a la C++. */

/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (Jacobian calculated by
   a forward-difference approximation) */
public static native int hybrd1( cminpack_func_nn fcn_nn, 
	       Pointer p, int n, DoublePointer x, DoublePointer fvec, double tol,
	       DoublePointer wa, int lwa );
public static native int hybrd1( cminpack_func_nn fcn_nn, 
	       Pointer p, int n, DoubleBuffer x, DoubleBuffer fvec, double tol,
	       DoubleBuffer wa, int lwa );
public static native int hybrd1( cminpack_func_nn fcn_nn, 
	       Pointer p, int n, double[] x, double[] fvec, double tol,
	       double[] wa, int lwa );

/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (Jacobian calculated by
   a forward-difference approximation, more general). */
public static native int hybrd( cminpack_func_nn fcn_nn,
	      Pointer p, int n, DoublePointer x, DoublePointer fvec, double xtol, int maxfev,
	      int ml, int mu, double epsfcn, DoublePointer diag, int mode,
	      double factor, int nprint, IntPointer nfev,
	      DoublePointer fjac, int ldfjac, DoublePointer r, int lr, DoublePointer qtf,
	      DoublePointer wa1, DoublePointer wa2, DoublePointer wa3, DoublePointer wa4);
public static native int hybrd( cminpack_func_nn fcn_nn,
	      Pointer p, int n, DoubleBuffer x, DoubleBuffer fvec, double xtol, int maxfev,
	      int ml, int mu, double epsfcn, DoubleBuffer diag, int mode,
	      double factor, int nprint, IntBuffer nfev,
	      DoubleBuffer fjac, int ldfjac, DoubleBuffer r, int lr, DoubleBuffer qtf,
	      DoubleBuffer wa1, DoubleBuffer wa2, DoubleBuffer wa3, DoubleBuffer wa4);
public static native int hybrd( cminpack_func_nn fcn_nn,
	      Pointer p, int n, double[] x, double[] fvec, double xtol, int maxfev,
	      int ml, int mu, double epsfcn, double[] diag, int mode,
	      double factor, int nprint, int[] nfev,
	      double[] fjac, int ldfjac, double[] r, int lr, double[] qtf,
	      double[] wa1, double[] wa2, double[] wa3, double[] wa4);
  
/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (user-supplied Jacobian) */
public static native int hybrj1( cminpack_funcder_nn fcnder_nn, Pointer p, int n, DoublePointer x,
	       DoublePointer fvec, DoublePointer fjac, int ldfjac, double tol,
	       DoublePointer wa, int lwa );
public static native int hybrj1( cminpack_funcder_nn fcnder_nn, Pointer p, int n, DoubleBuffer x,
	       DoubleBuffer fvec, DoubleBuffer fjac, int ldfjac, double tol,
	       DoubleBuffer wa, int lwa );
public static native int hybrj1( cminpack_funcder_nn fcnder_nn, Pointer p, int n, double[] x,
	       double[] fvec, double[] fjac, int ldfjac, double tol,
	       double[] wa, int lwa );
          
/* find a zero of a system of N nonlinear functions in N variables by
   a modification of the Powell hybrid method (user-supplied Jacobian,
   more general) */
public static native int hybrj( cminpack_funcder_nn fcnder_nn, Pointer p, int n, DoublePointer x,
	      DoublePointer fvec, DoublePointer fjac, int ldfjac, double xtol,
	      int maxfev, DoublePointer diag, int mode, double factor,
	      int nprint, IntPointer nfev, IntPointer njev, DoublePointer r,
	      int lr, DoublePointer qtf, DoublePointer wa1, DoublePointer wa2,
	      DoublePointer wa3, DoublePointer wa4 );
public static native int hybrj( cminpack_funcder_nn fcnder_nn, Pointer p, int n, DoubleBuffer x,
	      DoubleBuffer fvec, DoubleBuffer fjac, int ldfjac, double xtol,
	      int maxfev, DoubleBuffer diag, int mode, double factor,
	      int nprint, IntBuffer nfev, IntBuffer njev, DoubleBuffer r,
	      int lr, DoubleBuffer qtf, DoubleBuffer wa1, DoubleBuffer wa2,
	      DoubleBuffer wa3, DoubleBuffer wa4 );
public static native int hybrj( cminpack_funcder_nn fcnder_nn, Pointer p, int n, double[] x,
	      double[] fvec, double[] fjac, int ldfjac, double xtol,
	      int maxfev, double[] diag, int mode, double factor,
	      int nprint, int[] nfev, int[] njev, double[] r,
	      int lr, double[] qtf, double[] wa1, double[] wa2,
	      double[] wa3, double[] wa4 );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (Jacobian calculated by a forward-difference approximation) */
public static native int lmdif1( cminpack_func_mn fcn_mn,
	       Pointer p, int m, int n, DoublePointer x, DoublePointer fvec, double tol,
	       IntPointer iwa, DoublePointer wa, int lwa );
public static native int lmdif1( cminpack_func_mn fcn_mn,
	       Pointer p, int m, int n, DoubleBuffer x, DoubleBuffer fvec, double tol,
	       IntBuffer iwa, DoubleBuffer wa, int lwa );
public static native int lmdif1( cminpack_func_mn fcn_mn,
	       Pointer p, int m, int n, double[] x, double[] fvec, double tol,
	       int[] iwa, double[] wa, int lwa );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (Jacobian calculated by a forward-difference approximation, more
   general) */
public static native int lmdif( cminpack_func_mn fcn_mn,
	      Pointer p, int m, int n, DoublePointer x, DoublePointer fvec, double ftol,
	      double xtol, double gtol, int maxfev, double epsfcn,
	      DoublePointer diag, int mode, double factor, int nprint,
	      IntPointer nfev, DoublePointer fjac, int ldfjac, IntPointer ipvt,
	      DoublePointer qtf, DoublePointer wa1, DoublePointer wa2, DoublePointer wa3,
	      DoublePointer wa4 );
public static native int lmdif( cminpack_func_mn fcn_mn,
	      Pointer p, int m, int n, DoubleBuffer x, DoubleBuffer fvec, double ftol,
	      double xtol, double gtol, int maxfev, double epsfcn,
	      DoubleBuffer diag, int mode, double factor, int nprint,
	      IntBuffer nfev, DoubleBuffer fjac, int ldfjac, IntBuffer ipvt,
	      DoubleBuffer qtf, DoubleBuffer wa1, DoubleBuffer wa2, DoubleBuffer wa3,
	      DoubleBuffer wa4 );
public static native int lmdif( cminpack_func_mn fcn_mn,
	      Pointer p, int m, int n, double[] x, double[] fvec, double ftol,
	      double xtol, double gtol, int maxfev, double epsfcn,
	      double[] diag, int mode, double factor, int nprint,
	      int[] nfev, double[] fjac, int ldfjac, int[] ipvt,
	      double[] qtf, double[] wa1, double[] wa2, double[] wa3,
	      double[] wa4 );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian) */
public static native int lmder1( cminpack_funcder_mn fcnder_mn,
	       Pointer p, int m, int n, DoublePointer x, DoublePointer fvec, DoublePointer fjac,
	       int ldfjac, double tol, IntPointer ipvt,
	       DoublePointer wa, int lwa );
public static native int lmder1( cminpack_funcder_mn fcnder_mn,
	       Pointer p, int m, int n, DoubleBuffer x, DoubleBuffer fvec, DoubleBuffer fjac,
	       int ldfjac, double tol, IntBuffer ipvt,
	       DoubleBuffer wa, int lwa );
public static native int lmder1( cminpack_funcder_mn fcnder_mn,
	       Pointer p, int m, int n, double[] x, double[] fvec, double[] fjac,
	       int ldfjac, double tol, int[] ipvt,
	       double[] wa, int lwa );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian, more general) */
public static native int lmder( cminpack_funcder_mn fcnder_mn,
	      Pointer p, int m, int n, DoublePointer x, DoublePointer fvec, DoublePointer fjac,
	      int ldfjac, double ftol, double xtol, double gtol,
	      int maxfev, DoublePointer diag, int mode, double factor,
	      int nprint, IntPointer nfev, IntPointer njev, IntPointer ipvt,
	      DoublePointer qtf, DoublePointer wa1, DoublePointer wa2, DoublePointer wa3,
	      DoublePointer wa4 );
public static native int lmder( cminpack_funcder_mn fcnder_mn,
	      Pointer p, int m, int n, DoubleBuffer x, DoubleBuffer fvec, DoubleBuffer fjac,
	      int ldfjac, double ftol, double xtol, double gtol,
	      int maxfev, DoubleBuffer diag, int mode, double factor,
	      int nprint, IntBuffer nfev, IntBuffer njev, IntBuffer ipvt,
	      DoubleBuffer qtf, DoubleBuffer wa1, DoubleBuffer wa2, DoubleBuffer wa3,
	      DoubleBuffer wa4 );
public static native int lmder( cminpack_funcder_mn fcnder_mn,
	      Pointer p, int m, int n, double[] x, double[] fvec, double[] fjac,
	      int ldfjac, double ftol, double xtol, double gtol,
	      int maxfev, double[] diag, int mode, double factor,
	      int nprint, int[] nfev, int[] njev, int[] ipvt,
	      double[] qtf, double[] wa1, double[] wa2, double[] wa3,
	      double[] wa4 );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian, minimal storage) */
public static native int lmstr1( cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m, int n,
	       DoublePointer x, DoublePointer fvec, DoublePointer fjac, int ldfjac,
	       double tol, IntPointer ipvt, DoublePointer wa, int lwa );
public static native int lmstr1( cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m, int n,
	       DoubleBuffer x, DoubleBuffer fvec, DoubleBuffer fjac, int ldfjac,
	       double tol, IntBuffer ipvt, DoubleBuffer wa, int lwa );
public static native int lmstr1( cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m, int n,
	       double[] x, double[] fvec, double[] fjac, int ldfjac,
	       double tol, int[] ipvt, double[] wa, int lwa );

/* minimize the sum of the squares of nonlinear functions in N
   variables by a modification of the Levenberg-Marquardt algorithm
   (user-supplied Jacobian, minimal storage, more general) */
public static native int lmstr(  cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m,
	      int n, DoublePointer x, DoublePointer fvec, DoublePointer fjac,
	      int ldfjac, double ftol, double xtol, double gtol,
	      int maxfev, DoublePointer diag, int mode, double factor,
	      int nprint, IntPointer nfev, IntPointer njev, IntPointer ipvt,
	      DoublePointer qtf, DoublePointer wa1, DoublePointer wa2, DoublePointer wa3,
	      DoublePointer wa4 );
public static native int lmstr(  cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m,
	      int n, DoubleBuffer x, DoubleBuffer fvec, DoubleBuffer fjac,
	      int ldfjac, double ftol, double xtol, double gtol,
	      int maxfev, DoubleBuffer diag, int mode, double factor,
	      int nprint, IntBuffer nfev, IntBuffer njev, IntBuffer ipvt,
	      DoubleBuffer qtf, DoubleBuffer wa1, DoubleBuffer wa2, DoubleBuffer wa3,
	      DoubleBuffer wa4 );
public static native int lmstr(  cminpack_funcderstr_mn fcnderstr_mn, Pointer p, int m,
	      int n, double[] x, double[] fvec, double[] fjac,
	      int ldfjac, double ftol, double xtol, double gtol,
	      int maxfev, double[] diag, int mode, double factor,
	      int nprint, int[] nfev, int[] njev, int[] ipvt,
	      double[] qtf, double[] wa1, double[] wa2, double[] wa3,
	      double[] wa4 );
 
public static native void chkder( int m, int n, @Const DoublePointer x, DoublePointer fvec, DoublePointer fjac,
	       int ldfjac, DoublePointer xp, DoublePointer fvecp, int mode,
	       DoublePointer err  );
public static native void chkder( int m, int n, @Const DoubleBuffer x, DoubleBuffer fvec, DoubleBuffer fjac,
	       int ldfjac, DoubleBuffer xp, DoubleBuffer fvecp, int mode,
	       DoubleBuffer err  );
public static native void chkder( int m, int n, @Const double[] x, double[] fvec, double[] fjac,
	       int ldfjac, double[] xp, double[] fvecp, int mode,
	       double[] err  );

public static native double dpmpar( int i );

public static native double enorm( int n, @Const DoublePointer x );
public static native double enorm( int n, @Const DoubleBuffer x );
public static native double enorm( int n, @Const double[] x );

/* compute a forward-difference approximation to the m by n jacobian
   matrix associated with a specified problem of m functions in n
   variables. */
public static native int fdjac2(cminpack_func_mn fcn_mn,
	     Pointer p, int m, int n, DoublePointer x, @Const DoublePointer fvec, DoublePointer fjac,
	     int ldfjac, double epsfcn, DoublePointer wa);
public static native int fdjac2(cminpack_func_mn fcn_mn,
	     Pointer p, int m, int n, DoubleBuffer x, @Const DoubleBuffer fvec, DoubleBuffer fjac,
	     int ldfjac, double epsfcn, DoubleBuffer wa);
public static native int fdjac2(cminpack_func_mn fcn_mn,
	     Pointer p, int m, int n, double[] x, @Const double[] fvec, double[] fjac,
	     int ldfjac, double epsfcn, double[] wa);

/* compute a forward-difference approximation to the n by n jacobian
   matrix associated with a specified problem of n functions in n
   variables. if the jacobian has a banded form, then function
   evaluations are saved by only approximating the nonzero terms. */
public static native int fdjac1(cminpack_func_nn fcn_nn,
	     Pointer p, int n, DoublePointer x, @Const DoublePointer fvec, DoublePointer fjac, int ldfjac,
	     int ml, int mu, double epsfcn, DoublePointer wa1,
	     DoublePointer wa2);
public static native int fdjac1(cminpack_func_nn fcn_nn,
	     Pointer p, int n, DoubleBuffer x, @Const DoubleBuffer fvec, DoubleBuffer fjac, int ldfjac,
	     int ml, int mu, double epsfcn, DoubleBuffer wa1,
	     DoubleBuffer wa2);
public static native int fdjac1(cminpack_func_nn fcn_nn,
	     Pointer p, int n, double[] x, @Const double[] fvec, double[] fjac, int ldfjac,
	     int ml, int mu, double epsfcn, double[] wa1,
	     double[] wa2);

/* compute inverse(JtJ) after a run of lmdif or lmder. The covariance matrix is obtained
   by scaling the result by enorm(y)**2/(m-n). If JtJ is singular and k = rank(J), the
   pseudo-inverse is computed, and the result has to be scaled by enorm(y)**2/(m-k). */
public static native void covar(int n, DoublePointer r, int ldr, 
           @Const IntPointer ipvt, double tol, DoublePointer wa);
public static native void covar(int n, DoubleBuffer r, int ldr, 
           @Const IntBuffer ipvt, double tol, DoubleBuffer wa);
public static native void covar(int n, double[] r, int ldr, 
           @Const int[] ipvt, double tol, double[] wa);

/* covar1 estimates the variance-covariance matrix:
   C = sigma**2 (JtJ)**+
   where (JtJ)**+ is the inverse of JtJ or the pseudo-inverse of JtJ (in case J does not have full rank),
   and sigma**2 = fsumsq / (m - k)
   where fsumsq is the residual sum of squares and k is the rank of J.
   The function returns 0 if J has full rank, else the rank of J.
*/
public static native int covar1(int m, int n, double fsumsq, DoublePointer r, int ldr, 
                           @Const IntPointer ipvt, double tol, DoublePointer wa);
public static native int covar1(int m, int n, double fsumsq, DoubleBuffer r, int ldr, 
                           @Const IntBuffer ipvt, double tol, DoubleBuffer wa);
public static native int covar1(int m, int n, double fsumsq, double[] r, int ldr, 
                           @Const int[] ipvt, double tol, double[] wa);

/* internal MINPACK subroutines */
public static native void dogleg(int n, @Const DoublePointer r, int lr, 
             @Const DoublePointer diag, @Const DoublePointer qtb, double delta, DoublePointer x, 
             DoublePointer wa1, DoublePointer wa2);
public static native void dogleg(int n, @Const DoubleBuffer r, int lr, 
             @Const DoubleBuffer diag, @Const DoubleBuffer qtb, double delta, DoubleBuffer x, 
             DoubleBuffer wa1, DoubleBuffer wa2);
public static native void dogleg(int n, @Const double[] r, int lr, 
             @Const double[] diag, @Const double[] qtb, double delta, double[] x, 
             double[] wa1, double[] wa2);
public static native void qrfac(int m, int n, DoublePointer a, int lda, int pivot, IntPointer ipvt, int lipvt, DoublePointer rdiag,
            DoublePointer acnorm, DoublePointer wa);
public static native void qrfac(int m, int n, DoubleBuffer a, int lda, int pivot, IntBuffer ipvt, int lipvt, DoubleBuffer rdiag,
            DoubleBuffer acnorm, DoubleBuffer wa);
public static native void qrfac(int m, int n, double[] a, int lda, int pivot, int[] ipvt, int lipvt, double[] rdiag,
            double[] acnorm, double[] wa);
public static native void qrsolv(int n, DoublePointer r, int ldr, 
             @Const IntPointer ipvt, @Const DoublePointer diag, @Const DoublePointer qtb, DoublePointer x, 
             DoublePointer sdiag, DoublePointer wa);
public static native void qrsolv(int n, DoubleBuffer r, int ldr, 
             @Const IntBuffer ipvt, @Const DoubleBuffer diag, @Const DoubleBuffer qtb, DoubleBuffer x, 
             DoubleBuffer sdiag, DoubleBuffer wa);
public static native void qrsolv(int n, double[] r, int ldr, 
             @Const int[] ipvt, @Const double[] diag, @Const double[] qtb, double[] x, 
             double[] sdiag, double[] wa);
public static native void qform(int m, int n, DoublePointer q, int ldq, DoublePointer wa);
public static native void qform(int m, int n, DoubleBuffer q, int ldq, DoubleBuffer wa);
public static native void qform(int m, int n, double[] q, int ldq, double[] wa);
public static native void r1updt(int m, int n, DoublePointer s, int ls, @Const DoublePointer u, DoublePointer v, DoublePointer w, IntPointer sing);
public static native void r1updt(int m, int n, DoubleBuffer s, int ls, @Const DoubleBuffer u, DoubleBuffer v, DoubleBuffer w, IntBuffer sing);
public static native void r1updt(int m, int n, double[] s, int ls, @Const double[] u, double[] v, double[] w, int[] sing);
public static native void r1mpyq(int m, int n, DoublePointer a, int lda, @Const DoublePointer v, @Const DoublePointer w);
public static native void r1mpyq(int m, int n, DoubleBuffer a, int lda, @Const DoubleBuffer v, @Const DoubleBuffer w);
public static native void r1mpyq(int m, int n, double[] a, int lda, @Const double[] v, @Const double[] w);
public static native void lmpar(int n, DoublePointer r, int ldr, 
            @Const IntPointer ipvt, @Const DoublePointer diag, @Const DoublePointer qtb, double delta, 
            DoublePointer par, DoublePointer x, DoublePointer sdiag, DoublePointer wa1, 
            DoublePointer wa2);
public static native void lmpar(int n, DoubleBuffer r, int ldr, 
            @Const IntBuffer ipvt, @Const DoubleBuffer diag, @Const DoubleBuffer qtb, double delta, 
            DoubleBuffer par, DoubleBuffer x, DoubleBuffer sdiag, DoubleBuffer wa1, 
            DoubleBuffer wa2);
public static native void lmpar(int n, double[] r, int ldr, 
            @Const int[] ipvt, @Const double[] diag, @Const double[] qtb, double delta, 
            double[] par, double[] x, double[] sdiag, double[] wa1, 
            double[] wa2);
public static native void rwupdt(int n, DoublePointer r, int ldr, 
             @Const DoublePointer w, DoublePointer b, DoublePointer alpha, DoublePointer cos, 
             DoublePointer sin);
public static native void rwupdt(int n, DoubleBuffer r, int ldr, 
             @Const DoubleBuffer w, DoubleBuffer b, DoubleBuffer alpha, DoubleBuffer cos, 
             DoubleBuffer sin);
public static native void rwupdt(int n, double[] r, int ldr, 
             @Const double[] w, double[] b, double[] alpha, double[] cos, 
             double[] sin);
// #ifdef __cplusplus
// #endif /* __cplusplus */


// #endif /* __CMINPACK_H__ */


}
