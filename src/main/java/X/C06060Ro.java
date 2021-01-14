package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* renamed from: X.0Ro  reason: invalid class name and case insensitive filesystem */
public class C06060Ro extends BroadcastReceiver {
    public final /* synthetic */ C06000Ri A00;

    public C06060Ro(C06000Ri r1) {
        this.A00 = r1;
    }

    public void onReceive(Context context, Intent intent) {
        int type;
        C06000Ri r2 = this.A00;
        NetworkInfo activeNetworkInfo = r2.A03.getActiveNetworkInfo();
        if (activeNetworkInfo != null && (type = activeNetworkInfo.getType()) != r2.A00) {
            r2.A02();
            r2.A00 = type;
        }
    }
}
