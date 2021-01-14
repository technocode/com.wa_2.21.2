package com.whatsapp;

import X.AnonymousClass01X;
import X.C06140Ry;
import X.C29581Zk;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class WaButton extends C29581Zk {
    public WaButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public final void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            AnonymousClass01X A00 = AnonymousClass01X.A00();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A22);
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
}
