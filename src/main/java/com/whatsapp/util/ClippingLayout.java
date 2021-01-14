package com.whatsapp.util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ClippingLayout extends FrameLayout {
    public Rect A00;

    public ClippingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Rect rect = this.A00;
        if (rect != null) {
            canvas.clipRect(rect);
        }
        return super.drawChild(canvas, view, j);
    }

    public void setClipBounds(Rect rect) {
        Rect rect2 = this.A00;
        if (rect != rect2) {
            if (rect == null) {
                this.A00 = null;
            } else if (!rect.equals(rect2)) {
                Rect rect3 = this.A00;
                if (rect3 == null) {
                    this.A00 = new Rect(rect);
                } else {
                    rect3.set(rect);
                }
            } else {
                return;
            }
            invalidate();
        }
    }
}
