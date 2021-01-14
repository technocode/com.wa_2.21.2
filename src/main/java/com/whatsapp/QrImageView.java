package com.whatsapp;

import X.AnonymousClass05j;
import X.AnonymousClass0Q7;
import X.AnonymousClass1G3;
import X.AnonymousClass1GH;
import X.AnonymousClass1GJ;
import X.AnonymousClass1NE;
import X.AnonymousClass1NF;
import X.AnonymousClass1NG;
import X.C06140Ry;
import X.C25191Fl;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class QrImageView extends View {
    public static final Random A07 = new Random();
    public int A00;
    public Paint A01 = new Paint();
    public RectF A02 = new RectF();
    public Drawable A03;
    public AnonymousClass1GJ A04;
    public ArrayList A05;
    public boolean A06;

    public QrImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A1R);
            this.A06 = obtainStyledAttributes.getBoolean(1, true);
            this.A00 = obtainStyledAttributes.getInt(0, -16777216);
            this.A03 = obtainStyledAttributes.getDrawable(2);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            try {
                this.A04 = AnonymousClass1GH.A01("This is a sample QR Code", AnonymousClass1G3.M, null);
            } catch (C25191Fl e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void A00(AnonymousClass1NF r5) {
        ArrayList arrayList = this.A05;
        if (arrayList == null || arrayList.isEmpty()) {
            AnonymousClass05j r0 = this.A04.A04;
            int i = r0.A01 * r0.A00;
            ArrayList arrayList2 = new ArrayList(i);
            this.A05 = arrayList2;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(Integer.valueOf(i2));
            }
        }
        AnonymousClass1NG r2 = new AnonymousClass1NG(this);
        r2.setDuration(1200);
        r2.setInterpolator(new LinearInterpolator());
        if (r5 != null) {
            r2.setAnimationListener(new AnonymousClass1NE(this, r5));
        }
        startAnimation(r2);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A06 && this.A04 != null) {
            A00(null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A05 = null;
        clearAnimation();
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass1GJ r0 = this.A04;
        if (r0 != null) {
            AnonymousClass05j r13 = r0.A04;
            int i = r13.A01;
            int i2 = r13.A00;
            float width = this.A02.width();
            float f = width / ((float) i);
            float height = this.A02.height() / ((float) i2);
            this.A01.setColor(-1);
            canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.A01);
            this.A01.setColor(this.A00);
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    if (r13.A02[i4][i3] == 1) {
                        RectF rectF = this.A02;
                        float f2 = rectF.left;
                        float f3 = rectF.top;
                        canvas.drawRect((float) ((int) ((((float) i3) * f) + f2)), (float) ((int) ((((float) i4) * height) + f3)), (((float) (i3 + 1)) * f) + f2, (((float) (i4 + 1)) * height) + f3, this.A01);
                    }
                }
            }
            this.A01.setColor(-1);
            if (this.A05 != null && !isInEditMode()) {
                Iterator it = this.A05.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    int i5 = intValue % i;
                    int i6 = intValue / i;
                    RectF rectF2 = this.A02;
                    float f4 = rectF2.left;
                    float f5 = rectF2.top;
                    canvas.drawRect((float) ((int) ((((float) i5) * f) + f4)), (float) ((int) ((((float) i6) * height) + f5)), (((float) (i5 + 1)) * f) + f4, (((float) (i6 + 1)) * height) + f5, this.A01);
                }
            }
            if (this.A03 != null) {
                ArrayList arrayList = this.A05;
                if (arrayList == null || arrayList.isEmpty() || isInEditMode()) {
                    this.A03.draw(canvas);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.QrImageView.onMeasure(int, int):void");
    }

    public void setQrCode(AnonymousClass1GJ r2) {
        setQrCode(r2, null);
    }

    public void setQrCode(AnonymousClass1GJ r2, AnonymousClass1NF r3) {
        this.A04 = r2;
        if (this.A06 && AnonymousClass0Q7.A0i(this) && r2 != null) {
            A00(r3);
        } else if (r3 != null) {
            r3.AET(this);
        }
    }
}
