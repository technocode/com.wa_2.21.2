package X;

import android.content.Context;
import android.graphics.Typeface;
import android.icu.text.DecimalFormat;
import android.text.SpannableStringBuilder;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

/* renamed from: X.0Qw  reason: invalid class name and case insensitive filesystem */
public class C05880Qw implements AbstractC05890Qx {
    public static AbstractC05890Qx A00;
    public static AbstractC05890Qx A01;
    public static AbstractC05890Qx A02;
    public static final BigDecimal A03 = new BigDecimal(1);
    public final C05910Qz currency;
    public final String currencyIconText;
    public final int currencyType;
    public final int fractionScale;
    public final int maxFractionScale;
    public C05900Qy maxValue;
    public final C05900Qy minValue;
    public final String requestCurrencyIconText;

    static {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        A02 = new C05880Qw(null, -1, "#", "#", 1, 1, bigDecimal, bigDecimal);
        BigDecimal valueOf = BigDecimal.valueOf(5000L);
        BigDecimal bigDecimal2 = A03;
        A01 = new C05880Qw("INR", 0, "R", "r", 2, 2, valueOf, bigDecimal2);
        A00 = new C05880Qw("BRL", 0, "B", "b", 2, 2, BigDecimal.valueOf(1000L), bigDecimal2);
    }

    public C05880Qw(String str, int i, String str2, String str3, int i2, int i3, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C05910Qz r0;
        if (1 == 0) {
            Log.e(new AssertionError("PaymentCurrency scale should be >= 0"));
        }
        this.fractionScale = i2;
        this.maxFractionScale = i3;
        this.maxValue = new C05900Qy(bigDecimal, i2);
        this.minValue = new C05900Qy(bigDecimal2, i2);
        if (str == null) {
            try {
                r0 = C05910Qz.A01;
            } catch (Exception unused) {
                r0 = C05910Qz.A01;
            } catch (Throwable th) {
                this.currency = C05910Qz.A01;
                throw th;
            }
        } else {
            r0 = new C05910Qz(str);
        }
        this.currency = r0;
        this.currencyType = i;
        this.currencyIconText = str2;
        this.requestCurrencyIconText = str3;
    }

    @Override // X.AbstractC05890Qx
    public String A4P(AnonymousClass01X r5, C05900Qy r6) {
        C05910Qz r3 = this.currency;
        BigDecimal bigDecimal = r6.A00;
        return r3.A01(r5, bigDecimal.scale(), false).A03(bigDecimal);
    }

    @Override // X.AbstractC05890Qx
    public String A4Q(AnonymousClass01X r3, BigDecimal bigDecimal) {
        return this.currency.A03(r3, bigDecimal, false);
    }

    @Override // X.AbstractC05890Qx
    public String A4R(AnonymousClass01X r5, C05900Qy r6) {
        C05910Qz r3 = this.currency;
        BigDecimal bigDecimal = r6.A00;
        return r3.A01(r5, bigDecimal.scale(), true).A03(bigDecimal);
    }

    @Override // X.AbstractC05890Qx
    public String A4S(AnonymousClass01X r3, BigDecimal bigDecimal) {
        return this.currency.A03(r3, bigDecimal, true);
    }

    @Override // X.AbstractC05890Qx
    public BigDecimal A4V(AnonymousClass01X r7, String str) {
        Number parse;
        C05910Qz r2 = this.currency;
        if (r2 != null) {
            try {
                AnonymousClass0R0 A012 = r2.A01(r7, C05910Qz.A00(r2.A00), false);
                String trim = str.replace(A012.A01, "").replace(A012.A00, "").replace(AnonymousClass020.A01, "").trim();
                AnonymousClass0R1 r1 = A012.A07;
                if (AnonymousClass0R1.A02) {
                    DecimalFormat decimalFormat = r1.A00;
                    if (decimalFormat != null) {
                        parse = decimalFormat.parse(trim);
                    } else {
                        throw null;
                    }
                } else {
                    AnonymousClass0R2 r0 = r1.A01;
                    if (r0 != null) {
                        parse = r0.A04.parse(trim.replace(String.valueOf(r0.A01), ""));
                    } else {
                        throw null;
                    }
                }
                return new BigDecimal(parse.toString());
            } catch (Exception e) {
                Log.w("Currency parse threw: ", e);
                try {
                    return new BigDecimal(str);
                } catch (Exception e2) {
                    Log.w("Currency parse fallback threw: ", e2);
                    return null;
                }
            }
        } else {
            throw null;
        }
    }

    @Override // X.AbstractC05890Qx
    public String A5e() {
        return this.currency.A00;
    }

    @Override // X.AbstractC05890Qx
    public CharSequence A5f(Context context) {
        return A5g(context, 0);
    }

    @Override // X.AbstractC05890Qx
    public CharSequence A5g(Context context, int i) {
        String str;
        if (i == 1) {
            str = this.requestCurrencyIconText;
        } else {
            str = this.currencyIconText;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Typeface A0Z = C002001d.A0Z(context);
        if (A0Z != null) {
            spannableStringBuilder.setSpan(new AnonymousClass0R3(A0Z), 0, this.currencyIconText.length(), 0);
        }
        return spannableStringBuilder;
    }

    @Override // X.AbstractC05890Qx
    public String A5i(AnonymousClass01X r2) {
        return this.currency.A02(r2);
    }

    @Override // X.AbstractC05890Qx
    public int A5z() {
        return this.fractionScale;
    }

    @Override // X.AbstractC05890Qx
    public C05900Qy A7G() {
        return this.maxValue;
    }

    @Override // X.AbstractC05890Qx
    public C05900Qy A7X() {
        return this.minValue;
    }

    @Override // X.AbstractC05890Qx
    public int A9H(AnonymousClass01X r7) {
        C05910Qz r3 = this.currency;
        String A012 = r3.A01(r7, C05910Qz.A00(r3.A00), true).A01(1.0d);
        String A022 = r3.A02(r7);
        int length = A012.length();
        int length2 = A022.length();
        if (length < length2 || !A012.substring(0, length2).equals(A022)) {
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC05890Qx
    public void AOW(C05900Qy r1) {
        this.maxValue = r1;
    }
}
