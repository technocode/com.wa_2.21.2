package X;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1Ga  reason: invalid class name and case insensitive filesystem */
public class C25231Ga implements ValueAnimator.AnimatorUpdateListener {
    public final RecyclerView A00;
    public final C33641h7 A01;

    public C25231Ga(RecyclerView recyclerView, C33641h7 r2) {
        this.A00 = recyclerView;
        this.A01 = r2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue();
        this.A00.invalidate();
    }
}
