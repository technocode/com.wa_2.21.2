package X;

import java.util.List;

/* renamed from: X.3S4  reason: invalid class name */
public class AnonymousClass3S4 extends AnonymousClass356 {
    public final AnonymousClass355 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public AnonymousClass3S4(String str, String str2, String str3, String str4, List list, String str5, AnonymousClass355 r7, String str6, String str7, String str8) {
        super(str3);
        this.A06 = str;
        this.A05 = str2;
        this.A08 = list;
        this.A07 = str4;
        this.A01 = str5;
        this.A00 = r7;
        this.A02 = str6;
        this.A04 = str7;
        this.A03 = str8;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeModal{iconLightUrl='");
        AnonymousClass008.A1W(A0S, this.A06, '\'', ", iconDarkUrl='");
        AnonymousClass008.A1W(A0S, this.A05, '\'', ", iconDescription='");
        AnonymousClass008.A1W(A0S, super.A02, '\'', ", title='");
        AnonymousClass008.A1W(A0S, this.A07, '\'', ", bulletPoints=");
        A0S.append(this.A08);
        A0S.append(", agreeButtonText='");
        AnonymousClass008.A1W(A0S, this.A01, '\'', ", timing=");
        A0S.append(this.A00);
        A0S.append(", body='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", footer='");
        AnonymousClass008.A1W(A0S, this.A04, '\'', ", dismissButtonText='");
        A0S.append(this.A03);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
