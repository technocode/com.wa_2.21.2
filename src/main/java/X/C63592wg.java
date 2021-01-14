package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.2wg  reason: invalid class name and case insensitive filesystem */
public class C63592wg extends AnimatorListenerAdapter {
    public final /* synthetic */ PaymentAmountInputField A00;

    public C63592wg(PaymentAmountInputField paymentAmountInputField) {
        this.A00 = paymentAmountInputField;
    }

    public void onAnimationCancel(Animator animator) {
        View view = this.A00.A08;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        View view = this.A00.A08;
        if (view != null) {
            view.setTranslationX(0.0f);
        }
    }
}
