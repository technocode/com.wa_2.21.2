package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.3BJ  reason: invalid class name */
public class AnonymousClass3BJ extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GetCredential A01;
    public final /* synthetic */ boolean A02;

    public AnonymousClass3BJ(GetCredential getCredential, boolean z, int i) {
        this.A01 = getCredential;
        this.A02 = z;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.A02) {
            GetCredential getCredential = this.A01;
            getCredential.A02.setVisibility(8);
            getCredential.A03.setVisibility(8);
            getCredential.A01.resetTransition();
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        if (this.A02) {
            GetCredential getCredential = this.A01;
            getCredential.A01.startTransition(300);
            getCredential.A02.setVisibility(0);
            getCredential.A03.setVisibility(0);
            if (getCredential.A02.getY() == 0.0f) {
                getCredential.A02.setY((float) (-this.A00));
                return;
            }
            return;
        }
        this.A01.A01.reverseTransition(300);
    }
}
