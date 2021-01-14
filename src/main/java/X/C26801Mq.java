package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1Mq  reason: invalid class name and case insensitive filesystem */
public class C26801Mq {
    public static final long A04;
    public static final long A05;
    public static final long A06;
    public boolean A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass00D A02;
    public final C015808q A03;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        A05 = timeUnit.toMillis(1);
        A04 = timeUnit.toMillis(8);
        A06 = timeUnit.toMillis(24);
    }

    public C26801Mq(AnonymousClass00S r1, C015808q r2, AnonymousClass00D r3) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
    }
}
