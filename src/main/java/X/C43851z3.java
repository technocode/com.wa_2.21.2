package X;

import java.util.Arrays;

/* renamed from: X.1z3  reason: invalid class name and case insensitive filesystem */
public class C43851z3 extends AnonymousClass1VN {
    public String A00;
    public String[] A01;

    public C43851z3(String str, String str2, String[] strArr, long j, long j2) {
        super(7, str, C001801b.A14(str2), j, j2);
        this.A00 = str2;
        this.A01 = strArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C43851z3.class != obj.getClass()) {
            return false;
        }
        C43851z3 r4 = (C43851z3) obj;
        if (!this.A00.equals(r4.A00)) {
            return false;
        }
        return Arrays.equals(this.A01, r4.A01);
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + Arrays.hashCode(this.A01);
    }
}
