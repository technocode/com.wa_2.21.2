package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

/* renamed from: X.2RY  reason: invalid class name */
public class AnonymousClass2RY implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;

    public AnonymousClass2RY(View view) {
        this.A00 = view;
    }

    public void onGlobalLayout() {
        View view = this.A00;
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200);
        view.startAnimation(translateAnimation);
    }
}
