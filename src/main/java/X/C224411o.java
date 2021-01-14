package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ViewGroup;

/* renamed from: X.11o  reason: invalid class name and case insensitive filesystem */
public class C224411o extends ViewGroup.LayoutParams {
    public SparseArray A00;
    public SparseArray A01;

    public C224411o(int i, int i2) {
        super(i, i2);
        this.A00 = new SparseArray();
        this.A01 = new SparseArray();
    }

    public C224411o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = new SparseArray();
        this.A01 = new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C224311n.A00);
        int i = ((ViewGroup.LayoutParams) this).width;
        if (i >= 0) {
            this.A00.put(55, Float.valueOf((float) i));
        }
        int i2 = ((ViewGroup.LayoutParams) this).height;
        if (i2 >= 0) {
            this.A00.put(20, Float.valueOf((float) i2));
        }
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(index, typedValue);
            int i4 = typedValue.type;
            if (i4 == 5) {
                this.A00.put(index, Float.valueOf((float) obtainStyledAttributes.getDimensionPixelSize(index, 0)));
            } else if (i4 == 3) {
                this.A01.put(index, obtainStyledAttributes.getString(index));
            } else {
                this.A00.put(index, Float.valueOf(obtainStyledAttributes.getFloat(index, 0.0f)));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public C224411o(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        if (layoutParams instanceof C224411o) {
            C224411o r4 = (C224411o) layoutParams;
            this.A00 = r4.A00.clone();
            this.A01 = r4.A01.clone();
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        this.A01 = new SparseArray();
        if (layoutParams.width >= 0) {
            sparseArray.put(55, Float.valueOf((float) ((ViewGroup.LayoutParams) this).width));
        }
        if (layoutParams.height >= 0) {
            sparseArray.put(20, Float.valueOf((float) ((ViewGroup.LayoutParams) this).height));
        }
    }
}
