package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.2UY  reason: invalid class name */
public class AnonymousClass2UY extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass2US A00;
    public final /* synthetic */ C57662kf A01;

    public AnonymousClass2UY(C57662kf r1, AnonymousClass2US r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onAnimationEnd(Animator animator) {
        MediaViewBaseFragment mediaViewBaseFragment = this.A01.A06;
        if (mediaViewBaseFragment.A0A() != null) {
            mediaViewBaseFragment.A10(true, true);
            AnonymousClass2US r0 = this.A00;
            if (r0 != null) {
                r0.ALF(true);
            }
        }
    }
}
