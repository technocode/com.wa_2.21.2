package com.whatsapp;

import X.AnonymousClass01X;
import X.C06140Ry;
import X.C08490bD;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;

public class WaImageView extends C08490bD {
    public boolean A00;
    public final AnonymousClass01X A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaImageView(Context context) {
        super(context, null);
        AnonymousClass01X r1 = null;
        this.A01 = !isInEditMode() ? AnonymousClass01X.A00() : r1;
    }

    public WaImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A01 = A002;
        A01(context, attributeSet);
    }

    public WaImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass01X A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A01 = A002;
        A01(context, attributeSet);
    }

    public final void A01(Context context, AttributeSet attributeSet) {
        AnonymousClass01X r3;
        if (attributeSet != null && (r3 = this.A01) != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A26);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                setContentDescription(r3.A06(resourceId));
            }
            this.A00 = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        AnonymousClass01X r0;
        if (!this.A00 || (r0 = this.A01) == null) {
            z = false;
        } else {
            z = r0.A02().A06;
            if (z) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, ((float) super.getWidth()) * 0.5f, ((float) super.getHeight()) * 0.5f);
            }
        }
        super.onDraw(canvas);
        if (this.A00 && z) {
            canvas.restore();
        }
    }
}
