package X;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.316  reason: invalid class name */
public class AnonymousClass316 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ MessageGifVideoPlayer A00;

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public AnonymousClass316(MessageGifVideoPlayer messageGifVideoPlayer) {
        this.A00 = messageGifVideoPlayer;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        MessageGifVideoPlayer messageGifVideoPlayer = this.A00;
        messageGifVideoPlayer.A03 = new Surface(surfaceTexture);
        MessageGifVideoPlayer.A00(messageGifVideoPlayer);
        MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(messageGifVideoPlayer.A03);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        MessageGifVideoPlayer messageGifVideoPlayer = this.A00;
        MediaPlayer mediaPlayer = messageGifVideoPlayer.A02;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(null);
            messageGifVideoPlayer.A04();
        }
        Surface surface = messageGifVideoPlayer.A03;
        if (surface != null) {
            surface.release();
            messageGifVideoPlayer.A03 = null;
            return true;
        }
        throw null;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        MessageGifVideoPlayer.A00(this.A00);
    }
}
