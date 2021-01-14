package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;

/* renamed from: X.18t  reason: invalid class name and case insensitive filesystem */
public final class C240518t {
    public static float A00 = Float.NaN;
    public static long A01;
    public static final IntentFilter A02 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    public static int A00(Context context) {
        int intExtra;
        boolean isScreenOn;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, A02);
        int i = 0;
        if (registerReceiver == null) {
            intExtra = 0;
        } else {
            intExtra = registerReceiver.getIntExtra("plugged", 0);
        }
        if ((intExtra & 7) != 0) {
            i = 1;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C001801b.A1f()) {
            isScreenOn = powerManager.isInteractive();
        } else {
            isScreenOn = powerManager.isScreenOn();
        }
        int i2 = isScreenOn ? 1 : 0;
        int i3 = isScreenOn ? 1 : 0;
        int i4 = isScreenOn ? 1 : 0;
        return (i2 << 1) | i;
    }
}
