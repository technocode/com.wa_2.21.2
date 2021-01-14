package com.whatsapp;

import X.C06140Ry;
import X.ViewTreeObserver$OnGlobalLayoutListenerC27181Om;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;

public class WaRoundCornerImageView extends WaImageView {
    public float A00;
    public Path A01;
    public ViewTreeObserver$OnGlobalLayoutListenerC27181Om A02;

    public WaRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A28);
            try {
                this.A00 = obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics()));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.A02 = new ViewTreeObserver$OnGlobalLayoutListenerC27181Om(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A02);
    }

    public void onDetachedFromWindow() {
        getViewTreeObserver().removeGlobalOnLayoutListener(this.A02);
        super.onDetachedFromWindow();
    }

    @Override // com.whatsapp.WaImageView
    public void onDraw(Canvas canvas) {
        Path path = this.A01;
        if (path != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }
}
