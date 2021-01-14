package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.0LU  reason: invalid class name */
public final class AnonymousClass0LU extends BroadcastReceiver {
    public Context A00;
    public final AnonymousClass0LT A01;

    public AnonymousClass0LU(AnonymousClass0LT r1) {
        this.A01 = r1;
    }

    public final synchronized void A00() {
        Context context = this.A00;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.A00 = null;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if ("com.google.android.gms".equals(str)) {
            this.A01.A00();
            A00();
        }
    }
}
