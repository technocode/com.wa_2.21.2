package com.whatsapp.components;

import X.AnonymousClass01X;
import X.AnonymousClass2FY;
import X.C06140Ry;
import X.C46912Fn;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

public class RoundCornerProgressBar extends View {
    public float A00 = 0.0f;
    public int A01 = -920588;
    public int A02 = 0;
    public int A03 = -15561602;
    public int A04 = 10;
    public boolean A05 = true;
    public final Paint A06 = new Paint(1);
    public final RectF A07 = new RectF();
    public final AnonymousClass01X A08;

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnonymousClass01X A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A08 = A002;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A1V);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, 10);
            this.A03 = obtainStyledAttributes.getInteger(1, -15561602);
            this.A01 = obtainStyledAttributes.getInteger(0, -920588);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.A02;
    }

    public void onDraw(Canvas canvas) {
        float f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f2 = (this.A00 / 100.0f) * ((float) ((width - paddingLeft) - paddingRight));
        if (isInEditMode() || this.A08.A0M()) {
            f = ((float) paddingLeft) + f2;
        } else {
            f = (((float) width) - f2) - ((float) paddingRight);
        }
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) >> 1) + getPaddingTop();
        Paint paint = this.A06;
        paint.setColor(this.A01);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.A07;
        rectF.set(0.0f, (float) (height - (this.A04 >> 1)), (float) getWidth(), (float) ((this.A04 >> 1) + height));
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A03);
        if (isInEditMode() || this.A08.A0M()) {
            int i = this.A04 >> 1;
            rectF.set((float) paddingLeft, (float) (height - i), f, (float) (i + height));
        } else {
            int i2 = this.A04 >> 1;
            rectF.set(f, (float) (height - i2), (float) (width - paddingRight), (float) (i2 + height));
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
    }

    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingBottom() + getPaddingTop() + this.A04;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public void setProgress(int i) {
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("Progress must be between 0 and 100 inclusive");
        } else if (i != this.A02) {
            this.A02 = i;
            if (!this.A05) {
                this.A00 = (float) i;
                invalidate();
            } else if (i > 0) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, (float) i);
                ofFloat.setDuration((long) ((int) Math.max(200.0f, (((float) this.A02) / 100.0f) * 650.0f)));
                ofFloat.setInterpolator(new DecelerateInterpolator());
                ofFloat.addUpdateListener(new AnonymousClass2FY(this));
                ofFloat.addListener(new C46912Fn(this));
                ofFloat.setStartDelay(300);
                ofFloat.start();
            } else {
                this.A00 = (float) i;
                this.A05 = false;
                invalidate();
            }
        }
    }
}
