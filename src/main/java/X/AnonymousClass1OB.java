package X;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.1OB  reason: invalid class name */
public class AnonymousClass1OB implements SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public Surface A01;
    public AnonymousClass1OC A02;
    public EGL10 A03;
    public EGLContext A04;
    public EGLDisplay A05;
    public EGLSurface A06;
    public boolean A07;
    public final Object A08 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1OB(int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1OB.<init>(int, int):void");
    }

    public void A00() {
        if (this.A03 != null) {
            A01("before makeCurrent");
            EGL10 egl10 = this.A03;
            EGLDisplay eGLDisplay = this.A05;
            EGLSurface eGLSurface = this.A06;
            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A04)) {
                throw new RuntimeException("eglMakeCurrent failed");
            }
            return;
        }
        throw new RuntimeException("not configured for makeCurrent");
    }

    public final void A01(String str) {
        boolean z = false;
        while (true) {
            int eglGetError = this.A03.eglGetError();
            if (eglGetError == 12288) {
                break;
            }
            StringBuilder A0Y = AnonymousClass008.A0Y(str, ": EGL error: 0x");
            A0Y.append(Integer.toHexString(eglGetError));
            Log.e("OutputSurface", A0Y.toString());
            z = true;
        }
        if (z) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A08;
        synchronized (obj) {
            if (!this.A07) {
                this.A07 = true;
                obj.notifyAll();
            } else {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
        }
    }
}
