package com.facebook.animated.gif;

import X.AbstractC20320wW;
import X.AbstractC20330wX;
import X.C20310wV;
import X.EnumC20290wT;
import X.EnumC20300wU;
import java.nio.ByteBuffer;

public class GifImage implements AbstractC20320wW {
    public static volatile boolean sInitialized;
    public long mNativeContext;

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // X.AbstractC20320wW
    public boolean doesRenderSupportScaling() {
        return false;
    }

    public GifImage() {
    }

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    @Override // X.AbstractC20320wW
    public AbstractC20330wX getFrame(int i) {
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
        GifFrame nativeGetFrame = nativeGetFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            EnumC20290wT r8 = EnumC20290wT.BLEND_WITH_PREVIOUS;
            int disposalMode = nativeGetFrame.getDisposalMode();
            EnumC20300wU r9 = EnumC20300wU.DISPOSE_DO_NOT;
            if (!(disposalMode == 0 || disposalMode == 1)) {
                if (disposalMode == 2) {
                    r9 = EnumC20300wU.DISPOSE_TO_BACKGROUND;
                } else if (disposalMode == 3) {
                    r9 = EnumC20300wU.DISPOSE_TO_PREVIOUS;
                }
            }
            return new C20310wV(xOffset, yOffset, width, height, r8, r9);
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
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    @Override // X.AbstractC20320wW
    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // X.AbstractC20320wW
    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }
}
