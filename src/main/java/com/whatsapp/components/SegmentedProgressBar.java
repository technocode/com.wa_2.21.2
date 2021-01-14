package com.whatsapp.components;

import X.AnonymousClass01X;
import X.C06140Ry;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class SegmentedProgressBar extends View {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnimatorSet A08;
    public Bitmap A09;
    public float[] A0A;
    public int[] A0B;
    public final Paint A0C = new Paint(1);
    public final RectF A0D = new RectF();
    public final AnonymousClass01X A0E = AnonymousClass01X.A00();

    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A1a);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.A07 = dimensionPixelSize;
            if (dimensionPixelSize % 2 == 1) {
                this.A07 = dimensionPixelSize + 1;
            }
            this.A05 = obtainStyledAttributes.getInteger(2, 0);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(0, 0);
            this.A02 = obtainStyledAttributes.getInteger(3, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS;
        this.A00 = 300;
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i = (width - paddingLeft) - paddingRight;
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) >> 1) + getPaddingTop();
        Paint paint = this.A0C;
        paint.setColor(this.A02);
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = this.A0D;
        rectF.set(0.0f, (float) (height - (this.A07 >> 1)), (float) getWidth(), (float) ((this.A07 >> 1) + height));
        canvas.drawRect(rectF, paint);
        if (this.A0A != null && this.A0B != null) {
            int i2 = 0;
            float f = 0.0f;
            while (true) {
                float[] fArr = this.A0A;
                if (i2 >= fArr.length) {
                    break;
                }
                if (fArr[i2] != 0.0f) {
                    paint.setColor(this.A0B[i2]);
                    float f2 = (this.A0A[i2] / 100.0f) * ((float) i);
                    if (isInEditMode() || this.A0E.A0M()) {
                        float f3 = (float) paddingLeft;
                        int i3 = this.A07 >> 1;
                        rectF.set(f3 + f, (float) (height - i3), f3 + f2 + f, (float) (i3 + height));
                        canvas.drawRect(rectF, paint);
                        if (!(i2 == this.A0A.length - 1 && this.A06 == 100)) {
                            paint.setColor(this.A03);
                            float f4 = f2 + f;
                            float f5 = f4 - ((float) this.A04);
                            int i4 = this.A07 >> 1;
                            rectF.set(f5, (float) (height - i4), f4, (float) (i4 + height));
                            canvas.drawRect(rectF, paint);
                        }
                    } else {
                        float f6 = ((float) (width - paddingRight)) - f;
                        float f7 = f6 - f2;
                        int i5 = this.A07 >> 1;
                        rectF.set(f7, (float) (height - i5), f6, (float) (i5 + height));
                        canvas.drawRect(rectF, paint);
                        if (!(i2 == this.A0A.length - 1 && this.A06 == 100)) {
                            paint.setColor(this.A03);
                            int i6 = this.A07 >> 1;
                            rectF.set(f7, (float) (height - i6), ((float) this.A04) + f7, (float) (i6 + height));
                            canvas.drawRect(rectF, paint);
                        }
                    }
                    f += f2;
                }
                i2++;
            }
        }
        paint.setColor(this.A05);
        if (this.A09 == null) {
            int width2 = getWidth();
            int i7 = this.A07;
            float height2 = rectF.height() / 2.0f;
            Bitmap createBitmap = Bitmap.createBitmap(width2, i7, Bitmap.Config.ARGB_8888);
            this.A09 = createBitmap;
            Canvas canvas2 = new Canvas(createBitmap);
            Paint paint2 = new Paint(1);
            paint2.setColor(this.A05);
            paint2.setXfermode(null);
            float f8 = (float) width2;
            float f9 = (float) i7;
            canvas2.drawRect(0.0f, 0.0f, f8, f9, paint2);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawRoundRect(new RectF(0.0f, 0.0f, f8, f9), height2, height2, paint2);
        }
        canvas.drawBitmap(this.A09, 0.0f, 0.0f, paint);
    }

    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingBottom() + getPaddingTop() + this.A07;
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A09 = null;
    }
}
