package X;

import android.view.View;

/* renamed from: X.1qY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38851qY implements AbstractC17500re {
    public static final /* synthetic */ C38851qY A00 = new C38851qY();

    @Override // X.AbstractC17500re
    public final void AQi(View view, float f) {
        if (f < 0.0f || f >= 1.0f) {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        view.setTranslationX((-f) * ((float) view.getWidth()));
        view.setAlpha(Math.max(0.0f, 1.0f - f));
        float max = Math.max(0.0f, 1.0f - (f * 0.3f));
        view.setScaleX(max);
        view.setScaleY(max);
    }
}
