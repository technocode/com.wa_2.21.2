package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.0RR  reason: invalid class name */
public class AnonymousClass0RR extends BroadcastReceiver {
    public final AnonymousClass0FE A00;
    public final AnonymousClass0C4 A01;

    public AnonymousClass0RR(AnonymousClass0C4 r1, AnonymousClass0FE r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void onReceive(Context context, Intent intent) {
        this.A01.A07 = false;
        boolean booleanExtra = intent.getBooleanExtra("noPopup", true);
        boolean booleanExtra2 = intent.getBooleanExtra("isAndroidWearRefresh", false);
        this.A00.A08(C006803i.A08(intent), booleanExtra, booleanExtra2);
    }
}
