package X;

import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.2SQ  reason: invalid class name */
public class AnonymousClass2SQ extends TranslateAnimation {
    public final /* synthetic */ AnonymousClass2SS A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2SQ(AnonymousClass2SS r10) {
        super(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        this.A00 = r10;
    }

    public void applyTransformation(float f, Transformation transformation) {
        super.applyTransformation(f, transformation);
        AnonymousClass2SS r2 = this.A00;
        r2.A02.A00((1.0f - f) * ((float) r2.A01.getHeight()));
    }
}
