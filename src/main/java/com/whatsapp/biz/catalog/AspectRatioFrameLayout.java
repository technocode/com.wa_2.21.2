package com.whatsapp.biz.catalog;

import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class AspectRatioFrameLayout extends FrameLayout {
    public float A00 = 1.0f;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        A00(context, attributeSet);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C07990aH.A0J, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i)) / this.A00), 1073741824));
        } else if (mode2 == 1073741824) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i2)) * this.A00), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }
}
