package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2JM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2JM implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;

    public /* synthetic */ AnonymousClass2JM(View view, int i, int i2) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        view.setBackgroundColor(((Number) valueAnimator.getAnimatedValue()).intValue());
        if (i == R.color.primary_surface && ((Number) valueAnimator.getAnimatedValue()).intValue() == i2) {
            view.setBackgroundResource(0);
        }
    }
}
