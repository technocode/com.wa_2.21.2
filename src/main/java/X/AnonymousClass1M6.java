package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.HomeActivity;

/* renamed from: X.1M6  reason: invalid class name */
public class AnonymousClass1M6 extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass0XX A00;

    public AnonymousClass1M6(AnonymousClass0XX r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        HomeActivity homeActivity = this.A00.A00;
        View view = homeActivity.A0C;
        if (view != null) {
            view.removeOnLayoutChangeListener(homeActivity.A07);
            homeActivity.A05.removeAllListeners();
            homeActivity.A05 = null;
        }
    }
}
