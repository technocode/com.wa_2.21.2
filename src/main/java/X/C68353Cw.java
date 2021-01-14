package X;

/* renamed from: X.3Cw  reason: invalid class name and case insensitive filesystem */
public class C68353Cw {
    public final Object A00;
    public final Object A01;

    public C68353Cw(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C68353Cw)) {
            return false;
        }
        C68353Cw r3 = (C68353Cw) obj;
        Object obj2 = r3.A00;
        Object obj3 = this.A00;
        if (obj2 == null) {
            if (obj3 != null) {
                return false;
            }
        } else if (obj3 == null || !obj2.equals(obj3)) {
            return false;
        }
        Object obj4 = r3.A01;
        Object obj5 = this.A01;
        if (obj4 == null) {
            if (obj5 == null) {
                return true;
            }
            return false;
        } else if (obj5 == null || !obj4.equals(obj5)) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        return this.A00.hashCode() ^ this.A01.hashCode();
    }
}
