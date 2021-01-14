package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass0My;
import X.C003701u;
import X.C05560Pe;
import X.C06140Ry;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class WaTextView extends C05560Pe {
    public WaTextView(Context context) {
        super(context, null);
    }

    public WaTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null && !isInEditMode()) {
            AnonymousClass01X A00 = AnonymousClass01X.A00();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A2A);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                setContentDescription(A00.A06(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId2 != 0) {
                setHint(A00.A06(resourceId2));
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(A00.A06(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId4 != 0) {
                setText(A00.A06(resourceId4));
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(C003701u.A00(charSequence), bufferType);
    }

    @Override // X.C05560Pe
    public void setTypeface(Typeface typeface, int i) {
        if (!Build.MANUFACTURER.equalsIgnoreCase("lenovo") || Build.VERSION.SDK_INT != 17) {
            super.setTypeface(typeface, i);
            return;
        }
        if (typeface != null && i > 0) {
            typeface = AnonymousClass0My.A00(getContext(), typeface, i);
            i = 0;
        }
        super.setTypeface(typeface, i);
    }
}
