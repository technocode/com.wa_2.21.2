package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass008;
import X.AnonymousClass31U;
import X.C08490bD;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class WallPaperView extends C08490bD {
    public Rect A00;
    public AnonymousClass31U A01;
    public boolean A02;

    public WallPaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass31U r0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.A00;
        boolean z = true;
        if (rect == null) {
            if (!isInEditMode()) {
                AnonymousClass008.A0y("redraw:", measuredWidth, " | ", measuredHeight);
            }
            this.A00 = new Rect(0, 0, measuredWidth, measuredHeight);
        } else if (rect.width() == measuredWidth && this.A00.height() == measuredHeight) {
            z = false;
        } else {
            this.A00.set(0, 0, measuredWidth, measuredHeight);
            if (!isInEditMode()) {
                AnonymousClass008.A0y("redraw changed:", measuredWidth, " | ", measuredHeight);
            }
        }
        super.onDraw(canvas);
        if ((z || this.A02) && measuredHeight > 0 && measuredWidth > 0 && (r0 = this.A01) != null) {
            r0.AKC(measuredWidth, measuredHeight);
        }
    }

    public void setDrawable(Drawable drawable) {
        this.A02 = true;
        setImageDrawable(drawable);
        invalidate();
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float max = Math.max(((float) (i3 - i)) / ((float) drawable.getIntrinsicWidth()), ((float) (i4 - i2)) / ((float) drawable.getIntrinsicHeight()));
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public void setOnSizeChangedListener(AnonymousClass31U r1) {
        this.A01 = r1;
    }
}
