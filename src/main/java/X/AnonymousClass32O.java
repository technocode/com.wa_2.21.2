package X;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;

/* renamed from: X.32O  reason: invalid class name */
public class AnonymousClass32O extends Scroller {
    public float A00;

    public AnonymousClass32O(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        float f = this.A00;
        if (f != 0.0f) {
            i5 = (int) (f * ((float) i5));
        }
        super.startScroll(i, i2, i3, i4, i5);
    }
}
