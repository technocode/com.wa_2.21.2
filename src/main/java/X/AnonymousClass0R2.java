package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.0R2  reason: invalid class name */
public class AnonymousClass0R2 {
    public final char A00;
    public final char A01;
    public final int A02;
    public final int A03;
    public final DecimalFormat A04;

    public AnonymousClass0R2(Locale locale, String str) {
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(locale);
        this.A04 = decimalFormat;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        this.A00 = decimalFormatSymbols.getDecimalSeparator();
        this.A01 = decimalFormatSymbols.getGroupingSeparator();
        this.A04.applyPattern(str);
        this.A04.setGroupingUsed(false);
        int indexOf = str.indexOf(46);
        indexOf = indexOf == -1 ? str.length() : indexOf;
        int lastIndexOf = str.lastIndexOf(44, indexOf - 1);
        int i = (indexOf - lastIndexOf) - 1;
        this.A02 = i;
        int lastIndexOf2 = str.lastIndexOf(44, lastIndexOf - 1);
        if (lastIndexOf2 == -1) {
            this.A03 = i;
        } else {
            this.A03 = (lastIndexOf - lastIndexOf2) - 1;
        }
    }

    public final String A00(String str) {
        int lastIndexOf = str.lastIndexOf(this.A00);
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        int i = lastIndexOf - 1;
        while (i > 0 && Character.isDigit(str.charAt(i - 1))) {
            i--;
        }
        int i2 = i + 1;
        StringBuilder sb = new StringBuilder(str.substring(0, i2));
        while (i2 < lastIndexOf) {
            int i3 = (lastIndexOf - i2) - this.A02;
            if (i3 == 0) {
                sb.append(this.A01);
            } else if (i3 > 0 && i3 % this.A03 == 0) {
                sb.append(this.A01);
            }
            sb.append(str.charAt(i2));
            i2++;
        }
        sb.append(str.substring(lastIndexOf));
        return sb.toString();
    }
}
