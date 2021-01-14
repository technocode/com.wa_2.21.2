package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0Sh  reason: invalid class name and case insensitive filesystem */
public class C06230Sh {
    public static long A03;
    public static long A04;
    public static volatile C06230Sh A05;
    public final AnonymousClass00S A00;
    public final C002701k A01;
    public final AnonymousClass0AR A02;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        A04 = timeUnit.convert(15, TimeUnit.MINUTES);
        A03 = timeUnit.convert(10, TimeUnit.SECONDS);
    }

    public C06230Sh(AnonymousClass00S r1, C002701k r2, AnonymousClass0AR r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public boolean A00() {
        C002701k r6 = this.A01;
        return Math.abs(this.A00.A05() - r6.A05()) < Math.max(TimeUnit.MILLISECONDS.convert((long) r6.A03(200), TimeUnit.MINUTES), A04);
    }
}
