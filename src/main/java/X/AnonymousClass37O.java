package X;

import android.media.MediaPlayer;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.37O  reason: invalid class name */
public class AnonymousClass37O implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ VideoSurfaceView A00;

    public AnonymousClass37O(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A02 = 2;
        videoSurfaceView.A0H = true;
        videoSurfaceView.A0G = true;
        videoSurfaceView.A0F = true;
        MediaPlayer.OnPreparedListener onPreparedListener = videoSurfaceView.A0B;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(videoSurfaceView.A0C);
        }
        videoSurfaceView.A08 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        videoSurfaceView.A07 = videoHeight;
        StringBuilder A0S = AnonymousClass008.A0S("videoview/onPrepare: ");
        A0S.append(videoSurfaceView.A08);
        A0S.append("x");
        AnonymousClass008.A1L(A0S, videoHeight);
        int i = videoSurfaceView.A03;
        if (i >= 0) {
            videoSurfaceView.seekTo(i);
        }
        if (videoSurfaceView.A08 != 0 && videoSurfaceView.A07 != 0) {
            videoSurfaceView.getHolder().setFixedSize(videoSurfaceView.A08, videoSurfaceView.A07);
            if (videoSurfaceView.A05 == videoSurfaceView.A08 && videoSurfaceView.A04 == videoSurfaceView.A07 && videoSurfaceView.A06 == 3) {
                videoSurfaceView.start();
            }
        } else if (videoSurfaceView.A06 == 3) {
            videoSurfaceView.start();
        }
    }
}
