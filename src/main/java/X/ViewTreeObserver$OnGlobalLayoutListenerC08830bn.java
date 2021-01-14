package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;

/* renamed from: X.0bn  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnGlobalLayoutListenerC08830bn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;

    public ViewTreeObserver$OnGlobalLayoutListenerC08830bn(View view, View view2) {
        this.A01 = view;
        this.A00 = view2;
    }

    public void onGlobalLayout() {
        View view = this.A01;
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200);
        view.startAnimation(translateAnimation);
        this.A00.startAnimation(translateAnimation);
    }
}
