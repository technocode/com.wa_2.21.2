package X;

import android.view.View;
import android.widget.Scroller;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.242  reason: invalid class name */
public class AnonymousClass242 extends AbstractC30661bi {
    public AnonymousClass0VS A00;
    public AnonymousClass0VS A01;

    public static final int A00(AnonymousClass0VT r3, View view, AnonymousClass0VS r5) {
        int A012;
        int A07 = (r5.A07(view) >> 1) + r5.A09(view);
        if (r3.A0f()) {
            A012 = (r5.A05() >> 1) + r5.A04();
        } else {
            A012 = r5.A01() >> 1;
        }
        return A07 - A012;
    }

    public static final View A01(AnonymousClass0VT r8, AnonymousClass0VS r9) {
        int A012;
        int A0A = r8.A0A();
        View view = null;
        if (A0A == 0) {
            return null;
        }
        if (r8.A0f()) {
            A012 = (r9.A05() >> 1) + r9.A04();
        } else {
            A012 = r9.A01() >> 1;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0A; i2++) {
            View A0I = r8.A0I(i2);
            int abs = Math.abs(((r9.A07(A0I) >> 1) + r9.A09(A0I)) - A012);
            if (abs < i) {
                view = A0I;
                i = abs;
            }
        }
        return view;
    }

    public final int A04(AnonymousClass0VT r18, AnonymousClass0VS r19, int i, int i2) {
        int max;
        Scroller scroller = super.A00;
        int i3 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        scroller.fling(0, 0, i, i2, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
        int[] iArr = {super.A00.getFinalX(), super.A00.getFinalY()};
        int A0A = r18.A0A();
        float f = 1.0f;
        if (A0A != 0) {
            View view = null;
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < A0A; i5++) {
                View A0I = r18.A0I(i5);
                int A06 = AnonymousClass0VT.A06(A0I);
                if (A06 != -1) {
                    if (A06 < i4) {
                        view = A0I;
                        i4 = A06;
                    }
                    if (A06 > i3) {
                        view2 = A0I;
                        i3 = A06;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(r19.A06(view), r19.A06(view2)) - Math.min(r19.A09(view), r19.A09(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i3 - i4) + 1));
                if (f <= 0.0f) {
                    return 0;
                }
            }
        }
        int i6 = iArr[0];
        int abs = Math.abs(i6);
        int i7 = iArr[1];
        if (abs > Math.abs(i7)) {
            i7 = i6;
        }
        return Math.round(((float) i7) / f);
    }
}
