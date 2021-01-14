package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: X.1Dh  reason: invalid class name and case insensitive filesystem */
public class C24851Dh extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC24951Dr A01;

    public C24851Dh(AbstractC24951Dr r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A03(this.A00);
    }

    public void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.A01.A06;
        snackbarContentLayout.A03.setAlpha(1.0f);
        long j = (long) 180;
        long j2 = (long) 0;
        snackbarContentLayout.A03.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.A02.getVisibility() == 0) {
            snackbarContentLayout.A02.setAlpha(1.0f);
            snackbarContentLayout.A02.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
