package X;

import android.animation.ValueAnimator;
import com.whatsapp.payments.ui.widget.PaymentAmountInputField;

/* renamed from: X.2wS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63462wS implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ PaymentAmountInputField A00;

    public /* synthetic */ C63462wS(PaymentAmountInputField paymentAmountInputField) {
        this.A00 = paymentAmountInputField;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A05(valueAnimator);
    }
}
