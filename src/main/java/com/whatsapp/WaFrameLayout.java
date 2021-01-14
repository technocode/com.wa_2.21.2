package com.whatsapp;

import X.C002001d;
import X.C004302a;
import X.C06140Ry;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class WaFrameLayout extends FrameLayout {
    public int A00 = 0;

    public WaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A24);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            Drawable background = getBackground();
            if (!(background == null || this.A00 == 0)) {
                setBackgroundDrawable(background);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            Drawable foreground = getForeground();
            if (!(foreground == null || resourceId == 0)) {
                Drawable A0d = C002001d.A0d(foreground);
                C002001d.A2Z(A0d, C004302a.A00(context, resourceId));
                setForeground(A0d);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A00 == 0 || drawable == null) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        Drawable A0d = C002001d.A0d(drawable);
        C002001d.A2Z(A0d, C004302a.A00(getContext(), this.A00));
        super.setBackgroundDrawable(A0d);
    }
}
