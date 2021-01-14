package X;

/* renamed from: X.01h  reason: invalid class name and case insensitive filesystem */
public class C002401h {
    public static volatile C002401h A04;
    public AbstractC002501i A00;
    public final AnonymousClass01X A01;
    public final C006903j A02;
    public final AbstractC002501i A03 = new AnonymousClass097();

    public C002401h(C006903j r2, AnonymousClass01X r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public static C002401h A00() {
        if (A04 == null) {
            synchronized (C002401h.class) {
                if (A04 == null) {
                    A04 = new C002401h(C006903j.A00(), AnonymousClass01X.A00());
                }
            }
        }
        return A04;
    }

    public final synchronized AbstractC002501i A01() {
        AbstractC002501i r0;
        r0 = this.A00;
        if (r0 == null) {
            if ("ru".equals(this.A01.A04())) {
                r0 = new AnonymousClass233(this);
                this.A00 = r0;
            } else {
                r0 = this.A03;
                this.A00 = r0;
            }
        }
        return r0;
    }

    public String A02(AnonymousClass02N r7, int i, int i2, Object... objArr) {
        double d;
        if (A01() == this.A03 || r7 == null) {
            AnonymousClass01X r0 = this.A01;
            return String.format(r0.A0I(), r0.A08(i, (long) i2), objArr);
        }
        AbstractC002501i A012 = A01();
        C08560bL r02 = (C08560bL) this.A02.A0A().get(r7);
        if (r02 == null) {
            d = 0.0d;
        } else {
            d = r02.A00;
        }
        AnonymousClass01X r4 = this.A01;
        return String.format(r4.A0I(), A012.A4O(d, r4.A08(i, (long) i2)), objArr);
    }

    public String A03(AnonymousClass02N r6, int i, Object... objArr) {
        double d;
        if (A01() == this.A03 || r6 == null) {
            AnonymousClass01X r0 = this.A01;
            return String.format(r0.A0I(), r0.A06(i), objArr);
        }
        AbstractC002501i A012 = A01();
        C08560bL r02 = (C08560bL) this.A02.A0A().get(r6);
        if (r02 == null) {
            d = 0.0d;
        } else {
            d = r02.A00;
        }
        AnonymousClass01X r3 = this.A01;
        return String.format(r3.A0I(), A012.A4O(d, r3.A06(i)), objArr);
    }
}
