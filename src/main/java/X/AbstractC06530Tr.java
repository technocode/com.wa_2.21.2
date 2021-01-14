package X;

import java.util.Locale;

/* renamed from: X.0Tr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC06530Tr implements AbstractC06520Tq {
    public final AnonymousClass0U5 A00;

    public AbstractC06530Tr(AnonymousClass0U5 r1) {
        this.A00 = r1;
    }

    public boolean A00(CharSequence charSequence, int i) {
        if (i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        AnonymousClass0U5 r0 = this.A00;
        if (r0 != null) {
            int A2d = r0.A2d(charSequence, 0, i);
            if (A2d == 0) {
                return true;
            }
            if (A2d == 1) {
                return false;
            }
            if (!(this instanceof AnonymousClass0U7)) {
                return ((AnonymousClass0U3) this).A00;
            }
            return C06560Tv.A00(Locale.getDefault()) == 1;
        } else if (!(this instanceof AnonymousClass0U7)) {
            return ((AnonymousClass0U3) this).A00;
        } else {
            return C06560Tv.A00(Locale.getDefault()) == 1;
        }
    }
}
