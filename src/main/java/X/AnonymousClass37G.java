package X;

/* renamed from: X.37G  reason: invalid class name */
public abstract class AnonymousClass37G {
    public int A00;
    public final int A01;

    public AnonymousClass37G(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public void A00() {
        long j;
        if (!(this instanceof AnonymousClass3T3)) {
            C56832jG r3 = (C56832jG) this;
            if (!r3.A05) {
                r3.A05 = true;
                AnonymousClass1WB r2 = r3.A04;
                if (r2 != null) {
                    synchronized (r2) {
                        j = r2.A03;
                    }
                    r3.A02 = j;
                }
                r3.A0A.A02();
                return;
            }
            return;
        }
        AnonymousClass3T3 r1 = (AnonymousClass3T3) this;
        r1.A01 = true;
        r1.A07.A02();
    }

    public void A01() {
        if (!(this instanceof AnonymousClass3T3)) {
            C56832jG r1 = (C56832jG) this;
            r1.A0C.A00();
            r1.A0B.A00();
            r1.A0A.A00();
            r1.A09.A00();
            r1.A00 = 4;
            return;
        }
        ((AnonymousClass3T3) this).A08.A00();
    }
}
