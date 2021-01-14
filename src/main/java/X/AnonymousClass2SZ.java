package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.2SZ  reason: invalid class name */
public class AnonymousClass2SZ extends TranslateAnimation {
    public final /* synthetic */ AbstractC49792Sd A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2SZ(AbstractC49792Sd r10) {
        super(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        this.A00 = r10;
    }

    public void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        AbstractC49792Sd r1 = this.A00;
        r1.A0G((int) (((float) r1.A0J.getHeight()) * f));
    }
}
