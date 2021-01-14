package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;

/* renamed from: X.1PK  reason: invalid class name */
public class AnonymousClass1PK extends Transition {
    public static final String[] A02 = {"circleTransition:transforms"};
    public final boolean A00;
    public final boolean A01;

    public AnonymousClass1PK(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }

    public void captureEndValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new AnonymousClass1PJ(transitionValues.view));
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            transitionValues.values.put("circleTransition:transforms", new AnonymousClass1PJ(transitionValues.view));
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (!(transitionValues == null || transitionValues2 == null)) {
            AnonymousClass1PJ r14 = (AnonymousClass1PJ) transitionValues.values.get("circleTransition:transforms");
            AnonymousClass1PJ r8 = (AnonymousClass1PJ) transitionValues2.values.get("circleTransition:transforms");
            if (!(r14 == null || r8 == null || r14.equals(r8))) {
                float f = ((float) r14.A05) * r14.A00;
                int i = r8.A05;
                float f2 = (float) i;
                float f3 = r8.A00;
                float f4 = ((f - (f2 * f3)) / 2.0f) + ((float) ((-r8.A06) + r14.A06)) + r14.A02;
                float f5 = (float) ((-r8.A07) + r14.A07);
                float f6 = ((float) r14.A04) * r14.A01;
                int i2 = r8.A04;
                float f7 = (float) i2;
                float f8 = r8.A01;
                float f9 = ((f6 - (f7 * f8)) / 2.0f) + f5 + r14.A03;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(transitionValues2.view, View.TRANSLATION_X, View.TRANSLATION_Y, getPathMotion().getPath(f4, f9, r8.A02, r8.A03));
                transitionValues2.view.setTranslationX(f4);
                transitionValues2.view.setTranslationY(f9);
                float min = Math.min(f / f2, f6 / f7);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(transitionValues2.view, View.SCALE_X, min, f3);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(transitionValues2.view, View.SCALE_Y, min, f8);
                float min2 = (float) (Math.min(i, i2) / 2);
                float sqrt = (float) (Math.sqrt((double) ((i2 * i2) + (i * i))) / 2.0d);
                View view = transitionValues2.view;
                int i3 = i / 2;
                int i4 = i2 / 2;
                float f10 = sqrt;
                if (this.A01) {
                    f10 = min2;
                }
                boolean z = this.A00;
                if (!z) {
                    min2 = sqrt;
                }
                AnonymousClass1PL r3 = new AnonymousClass1PL(ViewAnimationUtils.createCircularReveal(view, i3, i4, f10, min2));
                transitionValues2.view.setAlpha(0.0f);
                r3.addListener(new AnonymousClass1PH(this, transitionValues2));
                if (z) {
                    transitionValues2.view.setOutlineProvider(new AnonymousClass1PI(this, r8));
                    transitionValues2.view.setClipToOutline(true);
                    transitionValues2.view.invalidateOutline();
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, r3, ofFloat2, ofFloat3);
                animatorSet.setInterpolator(getInterpolator());
                return animatorSet;
            }
        }
        return null;
    }

    public String[] getTransitionProperties() {
        return A02;
    }
}
