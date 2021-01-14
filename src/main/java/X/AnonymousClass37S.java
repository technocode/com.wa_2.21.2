package X;

import android.view.SurfaceHolder;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.37S  reason: invalid class name */
public class AnonymousClass37S implements SurfaceHolder.Callback {
    public final /* synthetic */ VideoSurfaceView A00;

    public AnonymousClass37S(VideoSurfaceView videoSurfaceView) {
        this.A00 = videoSurfaceView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r2.A07 != r7) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void surfaceChanged(android.view.SurfaceHolder r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            java.lang.String r1 = "videoview/surfaceChanged: "
            java.lang.String r0 = "x"
            X.AnonymousClass008.A0y(r1, r6, r0, r7)
            com.whatsapp.videoplayback.VideoSurfaceView r2 = r3.A00
            r2.A05 = r6
            r2.A04 = r7
            int r0 = r2.A08
            if (r0 != r6) goto L_0x0018
            int r0 = r2.A07
            r1 = 1
            if (r0 == r7) goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            android.media.MediaPlayer r0 = r2.A0C
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002e
            int r0 = r2.A03
            if (r0 < 0) goto L_0x0026
            r2.seekTo(r0)
        L_0x0026:
            int r1 = r2.A06
            r0 = 3
            if (r1 != r0) goto L_0x002e
            r2.start()
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37S.surfaceChanged(android.view.SurfaceHolder, int, int, int):void");
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A0E = surfaceHolder;
        videoSurfaceView.A02();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A03 = videoSurfaceView.getCurrentPosition();
        videoSurfaceView.A0E = null;
        videoSurfaceView.A03(true);
    }
}
