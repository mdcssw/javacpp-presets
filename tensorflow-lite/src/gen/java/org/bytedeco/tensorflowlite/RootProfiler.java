// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


/** A root profiler instance installed in TFLite runtime.
 *  It's capable to dispatching profiling events to all child profilers attached
 *  to it. Child profilers can either accept for discard the events based on the
 *  event type. */
@Namespace("tflite::profiling") @NoOffset @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class RootProfiler extends Profiler {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RootProfiler(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RootProfiler(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RootProfiler position(long position) {
        return (RootProfiler)super.position(position);
    }
    @Override public RootProfiler getPointer(long i) {
        return new RootProfiler((Pointer)this).offsetAddress(i);
    }

  public RootProfiler() { super((Pointer)null); allocate(); }
  private native void allocate();

  // Not copiable.
  
  

  // Movable.
  public RootProfiler(@ByRef(true) RootProfiler arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByRef(true) RootProfiler arg0);
  public native @ByRef @Name("operator =") RootProfiler put(@ByRef(true) RootProfiler arg0);

  /** Adds a profiler to root profiler.
   *  Added {@code profiler} should not be nullptr or it will be ignored.
   *  Caller must retains the ownership. The lifetime should exceed the
   *  lifetime of the RootProfiler. */
  public native void AddProfiler(Profiler profiler);

  /** Adds a profiler to RootProfiler.
   *  Added {@code profiler} should not be nullptr or it will be ignored.
   *  Transfers the ownership of {@code profiler} to RootProfiler. */

  /** Signals the beginning of an event to all child profilers.
   *  The {@code tag}, {@code event_metadata1} and {@code event_metadata2} arguments have
   *  different interpretations based on the actual Profiler instance
   *  and the {@code event_type}.
   *  Returns a handle to the profile event which can be used in a later
   *  {@code EndEvent} call. */
  public native @Cast("uint32_t") int BeginEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::profiling::RootProfiler::EventType") int event_type,
                        @Cast("int64_t") long event_metadata1,
                        @Cast("int64_t") long event_metadata2);
  public native @Cast("uint32_t") int BeginEvent(String tag, @Cast("tflite::profiling::RootProfiler::EventType") int event_type,
                        @Cast("int64_t") long event_metadata1,
                        @Cast("int64_t") long event_metadata2);

  /** Signals an end to the specified profile event to all child profilers with
   *  'event_metadata's.
   *  An invalid event handle (e.g. not a value returned from BeginEvent call or
   *  a handle invalidated by RemoveChildProfilers) will be ignored. */
  public native void EndEvent(@Cast("uint32_t") int event_handle, @Cast("int64_t") long event_metadata1,
                  @Cast("int64_t") long event_metadata2);
  /** Signals an end to the specified profile event to all child profilers.
   *  An invalid event handle (e.g. not a value returned from BeginEvent call or
   *  a handle invalidated by RemoveChildProfilers) will be ignored. */
  public native void EndEvent(@Cast("uint32_t") int event_handle);

  /** Appends an event of type 'event_type' with 'tag' and 'event_metadata'
   *  The {@code tag}, {@code metric}, {@code event_metadata1} and {@code event_metadata2} arguments
   *  have different interpretations based on the actual Profiler instance and
   *  the {@code event_type}. */
  public native void AddEvent(@Cast("const char*") BytePointer tag, @Cast("tflite::profiling::RootProfiler::EventType") int event_type, @Cast("uint64_t") long metric,
                  @Cast("int64_t") long event_metadata1, @Cast("int64_t") long event_metadata2);
  public native void AddEvent(String tag, @Cast("tflite::profiling::RootProfiler::EventType") int event_type, @Cast("uint64_t") long metric,
                  @Cast("int64_t") long event_metadata1, @Cast("int64_t") long event_metadata2);

  // Adds a profiler event with data.
  // Data will be a const TelemetrySettings* for TELEMETRY_REPORT_SETTINGS
  // and TELEMETRY_DELEGATE_REPORT_SETTINGS.
  public native void AddEventWithData(@Cast("const char*") BytePointer tag, @Cast("tflite::profiling::RootProfiler::EventType") int event_type,
                          @Const Pointer data);
  public native void AddEventWithData(String tag, @Cast("tflite::profiling::RootProfiler::EventType") int event_type,
                          @Const Pointer data);

  /** Removes all child profilers and releases the child profiler if it's owned
   *  by the root profiler. Also invalidates all event handles generated
   *  from previous {@code BeginEvent} calls. */
  public native void RemoveChildProfilers();
}
