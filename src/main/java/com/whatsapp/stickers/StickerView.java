package com.whatsapp.stickers;

import X.AbstractC17400rT;
import X.C007603r;
import X.C08490bD;
import X.C71853Qo;
import X.C71913Qu;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class StickerView extends C08490bD {
    public int A00;
    public AbstractC17400rT A01;
    public boolean A02;
    public boolean A03;
    public final AbstractC17400rT A04 = new C71853Qo(this);

    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A00() {
        if (!C007603r.A08()) {
            Drawable drawable = getDrawable();
            if (drawable instanceof C71913Qu) {
                C71913Qu r2 = (C71913Qu) drawable;
                r2.A06 = this.A02;
                int i = this.A00;
                if (!r2.A07) {
                    r2.A01 = i;
                } else if (r2.A01 < i) {
                    r2.A01 = i;
                    r2.A00 = 0;
                }
            }
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        }
    }

    public void A01() {
        Drawable drawable = getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    public AbstractC17400rT getAnimationCallback() {
        return this.A01;
    }

    public boolean getLoopIndefinitely() {
        return this.A02;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A03 && this.A02) {
            A00();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            A01();
        } else if (this.A03 && this.A02) {
            A00();
        }
    }

    public void setAnimationCallback(AbstractC17400rT r1) {
        this.A01 = r1;
    }

    @Override // X.C08490bD
    public void setImageDrawable(Drawable drawable) {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        Drawable drawable2 = getDrawable();
        if (drawable2 != drawable && (drawable2 instanceof C71913Qu)) {
            C71913Qu r2 = (C71913Qu) drawable2;
            r2.A0A.remove(this.A04);
            r2.stop();
        }
        super.setImageDrawable(drawable);
        if (drawable instanceof C71913Qu) {
            ((C71913Qu) drawable).A0A.add(this.A04);
        }
    }

    public void setLoopIndefinitely(boolean z) {
        this.A02 = z;
    }

    public void setMaxLoops(int i) {
        this.A00 = i;
    }

    public void setUserVisibleForIndefiniteLoop(boolean z) {
        this.A03 = z;
    }
}
