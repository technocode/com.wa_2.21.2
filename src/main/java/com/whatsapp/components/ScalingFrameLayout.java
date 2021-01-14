package com.whatsapp.components;

import X.AnonymousClass01X;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScalingFrameLayout extends FrameLayout {
    public float A00 = 1.0f;
    public final AnonymousClass01X A01;

    public ScalingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = isInEditMode() ? null : AnonymousClass01X.A00();
    }

    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        AnonymousClass01X r2 = this.A01;
        if (r2.A02().A06) {
            canvas.translate((float) getWidth(), 0.0f);
        }
        float f = this.A00;
        canvas.scale(f, f);
        if (r2.A02().A06) {
            canvas.translate((float) (-getWidth()), 0.0f);
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i)) / this.A00), mode), View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i2)) / this.A00), mode2));
        setMeasuredDimension((int) (((float) getMeasuredWidth()) * this.A00), (int) (((float) getMeasuredHeight()) * this.A00));
    }

    public void setScale(float f) {
        this.A00 = f;
    }
}
