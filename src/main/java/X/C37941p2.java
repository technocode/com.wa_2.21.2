package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.1p2  reason: invalid class name and case insensitive filesystem */
public class C37941p2 implements AnonymousClass11B {
    public final /* synthetic */ AbstractC008905s A00;

    public C37941p2(AbstractC008905s r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        AbstractC008905s r1 = this.A00;
        view.setScaleX(r1.A00.A02);
        view.setScaleY(r1.A00.A03);
        view.setTranslationX(r1.A00.A04);
        view.setTranslationY(r1.A00.A05);
        view.setRotation(r1.A00.A01);
        view.setAlpha(r1.A00.A00);
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
    }
}
