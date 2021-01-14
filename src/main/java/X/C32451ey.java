package X;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1ey  reason: invalid class name and case insensitive filesystem */
public class C32451ey implements AnonymousClass104 {
    public static final boolean A0E;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaRecorder A06;
    public Surface A07;
    public RandomAccessFile A08;
    public CountDownLatch A09;
    public final Object A0A;
    public volatile SurfaceTexture A0B;
    public volatile SurfaceTexture A0C;
    public volatile C19870vk A0D;

    @Override // X.AnonymousClass104
    public C07050Vs AQ9(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, AnonymousClass0VV r4, int i, boolean z, AnonymousClass101 r7, boolean z2) {
        return null;
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        A0E = z;
    }

    public C32451ey() {
        Object obj = new Object();
        this.A0A = obj;
        synchronized (obj) {
            this.A09 = new CountDownLatch(1);
        }
    }

    public SurfaceTexture A00(int i, int i2, int i3, int i4) {
        SurfaceTexture surfaceTexture;
        this.A00 = i3;
        this.A04 = i4;
        this.A02 = i;
        this.A01 = i2;
        try {
            this.A09.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            StringBuilder A0S = AnonymousClass008.A0S("Timeout when creating SurfaceNode: ");
            A0S.append(e.getMessage());
            Log.e("GLSurfacePipeCoordinatorImpl", A0S.toString());
        }
        synchronized (this.A0A) {
            SurfaceTexture surfaceTexture2 = this.A0C;
            if (surfaceTexture2 != null) {
                if (A0E) {
                    C19870vk r3 = this.A0D;
                    if (r3 == null) {
                        r3 = new C19870vk();
                        this.A0D = r3;
                    }
                    r3.A03(surfaceTexture2, this.A04);
                    int i5 = this.A02;
                    int i6 = this.A01;
                    surfaceTexture2 = r3.A09;
                    if (!(surfaceTexture2 != null && r3.A01 == i5 && r3.A00 == i6)) {
                        r3.A01 = i5;
                        r3.A00 = i6;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.setOnFrameAvailableListener(null);
                            r3.A09.release();
                            r3.A09 = null;
                        }
                        int i7 = r3.A03;
                        if (i7 != -1) {
                            GLES20.glDeleteTextures(1, new int[]{i7}, 0);
                            r3.A03 = -1;
                        }
                        int[] iArr = new int[1];
                        GLES20.glGenTextures(1, iArr, 0);
                        C19870vk.A02("glGenTextures");
                        int i8 = iArr[0];
                        r3.A03 = i8;
                        GLES20.glBindTexture(36197, i8);
                        StringBuilder sb = new StringBuilder("glBindTexture ");
                        sb.append(r3.A03);
                        C19870vk.A02(sb.toString());
                        GLES20.glTexParameterf(36197, 10241, 9729.0f);
                        GLES20.glTexParameterf(36197, 10240, 9729.0f);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        C19870vk.A02("glTexParameter");
                        SurfaceTexture surfaceTexture3 = new SurfaceTexture(r3.A03);
                        r3.A09 = surfaceTexture3;
                        surfaceTexture3.setOnFrameAvailableListener(r3);
                        surfaceTexture2 = r3.A09;
                    }
                }
                this.A0B = surfaceTexture2;
                surfaceTexture = this.A0B;
            } else {
                throw new IllegalStateException("SurfaceNode was not created");
            }
        }
        return surfaceTexture;
    }

    public void A01() {
        if (A0E) {
            C19870vk r5 = this.A0D;
            this.A0D = null;
            if (r5 != null) {
                if (r5.A0D != EGL14.EGL_NO_DISPLAY) {
                    synchronized (r5.A0F) {
                        if (r5.A0O != EGL14.EGL_NO_SURFACE) {
                            try {
                                EGL14.eglMakeCurrent(r5.A0D, r5.A0O, r5.A0O, r5.A0C);
                                EGLDisplay eGLDisplay = r5.A0D;
                                EGLSurface eGLSurface = r5.A0O;
                                int[] iArr = r5.A0L;
                                EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                                EGL14.eglQuerySurface(r5.A0D, r5.A0O, 12374, iArr, 1);
                                GLES20.glViewport(0, 0, iArr[0], iArr[1]);
                                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                                GLES20.glClear(16384);
                                EGL14.eglSwapBuffers(r5.A0D, r5.A0O);
                            } catch (RuntimeException unused) {
                            }
                            EGLDisplay eGLDisplay2 = r5.A0D;
                            EGLSurface eGLSurface2 = r5.A0E;
                            EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, r5.A0C);
                            EGL14.eglDestroySurface(r5.A0D, r5.A0O);
                            r5.A0O = EGL14.EGL_NO_SURFACE;
                        }
                        r5.A0A = null;
                    }
                    synchronized (r5.A0G) {
                        if (r5.A0P != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(r5.A0D, r5.A0P);
                            r5.A0P = EGL14.EGL_NO_SURFACE;
                        }
                    }
                    EGLSurface eGLSurface3 = r5.A0E;
                    if (eGLSurface3 != EGL14.EGL_NO_SURFACE) {
                        EGL14.eglDestroySurface(r5.A0D, eGLSurface3);
                    }
                    int i = r5.A03;
                    if (i != -1) {
                        GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    }
                    int i2 = r5.A02;
                    if (i2 != 0) {
                        GLES20.glDeleteProgram(i2);
                    }
                    EGLDisplay eGLDisplay3 = r5.A0D;
                    EGLSurface eGLSurface4 = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay3, eGLSurface4, eGLSurface4, EGL14.EGL_NO_CONTEXT);
                    EGL14.eglDestroyContext(r5.A0D, r5.A0C);
                    EGL14.eglReleaseThread();
                    EGL14.eglTerminate(r5.A0D);
                }
                r5.A0D = EGL14.EGL_NO_DISPLAY;
                r5.A0C = EGL14.EGL_NO_CONTEXT;
                r5.A0B = null;
                r5.A0E = EGL14.EGL_NO_SURFACE;
                r5.A02 = 0;
                r5.A03 = -1;
                SurfaceTexture surfaceTexture = r5.A09;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    r5.A09 = null;
                }
            }
            this.A0B = null;
        }
    }

    public void A02(int i) {
        this.A04 = i;
        if (A0E) {
            synchronized (this.A0A) {
                SurfaceTexture surfaceTexture = this.A0C;
                C19870vk r1 = this.A0D;
                if (!(r1 == null || surfaceTexture == null)) {
                    r1.A03(surfaceTexture, this.A04);
                }
            }
        }
    }

    @Override // X.AnonymousClass104
    public C07050Vs AQA(CamcorderProfile camcorderProfile, String str, AnonymousClass0VV r18, int i, boolean z, AnonymousClass101 r21, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3 = false;
        if (i == 90 || i == 270) {
            i2 = camcorderProfile.videoFrameHeight;
            i3 = camcorderProfile.videoFrameWidth;
            i4 = this.A01;
            i5 = this.A02;
        } else {
            i2 = camcorderProfile.videoFrameWidth;
            i3 = camcorderProfile.videoFrameHeight;
            i4 = this.A02;
            i5 = this.A01;
        }
        float f = (float) i2;
        float f2 = (float) i3;
        float f3 = ((float) i4) / ((float) i5);
        if (f / f2 > f3) {
            i2 = (int) (f2 * f3);
        } else {
            i3 = (int) (f / f3);
        }
        int i6 = i2 - (i2 % 16);
        int i7 = i3 - (i3 % 16);
        int i8 = (this.A00 + this.A04) % 360;
        int i9 = i6;
        if (i8 % 180 != 0) {
            z3 = true;
            i9 = i7;
        }
        camcorderProfile.videoFrameWidth = i9;
        if (!z3) {
            i6 = i7;
        }
        camcorderProfile.videoFrameHeight = i6;
        this.A08 = new RandomAccessFile(str, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A06 = mediaRecorder;
        mediaRecorder.setAudioSource(5);
        this.A06.setVideoSource(2);
        this.A06.setOrientationHint(i8);
        this.A06.setProfile(camcorderProfile);
        this.A06.setOutputFile(this.A08.getFD());
        this.A06.prepare();
        this.A07 = this.A06.getSurface();
        C19870vk r2 = this.A0D;
        if (r2 != null) {
            r2.A05(this.A07, this.A04);
        }
        this.A06.start();
        C07050Vs r7 = new C07050Vs(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, str, i8, r18, camcorderProfile.audioCodec, camcorderProfile.videoCodec);
        if (r21 != null) {
            throw null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = r7.A01;
        if (j != -1) {
            elapsedRealtime = j;
        }
        r7.A01 = elapsedRealtime;
        return r7;
    }

    @Override // X.AnonymousClass104
    public void AQI() {
        try {
            MediaRecorder mediaRecorder = this.A06;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A06;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.A06.release();
                this.A06 = null;
            }
            C19870vk r0 = this.A0D;
            if (r0 != null) {
                r0.A05(null, 0);
            }
            Surface surface = this.A07;
            if (surface != null) {
                surface.release();
                this.A07 = null;
            }
            RandomAccessFile randomAccessFile = this.A08;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
                this.A08 = null;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A06;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A06.release();
                this.A06 = null;
            }
            C19870vk r02 = this.A0D;
            if (r02 != null) {
                r02.A05(null, 0);
            }
            Surface surface2 = this.A07;
            if (surface2 != null) {
                surface2.release();
                this.A07 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A08;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A08 = null;
            }
            throw th;
        }
    }
}
