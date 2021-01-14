package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: X.1D7  reason: invalid class name */
public class AnonymousClass1D7 extends LinearLayout.LayoutParams {
    public int A00 = 1;
    public Interpolator A01;

    public AnonymousClass1D7() {
        super(-1, -2);
    }

    public AnonymousClass1D7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A08);
        this.A00 = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass1D7(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public AnonymousClass1D7(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public AnonymousClass1D7(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
