package X;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: X.0tA  reason: invalid class name and case insensitive filesystem */
public class C18320tA {
    public int A00 = -1;
    public int A01 = -1;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public C18310t9 A03;

    public C18320tA(C18310t9 r2) {
        this.A03 = r2;
    }

    public void A00() {
        C18310t9 r3 = this.A03;
        EGLSurface eGLSurface = this.A02;
        if (r3.A02 == EGL14.EGL_NO_DISPLAY) {
            Log.d("Grafika", "NOTE: makeCurrent w/o display");
        }
        if (!EGL14.eglMakeCurrent(r3.A02, eGLSurface, eGLSurface, r3.A01)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void A01() {
        C18310t9 r0 = this.A03;
        if (!EGL14.eglSwapBuffers(r0.A02, this.A02)) {
            Log.d("Grafika", "WARNING: swapBuffers() failed");
        }
    }
}
