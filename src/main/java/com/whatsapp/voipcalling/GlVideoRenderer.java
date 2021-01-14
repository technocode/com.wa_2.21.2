package com.whatsapp.voipcalling;

import java.nio.FloatBuffer;

public class GlVideoRenderer {
    public static final int CAP_RENDER_BGRA = 4;
    public static final int CAP_RENDER_I420 = 16;
    public static final int CAP_RENDER_NV12 = 8;
    public static final int CAP_RENDER_OES_TEXTURE = 1;
    public static final int CAP_RENDER_TEXTURE = 2;
    public long nativeHandle;

    public static native void initNative();

    public native boolean init(int i, int i2);

    public native void release();

    public native void renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    public native void renderOesTexture(int i, int i2, int i3, FloatBuffer floatBuffer);

    public native void setScaleType(int i);

    public native void setWindow(int i, int i2, int i3, int i4);

    static {
        initNative();
    }
}
