package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1O5  reason: invalid class name */
public class AnonymousClass1O5 implements InputFilter {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public AnonymousClass1O5(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int A04 = TextStatusComposerActivity.A04(spanned, 0, spanned.length());
        int A042 = TextStatusComposerActivity.A04(spanned, i3, i4);
        int A043 = TextStatusComposerActivity.A04(charSequence, i, i2);
        int i5 = (700 - A04) + A042;
        if (i5 <= 0) {
            TextStatusComposerActivity.A05(this.A00);
            return "";
        } else if (i5 >= A043) {
            return null;
        } else {
            TextStatusComposerActivity.A05(this.A00);
            return C002001d.A1G(charSequence, i, i2, i5);
        }
    }
}
