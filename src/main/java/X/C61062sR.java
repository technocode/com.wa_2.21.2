package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2sR  reason: invalid class name and case insensitive filesystem */
public class C61062sR extends BroadcastReceiver {
    public C04560Kv A00;

    public void onReceive(Context context, Intent intent) {
        this.A00 = C04560Kv.A00();
        Log.i("PaymentMethodUpdateNotification/dismiss");
        C04560Kv r3 = this.A00;
        if (!TextUtils.isEmpty(r3.A04.A01("unread_payment_method_credential_ids"))) {
            r3.A04.A05("unread_payment_method_credential_ids", "");
            r3.A01.A04(null, 22, "PaymentMethodUpdateNotification3");
        }
    }
}
