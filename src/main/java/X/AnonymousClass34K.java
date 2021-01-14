package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

/* renamed from: X.34K  reason: invalid class name */
public class AnonymousClass34K extends AnimatorListenerAdapter {
    public final /* synthetic */ C72033Rg A00;

    public AnonymousClass34K(C72033Rg r1) {
        this.A00 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        int i;
        C72033Rg r2 = this.A00;
        r2.A02 = null;
        boolean z = r2.A03;
        WaImageView waImageView = r2.A09;
        if (z) {
            waImageView.setAlpha(1.0f);
        } else {
            waImageView.setAlpha(0.0f);
            waImageView.setVisibility(8);
        }
        WaTextView waTextView = r2.A0A;
        if (r2.A03) {
            i = r2.A04;
        } else {
            i = r2.A05;
        }
        waTextView.setTextColor(i);
    }
}
