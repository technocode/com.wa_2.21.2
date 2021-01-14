package com.whatsapp.qrcode;

import X.AnonymousClass01X;
import X.AnonymousClass0V9;
import X.C004302a;
import X.C07990aH;
import X.C64772yk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

public class QrScannerOverlay extends View {
    public float A00;
    public float A01 = 0.0f;
    public int A02;
    public int A03;
    public int A04;
    public Paint A05;
    public Drawable A06;
    public C64772yk A07;
    public String A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Paint A0E = new Paint(1);
    public final Rect A0F = new Rect();
    public final RectF A0G = new RectF();
    public final AnonymousClass01X A0H = AnonymousClass01X.A00();

    public QrScannerOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A1m);
        this.A04 = obtainStyledAttributes.getInt(0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId != 0) {
            this.A08 = this.A0H.A06(resourceId);
            this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        }
        obtainStyledAttributes.recycle();
        this.A0A = getResources().getDimension(R.dimen.autofocus_stroke_size);
        this.A09 = getResources().getDimension(R.dimen.contact_qr_corner_radius);
        this.A0D = C004302a.A00(context, R.color.white_alpha_20);
        this.A0C = C004302a.A00(context, R.color.qr_scanline);
        this.A0B = C004302a.A00(context, R.color.qr_scanner_overlay_gray);
        if (this.A04 == 2) {
            this.A00 = 0.0125f;
            AnonymousClass0V9 A002 = AnonymousClass0V9.A00(getResources(), R.drawable.ic_qr_frame, null);
            if (A002 != null) {
                this.A06 = A002;
                A002.setBounds(0, 0, A002.getIntrinsicWidth(), this.A06.getIntrinsicHeight());
                return;
            }
            throw null;
        }
        this.A00 = 0.01f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C64772yk r2 = new C64772yk(this);
        this.A07 = r2;
        r2.setDuration(2000);
        this.A07.setRepeatCount(-1);
        this.A07.setRepeatMode(2);
        startAnimation(this.A07);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = (Math.min(width, height) * 3) >> 2;
        int paddingLeft = getPaddingLeft() + ((width - min) >> 1);
        int paddingTop = getPaddingTop() + ((height - min) >> 1);
        int i = paddingLeft + min;
        int i2 = paddingTop + min;
        float f = this.A01;
        float f2 = this.A00;
        float f3 = f + f2;
        this.A01 = f3;
        if (f3 > 1.0f || f3 < 0.0f) {
            if (f3 > 1.0f) {
                this.A01 = 1.0f;
            } else {
                this.A01 = 0.0f;
            }
            this.A00 = -f2;
        }
        if (this.A04 == 0) {
            Paint paint = this.A0E;
            paint.setColor(this.A0B);
            paint.setStyle(Paint.Style.FILL);
            float f4 = (float) width;
            float f5 = (float) paddingTop;
            canvas.drawRect(0.0f, 0.0f, f4, f5, paint);
            float f6 = (float) paddingLeft;
            float f7 = (float) i2;
            canvas.drawRect(0.0f, f5, f6, f7, paint);
            float f8 = (float) i;
            canvas.drawRect(f8, f5, f4, f7, paint);
            canvas.drawRect(0.0f, f7, f4, (float) height, paint);
            float f9 = this.A0A;
            paint.setStrokeWidth(f9);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.A0D);
            canvas.drawRect(f6, f5, f8, f7, paint);
            float f10 = (float) ((paddingLeft + i) >> 1);
            int i3 = min / 12;
            canvas.drawLine(f10, (float) (paddingTop - i3), f10, (float) (paddingTop + i3), paint);
            canvas.drawLine(f10, (float) (i2 - i3), f10, (float) (i2 + i3), paint);
            float f11 = (float) ((paddingTop + i2) >> 1);
            canvas.drawLine((float) (paddingLeft - i3), f11, (float) (paddingLeft + i3), f11, paint);
            canvas.drawLine((float) (i - i3), f11, (float) (i + i3), f11, paint);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(this.A0C);
            paint.setAlpha(127);
            float f12 = f9 * 2.0f;
            paint.setStrokeWidth(f12);
            int i4 = (int) (f12 + f5);
            int i5 = (int) (f7 - f12);
            float f13 = (((float) (i5 - i4)) * this.A01) + ((float) i4);
            canvas.drawLine(f6, f13, f8, f13, paint);
            return;
        }
        canvas.drawColor(this.A0B);
        if (this.A05 == null) {
            Paint paint2 = new Paint(1);
            this.A05 = paint2;
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        RectF rectF = this.A0G;
        float f14 = (float) paddingLeft;
        float f15 = (float) paddingTop;
        float f16 = (float) i2;
        rectF.set(f14, f15, (float) i, f16);
        if (this.A04 == 1) {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, this.A05);
            Paint paint3 = this.A0E;
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setColor(this.A0C);
            paint3.setAlpha(127);
            float f17 = this.A0A * 2.0f;
            paint3.setStrokeWidth(f17);
            int i6 = (int) (f17 + f15);
            i2 = (int) (f16 - f17);
            float f18 = this.A01;
            float f19 = (f18 * 2.0f) - 1.0f;
            float f20 = (float) ((paddingLeft + i) >> 1);
            float sqrt = (((float) (i - paddingLeft)) * ((float) Math.sqrt((double) (1.0f - (f19 * f19))))) / 2.0f;
            float f21 = (((float) (i2 - i6)) * f18) + ((float) i6);
            canvas.drawLine(f20 - sqrt, f21, sqrt + f20, f21, paint3);
        } else {
            float f22 = this.A09;
            canvas.drawRoundRect(rectF, f22, f22, this.A05);
            this.A06.setAlpha((int) (this.A01 * 255.0f));
            canvas.save();
            canvas.translate(f14, f15);
            this.A06.draw(canvas);
            canvas.translate((float) (i - paddingLeft), 0.0f);
            canvas.rotate(90.0f);
            this.A06.draw(canvas);
            canvas.rotate(-90.0f);
            canvas.translate(0.0f, (float) (i2 - paddingTop));
            canvas.rotate(180.0f);
            this.A06.draw(canvas);
            canvas.rotate(-180.0f);
            canvas.translate((float) (paddingLeft - i), 0.0f);
            canvas.rotate(270.0f);
            this.A06.draw(canvas);
            canvas.restore();
        }
        if (this.A08 != null) {
            Paint paint4 = this.A0E;
            paint4.setColor(-1);
            paint4.setStyle(Paint.Style.FILL);
            paint4.setTextSize((float) this.A02);
            String str = this.A08;
            int length = str.length();
            Rect rect = this.A0F;
            paint4.getTextBounds(str, 0, length, rect);
            canvas.drawText(this.A08, ((float) (width - rect.width())) / 2.0f, (float) ((rect.height() >> 1) + i2 + this.A03), paint4);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        C64772yk r0;
        if (getVisibility() != 0) {
            clearAnimation();
        } else if (getAnimation() == null && (r0 = this.A07) != null) {
            startAnimation(r0);
        }
    }
}
