package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.2ug  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62372ug implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPaymentActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62372ug(IndiaUpiPaymentActivity indiaUpiPaymentActivity) {
        this.A00 = indiaUpiPaymentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiPaymentActivity indiaUpiPaymentActivity = this.A00;
        dialogInterface.dismiss();
        indiaUpiPaymentActivity.A0G(R.string.register_wait_message);
        indiaUpiPaymentActivity.AH0(((AnonymousClass1DU) indiaUpiPaymentActivity).A0D.A06(), null);
    }
}
