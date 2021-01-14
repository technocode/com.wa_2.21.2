package X;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.Log;

/* renamed from: X.0t9  reason: invalid class name and case insensitive filesystem */
public final class C18310t9 {
    public EGLConfig A00 = null;
    public EGLContext A01;
    public EGLDisplay A02;

    public C18310t9() {
        EGLConfig eGLConfig;
        EGLDisplay eGLDisplay = EGL14.EGL_NO_DISPLAY;
        this.A02 = eGLDisplay;
        EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
        this.A01 = eGLContext;
        if (eGLDisplay == eGLDisplay) {
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            this.A02 = eglGetDisplay;
            if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
                int[] iArr = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                    EGLContext eGLContext2 = this.A01;
                    if (eGLContext2 == EGL14.EGL_NO_CONTEXT) {
                        int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344};
                        iArr2[10] = 12610;
                        iArr2[11] = 1;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        if (!EGL14.eglChooseConfig(this.A02, iArr2, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                            StringBuilder sb = new StringBuilder("unable to find RGB8888 / ");
                            sb.append(2);
                            sb.append(" EGLConfig");
                            Log.w("Grafika", sb.toString());
                            eGLConfig = null;
                        } else {
                            eGLConfig = eGLConfigArr[0];
                        }
                        if (eGLConfig != null) {
                            eGLContext2 = EGL14.eglCreateContext(this.A02, eGLConfig, eGLContext, new int[]{12440, 2, 12344}, 0);
                            A00("eglCreateContext");
                            this.A00 = eGLConfig;
                            this.A01 = eGLContext2;
                        } else {
                            throw new RuntimeException("Unable to find a suitable EGLConfig");
                        }
                    }
                    int[] iArr3 = new int[1];
                    EGL14.eglQueryContext(this.A02, eGLContext2, 12440, iArr3, 0);
                    StringBuilder sb2 = new StringBuilder("EGLContext created, client version ");
                    sb2.append(iArr3[0]);
                    Log.d("Grafika", sb2.toString());
                    return;
                }
                this.A02 = null;
                throw new RuntimeException("unable to initialize EGL14");
            }
            throw new RuntimeException("unable to get EGL14 display");
        }
        throw new RuntimeException("EGL already set up");
    }

    public static final void A00(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, ": EGL error: 0x");
            A0Y.append(Integer.toHexString(eglGetError));
            throw new RuntimeException(A0Y.toString());
        }
    }

    public void A01() {
        EGLDisplay eGLDisplay = this.A02;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext(this.A02, this.A01);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.A02);
        }
        this.A02 = EGL14.EGL_NO_DISPLAY;
        this.A01 = EGL14.EGL_NO_CONTEXT;
        this.A00 = null;
    }

    public void finalize() {
        try {
            if (this.A02 != EGL14.EGL_NO_DISPLAY) {
                Log.w("Grafika", "WARNING: EglCore was not explicitly released -- state may be leaked");
                A01();
            }
        } finally {
            super.finalize();
        }
    }
}
