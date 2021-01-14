package X;

import android.animation.ValueAnimator;
import com.whatsapp.components.SegmentedProgressBar;

/* renamed from: X.2FZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2FZ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SegmentedProgressBar A00;

    public /* synthetic */ AnonymousClass2FZ(SegmentedProgressBar segmentedProgressBar) {
        this.A00 = segmentedProgressBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SegmentedProgressBar segmentedProgressBar = this.A00;
        segmentedProgressBar.A02 = ((Number) valueAnimator.getAnimatedValue()).intValue();
        segmentedProgressBar.postInvalidate();
    }
}
