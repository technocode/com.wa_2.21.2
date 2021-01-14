package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.106  reason: invalid class name */
public final class AnonymousClass106 extends BroadcastReceiver {
    public final AbstractC03220Fg A00;

    public AnonymousClass106(AbstractC03220Fg r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (getResultCode() == -1) {
            AnonymousClass0PC r8 = new AnonymousClass0PC(getResultData(), getResultExtras(true).getLong("timestamp", Long.MAX_VALUE));
            StringBuilder A0S = AnonymousClass008.A0S("received phone id from ");
            A0S.append(intent.getPackage());
            A0S.append(": ");
            A0S.append(r8);
            Log.d(A0S.toString());
            String str = intent.getPackage();
            AbstractC03220Fg r6 = this.A00;
            AnonymousClass0PC A8L = r6.A8L();
            if (r8.A01 != null && r8.A00 < A8L.A00) {
                r6.AOm(r8);
                StringBuilder sb = new StringBuilder("updated phone id from ");
                sb.append(A8L);
                sb.append(" to ");
                sb.append(r8);
                sb.append(" based on package ");
                AnonymousClass008.A1U(sb, str);
                return;
            }
            return;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("unsuccessful phone id query to ");
        A0S2.append(intent.getPackage());
        Log.d(A0S2.toString());
    }
}
