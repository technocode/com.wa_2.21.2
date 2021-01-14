package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* renamed from: X.39p  reason: invalid class name and case insensitive filesystem */
public class C676539p extends AnimatorListenerAdapter {
    public final /* synthetic */ VoipCallNewParticipantBanner A00;

    public C676539p(VoipCallNewParticipantBanner voipCallNewParticipantBanner) {
        this.A00 = voipCallNewParticipantBanner;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A00;
        voipCallNewParticipantBanner.setVisibility(8);
        voipCallNewParticipantBanner.setTranslationY(0.0f);
        voipCallNewParticipantBanner.A06 = false;
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        AbstractC676739r r1 = this.A00.A05;
        if (r1 != null) {
            r1.ACq(false);
        }
    }
}
