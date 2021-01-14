package X;

import android.view.Surface;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: X.3C1  reason: invalid class name */
public abstract class AnonymousClass3C1 {
    public static final int[] A00 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12344};
    public static final int[] A01 = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};

    public int A01() {
        AnonymousClass3X4 r1 = (AnonymousClass3X4) this;
        int[] iArr = new int[1];
        r1.A04.eglQuerySurface(r1.A02, r1.A03, 12374, iArr);
        return iArr[0];
    }

    public int A02() {
        AnonymousClass3X4 r1 = (AnonymousClass3X4) this;
        int[] iArr = new int[1];
        r1.A04.eglQuerySurface(r1.A02, r1.A03, 12375, iArr);
        return iArr[0];
    }

    public void A03() {
        AnonymousClass3X4 r0 = (AnonymousClass3X4) this;
        EGL10 egl10 = r0.A04;
        EGLDisplay eGLDisplay = r0.A02;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT)) {
            throw AnonymousClass008.A07("detachCurrent", "eglMakeCurrent failed");
        }
    }

    public void A04() {
        AnonymousClass3X4 r4 = (AnonymousClass3X4) this;
        r4.A0A();
        EGLSurface eGLSurface = r4.A03;
        if (eGLSurface == EGL10.EGL_NO_SURFACE) {
            throw new RuntimeException("No EGLSurface - can't make current");
        } else if (!r4.A04.eglMakeCurrent(r4.A02, eGLSurface, eGLSurface, r4.A01)) {
            throw AnonymousClass008.A07("makeCurrent", "eglMakeCurrent failed");
        }
    }

    public void A05() {
        AnonymousClass3X4 r3 = (AnonymousClass3X4) this;
        r3.A0A();
        EGLSurface eGLSurface = r3.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            r3.A04.eglDestroySurface(r3.A02, eGLSurface);
            r3.A03 = EGL10.EGL_NO_SURFACE;
        }
        r3.A03();
        EGL10 egl10 = r3.A04;
        egl10.eglDestroyContext(r3.A02, r3.A01);
        egl10.eglTerminate(r3.A02);
        r3.A01 = EGL10.EGL_NO_CONTEXT;
        r3.A02 = EGL10.EGL_NO_DISPLAY;
        r3.A00 = null;
    }

    public void A06() {
        AnonymousClass3X4 r3 = (AnonymousClass3X4) this;
        EGLSurface eGLSurface = r3.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            r3.A04.eglDestroySurface(r3.A02, eGLSurface);
            r3.A03 = EGL10.EGL_NO_SURFACE;
        }
    }

    public void A07(Surface surface) {
        AnonymousClass3X4 r5 = (AnonymousClass3X4) this;
        AnonymousClass3C0 r4 = new AnonymousClass3C0(surface);
        r5.A0A();
        if (r5.A03 == EGL10.EGL_NO_SURFACE) {
            EGLSurface eglCreateWindowSurface = r5.A04.eglCreateWindowSurface(r5.A02, r5.A00, r4, new int[]{12344});
            r5.A03 = eglCreateWindowSurface;
            if (eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                throw AnonymousClass008.A07("eglCreateWindowSurface", "Failed to create window surface");
            }
            return;
        }
        throw new RuntimeException("Already has an EGLSurface");
    }

    public boolean A08() {
        return ((AnonymousClass3X4) this).A03 != EGL10.EGL_NO_SURFACE;
    }

    public boolean A09() {
        AnonymousClass3X4 r3 = (AnonymousClass3X4) this;
        r3.A0A();
        EGLSurface eGLSurface = r3.A03;
        if (eGLSurface != EGL10.EGL_NO_SURFACE) {
            return r3.A04.eglSwapBuffers(r3.A02, eGLSurface);
        }
        throw new RuntimeException("No EGLSurface - can't swap buffers");
    }
}
