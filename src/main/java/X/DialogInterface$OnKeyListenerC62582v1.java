package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;

/* renamed from: X.2v1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnKeyListenerC62582v1 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ IndiaUpiPaymentTransactionDetailsActivity A00;

    public /* synthetic */ DialogInterface$OnKeyListenerC62582v1(IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity) {
        this.A00 = indiaUpiPaymentTransactionDetailsActivity;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        IndiaUpiPaymentTransactionDetailsActivity indiaUpiPaymentTransactionDetailsActivity = this.A00;
        if (i != 4) {
            return false;
        }
        dialogInterface.dismiss();
        indiaUpiPaymentTransactionDetailsActivity.finish();
        return true;
    }
}
