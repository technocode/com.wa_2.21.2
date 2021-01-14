package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.StatusesFragment;

/* renamed from: X.1Nn  reason: invalid class name and case insensitive filesystem */
public class C26991Nn extends AnimatorListenerAdapter {
    public final /* synthetic */ StatusesFragment A00;

    public C26991Nn(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    public void onAnimationCancel(Animator animator) {
        animator.removeListener(this);
    }

    public void onAnimationEnd(Animator animator) {
        StatusesFragment statusesFragment = this.A00;
        statusesFragment.A0C.removeAll(statusesFragment.A0D);
        statusesFragment.A06.notifyDataSetChanged();
        statusesFragment.A00 = null;
    }
}
