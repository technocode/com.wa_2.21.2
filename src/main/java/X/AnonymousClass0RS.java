package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0RS  reason: invalid class name */
public class AnonymousClass0RS extends BroadcastReceiver {
    public final /* synthetic */ AnonymousClass03B A00;

    public AnonymousClass0RS(AnonymousClass03B r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        AnonymousClass03B r1 = this.A00;
        r1.A00 = null;
        if (!r1.A04()) {
            r1.A03.A04(null, 8, "Roadblocks");
        }
    }
}
