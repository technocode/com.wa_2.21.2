package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.37w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class CallableC672637w implements Callable {
    public final /* synthetic */ AnonymousClass39I A00;
    public final /* synthetic */ C72723Tz A01;

    public /* synthetic */ CallableC672637w(C72723Tz r1, AnonymousClass39I r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C72723Tz r0 = this.A01;
        AnonymousClass39I r4 = this.A00;
        if (C72723Tz.A00(r0.A03)) {
            return -6;
        }
        SurfaceTexture surfaceTexture = r4.A01;
        if (surfaceTexture != null) {
            StringBuilder A0S = AnonymousClass008.A0S("voip/video/SurfaceTextureHolder/deleteSurfaceTexture surfaceTexture = ");
            A0S.append(surfaceTexture);
            Log.i(A0S.toString());
            surfaceTexture.release();
            GLES20.glDeleteTextures(1, new int[]{r4.A00}, 0);
        }
        r4.A00 = 0;
        return 0;
    }
}
