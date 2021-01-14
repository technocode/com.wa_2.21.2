package X;

import android.view.View;

/* renamed from: X.3Q0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Q0 implements AbstractC17500re {
    public static final /* synthetic */ AnonymousClass3Q0 A00 = new AnonymousClass3Q0();

    @Override // X.AbstractC17500re
    public final void AQi(View view, float f) {
        if (f >= -1.0f && f <= 1.0f) {
            view.setPivotX(((float) view.getWidth()) * 0.5f);
            view.setPivotY((float) view.getHeight());
            view.setRotation(f * 18.75f);
        }
    }
}
