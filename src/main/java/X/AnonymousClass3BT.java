package X;

import android.animation.ValueAnimator;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.3BT  reason: invalid class name */
public class AnonymousClass3BT implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FormItemEditText A00;

    public AnonymousClass3BT(FormItemEditText formItemEditText) {
        this.A00 = formItemEditText;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        FormItemEditText formItemEditText = this.A00;
        formItemEditText.A0A.setAlpha(((Number) valueAnimator.getAnimatedValue()).intValue());
        formItemEditText.invalidate();
    }
}
