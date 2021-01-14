package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.HomeActivity;

/* renamed from: X.0Yc  reason: invalid class name and case insensitive filesystem */
public class C07540Yc extends AnimatorListenerAdapter {
    public final /* synthetic */ HomeActivity A00;

    public C07540Yc(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A09.setVisibility(0);
    }
}
