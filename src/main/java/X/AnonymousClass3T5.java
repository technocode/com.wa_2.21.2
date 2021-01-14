package X;

import android.content.Context;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.3T5  reason: invalid class name */
public class AnonymousClass3T5 extends AnonymousClass37M {
    public final VideoSurfaceView A00;

    public AnonymousClass3T5(Context context, String str, boolean z) {
        AnonymousClass3T4 r0 = new AnonymousClass3T4(this, context);
        this.A00 = r0;
        r0.setVideoPath(str);
        VideoSurfaceView videoSurfaceView = this.A00;
        videoSurfaceView.A0A = new C668336c(this);
        videoSurfaceView.A09 = new C668436d(this);
        videoSurfaceView.setLooping(z);
    }
}
