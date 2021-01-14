package X;

import android.view.ViewTreeObserver;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.2wo  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC63662wo implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ PaymentView A00;

    public ViewTreeObserver$OnGlobalLayoutListenerC63662wo(PaymentView paymentView) {
        this.A00 = paymentView;
    }

    public void onGlobalLayout() {
        PaymentView paymentView = this.A00;
        paymentView.A0N.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        paymentView.A0S.A01();
    }
}
