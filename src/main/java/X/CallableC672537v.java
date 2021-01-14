package X;

import android.graphics.SurfaceTexture;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.nio.FloatBuffer;
import java.util.concurrent.Callable;

/* renamed from: X.37v  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC672537v implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass39I A02;
    public final /* synthetic */ C72723Tz A03;

    public /* synthetic */ CallableC672537v(C72723Tz r1, AnonymousClass39I r2, int i, int i2) {
        this.A03 = r1;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int A012;
        C72723Tz r7 = this.A03;
        AnonymousClass39I r6 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        if (C72723Tz.A00(r7.A03)) {
            return -6;
        }
        GlVideoRenderer glVideoRenderer = r7.A07;
        if (r6.A00 == 0) {
            Log.i("voip/SurfaceTextureHolder/render ignore rendering after texture is released");
            A012 = -7;
        } else {
            SurfaceTexture surfaceTexture = r6.A01;
            surfaceTexture.updateTexImage();
            float[] fArr = r6.A03;
            surfaceTexture.getTransformMatrix(fArr);
            FloatBuffer asFloatBuffer = r6.A02.asFloatBuffer();
            asFloatBuffer.rewind();
            asFloatBuffer.put(fArr);
            glVideoRenderer.renderOesTexture(r6.A00, i, i2, asFloatBuffer);
            A012 = r7.A01();
        }
        return Integer.valueOf(A012);
    }
}
