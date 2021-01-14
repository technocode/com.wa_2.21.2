package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass02J;
import X.C07990aH;
import X.C08490bD;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

public class WallpaperImagePreview extends C08490bD {
    public boolean A00 = false;
    public final Path A01 = new Path();
    public final RectF A02 = new RectF();
    public final float[] A03 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.wallpaper_current_preview_corner_radius);
        float[] fArr = this.A03;
        float f = (float) dimensionPixelSize;
        fArr[4] = f;
        fArr[5] = f;
        fArr[6] = f;
        fArr[7] = f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A2k);
        try {
            this.A00 = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.A00) {
            canvas.clipPath(this.A01);
        }
        super.onDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00) {
            Path path = this.A01;
            path.reset();
            RectF rectF = this.A02;
            rectF.right = (float) getMeasuredWidth();
            rectF.bottom = (float) getMeasuredHeight();
            path.addRoundRect(rectF, this.A03, Path.Direction.CW);
            path.close();
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Point A002 = AnonymousClass02J.A00(getContext());
            float f = (float) A002.x;
            float f2 = (float) A002.y;
            float f3 = ((float) (i3 - i)) / f;
            float max = Math.max(f / intrinsicWidth, f2 / intrinsicHeight) * f3;
            Matrix imageMatrix = getImageMatrix();
            float f4 = 0.0f;
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            float f5 = ((f * f3) - (intrinsicWidth * max)) / 2.0f;
            float f6 = ((f2 * f3) - (intrinsicHeight * max)) / 2.0f;
            if (getResources().getConfiguration().orientation != 2) {
                f4 = f6;
            }
            imageMatrix.postTranslate(f5, f4);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void setRoundBottomCorners(boolean z) {
        this.A00 = z;
        invalidate();
    }
}
