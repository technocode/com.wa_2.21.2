package X;

import android.content.DialogInterface;
import com.whatsapp.voipcalling.CallLogActivity;

/* renamed from: X.37e  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC670937e implements DialogInterface.OnClickListener {
    public final /* synthetic */ CallLogActivity A00;

    public /* synthetic */ DialogInterface$OnClickListenerC670937e(CallLogActivity callLogActivity) {
        this.A00 = callLogActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CallLogActivity callLogActivity = this.A00;
        C002001d.A2N(callLogActivity, 1);
        callLogActivity.A0U(true);
    }
}
