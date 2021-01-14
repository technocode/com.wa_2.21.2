package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilFbPayHubActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.2uL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62162uL implements DialogInterface.OnClickListener {
    public final /* synthetic */ BottomSheetDialogFragment A00;
    public final /* synthetic */ BrazilPaymentActivity A01;

    public /* synthetic */ DialogInterface$OnClickListenerC62162uL(BrazilPaymentActivity brazilPaymentActivity, BottomSheetDialogFragment bottomSheetDialogFragment) {
        this.A01 = brazilPaymentActivity;
        this.A00 = bottomSheetDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BrazilPaymentActivity brazilPaymentActivity = this.A01;
        this.A00.A0r();
        brazilPaymentActivity.startActivity(new Intent(brazilPaymentActivity, BrazilFbPayHubActivity.class));
    }
}
