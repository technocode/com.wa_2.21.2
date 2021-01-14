package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.25G  reason: invalid class name */
public class AnonymousClass25G extends C33451gn {
    public static final int[] A01 = new int[2];
    public final C33491gr A00 = new C33491gr(this);

    public AnonymousClass25G(Context context) {
        super(context);
    }

    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
    }

    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
    }

    public void onMeasure(int i, int i2) {
        C33491gr r7 = this.A00;
        int[] iArr = A01;
        if (r7 != null) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
                r7.A02 = true;
                iArr[0] = size;
                iArr[1] = size2;
            } else {
                AnonymousClass118 r0 = r7.A00;
                if (r0 != null) {
                    r0.A01(i, i2, iArr);
                    r7.A02 = false;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
            setMeasuredDimension(iArr[0], iArr[1]);
            return;
        }
        throw null;
    }

    public void setRenderState(AnonymousClass118 r4) {
        C33491gr r2 = this.A00;
        AnonymousClass118 r0 = r2.A00;
        if (r0 != r4) {
            AnonymousClass119 r1 = null;
            if (r0 != null) {
                r0.A09 = null;
            }
            r2.A00 = r4;
            if (r4 != null) {
                C33491gr r02 = r4.A09;
                if (r02 == null || r02 == r2) {
                    r4.A09 = r2;
                    AnonymousClass113 r03 = r4.A06;
                    if (r03 != null) {
                        r1 = r03.A02;
                    }
                    r2.A00(r1);
                    return;
                }
                throw new RuntimeException("Must detach from previous host listener first");
            }
            r2.A00(null);
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }
}
