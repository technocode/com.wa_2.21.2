package X;

import android.os.Handler;
import android.util.Log;

/* renamed from: X.12K  reason: invalid class name */
public final class AnonymousClass12K {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public Handler A03;
    public Object A04;
    public boolean A05 = true;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass12I A09;
    public final AnonymousClass12J A0A;
    public final AnonymousClass12R A0B;

    public AnonymousClass12K(AnonymousClass12I r3, AnonymousClass12J r4, AnonymousClass12R r5, int i, Handler handler) {
        this.A09 = r3;
        this.A0A = r4;
        this.A0B = r5;
        this.A03 = handler;
        this.A01 = i;
    }

    public void A00() {
        C002001d.A3A(!this.A08);
        this.A08 = true;
        AnonymousClass25N r2 = (AnonymousClass25N) this.A09;
        synchronized (r2) {
            if (r2.A0A) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                A01(false);
                return;
            }
            r2.A0Q.A00.obtainMessage(14, this).sendToTarget();
        }
    }

    public synchronized void A01(boolean z) {
        this.A06 = z | this.A06;
        this.A07 = true;
        notifyAll();
    }
}
