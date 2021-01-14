package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;

/* renamed from: X.1ZJ  reason: invalid class name */
public class AnonymousClass1ZJ extends AbstractC12860jC {
    public final ObjectAnimator A00;
    public final boolean A01;

    public AnonymousClass1ZJ(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C12850jB r3 = new C12850jB(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        if (Build.VERSION.SDK_INT >= 18) {
            ofInt.setAutoCancel(true);
        }
        ofInt.setDuration((long) r3.A01);
        ofInt.setInterpolator(r3);
        this.A01 = z2;
        this.A00 = ofInt;
    }
}
