package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.MentionableEntry;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.2wV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnFocusChangeListenerC63492wV implements View.OnFocusChangeListener {
    public final /* synthetic */ MentionableEntry A00;
    public final /* synthetic */ PaymentView A01;

    public /* synthetic */ View$OnFocusChangeListenerC63492wV(PaymentView paymentView, MentionableEntry mentionableEntry) {
        this.A01 = paymentView;
        this.A00 = mentionableEntry;
    }

    public final void onFocusChange(View view, boolean z) {
        PaymentView paymentView = this.A01;
        MentionableEntry mentionableEntry = this.A00;
        if (z) {
            mentionableEntry.setHint("");
            paymentView.A01();
            if (paymentView.A05.getVisibility() == 0) {
                paymentView.A03(false);
                return;
            }
            return;
        }
        mentionableEntry.setHint(paymentView.A0h.A06(R.string.send_payment_note));
    }
}
