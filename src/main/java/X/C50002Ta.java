package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.2Ta  reason: invalid class name and case insensitive filesystem */
public class C50002Ta {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass1W8 A03;
    public Boolean A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public Long A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public URL A0H;
    public final byte A0I;
    public final long A0J = SystemClock.elapsedRealtime();

    public C50002Ta(byte b) {
        this.A0I = b;
    }

    public Long A00() {
        Long l = this.A08;
        if (l == null) {
            return 0L;
        }
        Long l2 = this.A07;
        if (l2 != null) {
            return AnonymousClass008.A06(l, l2.longValue());
        }
        return AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
    }

    public void A01() {
        Long l = this.A08;
        boolean z = false;
        if (l != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        this.A06 = AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
        this.A01 = 1;
    }

    public void A02() {
        Long l = this.A08;
        boolean z = false;
        if (l != null) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        this.A0A = AnonymousClass008.A06(l, SystemClock.elapsedRealtime());
    }

    public void A03(Exception exc) {
        if (exc instanceof C56792jC) {
            Throwable cause = exc.getCause();
            if (cause != null) {
                exc = cause;
            }
            this.A0F = exc.getClass().getName();
            return;
        }
        this.A0F = exc.getClass().getName();
    }

    public String toString() {
        String obj;
        Long valueOf;
        long j;
        StringBuilder A0S = AnonymousClass008.A0S("media type: ");
        A0S.append((int) this.A0I);
        A0S.append(" retry count: ");
        A0S.append(this.A0C);
        A0S.append(" network stack: ");
        A0S.append(this.A00);
        A0S.append(" connction type: ");
        A0S.append(this.A05);
        A0S.append(" connection class: ");
        A0S.append(this.A0E);
        A0S.append(" url: ");
        URL url = this.A0H;
        if (url == null) {
            obj = null;
        } else {
            obj = url.toString();
        }
        A0S.append(obj);
        A0S.append(" download time: ");
        A0S.append(A00());
        A0S.append(" queue time: ");
        Long l = this.A08;
        if (l == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(l.longValue() - this.A0J);
        }
        A0S.append(valueOf);
        A0S.append(" connction time: ");
        Long l2 = this.A08;
        long j2 = 0;
        if (l2 != null) {
            Long l3 = this.A06;
            if (l3 != null) {
                j2 = l3.longValue();
            } else if (this.A07 == null) {
                j2 = SystemClock.elapsedRealtime() - l2.longValue();
            }
        }
        A0S.append(j2);
        A0S.append(" route selection delay: ");
        A0S.append(this.A0D);
        A0S.append(" network time: ");
        Long l4 = this.A08;
        long j3 = 0;
        if (l4 != null) {
            Long l5 = this.A0A;
            if (l5 != null) {
                j3 = l5.longValue();
            } else if (this.A07 == null) {
                j3 = SystemClock.elapsedRealtime() - l4.longValue();
            }
        }
        A0S.append(j3);
        A0S.append(" connection reused: ");
        A0S.append(this.A04);
        A0S.append(" response code: ");
        A0S.append(this.A0B);
        A0S.append(" total bytes transferred: ");
        synchronized (this) {
            j = this.A02;
        }
        A0S.append(j);
        A0S.append(" media ip: ");
        A0S.append(this.A0G);
        A0S.append(" exception: ");
        A0S.append(this.A0F);
        A0S.append(" download stage: ");
        A0S.append(this.A01);
        return A0S.toString();
    }
}
