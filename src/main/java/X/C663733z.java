package X;

import android.animation.ValueAnimator;
import com.whatsapp.storage.SizeTickerView;

/* renamed from: X.33z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C663733z implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ SizeTickerView A02;

    public /* synthetic */ C663733z(SizeTickerView sizeTickerView, long j, long j2) {
        this.A02 = sizeTickerView;
        this.A00 = j;
        this.A01 = j2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        SizeTickerView sizeTickerView = this.A02;
        long j = this.A00;
        sizeTickerView.A05 = (long) ((((float) ((this.A01 - j) * ((long) ((Number) valueAnimator.getAnimatedValue()).intValue()))) / 10.0f) + ((float) j));
        sizeTickerView.A01();
    }
}
