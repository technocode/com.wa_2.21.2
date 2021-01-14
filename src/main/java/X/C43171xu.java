package X;

import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.videoplayback.VideoSurfaceView;

/* renamed from: X.1xu  reason: invalid class name and case insensitive filesystem */
public class C43171xu extends AbstractC25311Gi {
    public static final C43171xu A01 = new C43171xu();
    public final AnonymousClass1TL A00 = AnonymousClass1TL.A00();

    public void A01(View view, C46542Ay r7) {
        String str;
        VideoSurfaceView videoSurfaceView = (VideoSurfaceView) view.findViewById(R.id.video_view);
        View findViewById = view.findViewById(R.id.loading_progress);
        View findViewById2 = view.findViewById(R.id.play_button);
        String str2 = r7.A00;
        if (!TextUtils.isEmpty(str2)) {
            str = this.A00.A01(str2).getAbsolutePath();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            videoSurfaceView.setVideoPath(str);
        }
        videoSurfaceView.A0B = new AnonymousClass1TI(findViewById);
        videoSurfaceView.A09 = new AnonymousClass1TH(findViewById2);
        findViewById2.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(findViewById2, videoSurfaceView, 18));
        if (r7.A01) {
            videoSurfaceView.start();
            findViewById2.setVisibility(8);
            return;
        }
        findViewById2.setVisibility(0);
    }
}
