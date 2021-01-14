package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: X.155  reason: invalid class name */
public final class AnonymousClass155 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public Bitmap A0M;
    public Rect A0N;
    public Layout.Alignment A0O;
    public StaticLayout A0P;
    public CharSequence A0Q;
    public boolean A0R;
    public boolean A0S;
    public final float A0T;
    public final float A0U;
    public final float A0V;
    public final float A0W;
    public final float A0X;
    public final Paint A0Y;
    public final TextPaint A0Z;

    public AnonymousClass155(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.A0W = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A0X = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = (float) Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) * 2.0f) / 160.0f);
        this.A0T = round;
        this.A0V = round;
        this.A0U = round;
        TextPaint textPaint = new TextPaint();
        this.A0Z = textPaint;
        textPaint.setAntiAlias(true);
        this.A0Z.setSubpixelText(true);
        Paint paint = new Paint();
        this.A0Y = paint;
        paint.setAntiAlias(true);
        this.A0Y.setStyle(Paint.Style.FILL);
    }

    public final void A00(Canvas canvas, boolean z) {
        int i;
        int i2;
        if (z) {
            StaticLayout staticLayout = this.A0P;
            if (staticLayout != null) {
                int save = canvas.save();
                canvas.translate((float) this.A0I, (float) this.A0K);
                if (Color.alpha(this.A0L) > 0) {
                    Paint paint = this.A0Y;
                    paint.setColor(this.A0L);
                    canvas.drawRect((float) (-this.A0J), 0.0f, (float) (staticLayout.getWidth() + this.A0J), (float) staticLayout.getHeight(), paint);
                }
                int i3 = this.A0C;
                if (i3 == 1) {
                    TextPaint textPaint = this.A0Z;
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.A0T);
                    textPaint.setColor(this.A0B);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout.draw(canvas);
                } else if (i3 == 2) {
                    TextPaint textPaint2 = this.A0Z;
                    float f = this.A0V;
                    float f2 = this.A0U;
                    textPaint2.setShadowLayer(f, f2, f2, this.A0B);
                } else if (i3 == 3 || i3 == 4) {
                    if (i3 == 3) {
                        i2 = -1;
                        i = this.A0B;
                    } else {
                        i = -1;
                        i2 = this.A0B;
                    }
                    float f3 = this.A0V;
                    float f4 = f3 / 2.0f;
                    TextPaint textPaint3 = this.A0Z;
                    textPaint3.setColor(this.A0D);
                    textPaint3.setStyle(Paint.Style.FILL);
                    float f5 = -f4;
                    textPaint3.setShadowLayer(f3, f5, f5, i2);
                    staticLayout.draw(canvas);
                    textPaint3.setShadowLayer(f3, f4, f4, i);
                }
                TextPaint textPaint4 = this.A0Z;
                textPaint4.setColor(this.A0D);
                textPaint4.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint4.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        canvas.drawBitmap(this.A0M, (Rect) null, this.A0N, (Paint) null);
    }
}
