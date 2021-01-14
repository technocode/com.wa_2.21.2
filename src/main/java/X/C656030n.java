package X;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import com.google.android.material.chip.Chip;

/* renamed from: X.30n  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C656030n implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ Chip A00;

    public /* synthetic */ C656030n(Chip chip) {
        this.A00 = chip;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setChipBackgroundColor(ColorStateList.valueOf(((Number) valueAnimator.getAnimatedValue()).intValue()));
    }
}
