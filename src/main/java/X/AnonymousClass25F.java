package X;

import android.content.Context;

/* renamed from: X.25F  reason: invalid class name */
public class AnonymousClass25F extends C33451gn implements AnonymousClass11A {
    public AnonymousClass119 A00;
    public final C33461go A01 = new C33461go(this);

    public AnonymousClass25F(Context context) {
        super(context);
    }

    public void offsetLeftAndRight(int i) {
        super.offsetLeftAndRight(i);
    }

    public void offsetTopAndBottom(int i) {
        super.offsetTopAndBottom(i);
    }

    public void onMeasure(int i, int i2) {
        AnonymousClass119 r0 = this.A00;
        if (r0 == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(r0.A02.A04.width(), this.A00.A02.A04.height());
        }
    }

    @Override // X.AnonymousClass11A
    public void setRenderTree(AnonymousClass119 r2) {
        if (this.A00 != r2) {
            if (r2 == null) {
                this.A01.A01();
            }
            this.A00 = r2;
            requestLayout();
        }
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }
}
