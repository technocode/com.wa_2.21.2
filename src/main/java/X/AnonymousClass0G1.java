package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.0G1  reason: invalid class name */
public class AnonymousClass0G1 extends BroadcastReceiver {
    public final /* synthetic */ C03160Fa A00;

    public AnonymousClass0G1(C03160Fa r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.whatsapp.MessageHandler.LOGOUT_ACTION".equals(intent.getAction())) {
            Log.i("xmpp/handler/logout-timer/timeout");
            C03160Fa r1 = this.A00;
            if (!r1.A0H()) {
                r1.A03();
                Log.d("xmpp/handler/resetforlong");
                r1.A04();
            } else if (AnonymousClass0Fh.A01()) {
                Log.d("voip call in prgress; reset logout timer");
                r1.A02();
                r1.A0t.A01();
            } else {
                AnonymousClass0GA r12 = r1.A0A;
                if (r12 != null) {
                    r12.ANg(false);
                } else {
                    Log.i("xmpp/handler/logout-timer ignoring due to null sending channel");
                }
            }
        } else {
            StringBuilder sb = new StringBuilder("unknown intent received in logout receiver ");
            sb.append(intent);
            Log.w(sb.toString());
        }
    }
}
