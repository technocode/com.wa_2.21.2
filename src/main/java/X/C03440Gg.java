package X;

/* renamed from: X.0Gg  reason: invalid class name and case insensitive filesystem */
public class C03440Gg {
    public static volatile C03440Gg A06;
    public AnonymousClass04q A00;
    public C49172Ph A01;
    public C03450Gh A02;
    public C49212Pm A03;
    public C03470Gj A04;
    public final AnonymousClass00G A05;

    public C03440Gg(AnonymousClass00G r1, AnonymousClass04q r2) {
        this.A05 = r1;
        this.A00 = r2;
    }

    public static C03440Gg A00() {
        if (A06 == null) {
            synchronized (C03440Gg.class) {
                if (A06 == null) {
                    A06 = new C03440Gg(AnonymousClass00G.A01, AnonymousClass04q.A00());
                }
            }
        }
        return A06;
    }

    public synchronized C03450Gh A01() {
        C03450Gh r2;
        r2 = this.A02;
        if (r2 == null) {
            r2 = new C03450Gh(this.A05.A00, this.A00);
            this.A02 = r2;
        }
        return r2;
    }

    public synchronized C49212Pm A02() {
        C49212Pm r2;
        r2 = this.A03;
        if (r2 == null) {
            r2 = new C49212Pm(A01(), A01().A04.readLock());
            this.A03 = r2;
        }
        return r2;
    }
}
