package X;

import android.animation.ValueAnimator;
import org.npci.commonlibrary.widget.FormItemEditText;

/* renamed from: X.3BU  reason: invalid class name */
public class AnonymousClass3BU implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FormItemEditText A01;

    public AnonymousClass3BU(FormItemEditText formItemEditText, int i) {
        this.A01 = formItemEditText;
        this.A00 = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        FormItemEditText formItemEditText = this.A01;
        formItemEditText.A0N[this.A00] = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        formItemEditText.invalidate();
    }
}
