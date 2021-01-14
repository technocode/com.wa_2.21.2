package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.1Mi  reason: invalid class name and case insensitive filesystem */
public class C26761Mi extends Animation {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;

    public boolean willChangeBounds() {
        return true;
    }

    public C26761Mi(View view, int i, int i2) {
        this.A02 = view;
        this.A00 = i;
        this.A01 = i2;
    }

    public void applyTransformation(float f, Transformation transformation) {
        View view;
        if (f == 1.0f) {
            view = this.A02;
            view.getLayoutParams().height = -2;
        } else {
            view = this.A02;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = this.A00;
            layoutParams.height = i + ((int) (((float) (this.A01 - i)) * f));
        }
        view.requestLayout();
    }
}
