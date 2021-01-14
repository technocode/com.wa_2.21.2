package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.0vk  reason: invalid class name and case insensitive filesystem */
public class C19870vk implements SurfaceTexture.OnFrameAvailableListener {
    public static final int A0Q = (A0U.length >> 1);
    public static final String A0R = "GLSurfacePipe";
    public static final FloatBuffer A0S;
    public static final FloatBuffer A0T;
    public static final float[] A0U;
    public static final float[] A0V = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public SurfaceTexture A09;
    public SurfaceTexture A0A;
    public EGLConfig A0B;
    public EGLContext A0C;
    public EGLDisplay A0D;
    public EGLSurface A0E;
    public final Object A0F = new Object();
    public final Object A0G = new Object();
    public final float[] A0H = new float[16];
    public final float[] A0I = new float[16];
    public final float[] A0J = new float[16];
    public final float[] A0K = new float[16];
    public final int[] A0L = new int[2];
    public volatile int A0M;
    public volatile int A0N;
    public volatile EGLSurface A0O = EGL14.EGL_NO_SURFACE;
    public volatile EGLSurface A0P = EGL14.EGL_NO_SURFACE;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        A0U = fArr;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8 << 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        A0T = asFloatBuffer;
        float[] fArr2 = A0V;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length << 2);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        A0S = asFloatBuffer2;
    }

    public C19870vk() {
        EGLConfig eGLConfig;
        int A002;
        Matrix.setIdentityM(this.A0J, 0);
        Matrix.setIdentityM(this.A0K, 0);
        Matrix.setIdentityM(this.A0H, 0);
        Matrix.setIdentityM(this.A0I, 0);
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.A0D = eglGetDisplay;
        if (eglGetDisplay != EGL14.EGL_NO_DISPLAY) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (!EGL14.eglChooseConfig(this.A0D, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0) || (eGLConfig = eGLConfigArr[0]) == null) {
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                this.A0B = eGLConfig;
                this.A0C = EGL14.eglCreateContext(this.A0D, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                int eglGetError = EGL14.eglGetError();
                if (eglGetError != 12288 || this.A0C == null) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("eglCreateContext: EGL error: 0x");
                    A0S2.append(Integer.toHexString(eglGetError));
                    throw new RuntimeException(A0S2.toString());
                }
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.A0D, this.A0B, new int[]{12375, 1, 12374, 1, 12344}, 0);
                this.A0E = eglCreatePbufferSurface;
                if (eglCreatePbufferSurface == null || EGL14.eglGetError() != 12288) {
                    this.A0E = EGL14.EGL_NO_SURFACE;
                }
                EGLDisplay eGLDisplay = this.A0D;
                EGLSurface eGLSurface = this.A0E;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.A0C);
                int A003 = A00(35633, "precision mediump float;\nuniform mat4 uSurfaceTransformMatrix;\nuniform mat4 uSceneTransformMatrix;\nuniform mat4 uVideoTransformMatrix;\n\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\n\nvarying vec2 vTextureCoord;\n\nvoid main() {\n  gl_Position = uSceneTransformMatrix * aPosition;\n  vTextureCoord = (uSurfaceTransformMatrix * uVideoTransformMatrix * aTextureCoord).xy;\n}\n");
                if (A003 != 0 && (A002 = A00(35632, "#extension GL_OES_EGL_image_external : require\n\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\n\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")) != 0) {
                    this.A02 = GLES20.glCreateProgram();
                    A02("glCreateProgram");
                    if (this.A02 == 0) {
                        Log.e("GLSurfacePipe", "Could not create program");
                    }
                    GLES20.glAttachShader(this.A02, A003);
                    A02("glAttachShader");
                    GLES20.glAttachShader(this.A02, A002);
                    A02("glAttachShader");
                    GLES20.glLinkProgram(this.A02);
                    int[] iArr2 = new int[1];
                    GLES20.glGetProgramiv(this.A02, 35714, iArr2, 0);
                    if (iArr2[0] != 1) {
                        Log.e("GLSurfacePipe", "Could not link program: ");
                        Log.e("GLSurfacePipe", GLES20.glGetProgramInfoLog(this.A02));
                        GLES20.glDeleteProgram(this.A02);
                        this.A02 = 0;
                        return;
                    }
                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.A02, "aPosition");
                    this.A04 = glGetAttribLocation;
                    A01(glGetAttribLocation, "aPosition");
                    int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.A02, "aTextureCoord");
                    this.A05 = glGetAttribLocation2;
                    A01(glGetAttribLocation2, "aTextureCoord");
                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.A02, "uSurfaceTransformMatrix");
                    this.A07 = glGetUniformLocation;
                    A01(glGetUniformLocation, "uSurfaceTransformMatrix");
                    int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.A02, "uVideoTransformMatrix");
                    this.A08 = glGetUniformLocation2;
                    A01(glGetUniformLocation2, "uVideoTransformMatrix");
                    int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.A02, "uSceneTransformMatrix");
                    this.A06 = glGetUniformLocation3;
                    A01(glGetUniformLocation3, "uSceneTransformMatrix");
                    return;
                }
                return;
            }
            this.A0D = EGL14.EGL_NO_DISPLAY;
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public static int A00(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder sb = new StringBuilder("glCreateShader type=");
        sb.append(i);
        A02(sb.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb2 = new StringBuilder("Could not compile shader ");
        sb2.append(i);
        sb2.append(":");
        Log.e("GLSurfacePipe", sb2.toString());
        StringBuilder A0S2 = AnonymousClass008.A0S(" ");
        A0S2.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("GLSurfacePipe", A0S2.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public static void A01(int i, String str) {
        if (i < 0) {
            throw new RuntimeException(AnonymousClass008.A0L("Unable to locate '", str, "' in program"));
        }
    }

    public static void A02(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, ": glError 0x");
            A0Y.append(Integer.toHexString(glGetError));
            String obj = A0Y.toString();
            Log.e("GLSurfacePipe", obj);
            throw new RuntimeException(obj);
        }
    }

    public void A03(SurfaceTexture surfaceTexture, int i) {
        if (this.A0D != EGL14.EGL_NO_DISPLAY) {
            synchronized (this.A0F) {
                this.A0M = i;
                if (this.A0A == surfaceTexture) {
                    float[] fArr = this.A0H;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, 1.0f);
                    return;
                }
                if (this.A0O != EGL14.EGL_NO_SURFACE) {
                    EGL14.eglDestroySurface(this.A0D, this.A0O);
                    Matrix.setIdentityM(this.A0H, 0);
                    this.A0O = EGL14.EGL_NO_SURFACE;
                }
                this.A0A = surfaceTexture;
                if (surfaceTexture != null) {
                    float[] fArr2 = this.A0H;
                    Matrix.setIdentityM(fArr2, 0);
                    Matrix.rotateM(fArr2, 0, (float) i, 0.0f, 0.0f, 1.0f);
                    this.A0O = EGL14.eglCreateWindowSurface(this.A0D, this.A0B, surfaceTexture, new int[]{12344}, 0);
                    if (this.A0O == null || EGL14.eglGetError() != 12288) {
                        this.A0O = EGL14.EGL_NO_SURFACE;
                    }
                }
            }
        }
    }

    public void A04(EGLSurface eGLSurface, float[] fArr, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            try {
                EGL14.eglMakeCurrent(this.A0D, eGLSurface, eGLSurface, this.A0C);
                EGLDisplay eGLDisplay = this.A0D;
                int[] iArr = this.A0L;
                EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                EGL14.eglQuerySurface(this.A0D, eGLSurface, 12374, iArr, 1);
                GLES20.glViewport(0, 0, iArr[0], iArr[1]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                GLES20.glClear(16384);
                if (i % 180 == 0) {
                    i2 = this.A00;
                    i3 = this.A01;
                } else {
                    i2 = this.A01;
                    i3 = this.A00;
                }
                float f = ((float) i2) / ((float) i3);
                int i6 = iArr[0];
                float f2 = (float) i6;
                int i7 = iArr[1];
                float f3 = (float) i7;
                if (f2 / f3 > f) {
                    i4 = (int) (f3 * f);
                    i5 = i7;
                } else {
                    i4 = i6;
                    i5 = (int) (f2 / f);
                }
                int i8 = (i6 - i4) / 2;
                int i9 = (i7 - i5) / 2;
                if (i8 < 8 && i9 < 8) {
                    i4 = i6;
                    i5 = i7;
                    i8 = 0;
                    i9 = 0;
                }
                GLES20.glViewport(i8, i9, i4, i5);
                A02("draw start");
                GLES20.glUseProgram(this.A02);
                A02("glUseProgram");
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(36197, this.A03);
                GLES20.glUniformMatrix4fv(this.A07, 1, false, this.A0J, 0);
                A02("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(this.A08, 1, false, this.A0K, 0);
                A02("glUniformMatrix4fv");
                GLES20.glUniformMatrix4fv(this.A06, 1, false, fArr, 0);
                A02("glUniformMatrix4fv");
                GLES20.glEnableVertexAttribArray(this.A04);
                A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(this.A04, 2, 5126, false, 8, (Buffer) A0T);
                A02("glVertexAttribPointer");
                GLES20.glEnableVertexAttribArray(this.A05);
                A02("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(this.A05, 2, 5126, false, 8, (Buffer) A0S);
                A02("glVertexAttribPointer");
                GLES20.glDrawArrays(5, 0, A0Q);
                A02("glDrawArrays");
                GLES20.glDisableVertexAttribArray(this.A04);
                GLES20.glDisableVertexAttribArray(this.A05);
                GLES20.glBindTexture(36197, 0);
                GLES20.glUseProgram(0);
                EGL14.eglSwapBuffers(this.A0D, eGLSurface);
            } catch (RuntimeException unused) {
            }
            EGLDisplay eGLDisplay2 = this.A0D;
            EGLSurface eGLSurface2 = this.A0E;
            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, this.A0C);
        }
    }

    public void A05(Surface surface, int i) {
        if (this.A0D != EGL14.EGL_NO_DISPLAY) {
            synchronized (this.A0G) {
                this.A0N = i;
                if (this.A0P != EGL14.EGL_NO_SURFACE) {
                    Matrix.setIdentityM(this.A0I, 0);
                    EGL14.eglDestroySurface(this.A0D, this.A0P);
                    this.A0P = EGL14.EGL_NO_SURFACE;
                }
                if (surface != null) {
                    float[] fArr = this.A0I;
                    Matrix.setIdentityM(fArr, 0);
                    Matrix.rotateM(fArr, 0, (float) i, 0.0f, 0.0f, 1.0f);
                    this.A0P = EGL14.eglCreateWindowSurface(this.A0D, this.A0B, surface, new int[]{12344}, 0);
                    if (this.A0P == null || EGL14.eglGetError() != 12288) {
                        this.A0P = EGL14.EGL_NO_SURFACE;
                    }
                }
            }
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.A09;
        if (surfaceTexture2 != null) {
            try {
                surfaceTexture2.updateTexImage();
                this.A09.getTransformMatrix(this.A0J);
            } catch (RuntimeException unused) {
            }
            synchronized (this.A0F) {
                A04(this.A0O, this.A0H, this.A0M);
            }
            synchronized (this.A0G) {
                A04(this.A0P, this.A0I, this.A0N);
            }
        }
    }
}
