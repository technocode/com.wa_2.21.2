package com.whatsapp.doodle;

import X.AbstractC000400g;
import X.AnonymousClass01X;
import X.AnonymousClass2MA;
import X.AnonymousClass2MC;
import X.C000300f;
import X.C002701k;
import X.C004302a;
import X.C07990aH;
import X.C60502pa;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;
import java.util.Arrays;

public class ColorPickerView extends View {
    public float A00;
    public int A01 = 1;
    public int A02;
    public int A03 = -13381889;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Bitmap A08;
    public AnonymousClass2MA A09;
    public boolean A0A;
    public int[] A0B;
    public final Paint A0C = new Paint();
    public final Paint A0D = new Paint(1);
    public final C000300f A0E = C000300f.A00();
    public final AnonymousClass01X A0F;
    public final C002701k A0G = C002701k.A00();

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X A002;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A0F = A002;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A0d);
            this.A05 = (int) obtainStyledAttributes.getDimension(2, 1.0f);
            this.A07 = (int) obtainStyledAttributes.getDimension(1, 1.0f);
            this.A06 = (int) obtainStyledAttributes.getDimension(0, 1.0f);
            this.A00 = (float) this.A07;
            obtainStyledAttributes.recycle();
        }
    }

    public final void A00() {
        int i = this.A01;
        if (i == 3) {
            int i2 = (this.A02 / 5) + 1;
            for (int i3 = 0; i3 < this.A02; i3++) {
                int i4 = i3 / i2;
                int i5 = i3 % i2;
                int[] iArr = C60502pa.A08;
                int i6 = iArr[i4];
                int i7 = iArr[i4 + 1];
                float f = (float) (i2 - i5);
                float f2 = (float) i2;
                float f3 = (float) i5;
                this.A0B[i3] = Color.argb(255, (int) ((((((float) Color.red(i7)) * 1.0f) * f3) / f2) + (((((float) Color.red(i6)) * 1.0f) * f) / f2)), (int) ((((((float) Color.green(i7)) * 1.0f) * f3) / f2) + (((((float) Color.green(i6)) * 1.0f) * f) / f2)), (int) ((((((float) Color.blue(i7)) * 1.0f) * f3) / f2) + (((((float) Color.blue(i6)) * 1.0f) * f) / f2)));
            }
        } else {
            int i8 = this.A02;
            int i9 = i8 / 10;
            int i10 = 30;
            if (i == 2) {
                i10 = 50;
            }
            int i11 = i8 / i10;
            int i12 = 0;
            if (i == 2) {
                i12 = i8 >> 2;
            }
            int i13 = (((i8 - i9) - i11) - i9) - i12;
            for (int i14 = 0; i14 < i9; i14++) {
                int i15 = (i14 * 255) / i9;
                if (this.A01 == 2) {
                    int i16 = i9 - i14;
                    this.A0B[i14] = Color.argb(255, ((i16 * 255) / i9) + i15, ((i16 * 204) / i9) + i15, ((i16 * 77) / i9) + i15);
                } else {
                    this.A0B[i14] = i15 | -16777216 | (i15 << 16) | (i15 << 8);
                }
            }
            for (int i17 = 0; i17 < i11; i17++) {
                this.A0B[i9 + i17] = -1;
            }
            float[] fArr = new float[3];
            fArr[0] = 0.0f;
            fArr[2] = 1.0f;
            for (int i18 = 0; i18 < i9; i18++) {
                fArr[1] = ((float) i18) / ((float) i9);
                this.A0B[i9 + i11 + i18] = Color.HSVToColor(fArr);
            }
            fArr[1] = 0.8f;
            fArr[2] = 1.0f;
            for (int i19 = 0; i19 < i13; i19++) {
                fArr[0] = (((float) i19) * 360.0f) / ((float) i13);
                this.A0B[i9 + i11 + i9 + i19] = Color.HSVToColor(fArr);
            }
            for (int i20 = 0; i20 < i12; i20++) {
                this.A0B[i9 + i11 + i9 + i13 + i20] = Color.argb(255, 255, (i20 * 204) / i12, (i20 * 77) / i12);
            }
        }
        Path path = new Path();
        path.setFillType(Path.FillType.WINDING);
        float[] fArr2 = new float[8];
        Arrays.fill(fArr2, ((float) this.A05) / 0.8f);
        path.addRoundRect(new RectF(1.0f, 1.0f, (float) (this.A05 - 1), (float) (this.A02 - 1)), fArr2, Path.Direction.CW);
        Bitmap bitmap = this.A08;
        if (!(bitmap != null && bitmap.getWidth() == this.A05 && this.A08.getHeight() == this.A02)) {
            this.A08 = Bitmap.createBitmap(this.A05, this.A02, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(this.A08);
        Paint paint = this.A0C;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        canvas.save();
        canvas.clipPath(path);
        paint.setStrokeWidth(1.0f);
        for (int i21 = 0; i21 < this.A02; i21++) {
            paint.setColor(this.A0B[i21]);
            float f4 = (float) i21;
            canvas.drawLine(0.0f, f4, (float) this.A05, f4, paint);
        }
        canvas.restore();
        Paint paint2 = this.A0D;
        paint2.setColor(C004302a.A00(getContext(), R.color.color_picker_border_color));
        paint2.setStyle(style);
        paint2.setStrokeWidth((float) getResources().getDimensionPixelSize(R.dimen.status_color_picker_border_width));
        canvas.drawPath(path, paint2);
    }

    public void draw(Canvas canvas) {
        int paddingRight;
        int width;
        int paddingRight2;
        super.draw(canvas);
        if (this.A0E.A0D(AbstractC000400g.A24) || this.A0G.A0E(279)) {
            if (this.A0F.A0M()) {
                width = getWidth();
                paddingRight2 = getPaddingRight();
            } else {
                paddingRight = this.A05 + getPaddingRight();
                canvas.drawBitmap(this.A08, (float) paddingRight, (float) getPaddingTop(), this.A0C);
            }
        } else if (this.A0F.A0M()) {
            width = getWidth() - getPaddingRight();
            paddingRight2 = this.A05;
        } else {
            paddingRight = getPaddingLeft();
            canvas.drawBitmap(this.A08, (float) paddingRight, (float) getPaddingTop(), this.A0C);
        }
        paddingRight = width - paddingRight2;
        canvas.drawBitmap(this.A08, (float) paddingRight, (float) getPaddingTop(), this.A0C);
    }

    public int getColor() {
        return this.A03;
    }

    public float getMinSize() {
        return (float) this.A07;
    }

    public float getSize() {
        return this.A00;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A04 != 0 && getMeasuredHeight() > this.A04) {
            setMeasuredDimension(getMeasuredWidth(), this.A04);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass2MC r2 = (AnonymousClass2MC) parcelable;
        this.A03 = r2.A01;
        this.A00 = r2.A00;
        super.onRestoreInstanceState(r2.getSuperState());
    }

    public Parcelable onSaveInstanceState() {
        return new AnonymousClass2MC(super.onSaveInstanceState(), this.A03, this.A00);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int max = Math.max(1, (i2 - getPaddingTop()) - getPaddingBottom());
        this.A02 = max;
        int[] iArr = this.A0B;
        if (iArr == null || iArr.length < max) {
            this.A0B = new int[max];
        }
        A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r9.A0F.A02().A06 != false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r7 != 6) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.doodle.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void setColor(int i) {
        this.A03 = i;
    }

    public void setColorAndInvalidate(int i) {
        this.A03 = i;
        invalidate();
    }

    public void setColorPaletteAndInvalidate(int i) {
        this.A01 = i;
        A00();
        invalidate();
    }

    public void setListener(AnonymousClass2MA r1) {
        this.A09 = r1;
    }

    public void setMaxHeight(int i) {
        this.A04 = i;
    }

    private void setSize(float f) {
        this.A00 = f;
    }

    public void setSizeAndInvalidate(float f) {
        this.A00 = f;
        invalidate();
    }
}
