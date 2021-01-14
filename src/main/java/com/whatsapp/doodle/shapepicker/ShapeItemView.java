package com.whatsapp.doodle.shapepicker;

import X.C08490bD;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ShapeItemView extends C08490bD {
    public String A00;

    public ShapeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }
}
