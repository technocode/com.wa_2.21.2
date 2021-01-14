package X;

/* renamed from: X.2ta  reason: invalid class name and case insensitive filesystem */
public class C61692ta {
    public final C61072sS A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C61692ta(AnonymousClass0M5 r5) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AnonymousClass0OS A0A = r5.A0A("owner-name");
        String str7 = null;
        if (A0A == null || (str = A0A.A03) == null) {
            throw null;
        }
        this.A04 = str;
        AnonymousClass0OS A0A2 = r5.A0A("business-name");
        if (A0A2 == null || (str2 = A0A2.A03) == null) {
            throw null;
        }
        this.A02 = str2;
        AnonymousClass0OS A0A3 = r5.A0A("verify-type");
        if (A0A3 == null || (str3 = A0A3.A03) == null) {
            throw null;
        }
        this.A05 = str3;
        AnonymousClass0OS A0A4 = r5.A0A("bank-name");
        if (A0A4 != null) {
            str4 = A0A4.A03;
        } else {
            str4 = null;
        }
        this.A01 = str4;
        AnonymousClass0M5 A0D = r5.A0D("merchant");
        if (A0D != null) {
            AnonymousClass0OS A0A5 = A0D.A0A("credential-id");
            if (A0A5 == null || (str5 = A0A5.A03) == null) {
                throw null;
            }
            this.A03 = str5;
            AnonymousClass0OS A0A6 = r5.A0A("error-code");
            if (A0A6 != null && A0A6.A03 != null) {
                C61072sS r3 = new C61072sS();
                this.A00 = r3;
                AnonymousClass0OS A0A7 = r5.A0A("error-code");
                if (A0A7 != null) {
                    str6 = A0A7.A03;
                } else {
                    str6 = null;
                }
                int A022 = C006803i.A02(str6, 0);
                AnonymousClass0OS A0A8 = r5.A0A("error-text");
                str7 = A0A8 != null ? A0A8.A03 : str7;
                r3.code = A022;
                r3.text = str7;
                return;
            }
            return;
        }
        throw null;
    }
}
