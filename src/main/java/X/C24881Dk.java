package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: X.1Dk  reason: invalid class name and case insensitive filesystem */
public class C24881Dk extends AnimatorListenerAdapter {
    public final /* synthetic */ AbstractC24951Dr A00;

    public C24881Dk(AbstractC24951Dr r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        this.A00.A01();
    }

    public void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.A00.A06;
        snackbarContentLayout.A03.setAlpha(0.0f);
        long j = (long) 180;
        long j2 = (long) 70;
        snackbarContentLayout.A03.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.A02.getVisibility() == 0) {
            snackbarContentLayout.A02.setAlpha(0.0f);
            snackbarContentLayout.A02.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
