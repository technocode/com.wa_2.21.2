package com.whatsapp.status.playback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

public class AudioVolumeView extends View {
    public float A00;
    public final Paint A01 = new Paint(1);
    public final Path A02 = new Path();
    public final RectF A03 = new RectF();

    public AudioVolumeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01.setStrokeCap(Paint.Cap.ROUND);
        this.A01.setStrokeJoin(Paint.Join.ROUND);
        this.A01.setStyle(Paint.Style.STROKE);
        this.A01.setColor(-1);
        this.A01.setStrokeWidth(context.getResources().getDimension(R.dimen.audio_volume_segment));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = (float) ((getHeight() - getPaddingTop()) - getPaddingBottom());
        float f = 1.5f * height;
        RectF rectF = this.A03;
        rectF.set(0.0f, (height - f) / 2.0f, f, (height + f) / 2.0f);
        canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        Paint paint = this.A01;
        float strokeWidth = paint.getStrokeWidth();
        Path path = this.A02;
        path.reset();
        float f2 = height / 3.0f;
        path.moveTo(strokeWidth, f2);
        path.lineTo(f2, f2);
        float f3 = (height * 2.0f) / 3.0f;
        path.lineTo(f3, strokeWidth + 0.0f);
        path.lineTo(f3, height - strokeWidth);
        path.lineTo(f2, f3);
        path.lineTo(strokeWidth, f3);
        path.lineTo(strokeWidth, f2);
        paint.setColor(-1);
        canvas.drawPath(path, paint);
        canvas.translate(((-height) / 2.0f) + strokeWidth, 0.0f);
        int i = 0;
        do {
            float f4 = this.A00;
            float f5 = (((float) i) * 1.0f) / 8.0f;
            int i2 = 51;
            if (f4 >= f5) {
                i2 = f4 > (((float) (i + 1)) * 1.0f) / 8.0f ? 255 : 51 + ((int) ((f4 - f5) * 8.0f * 204.0f));
            }
            paint.setColor((i2 << 24) | 16777215);
            canvas.drawArc(rectF, -33.0f, 66.0f, false, paint);
            canvas.translate(paint.getStrokeWidth() * 3.0f, 0.0f);
            i++;
        } while (i < 8);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(((int) ((this.A01.getStrokeWidth() * 3.0f * 8.0f) + ((float) ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom())) + ((float) getPaddingLeft()) + ((float) getPaddingRight()))) + 1, getMeasuredHeight());
    }

    public void setVolume(float f) {
        this.A00 = f;
        invalidate();
    }
}
