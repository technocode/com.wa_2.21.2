package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import com.whatsapp.ViewProfilePhoto;

/* renamed from: X.1ON  reason: invalid class name */
public class AnonymousClass1ON extends Fade {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewProfilePhoto A01;

    public AnonymousClass1ON(ViewProfilePhoto viewProfilePhoto, int i) {
        this.A01 = viewProfilePhoto;
        this.A00 = i;
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        int i;
        ObjectAnimator objectAnimator = (ObjectAnimator) super.createAnimator(viewGroup, transitionValues, transitionValues2);
        if (!(objectAnimator == null || (i = this.A00) == 0)) {
            objectAnimator.addUpdateListener(new AnonymousClass1K4(this, i, this.A01.getWindow().getStatusBarColor(), objectAnimator));
        }
        return objectAnimator;
    }
}
