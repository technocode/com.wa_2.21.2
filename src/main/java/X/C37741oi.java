package X;

/* renamed from: X.1oi  reason: invalid class name and case insensitive filesystem */
public class C37741oi extends AbstractC16450pp {
    public int A00 = -1;
    public boolean A01;
    public final AbstractC30661bi A02;
    public final C37731oh A03;

    public C37741oi(AbstractC30661bi r2, C37731oh r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C37741oi)) {
            return false;
        }
        C37741oi r4 = (C37741oi) obj;
        if (!r4.A02.equals(this.A02) || !r4.A03.equals(this.A03)) {
            return false;
        }
        return true;
    }
}
