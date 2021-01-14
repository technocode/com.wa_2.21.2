package X;

import android.content.Context;
import android.icu.text.DecimalFormat;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.0R0  reason: invalid class name */
public class AnonymousClass0R0 {
    public static final String A0A = AnonymousClass008.A0O(AnonymousClass008.A0S("¤"), AnonymousClass020.A01, "#,##0.00");
    public static final Pattern A0B = Pattern.compile("[#0,.-]+");
    public String A00;
    public String A01;
    public final C47772Jm A02;
    public final C47822Jr A03;
    public final C47822Jr A04;
    public final C47822Jr A05;
    public final C47822Jr A06;
    public final AnonymousClass0R1 A07;
    public final String A08;
    public final String A09;

    public AnonymousClass0R0(AnonymousClass01X r3, C47772Jm r4, AnonymousClass0R1 r5) {
        this.A02 = r4;
        this.A07 = r5;
        if (r4.A02) {
            this.A05 = new C47822Jr(r3.A05(9));
            this.A06 = new C47822Jr(r3.A05(11));
            this.A09 = r3.A05(10);
            this.A03 = new C47822Jr(r3.A05(6));
            this.A04 = new C47822Jr(r3.A05(8));
            this.A08 = r3.A05(7);
            return;
        }
        C47822Jr r0 = C47822Jr.A02;
        this.A04 = r0;
        this.A03 = r0;
        this.A06 = r0;
        this.A05 = r0;
        this.A08 = "";
        this.A09 = "";
    }

    public AnonymousClass0R0(Context context, Locale locale, C47772Jm r5, AnonymousClass0R1 r6) {
        this.A02 = r5;
        this.A07 = r6;
        this.A05 = new C47822Jr(AnonymousClass0O0.A01(context, locale, 9));
        this.A06 = new C47822Jr(AnonymousClass0O0.A01(context, locale, 11));
        this.A09 = AnonymousClass0O0.A01(context, locale, 10);
        this.A03 = new C47822Jr(AnonymousClass0O0.A01(context, locale, 6));
        this.A04 = new C47822Jr(AnonymousClass0O0.A01(context, locale, 8));
        this.A08 = AnonymousClass0O0.A01(context, locale, 7);
    }

    public static int A00(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 48) {
            return hashCode != 1632 ? hashCode != 1776 ? hashCode != 2406 ? (hashCode != 2534 || !str.equals("০")) ? 5 : 3 : str.equals("०") ? 4 : 5 : str.equals("۰") ? 2 : 5 : str.equals("٠") ? 1 : 5;
        }
        return 5;
    }

    public String A01(double d) {
        String A002 = this.A07.A00(d);
        C47772Jm r4 = this.A02;
        if (!r4.A02) {
            return A002;
        }
        boolean z = false;
        if (d < 0.0d) {
            z = true;
        }
        if (z) {
            return A02(A002, r4.A00);
        }
        return A02(A002, r4.A01);
    }

    public final String A02(String str, C47782Jn r7) {
        String replaceFirst;
        String str2;
        if (r7.A03) {
            replaceFirst = r7.A01;
            str2 = A0B.matcher(r7.A02).replaceFirst(str);
        } else {
            replaceFirst = A0B.matcher(r7.A01).replaceFirst(str);
            str2 = r7.A02;
        }
        if (!replaceFirst.isEmpty() && this.A06.A00(replaceFirst.codePointBefore(replaceFirst.length())) && this.A05.A00(this.A01.codePointAt(0))) {
            StringBuilder A0S = AnonymousClass008.A0S(replaceFirst);
            A0S.append(this.A09);
            replaceFirst = A0S.toString();
        }
        if (!str2.isEmpty() && this.A04.A00(str2.codePointAt(0))) {
            C47822Jr r2 = this.A03;
            String str3 = this.A01;
            if (r2.A00(str3.codePointBefore(str3.length()))) {
                str2 = AnonymousClass008.A0O(new StringBuilder(), this.A08, str2);
            }
        }
        return AnonymousClass008.A0O(AnonymousClass008.A0S(replaceFirst), this.A01, str2);
    }

    public String A03(BigDecimal bigDecimal) {
        String A002;
        AnonymousClass0R1 r1 = this.A07;
        if (AnonymousClass0R1.A02) {
            DecimalFormat decimalFormat = r1.A00;
            if (decimalFormat != null) {
                A002 = decimalFormat.format(bigDecimal);
            } else {
                throw null;
            }
        } else {
            AnonymousClass0R2 r12 = r1.A01;
            if (r12 != null) {
                A002 = r12.A00(r12.A04.format(bigDecimal));
            } else {
                throw null;
            }
        }
        C47772Jm r2 = this.A02;
        if (!r2.A02) {
            return A002;
        }
        boolean z = false;
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            z = true;
        }
        if (z) {
            return A02(A002, r2.A00);
        }
        return A02(A002, r2.A01);
    }

    public void A04(int i) {
        AnonymousClass0R1 r1 = this.A07;
        if (AnonymousClass0R1.A02) {
            DecimalFormat decimalFormat = r1.A00;
            if (decimalFormat != null) {
                decimalFormat.setMinimumFractionDigits(i);
                decimalFormat.setMaximumFractionDigits(i);
                return;
            }
            throw null;
        }
        AnonymousClass0R2 r0 = r1.A01;
        if (r0 != null) {
            java.text.DecimalFormat decimalFormat2 = r0.A04;
            decimalFormat2.setMinimumFractionDigits(i);
            decimalFormat2.setMaximumFractionDigits(i);
            return;
        }
        throw null;
    }
}
