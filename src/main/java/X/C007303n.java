package X;

/* renamed from: X.03n  reason: invalid class name and case insensitive filesystem */
public class C007303n {
    public final AnonymousClass02N A00;
    public final String A01;
    public final boolean A02;

    public C007303n(AnonymousClass02N r1, boolean z, String str) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }

    public C007303n(C007303n r2) {
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C007303n.class != obj.getClass()) {
            return false;
        }
        C007303n r5 = (C007303n) obj;
        if (this.A02 != r5.A02) {
            return false;
        }
        String str = this.A01;
        if (str == null) {
            if (r5.A01 != null) {
                return false;
            }
        } else if (!str.equals(r5.A01)) {
            return false;
        }
        AnonymousClass02N r1 = this.A00;
        AnonymousClass02N r0 = r5.A00;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
        } else if (!r1.equals(r0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (i + 31) * 31;
        String str = this.A01;
        int i3 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        AnonymousClass02N r0 = this.A00;
        if (r0 != null) {
            i3 = r0.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Key[id=");
        A0S.append(this.A01);
        A0S.append(", from_me=");
        A0S.append(this.A02);
        A0S.append(", remote_jid=");
        A0S.append(this.A00);
        A0S.append("]");
        return A0S.toString();
    }
}
