package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;

/* renamed from: X.2vo  reason: invalid class name and case insensitive filesystem */
public class C63072vo extends BroadcastReceiver {
    public final /* synthetic */ IndiaUpiResetPinActivity A00;

    public C63072vo(IndiaUpiResetPinActivity indiaUpiResetPinActivity) {
        this.A00 = indiaUpiResetPinActivity;
    }

    public void onReceive(Context context, Intent intent) {
        IndiaUpiResetPinActivity indiaUpiResetPinActivity = this.A00;
        C43751yt r0 = indiaUpiResetPinActivity.A04;
        if (r0 != null) {
            indiaUpiResetPinActivity.A05.A00((C74463ay) r0.A06, null);
        } else {
            indiaUpiResetPinActivity.A0F.A07(null, "onLibraryResult got resend otp but bankaccount is null", null);
        }
    }
}
