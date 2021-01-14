package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: X.1DA  reason: invalid class name */
public class AnonymousClass1DA extends FrameLayout.LayoutParams {
    public float A00 = 0.5f;
    public int A01 = 0;

    public AnonymousClass1DA() {
        super(-1, -1);
    }

    public AnonymousClass1DA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C08030aM.A0M);
        this.A01 = obtainStyledAttributes.getInt(0, 0);
        this.A00 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public AnonymousClass1DA(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
