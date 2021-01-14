package X;

import android.animation.ValueAnimator;
import com.whatsapp.doodle.TitleBarComponent;

/* renamed from: X.2M5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2M5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TitleBarComponent A02;

    public /* synthetic */ AnonymousClass2M5(TitleBarComponent titleBarComponent, float f, int i) {
        this.A02 = titleBarComponent;
        this.A00 = f;
        this.A01 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        TitleBarComponent titleBarComponent = this.A02;
        float f = this.A00;
        int i = this.A01;
        AnonymousClass2MU r1 = titleBarComponent.A04;
        float floatValue = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        r1.A02 = f;
        r1.A03 = i;
        r1.A01 = floatValue;
        r1.invalidateSelf();
    }
}
