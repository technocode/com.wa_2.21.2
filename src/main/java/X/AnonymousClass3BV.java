package X;

import android.animation.ValueAnimator;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.3BV  reason: invalid class name */
public class AnonymousClass3BV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FormItemEditText A00;

    public AnonymousClass3BV(FormItemEditText formItemEditText) {
        this.A00 = formItemEditText;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0A.setAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
    }
}
