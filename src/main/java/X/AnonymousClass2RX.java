package X;

import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* renamed from: X.2RX  reason: invalid class name */
public class AnonymousClass2RX implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C08840bo A01;

    public AnonymousClass2RX(C08840bo r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public void onGlobalLayout() {
        C08840bo r4 = this.A01;
        r4.A02.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        float height = (float) r4.A02.getHeight();
        float f = this.A00;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f - (f / height), 1, 0.0f);
        translateAnimation.setDuration(300);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        r4.A02.startAnimation(translateAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 0, (height - f) * 1.4f, 0, 0.0f));
        animationSet.setDuration(300);
        r4.A04.startAnimation(animationSet);
        r4.A03.startAnimation(animationSet);
    }
}
