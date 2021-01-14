package com.whatsapp.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;

public class DragBottomSheetIndicator extends View {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final Paint A05 = new Paint(1);
    public final Paint A06 = new Paint(1);
    public final Path A07 = new Path();

    public DragBottomSheetIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05.setStyle(Paint.Style.STROKE);
        this.A05.setStrokeCap(Paint.Cap.SQUARE);
        this.A05.setStrokeWidth(context.getResources().getDisplayMetrics().density * 2.0f);
        this.A05.setColor(-1);
        this.A06.setStyle(Paint.Style.STROKE);
        this.A06.setStrokeCap(Paint.Cap.ROUND);
        this.A06.setStrokeJoin(Paint.Join.ROUND);
        this.A06.setStrokeWidth(context.getResources().getDisplayMetrics().density * 4.0f);
        this.A06.setColor(855638016);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float elapsedRealtime = ((this.A00 - this.A01) * 1000.0f) / ((float) (SystemClock.elapsedRealtime() - this.A03));
        if (elapsedRealtime > 1.0f) {
            elapsedRealtime = 1.0f;
        } else if (elapsedRealtime < -1.0f) {
            elapsedRealtime = -1.0f;
        }
        if (elapsedRealtime > 0.0f) {
            elapsedRealtime /= 2.0f;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int height = getHeight() - getPaddingBottom();
        Path path = this.A07;
        path.reset();
        float f = (((float) (height - paddingTop)) * elapsedRealtime) + ((float) ((height + paddingTop) >> 1));
        path.moveTo((float) paddingLeft, f);
        path.lineTo((float) ((paddingLeft + width) >> 1), (float) paddingTop);
        path.lineTo((float) width, f);
        canvas.drawPath(path, this.A06);
        canvas.drawPath(path, this.A05);
        canvas.translate(0.0f, (float) getHeight());
        if (this.A04) {
            invalidate();
        }
    }

    public void setOffset(float f) {
        this.A03 = this.A02;
        this.A01 = this.A00;
        this.A02 = SystemClock.elapsedRealtime();
        this.A00 = f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A04 = z;
        if (z) {
            invalidate();
        }
    }
}
