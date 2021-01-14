package com.facebook.jni;

import X.AbstractC20850xU;
import X.C008003w;

public class HybridData {
    public Destructor mDestructor = new Destructor(this);

    static {
        C008003w.A00("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    public class Destructor extends AbstractC20850xU {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        public Destructor(Object obj) {
            super(obj);
        }

        @Override // X.AbstractC20850xU
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }
}
