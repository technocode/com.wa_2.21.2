package X;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.0Qz  reason: invalid class name and case insensitive filesystem */
public class C05910Qz {
    public static final C05910Qz A01 = new C05910Qz("XXX");
    public final String A00;

    public C05910Qz(String str) {
        if (str.length() == 3) {
            this.A00 = str.toUpperCase(Locale.US);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0K("invalid currency code; currencyCode=", str));
    }

    public static int A00(String str) {
        Number number = (Number) AbstractC47792Jo.A01.get(str.toUpperCase(Locale.US));
        if (number == null) {
            return 2;
        }
        return number.intValue();
    }

    public final AnonymousClass0R0 A01(AnonymousClass01X r5, int i, boolean z) {
        String A05 = r5.A05(AnonymousClass0R0.A00(AbstractC002201f.A03(r5.A0I())));
        if (A05.isEmpty()) {
            A05 = AnonymousClass0R0.A0A;
        }
        C47772Jm r3 = new C47772Jm(A05, z);
        AnonymousClass0R0 r1 = new AnonymousClass0R0(r5, r3, new AnonymousClass0R1(r5.A0I(), r3.A00()));
        r1.A00 = this.A00;
        r1.A01 = A02(r5);
        r1.A04(i);
        return r1;
    }

    public String A02(AnonymousClass01X r3) {
        HashMap hashMap = AbstractC47792Jo.A02;
        String str = this.A00;
        Number number = (Number) hashMap.get(str);
        if (number == null) {
            return str;
        }
        return A04(r3.A05(number.intValue()));
    }

    public String A03(AnonymousClass01X r2, BigDecimal bigDecimal, boolean z) {
        return A01(r2, bigDecimal.scale(), z).A03(bigDecimal);
    }

    public final String A04(String str) {
        if (str.isEmpty()) {
            return this.A00;
        }
        AbstractC47862Jv r8 = AbstractC47862Jv.A03;
        if (r8.A00(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 2);
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            String[] strArr = (String[]) AbstractC47762Jl.A00.get(Integer.valueOf(codePointAt));
            if (strArr == null || strArr.length == 0) {
                sb.appendCodePoint(codePointAt);
            } else if (strArr.length == 1) {
                sb.append(strArr[0]);
            } else {
                int length2 = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    String str2 = strArr[i2];
                    if (!r8.A00(str2)) {
                        i2++;
                    } else if (str2 != null) {
                        sb.append(str2);
                    }
                }
                sb.appendCodePoint(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C05910Qz) {
            return this.A00.equals(((C05910Qz) obj).A00);
        }
        return false;
    }
}
