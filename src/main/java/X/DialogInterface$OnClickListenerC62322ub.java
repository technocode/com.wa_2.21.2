package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;

/* renamed from: X.2ub  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62322ub implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiCheckBalanceActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62322ub(IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity) {
        this.A00 = indiaUpiCheckBalanceActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = this.A00;
        indiaUpiCheckBalanceActivity.finish();
        indiaUpiCheckBalanceActivity.overridePendingTransition(0, 0);
    }
}
