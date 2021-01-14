package X;

import android.content.DialogInterface;
import com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment;

/* renamed from: X.2vY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62912vY implements DialogInterface.OnClickListener {
    public final /* synthetic */ PaymentsUnavailableDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62912vY(PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment) {
        this.A00 = paymentsUnavailableDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ActivityC004902h A0A = this.A00.A0A();
        if (A0A != null) {
            A0A.startActivity(C002001d.A0R(A0A, "payments-blocked", null, null, null, null, null));
        }
    }
}
