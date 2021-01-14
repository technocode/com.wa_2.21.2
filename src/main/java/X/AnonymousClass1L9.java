package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import com.whatsapp.Conversation;

/* renamed from: X.1L9  reason: invalid class name */
public class AnonymousClass1L9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ Conversation A02;

    public AnonymousClass1L9(Conversation conversation, ImageView imageView, View view) {
        this.A02 = conversation;
        this.A01 = imageView;
        this.A00 = view;
    }

    public void onGlobalLayout() {
        ImageView imageView = this.A01;
        imageView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        int[] iArr = new int[2];
        View view = this.A00;
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        this.A02.A0Y.getLocationOnScreen(iArr2);
        int i = iArr[0] - iArr2[0];
        int i2 = iArr[1] - iArr2[1];
        int width = i - ((intrinsicWidth - view.getWidth()) / 2);
        imageView.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        float f = (float) width;
        float height = (float) (i2 - ((intrinsicHeight - view.getHeight()) / 2));
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f, height, height - (((float) intrinsicHeight) * 2.0f));
        float intrinsicWidth2 = (((float) ((ImageView) view).getDrawable().getIntrinsicWidth()) * 1.0f) / ((float) intrinsicWidth);
        ScaleAnimation scaleAnimation = new ScaleAnimation(intrinsicWidth2, 1.0f, intrinsicWidth2, 1.0f, 1, 0.5f, 1, 0.5f);
        animationSet.addAnimation(new AlphaAnimation(0.5f, 0.0f));
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setDuration(2000);
        animationSet.setInterpolator(new DecelerateInterpolator(2.0f));
        animationSet.setAnimationListener(new C39721rz(this));
        imageView.startAnimation(animationSet);
    }
}
