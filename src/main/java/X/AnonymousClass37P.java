package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.37P  reason: invalid class name */
public class AnonymousClass37P implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public AnonymousClass37P(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A02 = 5;
        videoSurfaceView.A06 = 5;
        MediaPlayer.OnCompletionListener onCompletionListener = videoSurfaceView.A09;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(videoSurfaceView.A0C);
        }
    }
}
