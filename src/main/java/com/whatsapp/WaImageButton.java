package com.whatsapp;

import X.AnonymousClass01X;
import X.C06140Ry;
import X.C07880a2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageButton extends C07880a2 {
    public boolean A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    public WaImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            AnonymousClass01X A002 = AnonymousClass01X.A00();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A25);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(A002.A06(resourceId));
            }
            this.A00 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        if (this.A00) {
            z = this.A01.A02().A06;
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        } else {
            z = false;
        }
        super.onDraw(canvas);
        if (this.A00 && z) {
            canvas.restore();
        }
    }
}
