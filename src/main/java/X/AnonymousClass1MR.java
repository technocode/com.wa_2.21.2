package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.ConnectionUnavailableDialogFragment;
import com.whatsapp.MatchPhoneNumberFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.1MR  reason: invalid class name */
public final class AnonymousClass1MR extends Handler {
    public final AnonymousClass1MS A00;
    public final WeakReference A01;

    public AnonymousClass1MR(ActivityC004602e r2, AnonymousClass1MS r3) {
        super(Looper.getMainLooper());
        this.A01 = new WeakReference(r2);
        this.A00 = r3;
    }

    public void handleMessage(Message message) {
        ActivityC004602e r3 = (ActivityC004602e) this.A01.get();
        if (r3 == null) {
            StringBuilder sb = new StringBuilder("MatchPhoneNumberFragment was garbage collected with active messages still enqueued: ");
            sb.append(message);
            Log.w(sb.toString());
        }
        int i = message.what;
        if (i == 1) {
            Log.i("MatchPhoneNumberFragment/check-number/match");
            removeMessages(4);
            if (r3 != null) {
                MatchPhoneNumberFragment.A01(r3);
                this.A00.AHV();
            }
        } else if (i == 2) {
            Log.w("MatchPhoneNumberFragment/check-number/mismatch");
            removeMessages(4);
            if (r3 != null) {
                MatchPhoneNumberFragment.A01(r3);
                this.A00.AHo();
            }
        } else if (i == 3) {
            Log.e("MatchPhoneNumberFragment/error");
            if (r3 != null) {
                MatchPhoneNumberFragment.A01(r3);
                Bundle bundle = new Bundle();
                ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = new ConnectionUnavailableDialogFragment();
                connectionUnavailableDialogFragment.A0N(bundle);
                connectionUnavailableDialogFragment.A0u(r3.A04(), "CONNECTION ERROR");
            }
        } else if (i == 4) {
            Log.w("MatchPhoneNumberFragment/timeout");
            removeMessages(4);
            if (r3 != null) {
                MatchPhoneNumberFragment.A01(r3);
                Bundle bundle2 = new Bundle();
                ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment2 = new ConnectionUnavailableDialogFragment();
                connectionUnavailableDialogFragment2.A0N(bundle2);
                connectionUnavailableDialogFragment2.A0u(r3.A04(), "CONNECTION ERROR");
            }
        }
    }
}
