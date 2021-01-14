package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.2IN  reason: invalid class name */
public class AnonymousClass2IN extends Animation {
    public final /* synthetic */ AnonymousClass2IO A00;

    public AnonymousClass2IN(AnonymousClass2IO r1) {
        this.A00 = r1;
    }

    public void applyTransformation(float f, Transformation transformation) {
        AnonymousClass2IO r1 = this.A00;
        r1.A00 = 1.0f - f;
        r1.A08.invalidate();
    }
}
