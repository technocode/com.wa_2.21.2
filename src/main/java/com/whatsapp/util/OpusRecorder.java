package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder implements Closeable {
    public long nativeHandle;

    private native void allocateNative(String str, int i);

    private native void freeNative();

    public native void prepare();

    public native void start();

    public native void stop();

    public OpusRecorder(String str, int i) {
        allocateNative(str, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        freeNative();
    }

    @Override // java.lang.Object
    public void finalize() {
        super.finalize();
        if (this.nativeHandle != 0) {
            Log.d("OpusRecorder not closed before finalize");
            freeNative();
        }
    }
}
