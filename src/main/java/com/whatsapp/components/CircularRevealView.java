package com.whatsapp.components;

import X.C46852Fg;
import X.C46862Fh;
import X.C46872Fi;
import X.animation.Animation$AnimationListenerC46842Ff;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewAnimationUtils;
import android.view.animation.Animation;
import android.widget.FrameLayout;

public class CircularRevealView extends FrameLayout {
    public float A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public int A04 = 300;
    public Animator.AnimatorListener A05 = new C46852Fg(this);
    public Paint A06 = new Paint(1);
    public Path A07 = new Path();
    public RectF A08 = new RectF();
    public Animation.AnimationListener A09 = new animation.Animation$AnimationListenerC46842Ff(this);
    public C46872Fi A0A;
    public boolean A0B;
    public boolean A0C = true;

    public CircularRevealView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A00() {
        if (this.A0C) {
            super.clearAnimation();
        }
    }

    public void A01(boolean z) {
        if (!z) {
            setVisibility(8);
        } else if (Build.VERSION.SDK_INT < 21) {
            A00();
            C46872Fi r2 = new C46872Fi(this, true);
            this.A0A = r2;
            r2.setDuration((long) this.A04);
            this.A0A.setAnimationListener(this.A09);
            startAnimation(this.A0A);
        } else {
            int max = Math.max(getWidth(), getHeight());
            if (isAttachedToWindow()) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.A01, this.A02, (float) max, 0.0f);
                createCircularReveal.setDuration((long) this.A04);
                createCircularReveal.addListener(new C46862Fh(this));
                createCircularReveal.addListener(this.A05);
                createCircularReveal.start();
                return;
            }
            setVisibility(8);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 21) {
            clearAnimation();
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = Build.VERSION.SDK_INT;
        if (i < 21 && this.A03 != -1) {
            float sqrt = (float) (Math.sqrt((double) ((getHeight() * getHeight()) + (getWidth() * getWidth()))) * ((double) this.A00));
            float f = -sqrt;
            this.A08.set(f, f, sqrt, sqrt);
            this.A08.offset((float) this.A01, (float) this.A02);
            this.A06.setColor(this.A03);
            this.A06.setStyle(Paint.Style.FILL);
            canvas.drawArc(this.A08, 0.0f, 360.0f, true, this.A06);
        } else if (i < 21 && i >= 18) {
            float sqrt2 = (float) (Math.sqrt((double) ((getHeight() * getHeight()) + (getWidth() * getWidth()))) * ((double) this.A00));
            float f2 = -sqrt2;
            this.A08.set(f2, f2, sqrt2, sqrt2);
            this.A08.offset((float) this.A01, (float) this.A02);
            this.A06.setColor(this.A03);
            this.A06.setStyle(Paint.Style.FILL);
            this.A07.reset();
            this.A07.addArc(this.A08, 0.0f, 360.0f);
            canvas.clipPath(this.A07);
        }
    }

    public void setColor(int i) {
        this.A03 = i;
    }

    public void setDuration(int i) {
        this.A04 = i;
    }

    public void setShouldClearOnRestart(boolean z) {
        this.A0C = z;
    }
}
