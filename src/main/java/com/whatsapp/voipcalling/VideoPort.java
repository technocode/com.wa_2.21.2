package com.whatsapp.voipcalling;

import X.AnonymousClass39I;
import X.AnonymousClass39S;
import android.content.Context;
import android.graphics.Point;
import android.view.SurfaceHolder;

public interface VideoPort {
    public static final int ERROR_CREATE_EGL = -5;
    public static final int ERROR_CREATE_RENDERER = -2;
    public static final int ERROR_NO_EGL = -6;
    public static final int ERROR_NO_SURFACE = -1;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_STALE_TEXTURE = -7;
    public static final int ERROR_SWAP_BUFFERS = -3;
    public static final int ERROR_UPDATE_WINDOW_SIZE = -4;
    public static final int SUCCESS = 0;

    AnonymousClass39I createSurfaceTexture();

    Context getContext();

    SurfaceHolder getSurfaceHolder();

    Point getWindowSize();

    void release();

    void releaseSurfaceTexture(AnonymousClass39I v);

    int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    int renderTexture(AnonymousClass39I v, int i, int i2);

    int resetBlackScreen();

    void setListener(AnonymousClass39S v);

    int setScaleType(int i);
}
