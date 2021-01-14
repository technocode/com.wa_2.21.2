package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2u5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62002u5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPayIntentReceiverActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62002u5(IndiaUpiPayIntentReceiverActivity indiaUpiPayIntentReceiverActivity) {
        this.A00 = indiaUpiPayIntentReceiverActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiPayIntentReceiverActivity indiaUpiPayIntentReceiverActivity = this.A00;
        C002001d.A2N(indiaUpiPayIntentReceiverActivity, SearchActionVerificationClientService.NOTIFICATION_ID);
        C002001d.A2V(indiaUpiPayIntentReceiverActivity, IndiaUpiPayIntentReceiverActivity.class, false);
        Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
        indiaUpiPayIntentReceiverActivity.setResult(0);
        indiaUpiPayIntentReceiverActivity.finish();
    }
}
