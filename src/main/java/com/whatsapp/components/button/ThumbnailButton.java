package com.whatsapp.components.button;

import X.C06140Ry;
import X.C11740gt;
import X.C46942Fv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.whatsapp.WaImageView;

public class ThumbnailButton extends WaImageView {
    public static int A0A;
    public float A00;
    public float A01;
    public float A02 = 0.0f;
    public int A03;
    public int A04 = A0A;
    public Paint A05;
    public boolean A06;
    public boolean A07;
    public final Rect A08 = new Rect();
    public final RectF A09 = new RectF();

    static {
        int i = Build.VERSION.SDK_INT;
        A0A = (i < 19 || (i < 21 && "samsung".equalsIgnoreCase(Build.MANUFACTURER))) ? 1711315455 : 419430400;
    }

    public ThumbnailButton(Context context) {
        super(context);
        A00(context, null);
    }

    public ThumbnailButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        setBackgroundDrawable(new C11740gt());
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C06140Ry.A1t);
            this.A02 = obtainStyledAttributes.getDimension(4, this.A02);
            this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            this.A04 = obtainStyledAttributes.getInteger(5, this.A04);
            this.A01 = obtainStyledAttributes.getDimension(2, this.A01);
            this.A03 = obtainStyledAttributes.getInteger(1, this.A03);
            this.A06 = obtainStyledAttributes.getBoolean(3, this.A06);
            this.A07 = obtainStyledAttributes.getBoolean(6, this.A07);
            obtainStyledAttributes.recycle();
        }
        Paint paint = new Paint();
        this.A05 = paint;
        paint.setAntiAlias(true);
        this.A05.setDither(true);
        this.A05.setFilterBitmap(true);
        this.A05.setColor(-1);
        if (this.A07 && Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C46942Fv());
        }
    }

    public void A02(Canvas canvas) {
        int i;
        if (this.A01 > 0.0f && (i = this.A03) != 0) {
            this.A05.setColor(i);
            this.A05.setStrokeWidth(this.A01);
            this.A05.setStyle(Paint.Style.STROKE);
            float f = this.A02;
            if (f >= 0.0f) {
                canvas.drawRoundRect(this.A09, f, f, this.A05);
            } else {
                canvas.drawOval(this.A09, this.A05);
            }
        }
    }

    public float getBorderSize() {
        return this.A01;
    }

    public float getRadius() {
        return this.A02;
    }

    @Override // com.whatsapp.WaImageView
    public void onDraw(Canvas canvas) {
        Rect rect;
        int i = (int) ((this.A01 + 2.0f) / 2.0f);
        RectF rectF = this.A09;
        rectF.left = (float) (getPaddingLeft() + i);
        rectF.right = (float) ((getWidth() - getPaddingRight()) - i);
        rectF.top = (float) (getPaddingTop() + i);
        rectF.bottom = (float) ((getHeight() - getPaddingBottom()) - i);
        if (this.A06 || !(getDrawable() instanceof BitmapDrawable) || this.A02 == 0.0f) {
            super.onDraw(canvas);
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) getDrawable();
            if (!(bitmapDrawable == null || bitmapDrawable.getBitmap() == null)) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i2 = 0;
                if (getScaleType() == ImageView.ScaleType.FIT_CENTER) {
                    rect = this.A08;
                    rect.set(0, 0, width, height);
                    float f = (float) width;
                    float f2 = (float) height;
                    if (rectF.height() * f > rectF.width() * f2) {
                        float width2 = (rectF.width() * f2) / f;
                        float f3 = ((rectF.top + rectF.bottom) / 2.0f) - (width2 / 2.0f);
                        rectF.top = f3;
                        rectF.bottom = f3 + width2;
                    } else {
                        float height2 = (rectF.height() * f) / f2;
                        float f4 = ((rectF.left + rectF.right) / 2.0f) - (height2 / 2.0f);
                        rectF.left = f4;
                        rectF.right = f4 + height2;
                    }
                } else if (getScaleType() == ImageView.ScaleType.CENTER) {
                    rect = this.A08;
                    rect.set(0, 0, width, height);
                    float centerX = rectF.centerX() - ((float) (width >> 1));
                    rectF.left = centerX;
                    rectF.right = centerX + ((float) width);
                    float centerY = rectF.centerY() - ((float) (height >> 1));
                    rectF.top = centerY;
                    rectF.bottom = centerY + ((float) height);
                } else {
                    rect = this.A08;
                    rect.set(0, 0, width, height);
                    if (rectF.height() * ((float) width) > rectF.width() * ((float) height)) {
                        float width3 = (rectF.width() * ((float) rect.height())) / rectF.height();
                        int i3 = (int) (((float) ((rect.left + rect.right) >> 1)) - (width3 / 2.0f));
                        rect.left = i3;
                        rect.right = (int) (((float) i3) + width3);
                    } else {
                        float height3 = (rectF.height() * ((float) rect.width())) / rectF.width();
                        int i4 = (int) (((float) ((rect.top + rect.bottom) >> 1)) - (height3 / 2.0f));
                        rect.top = i4;
                        rect.bottom = (int) (((float) i4) + height3);
                    }
                }
                this.A05.setColor(-1);
                this.A05.setStyle(Paint.Style.FILL);
                if (this.A02 != 0.0f) {
                    int saveLayer = canvas.saveLayer(rectF, null, 31);
                    canvas.drawARGB(0, 0, 0, 0);
                    float f5 = this.A02;
                    if (f5 >= 0.0f) {
                        canvas.drawRoundRect(rectF, f5, f5, this.A05);
                    } else {
                        canvas.drawOval(rectF, this.A05);
                    }
                    this.A05.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    i2 = saveLayer;
                }
                canvas.drawBitmap(bitmap, rect, rectF, this.A05);
                if (this.A02 != 0.0f) {
                    this.A05.setXfermode(null);
                    canvas.restoreToCount(i2);
                }
            }
        }
        A02(canvas);
        if (!isEnabled()) {
            return;
        }
        if (isSelected() || isPressed()) {
            this.A05.setStyle(Paint.Style.FILL);
            this.A05.setColor(this.A04);
            float f6 = this.A02;
            if (f6 >= 0.0f) {
                canvas.drawRoundRect(rectF, f6, f6, this.A05);
            } else {
                canvas.drawOval(rectF, this.A05);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.A00 == 1.0f) {
            int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setAspectRatio(float f) {
        this.A00 = f;
    }

    public void setBorderColor(int i) {
        this.A03 = i;
    }

    public void setBorderSize(float f) {
        this.A01 = f;
    }

    public void setForegroundOnly(boolean z) {
        this.A06 = z;
    }

    public void setRadius(float f) {
        this.A02 = f;
    }

    public void setSelectionColor(int i) {
        this.A04 = i;
    }

    public void setShouldShowShadow(boolean z) {
        this.A07 = z;
        if (z && Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C46942Fv());
        }
    }
}
