package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2tc  reason: invalid class name and case insensitive filesystem */
public class C61712tc {
    public final int A00;
    public final C61072sS A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public C61712tc(AnonymousClass0M5 r6) {
        AnonymousClass0OS A0A = r6.A0A("status");
        String str = null;
        this.A00 = C006803i.A02(A0A != null ? A0A.A03 : null, 0);
        AnonymousClass0OS A0A2 = r6.A0A("verify-type");
        this.A08 = A0A2 != null ? A0A2.A03 : null;
        AnonymousClass0OS A0A3 = r6.A0A("verify-id");
        this.A07 = A0A3 != null ? A0A3.A03 : null;
        AnonymousClass0OS A0A4 = r6.A0A("last4");
        this.A04 = A0A4 != null ? A0A4.A03 : null;
        AnonymousClass0OS A0A5 = r6.A0A("masked-account-number");
        this.A05 = A0A5 != null ? A0A5.A03 : null;
        AnonymousClass0OS A0A6 = r6.A0A("bank-name");
        this.A03 = A0A6 != null ? A0A6.A03 : null;
        AnonymousClass0OS A0A7 = r6.A0A("bank-code");
        this.A02 = A0A7 != null ? A0A7.A03 : null;
        AnonymousClass0OS A0A8 = r6.A0A("support-phone-number");
        this.A06 = A0A8 != null ? A0A8.A03 : null;
        AnonymousClass0OS A0A9 = r6.A0A("remaining-retries");
        C006803i.A02(A0A9 != null ? A0A9.A03 : null, -1);
        this.A09 = new ArrayList();
        for (AnonymousClass0M5 r1 : r6.A0H("bank")) {
            C74713bN r2 = new C74713bN();
            r2.A01(0, r1);
            this.A09.add(r2);
        }
        AnonymousClass0OS A0A10 = r6.A0A("error-code");
        if (!(A0A10 == null || A0A10.A03 == null)) {
            C61072sS r3 = new C61072sS();
            this.A01 = r3;
            AnonymousClass0OS A0A11 = r6.A0A("error-code");
            int A022 = C006803i.A02(A0A11 != null ? A0A11.A03 : null, 0);
            AnonymousClass0OS A0A12 = r6.A0A("error-text");
            str = A0A12 != null ? A0A12.A03 : str;
            r3.code = A022;
            r3.text = str;
        }
    }
}
