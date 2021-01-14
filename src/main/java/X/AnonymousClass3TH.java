package X;

import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.3TH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3TH implements AbstractC676739r {
    public final /* synthetic */ VoipActivityV2 A00;

    public /* synthetic */ AnonymousClass3TH(VoipActivityV2 voipActivityV2) {
        this.A00 = voipActivityV2;
    }

    @Override // X.AbstractC676739r
    public final void ACq(boolean z) {
        VoipActivityV2 voipActivityV2 = this.A00;
        VideoCallParticipantView videoCallParticipantView = voipActivityV2.A0s;
        if (videoCallParticipantView.getLayoutMode() == 1) {
            float f = 0.0f;
            if (voipActivityV2.A0t.A0I) {
                ViewPropertyAnimator animate = videoCallParticipantView.animate();
                if (z) {
                    f = (float) (-voipActivityV2.A13.getBannerHeight());
                }
                animate.translationY(f).setDuration(600).setInterpolator(new DecelerateInterpolator(2.0f)).start();
            } else {
                videoCallParticipantView.setTranslationY(0.0f);
            }
        }
        if (!z && voipActivityV2.getResources() != null && voipActivityV2.A11 != null) {
            int dimensionPixelSize = voipActivityV2.getResources().getDimensionPixelSize(R.dimen.call_control_bottom_sheet_bounce_height);
            voipActivityV2.A11.A19(100, 150, 0, dimensionPixelSize, new DecelerateInterpolator(1.0f));
            voipActivityV2.A11.A19(300, 250, dimensionPixelSize, 0, new DecelerateInterpolator(2.0f));
        }
    }
}
