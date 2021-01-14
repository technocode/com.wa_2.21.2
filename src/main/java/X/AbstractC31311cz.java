package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* renamed from: X.1cz  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC31311cz extends AbstractC17850sN {
    public static final String A01 = AbstractC17610rq.A01("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver A00 = new C17840sM(this);

    public AbstractC31311cz(Context context, AnonymousClass0t5 r3) {
        super(context, r3);
    }

    public IntentFilter A05() {
        if (!(this instanceof C452924c)) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.BATTERY_OKAY");
            intentFilter.addAction("android.intent.action.BATTERY_LOW");
            return intentFilter;
        }
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter2;
    }
}
