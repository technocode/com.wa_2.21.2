package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.ArrayList;

/* renamed from: X.1Gd  reason: invalid class name and case insensitive filesystem */
public class C25261Gd implements InputFilter {
    public final /* synthetic */ AnonymousClass05q A00;
    public final /* synthetic */ C46422Aa A01;

    public C25261Gd(C46422Aa r1, AnonymousClass05q r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String obj = spanned.toString();
        StringBuffer stringBuffer = new StringBuffer(obj);
        stringBuffer.replace(i3, i4, charSequence.toString());
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() == 0) {
            arrayList.add(C008805h.A0T(obj));
            String obj2 = stringBuffer.toString();
            if (arrayList.size() == 1) {
                arrayList.add(C008805h.A0T(obj2));
                if (C008805h.A1Q((Number) C008805h.A0P(this.A01.A03, new C010106g(arrayList), this.A00))) {
                    return null;
                }
                return "";
            }
            throw new IllegalArgumentException("arguments have to be continuous");
        }
        throw new IllegalArgumentException("arguments have to be continuous");
    }
}
