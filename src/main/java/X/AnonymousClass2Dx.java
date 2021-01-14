package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.whatsapp.util.Log;

/* renamed from: X.2Dx  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Dx implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ SurfaceHolder$CallbackC50852Wi A00;

    public /* synthetic */ AnonymousClass2Dx(SurfaceHolder$CallbackC50852Wi r1) {
        this.A00 = r1;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceHolder$CallbackC50852Wi r4 = this.A00;
        C31591dU r1 = r4.A0F;
        if (r1 == null || r4.A03 == null || r4.A0G == null || r4.A0E == null || !r4.A0O) {
            Log.d("cameraview/draw-video-frame skipping after shutdown");
            return;
        }
        r1.A00();
        r4.A03.updateTexImage();
        SurfaceTexture surfaceTexture2 = r4.A03;
        float[] fArr = r4.A0W;
        surfaceTexture2.getTransformMatrix(fArr);
        GLES20.glViewport(0, 0, r4.getWidth(), r4.getHeight());
        r4.A0E.A01(r4.A02, fArr);
        r4.A0F.A01();
        r4.A0G.A00();
        C31591dU r12 = r4.A0G;
        int i = ((C18320tA) r12).A01;
        if (i < 0) {
            C18310t9 r0 = r12.A03;
            EGLSurface eGLSurface = r12.A02;
            int[] iArr = new int[1];
            EGL14.eglQuerySurface(r0.A02, eGLSurface, 12375, iArr, 0);
            i = iArr[0];
        }
        C31591dU r13 = r4.A0G;
        int i2 = ((C18320tA) r13).A00;
        if (i2 < 0) {
            C18310t9 r02 = r13.A03;
            EGLSurface eGLSurface2 = r13.A02;
            int[] iArr2 = new int[1];
            EGL14.eglQuerySurface(r02.A02, eGLSurface2, 12374, iArr2, 0);
            i2 = iArr2[0];
        }
        GLES20.glViewport(0, 0, i, i2);
        r4.A0E.A01(r4.A02, C18340tC.A00);
        r4.A0G.A01();
    }
}
