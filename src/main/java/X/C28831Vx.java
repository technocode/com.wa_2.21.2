package X;

/* renamed from: X.1Vx  reason: invalid class name and case insensitive filesystem */
public class C28831Vx {
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C28831Vx(boolean z, String str, int i, String str2) {
        this.A03 = z;
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C28831Vx.class != obj.getClass()) {
            return false;
        }
        C28831Vx r5 = (C28831Vx) obj;
        if (this.A03 != r5.A03 || this.A00 != r5.A00 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.A03) {
            StringBuilder A0S = AnonymousClass008.A0S("Trusted callers: uid=");
            A0S.append(this.A00);
            A0S.append(", package=");
            A0S.append(this.A01);
            return A0S.toString();
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("Untrusted caller: uid=");
        A0S2.append(this.A00);
        A0S2.append(", package=");
        A0S2.append(this.A01);
        return A0S2.toString();
    }
}
