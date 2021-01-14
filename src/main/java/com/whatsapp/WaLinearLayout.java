package com.whatsapp;

import X.AnonymousClass0SE;
import X.C002001d;
import X.C004302a;
import X.C06140Ry;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

public class WaLinearLayout extends LinearLayout {
    public int A00 = 0;

    public WaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A27);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            Drawable background = getBackground();
            if (!(background == null || this.A00 == 0)) {
                setBackgroundDrawable(background);
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setTag(R.id.bidilayout_ignore, AnonymousClass0SE.A00);
            }
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
