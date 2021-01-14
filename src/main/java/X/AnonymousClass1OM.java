package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.whatsapp.ViewProfilePhoto;

/* renamed from: X.1OM  reason: invalid class name */
public class AnonymousClass1OM extends Fade {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ViewProfilePhoto A02;

    public AnonymousClass1OM(ViewProfilePhoto viewProfilePhoto, float f, int i) {
        this.A02 = viewProfilePhoto;
        this.A00 = f;
        this.A01 = i;
    }

    public void captureStartValues(TransitionValues transitionValues) {
        super.captureStartValues(transitionValues);
        float f = this.A00;
        if (f != 0.0f) {
            transitionValues.values.put("android:fade:transitionAlpha", Float.valueOf(f));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        ObjectAnimator objectAnimator = (ObjectAnimator) super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (!(objectAnimator == null || (i = this.A01) == 0)) {
            objectAnimator.addUpdateListener(new AnonymousClass1K3(this, objectAnimator, this.A00, i));
        }
        return objectAnimator;
    }
}
