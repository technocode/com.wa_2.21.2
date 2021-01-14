package X;

import android.animation.ValueAnimator;
import com.whatsapp.CodeInputField;

/* renamed from: X.1Hi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25531Hi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CodeInputField A00;

    public /* synthetic */ C25531Hi(CodeInputField codeInputField) {
        this.A00 = codeInputField;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.setX(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
