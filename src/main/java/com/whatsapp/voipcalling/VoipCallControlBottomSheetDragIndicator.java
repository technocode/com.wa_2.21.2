package com.whatsapp.voipcalling;

import X.AbstractC676339k;
import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape3S0200000_I1_2;

public class VoipCallControlBottomSheetDragIndicator extends View {
    public float A00 = -1.0f;
    public int A01;
    public final Paint A02 = new Paint(1);
    public final Path A03 = new Path();

    /* JADX INFO: finally extract failed */
    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A2a);
            try {
                int color = obtainStyledAttributes.getColor(0, -1);
                obtainStyledAttributes.recycle();
                this.A02.setStyle(Paint.Style.STROKE);
                this.A02.setStrokeCap(Paint.Cap.ROUND);
                this.A02.setStrokeWidth(context.getResources().getDisplayMetrics().density * 4.0f);
                this.A02.setColor(color);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float width = (float) (getWidth() - getPaddingRight());
        float height = (float) (getHeight() - getPaddingBottom());
        Path path = this.A03;
        path.reset();
        float f = (height + paddingTop) / 2.0f;
        path.moveTo(paddingLeft, (this.A00 / 4.0f) + f);
        path.lineTo((paddingLeft + width) / 2.0f, (((height - paddingTop) * this.A00) / 1.75f) + f);
        path.lineTo(width, (this.A00 / 4.0f) + f);
        canvas.drawPath(path, this.A02);
    }

    public void setOnClickListener(AbstractC676339k r3) {
        super.setOnClickListener(new ViewOnClickEBaseShape3S0200000_I1_2(this, r3, 0));
    }

    public void setSlideOffset(float f) {
        float f2 = 1.0f;
        if (f <= 1.0f) {
            f2 = -1.0f;
            if (f > 0.0f) {
                f2 = 2.0f * (f - 0.5f);
            }
        }
        this.A00 = f2;
        invalidate();
    }
}
