package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity;

/* renamed from: X.2v2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62592v2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPaymentsTosActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62592v2(IndiaUpiPaymentsTosActivity indiaUpiPaymentsTosActivity) {
        this.A00 = indiaUpiPaymentsTosActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiPaymentsTosActivity indiaUpiPaymentsTosActivity = this.A00;
        dialogInterface.dismiss();
        indiaUpiPaymentsTosActivity.finish();
    }
}
