package X;

/* renamed from: X.1fi  reason: invalid class name and case insensitive filesystem */
public class C32851fi {
    public static final C32851fi A03 = new C32851fi();
    public int A00 = Integer.MAX_VALUE;
    public boolean A01 = true;
    public boolean A02 = true;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C32851fi)) {
            return false;
        }
        C32851fi r4 = (C32851fi) obj;
        if (this.A00 == r4.A00 && this.A02 == r4.A02 && this.A01 == r4.A01) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = 0;
        int i3 = 0;
        if (this.A02) {
            i3 = 4194304;
        }
        int i4 = i ^ i3;
        if (this.A01) {
            i2 = 8388608;
        }
        return i4 ^ i2;
    }
}
