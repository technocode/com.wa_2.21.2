package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.39h  reason: invalid class name */
public class AnonymousClass39h extends AnimatorListenerAdapter {
    public final /* synthetic */ AnimatorSet A00;
    public final /* synthetic */ VoipCallControlBottomSheet A01;

    public AnonymousClass39h(VoipCallControlBottomSheet voipCallControlBottomSheet, AnimatorSet animatorSet) {
        this.A01 = voipCallControlBottomSheet;
        this.A00 = animatorSet;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass02M r3 = this.A01.A0L;
        r3.A02.post(new RunnableEBaseShape13S0100000_I1_8(this.A00, 40));
    }
}
