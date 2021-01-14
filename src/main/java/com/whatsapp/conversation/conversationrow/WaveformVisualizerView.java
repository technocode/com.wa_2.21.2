package com.whatsapp.conversation.conversationrow;

import X.C004302a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

public class WaveformVisualizerView extends View {
    public byte[] A00 = null;
    public float[] A01;
    public final Paint A02 = new Paint();
    public final Path A03 = new Path();
    public final Rect A04 = new Rect();

    public WaveformVisualizerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02.setStrokeWidth(2.0f);
        this.A02.setStyle(Paint.Style.STROKE);
        this.A02.setStrokeJoin(Paint.Join.ROUND);
        this.A02.setStrokeCap(Paint.Cap.ROUND);
        this.A02.setAntiAlias(true);
        this.A02.setColor(C004302a.A00(getContext(), R.color.white));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        byte[] bArr = this.A00;
        if (bArr != null) {
            float[] fArr = this.A01;
            if (fArr == null || fArr.length < (bArr.length << 2)) {
                this.A01 = new float[(bArr.length << 2)];
            }
            Rect rect = this.A04;
            rect.set(0, 0, getWidth(), getHeight());
            rect.top = getPaddingTop() + rect.top;
            rect.bottom -= getPaddingBottom();
            rect.left = getPaddingLeft() + rect.left;
            rect.right -= getPaddingRight();
            Path path = this.A03;
            path.reset();
            path.moveTo((float) rect.left, (float) ((((rect.height() >> 1) * ((byte) (this.A00[0] + 128))) >> 7) + (rect.height() >> 1) + rect.top));
            for (int i = 0; i < this.A00.length - 1; i++) {
                path.lineTo((float) (((rect.width() * i) / (this.A00.length - 1)) + rect.left), (float) ((((rect.height() >> 1) * ((byte) (this.A00[i] + 128))) >> 7) + (rect.height() >> 1) + rect.top));
            }
            canvas.drawPath(path, this.A02);
        }
    }

    public void setColor(int i) {
        this.A02.setColor(i);
    }
}
