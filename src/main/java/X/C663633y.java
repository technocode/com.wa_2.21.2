package X;

import android.animation.ValueAnimator;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.33y  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C663633y implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SizeTickerView A00;

    public /* synthetic */ C663633y(SizeTickerView sizeTickerView) {
        this.A00 = sizeTickerView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SizeTickerView sizeTickerView = this.A00;
        int intValue = ((Number) valueAnimator.getAnimatedValue()).intValue();
        sizeTickerView.A02 = intValue;
        sizeTickerView.setTextColor(intValue);
    }
}
