package X;

import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import java.util.Locale;

/* renamed from: X.0R1  reason: invalid class name */
public class AnonymousClass0R1 {
    public static final boolean A02;
    public final DecimalFormat A00;
    public final AnonymousClass0R2 A01;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        }
        A02 = z;
    }

    public AnonymousClass0R1(Locale locale, String str) {
        if (A02) {
            this.A00 = new DecimalFormat(str, DecimalFormatSymbols.getInstance(locale));
        } else {
            this.A01 = new AnonymousClass0R2(locale, str);
        }
    }

    public String A00(double d) {
        if (A02) {
            DecimalFormat decimalFormat = this.A00;
            if (decimalFormat != null) {
                return decimalFormat.format(d);
            }
            throw null;
        }
        AnonymousClass0R2 r1 = this.A01;
        if (r1 != null) {
            return r1.A00(r1.A04.format(d));
        }
        throw null;
    }
}
