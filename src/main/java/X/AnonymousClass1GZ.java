package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.1GZ  reason: invalid class name */
public class AnonymousClass1GZ extends ThreadLocal {
    public final /* synthetic */ String A00;

    public AnonymousClass1GZ(String str) {
        this.A00 = str;
    }

    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        return new DecimalFormat(this.A00, DecimalFormatSymbols.getInstance(Locale.US));
    }
}
