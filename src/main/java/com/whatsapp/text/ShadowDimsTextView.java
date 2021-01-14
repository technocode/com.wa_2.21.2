package com.whatsapp.text;

import X.C05560Pe;
import X.C06140Ry;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ShadowDimsTextView extends C05560Pe {
    public ShadowDimsTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A1b);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(1, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(2, 0.0f);
        int color = obtainStyledAttributes.getColor(0, 0);
        if (color != 0) {
            setShadowLayer(dimension, dimension2, dimension3, color);
        } else {
            getPaint().clearShadowLayer();
        }
        obtainStyledAttributes.recycle();
    }
}
