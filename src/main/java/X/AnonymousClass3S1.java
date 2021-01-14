package X;

/* renamed from: X.3S1  reason: invalid class name */
public class AnonymousClass3S1 extends AnonymousClass356 {
    public final AnonymousClass355 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3S1(String str, String str2, String str3, String str4, String str5, AnonymousClass355 r6) {
        super(str4);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str5;
        this.A00 = r6;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeBanner{text='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", lightUrl='");
        AnonymousClass008.A1W(A0S, this.A03, '\'', ", lightIconFile='");
        A0S.append(super.A01);
        A0S.append('\'');
        A0S.append(", darkUrl='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", darkIconFile='");
        A0S.append(super.A00);
        A0S.append('\'');
        A0S.append(", iconDescription='");
        AnonymousClass008.A1W(A0S, super.A02, '\'', ", action='");
        AnonymousClass008.A1W(A0S, this.A01, '\'', ", timing=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
