package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: X.0o5  reason: invalid class name and case insensitive filesystem */
public class RunnableC15440o5 extends AnimationSet implements Runnable {
    public boolean A00 = true;
    public boolean A01;
    public boolean A02;
    public final View A03;
    public final ViewGroup A04;

    public RunnableC15440o5(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.A04 = viewGroup;
        this.A03 = view;
        addAnimation(animation);
        this.A04.post(this);
    }

    public boolean getTransformation(long j, Transformation transformation) {
        this.A00 = true;
        if (this.A01) {
            return !this.A02;
        }
        if (!super.getTransformation(j, transformation)) {
            this.A01 = true;
            View$OnAttachStateChangeListenerC14930n7.A00(this.A04, this);
        }
        return true;
    }

    public boolean getTransformation(long j, Transformation transformation, float f) {
        this.A00 = true;
        if (this.A01) {
            return !this.A02;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.A01 = true;
            View$OnAttachStateChangeListenerC14930n7.A00(this.A04, this);
        }
        return true;
    }

    public void run() {
        if (this.A01 || !this.A00) {
            this.A04.endViewTransition(this.A03);
            this.A02 = true;
            return;
        }
        this.A00 = false;
        this.A04.post(this);
    }
}
