package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.0d8  reason: invalid class name and case insensitive filesystem */
public class C09550d8 extends ViewGroup.LayoutParams {
    public float A00 = 0.0f;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public C09550d8() {
        super(-1, -1);
    }

    public C09550d8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.A0s);
        this.A02 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
