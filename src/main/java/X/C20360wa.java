package X;

import java.util.LinkedHashSet;

/* renamed from: X.0wa  reason: invalid class name and case insensitive filesystem */
public class C20360wa {
    public final AbstractC19710vU A00;
    public final C32701fR A01 = new C32701fR(this);
    public final C32791fb A02;
    public final LinkedHashSet A03 = new LinkedHashSet();

    public C20360wa(AbstractC19710vU r2, C32791fb r3) {
        this.A00 = r2;
        this.A02 = r3;
    }

    public AbstractC20030w0 A00(int i, AbstractC20030w0 r14) {
        C20440wi r4;
        AbstractC20030w0 r11;
        AbstractC20030w0 r10;
        C32791fb r2 = this.A02;
        C32711fS r5 = new C32711fS(this.A00, i);
        C32701fR r6 = this.A01;
        r2.A04();
        synchronized (r2) {
            C20430wh r9 = r2.A04;
            r4 = (C20440wi) r9.A02(r5);
            C20430wh r3 = r2.A03;
            C20440wi r0 = (C20440wi) r3.A02(r5);
            r11 = null;
            if (r0 != null) {
                r2.A05(r0);
                r10 = r2.A02(r0);
            } else {
                r10 = null;
            }
            int A97 = r2.A05.A97(r14.A04());
            if (A97 <= r2.A01.A01) {
                if (r3.A00() - r9.A00() <= r2.A01.A00 - 1) {
                    if (r3.A01() - r9.A01() <= r2.A01.A02 - A97) {
                        C20440wi r02 = new C20440wi(r5, r14, r6);
                        r3.A03(r5, r02);
                        r11 = r2.A01(r02);
                    }
                }
            }
        }
        if (r10 != null) {
            r10.close();
        }
        C32791fb.A00(r4);
        r2.A03();
        return r11;
    }
}
