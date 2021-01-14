package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.2SM  reason: invalid class name */
public class AnonymousClass2SM extends Animation {
    public final int A00;
    public final int A01;
    public final View A02;
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A03;

    public boolean willChangeBounds() {
        return true;
    }

    public AnonymousClass2SM(AbstractView$OnCreateContextMenuListenerC56112i5 r2, View view, int i) {
        this.A03 = r2;
        this.A02 = view;
        this.A01 = i;
        this.A00 = view.getHeight();
    }

    public void applyTransformation(float f, Transformation transformation) {
        int i = this.A00;
        int i2 = i + ((int) (((float) (this.A01 - i)) * f));
        View view = this.A02;
        view.getLayoutParams().height = i2;
        view.requestLayout();
        AbstractView$OnCreateContextMenuListenerC56112i5 r3 = this.A03;
        float height = (float) (r3.A0S.getHeight() + i2);
        r3.A06 = height;
        r3.A0K(Math.max(r3.A04, height), false);
    }
}
