package com.whatsapp;

import X.C004302a;
import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.HashMap;
import java.util.Map;

public class ContactStatusThumbnail extends ThumbnailButton {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final RectF A05 = new RectF();
    public final Map A06 = new HashMap();

    public ContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A0l);
            this.A01 = obtainStyledAttributes.getInteger(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(2, 0);
            obtainStyledAttributes.recycle();
        }
        this.A00 = C004302a.A00(context, R.color.contactStatusThumbnailRingBackground);
    }

    @Override // com.whatsapp.components.button.ThumbnailButton
    public void A02(Canvas canvas) {
        int i;
        if (this.A02 > 0) {
            super.A05.setStrokeWidth(((ThumbnailButton) this).A01);
            super.A05.setStyle(Paint.Style.STROKE);
            super.A05.setStrokeCap(Paint.Cap.ROUND);
            RectF rectF = this.A05;
            float f = 0.0f;
            rectF.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            float f2 = ((ThumbnailButton) this).A01 / 2.0f;
            rectF.inset(f2, f2);
            super.A05.setColor(this.A00);
            canvas.drawOval(rectF, super.A05);
            int i2 = this.A02;
            float f3 = 360.0f / ((float) i2);
            float f4 = -90.0f;
            if (i2 != 1) {
                if (f3 <= 24.0f) {
                    f = f3 / 2.0f;
                } else {
                    f = 12.0f;
                }
            }
            super.A05.setStrokeWidth(((ThumbnailButton) this).A01 - 1.0f);
            int i3 = 0;
            while (i3 < this.A02) {
                Paint paint = super.A05;
                Map map = this.A06;
                if (map.containsKey(Integer.valueOf(i3))) {
                    i = ((Number) map.get(Integer.valueOf(i3))).intValue();
                } else {
                    i = i3 < this.A04 ? this.A03 : this.A01;
                }
                paint.setColor(i);
                canvas.drawArc(rectF, (f / 2.0f) + f4, f3 - f, false, super.A05);
                f4 += f3;
                i3++;
            }
        }
    }
}
