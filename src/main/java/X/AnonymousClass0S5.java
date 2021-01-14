package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.0S5  reason: invalid class name */
public class AnonymousClass0S5 extends ViewGroup.MarginLayoutParams {
    public int A00;

    public AnonymousClass0S5() {
        super(-2, -2);
        this.A00 = 0;
        this.A00 = 21;
    }

    public AnonymousClass0S5(int i, int i2) {
        super(i, i2);
        this.A00 = 0;
        this.A00 = 8388627;
    }

    public AnonymousClass0S5(AnonymousClass0S5 r2) {
        super((ViewGroup.MarginLayoutParams) r2);
        this.A00 = 0;
        this.A00 = r2.A00;
    }

    public AnonymousClass0S5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A01);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass0S5(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A00 = 0;
    }
}
