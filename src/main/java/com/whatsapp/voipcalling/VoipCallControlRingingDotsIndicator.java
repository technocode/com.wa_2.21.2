package com.whatsapp.voipcalling;

import X.C004302a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;

public class VoipCallControlRingingDotsIndicator extends View {
    public int A00;
    public int A01;
    public Paint A02 = new Paint(1);
    public float[] A03 = new float[3];

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.call_control_bottom_ringing_dots_radius);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize << 1;
        this.A02.setColor(C004302a.A00(getContext(), 17170443));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        do {
            this.A02.setAlpha((int) (this.A03[i] * 255.0f));
            int i2 = this.A00 << 1;
            int i3 = this.A01;
            float f = (float) ((i2 * i) + i3);
            float f2 = (float) i3;
            canvas.drawCircle(f, f2, f2, this.A02);
            i++;
        } while (i < 3);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A00;
        setMeasuredDimension(i3 * 5, i3);
    }
}
