package X;

/* renamed from: X.03U  reason: invalid class name */
public class AnonymousClass03U {
    public static volatile AnonymousClass03U A0B;
    public AnonymousClass00G A00;
    public C451022z A01;
    public C08960c3 A02;
    public AnonymousClass230 A03;
    public AnonymousClass230 A04;
    public AnonymousClass231 A05;
    public final C000300f A06;
    public final C002701k A07;
    public final C006403e A08;
    public final AnonymousClass03Y A09;
    public final String A0A;

    public AnonymousClass03U(AnonymousClass00G r2, C002701k r3, AnonymousClass03Y r4, C000300f r5, C006403e r6, C006703h r7) {
        this.A07 = r3;
        this.A00 = r2;
        this.A08 = r6;
        this.A09 = r4;
        if (r7 != null) {
            this.A0A = "TLS_AES_128_GCM_SHA256";
            this.A06 = r5;
            return;
        }
        throw null;
    }

    public static AnonymousClass03U A00() {
        if (A0B == null) {
            synchronized (AnonymousClass03U.class) {
                if (A0B == null) {
                    AnonymousClass00G r5 = AnonymousClass00G.A01;
                    C002701k A002 = C002701k.A00();
                    AnonymousClass03Y r7 = AnonymousClass03Y.A02;
                    C000300f A003 = C000300f.A00();
                    if (C006403e.A04 == null) {
                        synchronized (C006403e.class) {
                            if (C006403e.A04 == null) {
                                C006403e.A04 = new C006403e(C006503f.A01());
                            }
                        }
                    }
                    A0B = new AnonymousClass03U(r5, A002, r7, A003, C006403e.A04, C006703h.A00());
                }
            }
        }
        return A0B;
    }

    public synchronized C451022z A01() {
        C451022z r1;
        r1 = this.A01;
        if (r1 == null) {
            r1 = new C451022z(this.A00.A00);
            this.A01 = r1;
        }
        return r1;
    }

    public synchronized C08960c3 A02() {
        C08960c3 r1;
        r1 = this.A02;
        if (r1 == null) {
            r1 = new C08960c3(this.A00.A00);
            this.A02 = r1;
        }
        return r1;
    }

    public synchronized AnonymousClass230 A03(boolean z) {
        if (z) {
            AnonymousClass230 r4 = this.A04;
            if (r4 == null) {
                r4 = new AnonymousClass28J(this.A07, this.A08, this.A09, this.A0A);
                this.A04 = r4;
            }
            return r4;
        }
        AnonymousClass230 r42 = this.A03;
        if (r42 == null) {
            r42 = new AnonymousClass28I(this.A07, this.A08, this.A09, this.A0A);
            this.A03 = r42;
        }
        return r42;
    }

    public synchronized AnonymousClass231 A04() {
        AnonymousClass231 r1;
        r1 = this.A05;
        if (r1 == null) {
            r1 = new AnonymousClass231(this.A00.A00);
            this.A05 = r1;
        }
        return r1;
    }
}
