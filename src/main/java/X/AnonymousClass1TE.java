package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.1TE  reason: invalid class name */
public class AnonymousClass1TE extends InputFilter.AllCaps {
    public final /* synthetic */ AnonymousClass01X A00;

    public AnonymousClass1TE(AnonymousClass01X r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        return String.valueOf(charSequence).toLowerCase(this.A00.A0I());
    }
}
