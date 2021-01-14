package X;

import android.media.MediaPlayer;

/* renamed from: X.2Py  reason: invalid class name and case insensitive filesystem */
public class C49302Py implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ TextureView$SurfaceTextureListenerC60532pe A00;

    public C49302Py(TextureView$SurfaceTextureListenerC60532pe r1) {
        this.A00 = r1;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        TextureView$SurfaceTextureListenerC60532pe r3 = this.A00;
        r3.A06 = true;
        if (r3.A08) {
            r3.A09.setVisibility(0);
            MediaPlayer mediaPlayer2 = r3.A01;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
                r3.A07 = true;
            }
        }
    }
}
