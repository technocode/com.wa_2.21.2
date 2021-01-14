package X;

import android.animation.ValueAnimator;
import com.whatsapp.components.SegmentedProgressBar;

/* renamed from: X.2Fa  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C46822Fa implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;

    public /* synthetic */ C46822Fa(SegmentedProgressBar segmentedProgressBar, int i) {
        this.A01 = segmentedProgressBar;
        this.A00 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SegmentedProgressBar segmentedProgressBar = this.A01;
        segmentedProgressBar.A0A[this.A00] = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        segmentedProgressBar.postInvalidate();
    }
}
