package X;

import android.telephony.PhoneStateListener;
import com.whatsapp.util.Log;

/* renamed from: X.1KK  reason: invalid class name */
public final class AnonymousClass1KK extends PhoneStateListener {
    public void onCallStateChanged(int i, String str) {
        if (i == 0) {
            Log.i("phone/state idle");
        } else if (i == 1) {
            Log.i("phone/state ringing");
            C28301Tu.A03();
        } else if (i != 2) {
            AnonymousClass008.A0t("phone/state unknown=", i);
        } else {
            Log.i("phone/state offhook");
        }
    }
}
