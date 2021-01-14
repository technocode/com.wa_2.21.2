package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1Ww  reason: invalid class name and case insensitive filesystem */
public class C29061Ww extends BroadcastReceiver {
    public AnonymousClass0BA A00;

    public void onReceive(Context context, Intent intent) {
        this.A00 = AnonymousClass0BA.A00();
        Log.i("MessagelessPaymentNotification/dismiss");
        AnonymousClass0BA r3 = this.A00;
        if (!TextUtils.isEmpty(r3.A05.A01("unread_messageless_transaction_ids"))) {
            r3.A05.A05("unread_messageless_transaction_ids", "");
            r3.A01.A04(null, 17, "MessagelessPaymentNotification3");
        }
    }
}
