package X;

import java.util.UUID;

/* renamed from: X.0cJ  reason: invalid class name and case insensitive filesystem */
public class C09110cJ {
    public Integer A00;
    public String A01;
    public final C000300f A02;
    public final AnonymousClass03P A03;
    public final AnonymousClass03S A04;
    public final AnonymousClass00Y A05;

    public C09110cJ(AnonymousClass00Y r1, C000300f r2, AnonymousClass03P r3, AnonymousClass03S r4) {
        this.A05 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    public void A00() {
        if (this.A02.A0D(AbstractC000400g.A0O) && this.A01 != null) {
            C43881z6 r3 = new C43881z6();
            A01(r3);
            r3.A00 = 3;
            this.A05.A0B(r3, null, false);
            this.A01 = null;
            this.A00 = null;
        }
    }

    public final void A01(C43881z6 r3) {
        r3.A03 = this.A01;
        r3.A01 = this.A00;
        Integer A1M = C002001d.A1M(this.A03, this.A04);
        if (A1M != null) {
            r3.A02 = Long.valueOf(A1M.longValue());
        }
    }

    public void A02(boolean z, int i) {
        if (this.A02.A0D(AbstractC000400g.A0O)) {
            this.A01 = UUID.randomUUID().toString();
            this.A00 = Integer.valueOf(i);
            C43881z6 r3 = new C43881z6();
            A01(r3);
            int i2 = 2;
            if (z) {
                i2 = 1;
            }
            r3.A00 = Integer.valueOf(i2);
            this.A05.A0B(r3, null, false);
        }
    }
}
