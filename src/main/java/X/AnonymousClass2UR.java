package X;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;

/* renamed from: X.2UR  reason: invalid class name */
public class AnonymousClass2UR extends Transition {
    public int A00;
    public int A01;
    public final Rect A02 = new Rect();
    public final AnonymousClass1PN A03;
    public final boolean A04;
    public final int[] A05 = new int[2];

    public AnonymousClass2UR(AnonymousClass1PN r2, boolean z) {
        this.A03 = r2;
        this.A04 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r0 == 0) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A00(android.transition.TransitionValues r10, android.animation.ValueAnimator r11) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UR.A00(android.transition.TransitionValues, android.animation.ValueAnimator):void");
    }

    public void captureEndValues(TransitionValues transitionValues) {
        if (!this.A04) {
            AnonymousClass1PN r3 = this.A03;
            if (r3.A01(R.string.transition_clipper_top).equals(AnonymousClass0Q7.A0G(transitionValues.view))) {
                View view = transitionValues.view;
                int[] iArr = this.A05;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3.A01(R.string.transition_clipper_bottom).equals(AnonymousClass0Q7.A0G(transitionValues.view))) {
                View view2 = transitionValues.view;
                int[] iArr2 = this.A05;
                view2.getLocationOnScreen(iArr2);
                this.A00 = transitionValues.view.getHeight() + iArr2[1];
            }
        }
    }

    public void captureStartValues(TransitionValues transitionValues) {
        if (this.A04) {
            AnonymousClass1PN r3 = this.A03;
            if (r3.A01(R.string.transition_clipper_top).equals(AnonymousClass0Q7.A0G(transitionValues.view))) {
                View view = transitionValues.view;
                int[] iArr = this.A05;
                view.getLocationOnScreen(iArr);
                this.A01 = iArr[1];
            }
            if (r3.A01(R.string.transition_clipper_bottom).equals(AnonymousClass0Q7.A0G(transitionValues.view))) {
                View view2 = transitionValues.view;
                int[] iArr2 = this.A05;
                view2.getLocationOnScreen(iArr2);
                this.A00 = transitionValues.view.getHeight() + iArr2[1];
            }
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatEvaluator(), 0, 1);
        ofObject.addUpdateListener(new AnonymousClass2UH(this, transitionValues2));
        return ofObject;
    }
}
