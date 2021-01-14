package com.whatsapp.payments.ui.widget;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.C61212so;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;

public class DebitCardInputText extends WaEditText {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public Paint A06;
    public Paint A07;
    public boolean A08;
    public float[] A09;
    public float[] A0A;
    public RectF[] A0B;
    public final int A0C;
    public final int A0D;
    public final AnonymousClass01X A0E;

    /* JADX INFO: finally extract failed */
    public DebitCardInputText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0E = AnonymousClass01X.A00();
        this.A01 = 1.0f;
        this.A02 = 2.0f;
        this.A03 = 24.0f;
        this.A04 = 8.0f;
        this.A05 = 4;
        this.A0C = getResources().getColor(R.color.accent_dark);
        this.A0D = getResources().getColor(R.color.payments_light_gray);
        this.A08 = false;
        this.A0A = new float[4];
        this.A01 = (float) A03(1.0f);
        this.A02 = (float) A03(this.A02);
        this.A03 = (float) A03(this.A03);
        this.A04 = (float) A03(this.A04);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C61212so.A0r, 0, 0);
        try {
            this.A01 = obtainStyledAttributes.getDimension(2, this.A01);
            this.A00 = obtainStyledAttributes.getDimension(0, 0.0f);
            this.A03 = obtainStyledAttributes.getDimension(1, this.A03);
            this.A04 = obtainStyledAttributes.getDimension(4, this.A04);
            this.A05 = obtainStyledAttributes.getInteger(3, 4);
            obtainStyledAttributes.recycle();
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.A05)});
            this.A06 = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.A07 = paint;
            paint.setStrokeWidth(this.A01);
            this.A07.setColor(this.A0C);
            setFontSize(this.A00);
            setBackgroundResource(0);
            setFilterTouchesWhenObscured(true);
            setCursorVisible(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int A03(float f) {
        return (int) (f * ((float) (getResources().getDisplayMetrics().densityDpi / 160)));
    }

    public final void A04(Canvas canvas, float f) {
        int i;
        float height = (float) canvas.getHeight();
        float textSize = getTextSize();
        Paint paint = new Paint(getPaint());
        if (this.A08) {
            i = this.A0C;
        } else {
            i = this.A0D;
        }
        paint.setColor(i);
        this.A08 = !this.A08;
        paint.setStrokeWidth(5.0f);
        float f2 = f + 5.0f;
        float f3 = height / 2.0f;
        float f4 = textSize / 2.0f;
        canvas.drawLine(f2, f3 - f4, f2, f3 + f4, paint);
    }

    private CharSequence getFullText() {
        return getText();
    }

    public int getMaxNumberOfChars() {
        return this.A05;
    }

    @Override // com.whatsapp.WaEditText
    public void onDraw(Canvas canvas) {
        int i;
        Editable text = getText();
        int length = text.length();
        float[] fArr = this.A0A;
        int length2 = fArr.length;
        if (length2 < length) {
            float[] fArr2 = new float[(length + 0)];
            System.arraycopy(fArr, 0, fArr2, 0, length2);
            fArr = fArr2;
        }
        this.A0A = fArr;
        getPaint().getTextWidths(text, 0, length, this.A0A);
        int i2 = 0;
        while (true) {
            i = this.A05;
            if (i2 >= i) {
                break;
            }
            float f = (this.A00 / 2.0f) + this.A0B[i2].left;
            if (length > i2) {
                canvas.drawText(text, i2, i2 + 1, f - (this.A0A[i2] / 2.0f), this.A09[i2], this.A06);
            }
            if (length == i2 && hasFocus()) {
                A04(canvas, this.A0B[i2].left);
            }
            RectF rectF = this.A0B[i2];
            canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A07);
            i2++;
        }
        if (length == i && hasFocus()) {
            A04(canvas, this.A0B[i2 - 1].right);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A072;
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        this.A06.setColor(this.A0C);
        int width = (getWidth() - AnonymousClass0Q7.A06(this)) - AnonymousClass0Q7.A07(this);
        float f = this.A03;
        if (f < 0.0f) {
            this.A00 = ((float) width) / ((((float) this.A05) * 2.0f) - 1.0f);
        } else if (this.A00 == 0.0f) {
            float f2 = (float) width;
            float f3 = (float) this.A05;
            this.A00 = (f2 - ((f3 - 1.0f) * f)) / f3;
        }
        int i6 = this.A05;
        this.A0B = new RectF[i6];
        this.A09 = new float[i6];
        int height = getHeight() - getPaddingTop();
        if (this.A0E.A02().A06) {
            i5 = -1;
            A072 = (int) (((float) (getWidth() - AnonymousClass0Q7.A07(this))) - this.A00);
        } else {
            A072 = AnonymousClass0Q7.A07(this);
            i5 = 1;
        }
        for (int i7 = 0; i7 < this.A05; i7++) {
            float f4 = (float) A072;
            float f5 = (float) height;
            this.A0B[i7] = new RectF(f4, f5, this.A00 + f4, f5);
            float f6 = this.A03;
            if (f6 < 0.0f) {
                A072 = (int) ((((float) i5) * this.A00 * 2.0f) + f4);
            } else {
                A072 = (int) (((this.A00 + f6) * ((float) i5)) + f4);
            }
            this.A09[i7] = this.A0B[i7].bottom - this.A04;
        }
    }

    @Override // X.C07670Zb
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    private void setFontSize(float f) {
        this.A06.setTextSize(f);
    }

    public void setSpace(float f) {
        this.A03 = f;
        invalidate();
    }
}
