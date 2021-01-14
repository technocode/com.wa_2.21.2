package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.search.verification.client.R;

/* renamed from: X.24J  reason: invalid class name */
public class AnonymousClass24J extends AbstractC30911cA {
    public static final TimeInterpolator A01 = new AccelerateInterpolator();
    public static final TimeInterpolator A02 = new DecelerateInterpolator();
    public static final AbstractC17220rB A03 = new AnonymousClass24I();
    public static final AbstractC17220rB A04 = new AnonymousClass24H();
    public static final AbstractC17220rB A05 = new AnonymousClass24D();
    public static final AbstractC17220rB A06 = new AnonymousClass24G();
    public static final AbstractC17220rB A07 = new AnonymousClass24E();
    public static final AbstractC17220rB A08 = new AnonymousClass24F();
    public AbstractC17220rB A00 = A03;

    public AnonymousClass24J() {
        A0V(80);
    }

    public static Animator A04(View view, C17280rH r14, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5 = f;
        float f6 = f2;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) r14.A00.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        C17300rJ r7 = new C17300rJ(view, r14.A00, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(r7);
        if (Build.VERSION.SDK_INT >= 19) {
            ofPropertyValuesHolder.addPauseListener(r7);
        }
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }

    public void A0V(int i) {
        if (i == 3) {
            this.A00 = A05;
        } else if (i == 5) {
            this.A00 = A06;
        } else if (i == 48) {
            this.A00 = A08;
        } else if (i == 80) {
            this.A00 = A03;
        } else if (i == 8388611) {
            this.A00 = A07;
        } else if (i == 8388613) {
            this.A00 = A04;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        C30821c0 r0 = new C30821c0();
        r0.A01 = i;
        this.A05 = r0;
    }
}
