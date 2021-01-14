package X;

/* renamed from: X.0ow  reason: invalid class name and case insensitive filesystem */
public class C15910ow {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    public C15910ow(int i, int i2, int i3, Object obj) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15910ow.class != obj.getClass()) {
            return false;
        }
        C15910ow r6 = (C15910ow) obj;
        int i = this.A00;
        if (i != r6.A00) {
            return false;
        }
        if (i == 8) {
            int i2 = this.A01;
            int i3 = this.A02;
            if (Math.abs(i2 - i3) == 1 && i2 == r6.A02 && i3 == r6.A01) {
                return true;
            }
        }
        if (this.A01 != r6.A01 || this.A02 != r6.A02) {
            return false;
        }
        Object obj2 = this.A03;
        Object obj3 = r6.A03;
        if (obj2 != null) {
            if (!obj2.equals(obj3)) {
                return false;
            }
        } else if (obj3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + this.A02) * 31) + this.A01;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.A00;
        if (i != 1) {
            str = i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm";
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.A02);
        sb.append("c:");
        sb.append(this.A01);
        sb.append(",p:");
        sb.append(this.A03);
        sb.append("]");
        return sb.toString();
    }
}
