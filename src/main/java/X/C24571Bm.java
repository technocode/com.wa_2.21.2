package X;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Bm  reason: invalid class name and case insensitive filesystem */
public class C24571Bm {
    public static ScheduledExecutorService A0A;
    public int A00;
    public WorkSource A01;
    public AtomicInteger A02;
    public boolean A03 = true;
    public final int A04;
    public final Context A05;
    public final PowerManager.WakeLock A06;
    public final Object A07 = this;
    public final String A08;
    public final Map A09 = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24571Bm(android.content.Context r12) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24571Bm.<init>(android.content.Context):void");
    }

    public final void A00() {
        PowerManager.WakeLock wakeLock = this.A06;
        if (wakeLock.isHeld()) {
            try {
                wakeLock.release();
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(this.A08).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            wakeLock.isHeld();
        }
    }
}
