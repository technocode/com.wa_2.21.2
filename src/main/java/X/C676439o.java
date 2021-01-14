package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.whatsapp.voipcalling.VoipCallNewParticipantBanner;

/* renamed from: X.39o  reason: invalid class name and case insensitive filesystem */
public class C676439o extends AnimatorListenerAdapter {
    public final /* synthetic */ VoipCallNewParticipantBanner A00;

    public C676439o(VoipCallNewParticipantBanner voipCallNewParticipantBanner) {
        this.A00 = voipCallNewParticipantBanner;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        VoipCallNewParticipantBanner voipCallNewParticipantBanner = this.A00;
        if (voipCallNewParticipantBanner.A03 != null) {
            AnonymousClass02M r2 = voipCallNewParticipantBanner.A0A;
            r2.A02.post(new RunnableEBaseShape13S0100000_I1_8(this, 41));
        }
        Handler handler = voipCallNewParticipantBanner.A08;
        handler.removeMessages(0);
        handler.sendEmptyMessageDelayed(0, 3000);
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        AbstractC676739r r1 = this.A00.A05;
        if (r1 != null) {
            r1.ACq(true);
        }
    }
}
