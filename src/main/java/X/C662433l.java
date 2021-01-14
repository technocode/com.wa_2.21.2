package X;

/* renamed from: X.33l  reason: invalid class name and case insensitive filesystem */
public class C662433l {
    public final int A00;
    public final String A01;

    public C662433l(int i, AnonymousClass3RI r3) {
        this.A00 = i;
        this.A01 = r3.getId();
    }

    public C662433l(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public boolean A00(int i) {
        if (!(this instanceof AnonymousClass3R2)) {
            return i == this.A00;
        }
        int i2 = this.A00;
        return i >= i2 && i < i2 + 4;
    }
}
