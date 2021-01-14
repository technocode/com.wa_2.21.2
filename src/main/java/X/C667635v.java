package X;

/* renamed from: X.35v  reason: invalid class name and case insensitive filesystem */
public class C667635v {
    public final String A00;
    public final String A01;

    public C667635v(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public C667635v(C667635v... r8) {
        String str = "";
        String str2 = str;
        for (C667635v r2 : r8) {
            StringBuilder A0S = AnonymousClass008.A0S(str);
            A0S.append(r2.A01);
            str = A0S.toString();
            StringBuilder A0S2 = AnonymousClass008.A0S(str2);
            A0S2.append(r2.A00);
            str2 = A0S2.toString();
        }
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean A00(char c, char c2) {
        int i = 0;
        while (true) {
            String str = this.A01;
            if (i >= str.length()) {
                return false;
            }
            if (str.charAt(i) == c && this.A00.charAt(i) == c2) {
                return true;
            }
            i++;
        }
    }
}
