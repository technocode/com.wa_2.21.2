package com.facebook.animated.webp;

import X.AbstractC20330wX;
import android.graphics.Bitmap;

public class WebPFrame implements AbstractC20330wX {
    public long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    @Override // X.AbstractC20330wX
    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.AbstractC20330wX
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.AbstractC20330wX
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // X.AbstractC20330wX
    public int getXOffset() {
        return nativeGetXOffset();
    }

    @Override // X.AbstractC20330wX
    public int getYOffset() {
        return nativeGetYOffset();
    }

    public boolean isBlendWithPreviousFrame() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // X.AbstractC20330wX
    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return nativeShouldDisposeToBackgroundColor();
    }
}
