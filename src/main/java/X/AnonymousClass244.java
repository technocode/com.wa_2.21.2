package X;

import android.view.View;

/* renamed from: X.244  reason: invalid class name */
public class AnonymousClass244 extends AbstractC30661bi {
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
}
