package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.37N  reason: invalid class name */
public class AnonymousClass37N implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public AnonymousClass37N(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.A07 = videoHeight;
        StringBuilder A0S = AnonymousClass008.A0S("videoview/onVideoSizeChanged: ");
        A0S.append(videoSurfaceView.A08);
        A0S.append("x");
        AnonymousClass008.A1L(A0S, videoHeight);
        if (videoSurfaceView.A08 != 0 && videoSurfaceView.A07 != 0) {
            videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
            videoSurfaceView.requestLayout();
        }
    }
}
