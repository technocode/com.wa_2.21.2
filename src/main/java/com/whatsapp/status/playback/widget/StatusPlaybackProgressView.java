package com.whatsapp.status.playback.widget;

import X.AbstractC660332o;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashSet;
import java.util.Set;

public class StatusPlaybackProgressView extends View {
    public float A00;
    public int A01;
    public int A02;
    public AbstractC660332o A03;
    public final Paint A04 = new Paint(1);
    public final RectF A05 = new RectF();
    public final Set A06 = new HashSet();

    public StatusPlaybackProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int A00(int i, boolean z) {
        return this.A06.contains(Integer.valueOf(i)) ? z ? -376511 : 1727676737 : z ? -1 : 1728053247;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A01 != 0) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f = (float) width;
            int i = this.A01;
            float f2 = (float) i;
            float min = Math.min((float) (height << 1), ((f * 1.0f) / f2) / 2.0f);
            float f3 = ((f - (((float) (i - 1)) * min)) * 1.0f) / f2;
            Paint paint = this.A04;
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStyle(Paint.Style.FILL);
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            float f4 = 0.0f;
            for (int i2 = 0; i2 < this.A01; i2++) {
                int i3 = this.A02;
                if (i2 == i3) {
                    AbstractC660332o r0 = this.A03;
                    if (r0 != null) {
                        this.A00 = r0.A8Y();
                    }
                    paint.setColor(A00(i2, false));
                    RectF rectF = this.A05;
                    float f5 = (float) height;
                    rectF.set(f4, 0.0f, f4 + f3, f5);
                    float f6 = f5 / 2.0f;
                    canvas.drawRoundRect(rectF, f6, f6, paint);
                    paint.setColor(A00(i2, true));
                    rectF.set(f4, 0.0f, ((this.A00 * f3) / 100.0f) + f4, f5);
                    canvas.drawRoundRect(rectF, f6, f6, paint);
                } else {
                    if (i2 < i3) {
                        paint.setColor(A00(i2, true));
                    } else {
                        paint.setColor(A00(i2, false));
                    }
                    RectF rectF2 = this.A05;
                    float f7 = (float) height;
                    rectF2.set(f4, 0.0f, f4 + f3, f7);
                    float f8 = f7 / 2.0f;
                    canvas.drawRoundRect(rectF2, f8, f8, paint);
                }
                f4 += f3 + min;
            }
            if (this.A03 != null) {
                invalidate();
            }
        }
    }

    public void setCount(int i) {
        this.A01 = i;
        invalidate();
    }

    public void setPosition(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A00 = 0.0f;
            invalidate();
        }
    }

    public void setProgressProvider(AbstractC660332o r1) {
        this.A03 = r1;
        invalidate();
    }
}
