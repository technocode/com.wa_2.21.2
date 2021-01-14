package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.2Fi  reason: invalid class name and case insensitive filesystem */
public class C46872Fi extends Animation {
    public boolean A00;
    public final /* synthetic */ CircularRevealView A01;

    public C46872Fi(CircularRevealView circularRevealView, boolean z) {
        this.A01 = circularRevealView;
        this.A00 = z;
    }

    public void applyTransformation(float f, Transformation transformation) {
        CircularRevealView circularRevealView = this.A01;
        if (this.A00) {
            f = 1.0f - f;
        }
        circularRevealView.A00 = f;
        circularRevealView.invalidate();
    }
}
