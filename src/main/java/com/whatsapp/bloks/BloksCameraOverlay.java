package com.whatsapp.bloks;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.search.verification.client.R;

public class BloksCameraOverlay extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Path A08;
    public boolean A09;
    public final Paint A0A = new Paint(1);

    public BloksCameraOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(null);
    }

    public void A00(String str) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        this.A07 = i;
        int i2 = displayMetrics.heightPixels;
        this.A03 = i2;
        this.A01 = 125;
        if (TextUtils.equals(str, "card")) {
            i = (this.A07 * 3) >> 2;
            i2 = this.A03 >> 2;
        } else if (TextUtils.equals(str, "square")) {
            i = (this.A07 * 9) / 10;
            i2 = i;
        } else if (TextUtils.equals(str, "selfie")) {
            i = (this.A07 << 2) / 5;
            i2 = (this.A03 * 3) / 5;
            this.A01 = 255;
            this.A09 = true;
        }
        int i3 = (this.A07 - i) >> 1;
        this.A04 = i3;
        int i4 = (this.A03 - i2) >> 1;
        this.A06 = i4;
        this.A05 = i3 + i;
        this.A02 = i4 + i2;
        this.A00 = getContext().getResources().getDimension(R.dimen.autofocus_stroke_size);
        if (this.A09) {
            int i5 = this.A04;
            int i6 = this.A06;
            int i7 = this.A05;
            int i8 = this.A02;
            float f = (float) i5;
            float f2 = (((float) (i7 - i5)) / 2.0f) + f;
            float f3 = (float) i6;
            float f4 = (float) (i8 - i6);
            float f5 = 0.4f * f4;
            float f6 = f3 + f5;
            float f7 = 0.5f * f4;
            float f8 = (0.8f * f4) + f3;
            float f9 = f4 * 0.25f;
            float f10 = f9 / 10.0f;
            float f11 = f5 / 2.0f;
            float f12 = f7 / 2.0f;
            RectF rectF = new RectF(f2 - f11, f6 - f12, f11 + f2, f6 + f12);
            float f13 = (1.5f * f9) / 2.0f;
            float f14 = f9 / 2.0f;
            RectF rectF2 = new RectF(f2 - f13, f8 - f14, f2 + f13, f8 + f14);
            Path path = new Path();
            this.A08 = path;
            path.setFillType(Path.FillType.EVEN_ODD);
            Path path2 = this.A08;
            Path.Direction direction = Path.Direction.CW;
            path2.addOval(rectF, direction);
            this.A08.addRoundRect(rectF2, f10, f10, direction);
            this.A08.addRect(f, f3, (float) i7, (float) i8, direction);
        }
    }

    public void onDraw(Canvas canvas) {
        Paint paint = this.A0A;
        paint.setARGB(this.A01, 50, 50, 50);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0.0f, 0.0f, (float) this.A07, (float) this.A06, paint);
        canvas.drawRect(0.0f, (float) this.A06, (float) this.A04, (float) this.A02, paint);
        canvas.drawRect((float) this.A05, (float) this.A06, (float) this.A07, (float) this.A02, paint);
        canvas.drawRect(0.0f, (float) this.A02, (float) this.A07, (float) this.A03, paint);
        paint.setStrokeWidth(this.A00);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(872415231);
        canvas.drawRect((float) this.A04, (float) this.A06, (float) this.A05, (float) this.A02, paint);
        if (this.A09) {
            paint.setARGB(180, 50, 50, 50);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.A08, paint);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-2147418368);
        paint.setStrokeWidth(this.A00 * 2.0f);
    }
}
