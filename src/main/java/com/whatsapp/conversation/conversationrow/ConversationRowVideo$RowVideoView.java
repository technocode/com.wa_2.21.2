package com.whatsapp.conversation.conversationrow;

import X.AbstractC59162nB;
import X.C002301g;
import X.C08490bD;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class ConversationRowVideo$RowVideoView extends C08490bD {
    public int A00;
    public int A01;
    public Paint A02 = new Paint(1);
    public RectF A03 = new RectF();
    public Shader A04;
    public Drawable A05;
    public boolean A06;
    public boolean A07;

    public ConversationRowVideo$RowVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A00(int i, int i2, boolean z) {
        if (this.A01 <= 0 || this.A00 <= 0 || z) {
            hashCode();
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int width = getWidth();
            this.A02.setColor(1711276032);
            this.A02.setShader(this.A04);
            this.A02.setStyle(Paint.Style.FILL);
            this.A03.set(0.0f, ((float) getHeight()) - (((C002301g.A0K.A00 * 24.0f) * 4.0f) / 3.0f), (float) width, (float) getHeight());
            canvas.drawRect(this.A03, this.A02);
            Drawable drawable = this.A05;
            if (drawable != null && !this.A06) {
                drawable.setBounds(0, 0, getWidth(), getHeight());
                this.A05.draw(canvas);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int A042;
        int i3;
        if (!isInEditMode()) {
            if (this.A06) {
                A042 = View.MeasureSpec.getSize(i);
            } else {
                A042 = (AbstractC59162nB.A04(getContext()) * 72) / 100;
            }
            if (View.MeasureSpec.getMode(i) != 0) {
                A042 = Math.min(A042, View.MeasureSpec.getSize(i));
            }
            if (this.A07) {
                if (getDrawable() != null && !(getDrawable() instanceof ColorDrawable)) {
                    A00(getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight(), false);
                }
                i3 = (int) ((((float) A042) / ((float) this.A01)) * ((float) this.A00));
            } else {
                i3 = A042;
            }
            if (View.MeasureSpec.getMode(i2) != 0) {
                i3 = Math.min(View.MeasureSpec.getSize(i2), i3);
            }
            hashCode();
            setMeasuredDimension(A042, i3);
        } else if (this.A07) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(600, 600);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!isInEditMode()) {
            float f = (float) i2;
            this.A04 = new LinearGradient(0.0f, f - (((C002301g.A0K.A00 * 24.0f) * 4.0f) / 3.0f), 0.0f, f, 0, -16777216, Shader.TileMode.CLAMP);
        }
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A05 = drawable;
    }

    public void setFullWidth(boolean z) {
        this.A06 = z;
    }

    public void setKeepRatio(boolean z) {
        this.A07 = z;
    }
}
