package X;

import android.animation.Animator;
import android.view.animation.Animation;

/* renamed from: X.0O3  reason: invalid class name */
public class AnonymousClass0O3 {
    public final Animator A00;
    public final Animation A01;

    public AnonymousClass0O3(Animator animator) {
        this.A01 = null;
        this.A00 = animator;
    }

    public AnonymousClass0O3(Animation animation) {
        this.A01 = animation;
        this.A00 = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }
}
