package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.2SR  reason: invalid class name */
public class AnonymousClass2SR extends Animation {
    public final int A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass2SS A02;

    public boolean willChangeBounds() {
        return true;
    }

    public AnonymousClass2SR(AnonymousClass2SS r2, View view, int i) {
        this.A02 = r2;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        AnonymousClass2SS r2 = this.A02;
        View view = r2.A01;
        view.getLayoutParams().height = i2;
        view.requestLayout();
        r2.A02.A00((float) i2);
    }
}
