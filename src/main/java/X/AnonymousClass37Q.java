package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.37Q  reason: invalid class name */
public class AnonymousClass37Q implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public AnonymousClass37Q(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder("videoview/ Error: ");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        Log.w(sb.toString());
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A02 = -1;
        videoSurfaceView.A06 = -1;
        MediaPlayer.OnErrorListener onErrorListener = videoSurfaceView.A0A;
        if (onErrorListener == null) {
            return true;
        }
        onErrorListener.onError(videoSurfaceView.A0C, i, i2);
        return true;
    }
}
