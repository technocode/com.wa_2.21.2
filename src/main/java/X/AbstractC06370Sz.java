package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0Sz  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06370Sz {
    public BroadcastReceiver A00;
    public final /* synthetic */ AnonymousClass0MW A01;

    public AbstractC06370Sz(AnonymousClass0MW r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC06370Sz.A00():int");
    }

    public IntentFilter A01() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    public void A02() {
        BroadcastReceiver broadcastReceiver = this.A00;
        if (broadcastReceiver != null) {
            try {
                this.A01.A0j.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.A00 = null;
        }
    }

    public void A03() {
        A02();
        IntentFilter A012 = A01();
        if (A012 != null && A012.countActions() != 0) {
            BroadcastReceiver broadcastReceiver = this.A00;
            if (broadcastReceiver == null) {
                broadcastReceiver = new AnonymousClass0j7(this);
                this.A00 = broadcastReceiver;
            }
            this.A01.A0j.registerReceiver(broadcastReceiver, A012);
        }
    }
}
