// Targeted by JavaCPP version 1.5.12: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;


// #ifdef __USE_LARGEFILE64
/* Note stat64 has the same shape as stat for x86-64.  */
@Name("struct stat64") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class stat64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public stat64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public stat64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public stat64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public stat64 position(long position) {
        return (stat64)super.position(position);
    }
    @Override public stat64 getPointer(long i) {
        return new stat64((Pointer)this).offsetAddress(i);
    }

// # ifdef __USE_TIME_BITS64
// # else
    public native @Cast("__dev_t") long st_dev(); public native stat64 st_dev(long setter);		/* Device.  */
// #  ifdef __x86_64__
    public native @Cast("__ino64_t") long st_ino(); public native stat64 st_ino(long setter);		/* File serial number.  */
    public native @Cast("__nlink_t") long st_nlink(); public native stat64 st_nlink(long setter);		/* Link count.  */
    public native @Cast("__mode_t") int st_mode(); public native stat64 st_mode(int setter);		/* File mode.  */
// #  else
// #  endif
    public native @Cast("__uid_t") int st_uid(); public native stat64 st_uid(int setter);		/* User ID of the file's owner.	*/
    public native @Cast("__gid_t") int st_gid(); public native stat64 st_gid(int setter);		/* Group ID of the file's group.*/
// #  ifdef __x86_64__
    public native int __pad0(); public native stat64 __pad0(int setter);
    public native @Cast("__dev_t") long st_rdev(); public native stat64 st_rdev(long setter);		/* Device number, if device.  */
    public native @Cast("__off_t") long st_size(); public native stat64 st_size(long setter);		/* Size of file, in bytes.  */
// #  else
// #  endif
    public native @Cast("__blksize_t") long st_blksize(); public native stat64 st_blksize(long setter);	/* Optimal block size for I/O.  */
    public native @Cast("__blkcnt64_t") long st_blocks(); public native stat64 st_blocks(long setter);	/* Nr. 512-byte blocks allocated.  */
// #  ifdef __USE_XOPEN2K8
    /* Nanosecond resolution timestamps are stored in a format
       equivalent to 'struct timespec'.  This is the type used
       whenever possible but the Unix namespace rules do not allow the
       identifier 'timespec' to appear in the <sys/stat.h> header.
       Therefore we have to handle the use of this header in strictly
       standard-compliant sources special.  */
    public native @ByRef timespec st_atim(); public native stat64 st_atim(timespec setter);		/* Time of last access.  */
    public native @ByRef timespec st_mtim(); public native stat64 st_mtim(timespec setter);		/* Time of last modification.  */
    public native @ByRef timespec st_ctim(); public native stat64 st_ctim(timespec setter);		/* Time of last status change.  */
// #  else
// #  endif
// #  ifdef __x86_64__
    public native @Cast("__syscall_slong_t") long __glibc_reserved(int i); public native stat64 __glibc_reserved(int i, long setter);
    @MemberGetter public native @Cast("__syscall_slong_t*") SizeTPointer __glibc_reserved();
// #  else
// #  endif
// # endif /* __USE_TIME_BITS64  */
  }
