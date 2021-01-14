package X;

import android.util.TypedValue;
import android.view.View;

/* renamed from: X.1pA  reason: invalid class name and case insensitive filesystem */
public class C38011pA implements AbstractC25331Gl {
    public static C38011pA A00 = new C38011pA();

    @Override // X.AbstractC25331Gl
    public void A2E(Object obj, AnonymousClass05q r5, AbstractC009906e r6, AbstractC008905s r7) {
        View view = (View) obj;
        C46432Ab r62 = (C46432Ab) r6;
        view.setAlpha(r62.A00);
        view.setRotation(r62.A01);
        view.setTranslationX(TypedValue.applyDimension(1, r62.A04, view.getContext().getResources().getDisplayMetrics()));
        view.setTranslationY(TypedValue.applyDimension(1, r62.A05, view.getContext().getResources().getDisplayMetrics()));
        view.setScaleX(r62.A02);
        view.setScaleY(r62.A03);
        r62.A06 = view;
    }

    @Override // X.AbstractC25331Gl
    public void AQk(Object obj, AnonymousClass05q r4, AbstractC009906e r5, AbstractC008905s r6) {
        View view = (View) obj;
        view.setAlpha(1.0f);
        view.setRotation(0.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        ((C46432Ab) r5).A06 = null;
    }
}
