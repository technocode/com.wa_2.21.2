package com.whatsapp.components;

import X.AnonymousClass01X;
import X.C06140Ry;
import X.C08000aJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FloatingActionButton extends C08000aJ {
    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.CENTER);
        if (attributeSet != null) {
            AnonymousClass01X A00 = AnonymousClass01X.A00();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A0l);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(A00.A06(resourceId));
            }
            obtainStyledAttributes.recycle();
        }
    }
}
