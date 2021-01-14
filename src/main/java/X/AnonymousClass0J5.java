package X;

/* renamed from: X.0J5  reason: invalid class name */
public class AnonymousClass0J5 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public AnonymousClass0J5(String str, String str2, String str3, String str4, String str5, int i) {
        this.A05 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A03 = str5;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SelectedRoute{authority='");
        A0S.append(this.A02);
        A0S.append("' ");
        A0S.append("authorityType='");
        A0S.append(this.A00);
        A0S.append("'");
        A0S.append('}');
        return A0S.toString();
    }
}
