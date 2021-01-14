package X;

import android.content.DialogInterface;
import com.whatsapp.payments.receiver.IndiaUpiPayIntentReceiverActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2u6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC62012u6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ IndiaUpiPayIntentReceiverActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC62012u6(IndiaUpiPayIntentReceiverActivity indiaUpiPayIntentReceiverActivity) {
        this.A00 = indiaUpiPayIntentReceiverActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IndiaUpiPayIntentReceiverActivity indiaUpiPayIntentReceiverActivity = this.A00;
        C002001d.A2N(indiaUpiPayIntentReceiverActivity, 10001);
        C002001d.A2V(indiaUpiPayIntentReceiverActivity, IndiaUpiPayIntentReceiverActivity.class, false);
        Log.i("PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled");
        indiaUpiPayIntentReceiverActivity.setResult(0);
        indiaUpiPayIntentReceiverActivity.finish();
    }
}
