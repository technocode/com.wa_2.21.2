package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.3HC  reason: invalid class name */
public class AnonymousClass3HC extends AbstractC63112vs {
    public AnonymousClass3HB A00;

    public AnonymousClass3HC(Context context, AnonymousClass01X r2, C01970Ad r3, AnonymousClass3HB r4) {
        super(context, r2, r3);
        this.A00 = r4;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        PaymentMethodRow paymentMethodRow;
        if (view == null) {
            paymentMethodRow = new PaymentMethodRow(getContext());
        } else {
            paymentMethodRow = (PaymentMethodRow) view;
        }
        AnonymousClass1VM r3 = (AnonymousClass1VM) super.A00.get(i);
        if (r3 != null) {
            AnonymousClass3HB r2 = this.A00;
            String A7S = r2.A7S(r3);
            if (r2.APa()) {
                r2.APj(r3, paymentMethodRow);
            } else {
                C28051Sr.A1d(paymentMethodRow, r3);
            }
            if (TextUtils.isEmpty(A7S)) {
                A7S = C28051Sr.A0y(this.A02, this.A01, r3);
            }
            paymentMethodRow.A04.setText(A7S);
            paymentMethodRow.A01(this.A00.A7R(r3));
            String A7Q = this.A00.A7Q(r3);
            if (!TextUtils.isEmpty(A7Q)) {
                paymentMethodRow.A02.setText(A7Q);
                paymentMethodRow.A02.setVisibility(0);
            } else {
                paymentMethodRow.A02.setVisibility(8);
                return paymentMethodRow;
            }
        }
        return paymentMethodRow;
    }
}
