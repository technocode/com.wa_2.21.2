package X;

/* renamed from: X.0Vu  reason: invalid class name and case insensitive filesystem */
public class C07070Vu {
    public final int A00;
    public final int A01;

    public C07070Vu(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07070Vu)) {
            return false;
        }
        C07070Vu r4 = (C07070Vu) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = this.A01;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("x");
        sb.append(this.A00);
        return sb.toString();
    }
}
