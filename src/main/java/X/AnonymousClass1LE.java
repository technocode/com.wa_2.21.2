package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.lang.ref.WeakReference;

/* renamed from: X.1LE  reason: invalid class name */
public class AnonymousClass1LE implements InputFilter {
    public final WeakReference A00;

    public AnonymousClass1LE(C27131Oe r2) {
        this.A00 = new WeakReference(r2);
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        C27131Oe r0 = (C27131Oe) this.A00.get();
        if (r0 == null || !r0.A0P()) {
            return null;
        }
        return "";
    }
}
