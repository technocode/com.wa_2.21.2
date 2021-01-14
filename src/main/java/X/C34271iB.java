package X;

import android.text.Layout;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1iB  reason: invalid class name and case insensitive filesystem */
public final class C34271iB extends AnonymousClass14E implements Comparable {
    public final int A00;

    public C34271iB(CharSequence charSequence, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        super(charSequence, alignment, null, f, 0, i, f2, i2, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Float.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, z, i3);
        this.A00 = i4;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        int i = ((C34271iB) obj).A00;
        int i2 = this.A00;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
