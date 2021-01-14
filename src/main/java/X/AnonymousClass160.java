package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import java.util.Locale;

/* renamed from: X.160  reason: invalid class name */
public class AnonymousClass160 extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public RunnableC232915e A01;
    public AnonymousClass161 A02;
    public Error A03;
    public RuntimeException A04;

    public AnonymousClass160() {
        super("dummySurface");
    }

    public boolean handleMessage(Message message) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eglCreatePbufferSurface;
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                RunnableC232915e r4 = this.A01;
                if (r4 == null) {
                    throw null;
                } else if (r4 != null) {
                    EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                    if (eglGetDisplay != null) {
                        int[] iArr3 = new int[2];
                        if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                            r4.A02 = eglGetDisplay;
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            int[] iArr4 = new int[1];
                            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, RunnableC232915e.A06, 0, eGLConfigArr, 0, 1, iArr4, 0);
                            if (!eglChooseConfig || iArr4[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                                throw new C232815c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]));
                            }
                            EGLDisplay eGLDisplay = r4.A02;
                            if (i2 == 0) {
                                iArr = new int[]{12440, 2, 12344};
                            } else {
                                iArr = new int[]{12440, 2, 12992, 1, 12344};
                            }
                            EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                            if (eglCreateContext != null) {
                                r4.A01 = eglCreateContext;
                                EGLDisplay eGLDisplay2 = r4.A02;
                                if (i2 == 1) {
                                    eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                                } else {
                                    if (i2 == 2) {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                                    } else {
                                        iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                                    }
                                    eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                                    if (eglCreatePbufferSurface == null) {
                                        throw new C232815c("eglCreatePbufferSurface failed");
                                    }
                                }
                                if (EGL14.eglMakeCurrent(eGLDisplay2, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
                                    r4.A03 = eglCreatePbufferSurface;
                                    int[] iArr5 = r4.A05;
                                    GLES20.glGenTextures(1, iArr5, 0);
                                    int glGetError = GLES20.glGetError();
                                    if (glGetError == 0) {
                                        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr5[0]);
                                        r4.A00 = surfaceTexture;
                                        surfaceTexture.setOnFrameAvailableListener(r4);
                                        SurfaceTexture surfaceTexture2 = this.A01.A00;
                                        if (surfaceTexture2 != null) {
                                            this.A02 = new AnonymousClass161(this, surfaceTexture2);
                                            synchronized (this) {
                                                notify();
                                            }
                                            return true;
                                        }
                                        throw null;
                                    }
                                    StringBuilder A0S = AnonymousClass008.A0S("glGenTextures failed. Error: ");
                                    A0S.append(Integer.toHexString(glGetError));
                                    throw new C232815c(A0S.toString());
                                }
                                throw new C232815c("eglMakeCurrent failed");
                            }
                            throw new C232815c("eglCreateContext failed");
                        }
                        throw new C232815c("eglInitialize failed");
                    }
                    throw new C232815c("eglGetDisplay failed");
                } else {
                    throw null;
                }
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.A04 = e;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.A03 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        } else if (i != 2) {
            return true;
        } else {
            try {
                RunnableC232915e r42 = this.A01;
                if (r42 != null) {
                    r42.A04.removeCallbacks(r42);
                    try {
                        SurfaceTexture surfaceTexture3 = r42.A00;
                        if (surfaceTexture3 != null) {
                            surfaceTexture3.release();
                            GLES20.glDeleteTextures(1, r42.A05, 0);
                        }
                        quit();
                        return true;
                    } finally {
                        EGLDisplay eGLDisplay3 = r42.A02;
                        if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGLDisplay eGLDisplay4 = r42.A02;
                            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                            EGL14.eglMakeCurrent(eGLDisplay4, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface2 = r42.A03;
                        if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(r42.A02, r42.A03);
                        }
                        EGLContext eGLContext = r42.A01;
                        if (eGLContext != null) {
                            EGL14.eglDestroyContext(r42.A02, eGLContext);
                        }
                        if (AnonymousClass0W2.A00 >= 19) {
                            EGL14.eglReleaseThread();
                        }
                        EGLDisplay eGLDisplay5 = r42.A02;
                        if (eGLDisplay5 != null && !eGLDisplay5.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(r42.A02);
                        }
                        r42.A02 = null;
                        r42.A01 = null;
                        r42.A03 = null;
                        r42.A00 = null;
                    }
                } else {
                    throw null;
                }
            } catch (Throwable th2) {
                quit();
                throw th2;
            }
        }
    }
}
