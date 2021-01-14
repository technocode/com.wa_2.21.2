package com.facebook.simplejni;

import X.AnonymousClass049;

public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    public class Destructor extends AnonymousClass049 {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        public static native void deleteNative(long j, long j2);

        public Destructor(Object obj, long j, long j2) {
            super(obj);
            this.mNativePointer = j;
            this.mNativeDestructorFunctionPointer = j2;
        }

        @Override // X.AnonymousClass049
        public void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0;
            }
        }
    }

    public NativeHolder(long j, long j2) {
        this.mNativePointer = j;
        this.mDestructor = new Destructor(this, j, j2);
    }

    public boolean isNativeEqual(NativeHolder nativeHolder) {
        return nativeHolder.mNativePointer == this.mNativePointer;
    }

    public synchronized void release() {
        this.mDestructor.destruct();
    }
}
