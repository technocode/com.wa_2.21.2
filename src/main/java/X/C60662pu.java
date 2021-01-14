package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.2pu  reason: invalid class name and case insensitive filesystem */
public class C60662pu extends ThumbnailButton {
    public float A00 = 15.0f;
    public int A01 = -1728053248;
    public int A02 = -1;
    public int A03 = 17;
    public Paint A04;
    public Rect A05;
    public RectF A06;
    public Drawable A07;
    public TextPaint A08;
    public CharSequence A09;

    public C60662pu(Context context) {
        super(context);
    }

    @Override // com.whatsapp.components.button.ThumbnailButton
    public void A02(Canvas canvas) {
        float f;
        super.A02(canvas);
        if (!TextUtils.isEmpty(this.A09)) {
            if (this.A04 == null) {
                Paint paint = new Paint();
                this.A04 = paint;
                paint.setAntiAlias(true);
                this.A04.setStyle(Paint.Style.FILL);
                this.A04.setColor(this.A01);
            }
            if (this.A08 == null) {
                TextPaint textPaint = new TextPaint();
                this.A08 = textPaint;
                textPaint.setAntiAlias(true);
                this.A08.setColor(this.A02);
                this.A08.setTextSize(this.A00);
                this.A08.setTextAlign(Paint.Align.CENTER);
            }
            if (this.A06 == null) {
                this.A06 = new RectF();
            }
            if (this.A05 == null) {
                this.A05 = new Rect();
            }
            float f2 = this.A00;
            float f3 = f2 * 1.25f;
            float f4 = f3 - f2;
            Path path = new Path();
            RectF rectF = super.A09;
            path.moveTo(rectF.left, rectF.bottom - f3);
            path.lineTo(rectF.right, rectF.bottom - f3);
            path.lineTo(rectF.right, rectF.bottom - super.A02);
            RectF rectF2 = this.A06;
            float f5 = rectF.right;
            float f6 = super.A02 * 2.0f;
            float f7 = rectF.bottom;
            rectF2.set(f5 - f6, f7 - f6, f5, f7);
            path.arcTo(this.A06, 0.0f, 90.0f);
            path.lineTo(rectF.left + super.A02, rectF.bottom);
            RectF rectF3 = this.A06;
            float f8 = rectF.left;
            float f9 = rectF.bottom;
            float f10 = super.A02 * 2.0f;
            rectF3.set(f8, f9 - f10, f10 + f8, f9);
            path.arcTo(this.A06, 90.0f, 90.0f);
            path.lineTo(rectF.left, rectF.bottom - f3);
            canvas.drawPath(path, this.A04);
            String charSequence = TextUtils.ellipsize(this.A09, this.A08, rectF.width() - super.A02, TextUtils.TruncateAt.END).toString();
            TextPaint textPaint2 = this.A08;
            int length = charSequence.length();
            textPaint2.getTextBounds(charSequence, 0, length, this.A05);
            int i = this.A03;
            if (i == 3) {
                float f11 = rectF.left;
                Rect rect = this.A05;
                f = f11 + ((float) ((rect.right - rect.left) >> 1)) + f4;
            } else if (i != 5) {
                f = (rectF.right + rectF.left) / 2.0f;
            } else {
                float f12 = rectF.right;
                Rect rect2 = this.A05;
                f = (f12 - ((float) ((rect2.right - rect2.left) >> 1))) - f4;
            }
            canvas.drawText(charSequence, 0, length, f, ((this.A00 / 2.0f) + (rectF.bottom - (f3 / 2.0f))) - (this.A08.descent() / 2.0f), (Paint) this.A08);
            Drawable drawable = this.A07;
            if (drawable != null) {
                float intrinsicWidth = (((float) drawable.getIntrinsicWidth()) * this.A00) / ((float) this.A07.getIntrinsicHeight());
                Drawable drawable2 = this.A07;
                float f13 = rectF.left + f4 + super.A02;
                float f14 = rectF.bottom;
                float f15 = f14 - f3;
                float f16 = (f3 - this.A00) / 2.0f;
                drawable2.setBounds((int) f13, (int) (f16 + f15), (int) (f13 + intrinsicWidth), (int) (f14 - f16));
                this.A07.draw(canvas);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.A07 = drawable;
    }

    public void setText(CharSequence charSequence) {
        this.A09 = charSequence;
    }

    public void setTextBackgroundColor(int i) {
        this.A01 = i;
    }

    public void setTextColor(int i) {
        this.A02 = i;
    }

    public void setTextGravity(int i) {
        this.A03 = i;
    }

    public void setTextSize(float f) {
        this.A00 = f;
    }
}
