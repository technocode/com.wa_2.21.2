package X;

import java.util.List;

/* renamed from: X.0qa  reason: invalid class name and case insensitive filesystem */
public class C16870qa {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public C16870qa(String str, boolean z, List list) {
        this.A00 = str;
        this.A02 = z;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16870qa.class != obj.getClass()) {
            return false;
        }
        C16870qa r5 = (C16870qa) obj;
        if (this.A02 != r5.A02 || !this.A01.equals(r5.A01)) {
            return false;
        }
        String str = this.A00;
        boolean startsWith = str.startsWith("index_");
        String str2 = r5.A00;
        if (startsWith) {
            return str2.startsWith("index_");
        }
        return str.equals(str2);
    }

    public int hashCode() {
        int hashCode;
        String str = this.A00;
        if (str.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.A01.hashCode() + (((hashCode * 31) + (this.A02 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Index{name='");
        AnonymousClass008.A1W(A0S, this.A00, '\'', ", unique=");
        A0S.append(this.A02);
        A0S.append(", columns=");
        A0S.append(this.A01);
        A0S.append('}');
        return A0S.toString();
    }
}
