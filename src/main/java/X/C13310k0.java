package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.0k0  reason: invalid class name and case insensitive filesystem */
public class C13310k0 extends ViewGroup.MarginLayoutParams {
    public float A00;
    public int A01;

    public C13310k0(int i) {
        super(i, -2);
        this.A01 = -1;
        this.A00 = 0.0f;
    }

    public C13310k0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A0O);
        this.A00 = obtainStyledAttributes.getFloat(3, 0.0f);
        this.A01 = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public C13310k0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A01 = -1;
    }
}
