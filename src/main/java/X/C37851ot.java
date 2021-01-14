package X;

import android.graphics.Typeface;
import android.text.InputFilter;

/* renamed from: X.1ot  reason: invalid class name and case insensitive filesystem */
public class C37851ot extends AbstractC25311Gi {
    public static final C37851ot A00 = new C37851ot();
    public static final InputFilter[] A01 = new InputFilter[0];

    public static final void A00(AnonymousClass1GT r2, C46422Aa r3, String str) {
        if (r3.A0K) {
            r2.setPadding(0, 0, 0, 0);
        }
        if (str != null && !str.equals(r2.getText().toString())) {
            r2.setText(str);
        }
        r2.setHint(r3.A0F);
        Integer num = r3.A0A;
        if (num != null) {
            r2.setGravity(num.intValue());
        }
        String str2 = r3.A0E;
        if (str2 != null) {
            r2.setTypeface(Typeface.create(str2, 0));
        }
        Integer num2 = r3.A0D;
        if (num2 != null) {
            r2.setInputType(num2.intValue());
        }
        if (r3.A0M) {
            r2.setMaxLines(1);
            Integer num3 = r3.A0D;
            if (num3 != null) {
                r2.setInputType(num3.intValue() & -131073);
            } else {
                r2.setInputType(r2.getInputType() & -131073);
            }
        }
        Float f = r3.A08;
        if (f != null) {
            r2.setTextSize(2, f.floatValue());
        }
        Integer num4 = r3.A0C;
        if (num4 != null) {
            r2.setTypeface(null, num4.intValue());
        }
    }
}
