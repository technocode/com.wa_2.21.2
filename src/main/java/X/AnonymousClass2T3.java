package X;

import android.os.SystemClock;

/* renamed from: X.2T3  reason: invalid class name */
public class AnonymousClass2T3 {
    public int A00 = 0;
    public long A01 = -1;
    public long A02 = -1;
    public AnonymousClass1O7 A03;
    public C50162Tq A04;
    public Integer A05;
    public Integer A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final long A0B;
    public final AnonymousClass1W6 A0C;
    public final AnonymousClass0Ci A0D;
    public final AnonymousClass00T A0E;
    public final boolean A0F;

    public AnonymousClass2T3(AnonymousClass00T r3, AnonymousClass0Ci r4, AnonymousClass1W6 r5, boolean z) {
        this.A0E = r3;
        this.A0D = r4;
        this.A0C = r5;
        this.A0F = z;
        this.A0B = SystemClock.uptimeMillis();
    }

    public final void A00() {
        AnonymousClass1W6 r7 = this.A0C;
        long j = this.A01;
        r7.A03 += j - this.A0B;
        long j2 = this.A02;
        if (j2 != -1) {
            r7.A04 += j - j2;
        }
        this.A0E.ANF(new RunnableEBaseShape10S0100000_I1_5(this, 46));
    }

    public synchronized void A01() {
        this.A02 = SystemClock.uptimeMillis();
    }

    public synchronized void A02(int i) {
        this.A00 = i;
    }

    public synchronized void A03(AnonymousClass1O7 r2) {
        this.A03 = r2;
    }

    public synchronized void A04(C50162Tq r2) {
        this.A04 = r2;
    }
}
