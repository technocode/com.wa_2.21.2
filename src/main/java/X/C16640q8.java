package X;

import android.view.View;

/* renamed from: X.0q8  reason: invalid class name and case insensitive filesystem */
public class C16640q8 {
    public C16620q6 A00 = new C16620q6();
    public final AbstractC16630q7 A01;

    public C16640q8(AbstractC16630q7 r2) {
        this.A01 = r2;
    }

    public View A00(int i, int i2, int i3, int i4) {
        AbstractC16630q7 r6 = this.A01;
        int A7x = r6.A7x();
        int A7w = r6.A7w();
        int i5 = -1;
        if (i2 > i) {
            i5 = 1;
        }
        View view = null;
        while (i != i2) {
            View A5D = r6.A5D(i);
            int A5G = r6.A5G(A5D);
            int A5F = r6.A5F(A5D);
            C16620q6 r2 = this.A00;
            r2.A04 = A7x;
            r2.A03 = A7w;
            r2.A02 = A5G;
            r2.A01 = A5F;
            r2.A00 = 0;
            r2.A00 = i3 | 0;
            if (r2.A00()) {
                return A5D;
            }
            if (i4 != 0) {
                r2.A00 = 0;
                r2.A00 = i4 | 0;
                if (r2.A00()) {
                    view = A5D;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean A01(View view) {
        C16620q6 r4 = this.A00;
        AbstractC16630q7 r0 = this.A01;
        int A7x = r0.A7x();
        int A7w = r0.A7w();
        int A5G = r0.A5G(view);
        int A5F = r0.A5F(view);
        r4.A04 = A7x;
        r4.A03 = A7w;
        r4.A02 = A5G;
        r4.A01 = A5F;
        C16620q6 r1 = this.A00;
        r1.A00 = 0;
        r1.A00 = 24579;
        return r1.A00();
    }
}
