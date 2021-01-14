package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.voipcalling.CallDetailsLayout;

/* renamed from: X.38i  reason: invalid class name and case insensitive filesystem */
public class C673838i extends AnimatorListenerAdapter {
    public final /* synthetic */ CallDetailsLayout A00;
    public final /* synthetic */ boolean A01;

    public C673838i(CallDetailsLayout callDetailsLayout, boolean z) {
        this.A00 = callDetailsLayout;
        this.A01 = z;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        CallDetailsLayout callDetailsLayout = this.A00;
        callDetailsLayout.A00 = 0;
        callDetailsLayout.clearAnimation();
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        CallDetailsLayout callDetailsLayout = this.A00;
        callDetailsLayout.A00 = 2;
        if (this.A01) {
            callDetailsLayout.setVisibility(8);
        } else {
            callDetailsLayout.A04.setVisibility(8);
        }
        callDetailsLayout.clearAnimation();
    }
}
