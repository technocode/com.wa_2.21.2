package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.39I  reason: invalid class name */
public final class AnonymousClass39I {
    public int A00;
    public final SurfaceTexture A01;
    public final ByteBuffer A02 = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder());
    public final float[] A03 = new float[16];

    public AnonymousClass39I() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameterf(36197, 10242, 33071.0f);
        GLES20.glTexParameterf(36197, 10243, 33071.0f);
        AnonymousClass1YV.A0G("generateTexture");
        this.A00 = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.A01 = surfaceTexture;
        StringBuilder A0S = AnonymousClass008.A0S("voip/video/SurfaceTextureHolder/createSurfaceTexture, surfaceTexture = ");
        A0S.append(surfaceTexture);
        Log.i(A0S.toString());
    }
}
