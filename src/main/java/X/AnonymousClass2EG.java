package X;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.whatsapp.util.Log;

/* renamed from: X.2EG  reason: invalid class name */
public class AnonymousClass2EG implements TextureView.SurfaceTextureListener {
    public boolean A00 = true;
    public final /* synthetic */ AnonymousClass2Wh A01;

    public AnonymousClass2EG(AnonymousClass2Wh r2) {
        this.A01 = r2;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass008.A0y("cameraview/on-surface-texture-available texture:", i, "x", i2);
        this.A01.A0O(i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Log.i("cameraview/on-surface-texture-destroyed");
        this.A01.A0K();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        StringBuilder A0U = AnonymousClass008.A0U("cameraview/on-surface-texture-size-changed texture:", i, "x", i2, " view:");
        AnonymousClass2Wh r1 = this.A01;
        A0U.append(r1.getWidth());
        A0U.append("x");
        A0U.append(r1.getHeight());
        Log.i(A0U.toString());
        r1.A0P(i, i2, r1.A0F);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.A00) {
            this.A00 = false;
            this.A01.A0h.A02("cameraView2");
        }
    }
}
