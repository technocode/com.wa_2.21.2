package X;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.2uj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62402uj implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62402uj(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String A002;
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        C002001d.A2N(indiaUpiPaymentActivity, 10);
        indiaUpiPaymentActivity.A0G(R.string.register_wait_message);
        String A06 = ((AnonymousClass1DU) indiaUpiPaymentActivity).A0D.A06();
        boolean isEmpty = TextUtils.isEmpty(A06);
        AnonymousClass3XM r1 = indiaUpiPaymentActivity.A04;
        boolean z = false;
        if (r1 == null) {
            z = true;
        }
        if (isEmpty) {
            ((AnonymousClass1DU) indiaUpiPaymentActivity).A04.A00();
        } else if (!z) {
            r1.A0D = indiaUpiPaymentActivity.A0p();
            ((AnonymousClass1DU) indiaUpiPaymentActivity).A03.A02("upi-get-credential");
            AnonymousClass1VM r0 = indiaUpiPaymentActivity.A02;
            String str = r0.A08;
            int i2 = ((C74463ay) indiaUpiPaymentActivity.A02.A06).A04;
            AnonymousClass3XM r7 = indiaUpiPaymentActivity.A04;
            C05900Qy r8 = indiaUpiPaymentActivity.A01;
            String str2 = r0.A0A;
            String A0o = indiaUpiPaymentActivity.A0o();
            C007003k r02 = indiaUpiPaymentActivity.A00;
            if (r02 == null) {
                A002 = null;
            } else {
                A002 = C12420i4.A00(r02);
            }
            indiaUpiPaymentActivity.A0k(A06, str, i2, r7, r8, str2, A0o, A002);
        } else {
            indiaUpiPaymentActivity.A0i();
        }
    }
}
