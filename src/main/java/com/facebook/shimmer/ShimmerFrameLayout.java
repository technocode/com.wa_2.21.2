package com.facebook.shimmer;

import X.AnonymousClass11L;
import X.AnonymousClass11M;
import X.AnonymousClass11N;
import X.AnonymousClass11P;
import X.C33681hB;
import X.C33691hC;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00 = true;
    public final Paint A01 = new Paint();
    public final AnonymousClass11P A02 = new AnonymousClass11P();

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass11M r0;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A01(new C33681hB().A01());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass11L.A00, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) {
                r0 = new C33681hB();
            } else {
                r0 = new C33691hC();
            }
            r0.A00(obtainStyledAttributes);
            A01(r0.A01());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A00() {
        AnonymousClass11P r1 = this.A02;
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            r1.A00.cancel();
        }
    }

    public void A01(AnonymousClass11N r12) {
        PorterDuff.Mode mode;
        boolean z;
        AnonymousClass11P r6 = this.A02;
        r6.A01 = r12;
        Paint paint = r6.A04;
        if (r12.A0F) {
            mode = PorterDuff.Mode.DST_IN;
        } else {
            mode = PorterDuff.Mode.SRC_IN;
        }
        paint.setXfermode(new PorterDuffXfermode(mode));
        r6.A01();
        if (r6.A01 != null) {
            ValueAnimator valueAnimator = r6.A00;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                r6.A00.cancel();
                r6.A00.removeAllUpdateListeners();
            } else {
                z = false;
            }
            AnonymousClass11N r0 = r6.A01;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (r0.A0E / r0.A0D)) + 1.0f);
            r6.A00 = ofFloat;
            ofFloat.setRepeatMode(r6.A01.A0B);
            r6.A00.setRepeatCount(r6.A01.A0A);
            ValueAnimator valueAnimator2 = r6.A00;
            AnonymousClass11N r02 = r6.A01;
            valueAnimator2.setDuration(r02.A0D + r02.A0E);
            r6.A00.addUpdateListener(r6.A02);
            if (z) {
                r6.A00.start();
            }
        }
        r6.invalidateSelf();
        if (r12.A0H) {
            setLayerType(2, this.A01);
        } else {
            setLayerType(0, null);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02.A00();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A00();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A02;
    }
}
