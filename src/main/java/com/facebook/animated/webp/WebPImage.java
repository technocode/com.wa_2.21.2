package com.facebook.animated.webp;

import X.AbstractC20320wW;
import X.AbstractC20330wX;
import X.C20310wV;
import X.EnumC20290wT;
import X.EnumC20300wU;
import java.nio.ByteBuffer;

public class WebPImage implements AbstractC20320wW {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // X.AbstractC20320wW
    public boolean doesRenderSupportScaling() {
        return true;
    }

    public WebPImage() {
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    @Override // X.AbstractC20320wW
    public AbstractC20330wX getFrame(int i) {
        return nativeGetFrame(i);
    }

    @Override // X.AbstractC20320wW
    /* renamed from: getFrame  reason: collision with other method in class */
    public WebPFrame m1getFrame(int i) {
        return nativeGetFrame(i);
    }

    @Override // X.AbstractC20320wW
    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    @Override // X.AbstractC20320wW
    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    @Override // X.AbstractC20320wW
    public C20310wV getFrameInfo(int i) {
        EnumC20290wT r7;
        WebPFrame nativeGetFrame = nativeGetFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            if (nativeGetFrame.isBlendWithPreviousFrame()) {
                r7 = EnumC20290wT.BLEND_WITH_PREVIOUS;
            } else {
                r7 = EnumC20290wT.NO_BLEND;
            }
            return new C20310wV(xOffset, yOffset, width, height, r7, nativeGetFrame.shouldDisposeToBackgroundColor() ? EnumC20300wU.DISPOSE_TO_BACKGROUND : EnumC20300wU.DISPOSE_DO_NOT);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    @Override // X.AbstractC20320wW
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // X.AbstractC20320wW
    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    @Override // X.AbstractC20320wW
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.AbstractC20320wW
    public int getWidth() {
        return nativeGetWidth();
    }
}
