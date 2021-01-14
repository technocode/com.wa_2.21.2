package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: X.24a  reason: invalid class name and case insensitive filesystem */
public class C452724a extends AbstractC31311cz {
    public static final String A00 = AbstractC17610rq.A01("BatteryChrgTracker");

    public C452724a(Context context, AnonymousClass0t5 r2) {
        super(context, r2);
    }

    @Override // X.AbstractC17850sN
    public Object A00() {
        int intExtra;
        Intent registerReceiver = this.A01.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            AbstractC17610rq.A00().A03(A00, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : (intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.AbstractC31311cz
    public IntentFilter A05() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
            return intentFilter;
        }
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        return intentFilter;
    }
}
