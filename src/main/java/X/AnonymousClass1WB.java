package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.1WB  reason: invalid class name */
public class AnonymousClass1WB {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public AnonymousClass1W8 A04;
    public Boolean A05;
    public Float A06;
    public Integer A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public URL A0M;
    public boolean A0N;
    public final int A0O;
    public final long A0P = SystemClock.elapsedRealtime();
    public final AnonymousClass1XO A0Q;

    public AnonymousClass1WB(AnonymousClass1XO r3, int i, int i2) {
        this.A00 = i;
        this.A0Q = r3;
        this.A0O = i2;
    }

    public synchronized long A00() {
        return this.A02;
    }

    public Long A01() {
        Long l = this.A0B;
        if (l == null) {
            return 0L;
        }
        Long l2 = this.A09;
        if (l2 != null) {
            return AnonymousClass008.A06(l, l2.longValue());
        }
        return AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
    }

    public void A02() {
        Long l = this.A0B;
        boolean z = false;
        if (l != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        this.A08 = AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
    }

    public void A03() {
        Long l = this.A0C;
        boolean z = false;
        if (l != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        this.A0D = AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
    }

    public void A04() {
        Long l = this.A0B;
        boolean z = true;
        boolean z2 = false;
        if (l != null) {
            z2 = true;
        }
        AnonymousClass00E.A07(z2);
        if (this.A08 == null) {
            z = false;
        }
        AnonymousClass00E.A07(z);
        this.A0I = AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
    }

    public void A05() {
        Long l = this.A0B;
        boolean z = false;
        if (l != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        this.A0E = AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
    }

    public void A06(Exception exc) {
        if (exc instanceof C49972Sx) {
            Throwable cause = exc.getCause();
            if (cause != null) {
                exc = cause;
            }
            this.A0K = exc.getClass().getName();
        } else if (exc != null) {
            this.A0K = exc.getClass().getName();
        }
    }
}
