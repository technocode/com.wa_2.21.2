package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.37U  reason: invalid class name */
public class AnonymousClass37U implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ AnonymousClass37V A00;

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public AnonymousClass37U(AnonymousClass37V r1) {
        this.A00 = r1;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        AnonymousClass37V r3 = this.A00;
        if (r3.A09 != null) {
            Surface surface = new Surface(surfaceTexture);
            r3.A0A = surface;
            r3.A09.setSurface(surface);
            if (r3.A00 == 0) {
                try {
                    r3.A09.setDataSource(r3.A0B);
                    r3.A09.prepareAsync();
                    r3.A00 = 1;
                } catch (IOException e) {
                    r3.A00 = -1;
                    r3.A03 = -1;
                    if (r3.A07 != null) {
                        r3.post(new RunnableEBaseShape13S0100000_I1_8(this, 29));
                    }
                    Log.e("mediaview/unable-to-play", e);
                }
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        AnonymousClass37V r2 = this.A00;
        MediaPlayer mediaPlayer = r2.A09;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(null);
        }
        Surface surface = r2.A0A;
        if (surface != null) {
            surface.release();
            r2.A0A = null;
        }
        r2.A0H = false;
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        AnonymousClass37V r6 = this.A00;
        if (!r6.A0H) {
            boolean z = false;
            if (surfaceTexture.getTimestamp() > 0) {
                z = true;
            }
            r6.A0H = z;
        }
    }
}
