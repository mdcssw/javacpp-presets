// Targeted by JavaCPP version 1.5.13-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<cv::Point3f>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Point3fVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Point3fVector(Pointer p) { super(p); }
    public Point3fVector(Point3f value) { this(1); put(0, value); }
    public Point3fVector(Point3f ... array) { this(array.length); put(array); }
    public Point3fVector()       { allocate();  }
    public Point3fVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef Point3fVector put(@ByRef Point3fVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public Point3f front() { return get(0); }
    public Point3f back() { return get(size() - 1); }
    @Index(function = "at") public native @ByRef Point3f get(@Cast("size_t") long i);
    public native Point3fVector put(@Cast("size_t") long i, Point3f value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Point3f value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const Point3f get();
    }

    public Point3f[] get() {
        Point3f[] array = new Point3f[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Point3f pop_back() {
        long size = size();
        Point3f value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public Point3fVector push_back(Point3f value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public Point3fVector put(Point3f value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public Point3fVector put(Point3f ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

