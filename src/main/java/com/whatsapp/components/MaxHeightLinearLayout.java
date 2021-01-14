package com.whatsapp.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaLinearLayout;

public class MaxHeightLinearLayout extends WaLinearLayout {
    public int A00;

    public MaxHeightLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        if (this.A00 > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.A00), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            } else if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.A00, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            } else if (mode == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size, this.A00), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            requestLayout();
        }
    }
}
