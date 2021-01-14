package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0sO  reason: invalid class name and case insensitive filesystem */
public class C17860sO extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass1d0 A00;

    public C17860sO(AnonymousClass1d0 r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            AbstractC17610rq.A00().A02(AnonymousClass1d0.A03, "Network broadcast received", new Throwable[0]);
            AnonymousClass1d0 r1 = this.A00;
            r1.A04(r1.A05());
        }
    }
}
