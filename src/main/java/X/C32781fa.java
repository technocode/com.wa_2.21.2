package X;

/* renamed from: X.1fa  reason: invalid class name and case insensitive filesystem */
public class C32781fa implements AbstractC20050w2 {
    public final /* synthetic */ C20440wi A00;
    public final /* synthetic */ C32791fb A01;

    public C32781fa(C32791fb r1, C20440wi r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AbstractC20050w2
    public void AMT(Object obj) {
        boolean z;
        AbstractC20030w0 A02;
        C32701fR r0;
        C32791fb r3 = this.A01;
        C20440wi r5 = this.A00;
        if (r5 != null) {
            synchronized (r3) {
                int i = r5.A00;
                z = false;
                boolean z2 = false;
                if (i > 0) {
                    z2 = true;
                }
                AnonymousClass0N2.A1Z(z2);
                int i2 = i - 1;
                r5.A00 = i2;
                if (!r5.A01 && i2 == 0) {
                    r3.A04.A03(r5.A04, r5);
                    z = true;
                }
                A02 = r3.A02(r5);
            }
            if (A02 != null) {
                A02.close();
            }
            if (z && (r0 = r5.A03) != null) {
                Object obj2 = r5.A04;
                C20360wa r1 = r0.A00;
                synchronized (r1) {
                    r1.A03.add(obj2);
                }
            }
            r3.A04();
            r3.A03();
            return;
        }
        throw null;
    }
}
