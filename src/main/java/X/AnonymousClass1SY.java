package X;

import java.math.BigDecimal;

/* renamed from: X.1SY  reason: invalid class name */
public class AnonymousClass1SY {
    public static final BigDecimal A00(AnonymousClass0M5 r2, C05910Qz r3) {
        String A00;
        if (r2 == null || (A00 = AnonymousClass0M5.A00(r2.A01)) == null || r3 == null) {
            return null;
        }
        return AnonymousClass1S6.A02(r3, Long.parseLong(A00));
    }

    public AnonymousClass1SI A01(AnonymousClass0M5 r8) {
        String A00;
        C05910Qz r3;
        if (r8 == null) {
            return null;
        }
        AnonymousClass0M5 A0D = r8.A0D("subtotal");
        AnonymousClass0M5 A0D2 = r8.A0D("total");
        AnonymousClass0M5 A0D3 = r8.A0D("currency");
        AnonymousClass0M5 A0D4 = r8.A0D("price_status");
        if (A0D4 == null) {
            A00 = null;
        } else {
            A00 = AnonymousClass0M5.A00(A0D4.A01);
        }
        if (A0D3 != null) {
            byte[] bArr = A0D3.A01;
            if (!C003701u.A0E(AnonymousClass0M5.A00(bArr))) {
                r3 = new C05910Qz(AnonymousClass0M5.A00(bArr));
                BigDecimal A002 = A00(A0D2, r3);
                BigDecimal A003 = A00(A0D, r3);
                if (A00 != null || r3 == null || A002 == null || A003 == null) {
                    return null;
                }
                return new AnonymousClass1SI();
            }
        }
        r3 = null;
        BigDecimal A0022 = A00(A0D2, r3);
        BigDecimal A0032 = A00(A0D, r3);
        return A00 != null ? null : null;
    }
}
