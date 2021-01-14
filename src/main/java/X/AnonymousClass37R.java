package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.37R  reason: invalid class name */
public class AnonymousClass37R implements MediaPlayer.OnBufferingUpdateListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public AnonymousClass37R(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.A00.A01 = i;
    }
}
