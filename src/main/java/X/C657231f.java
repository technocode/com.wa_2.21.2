package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;

/* renamed from: X.31f  reason: invalid class name and case insensitive filesystem */
public class C657231f extends AnimatorListenerAdapter {
    public final /* synthetic */ Interpolator A00;
    public final /* synthetic */ WallpaperPreview A01;

    public C657231f(WallpaperPreview wallpaperPreview, Interpolator interpolator) {
        this.A01 = wallpaperPreview;
        this.A00 = interpolator;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        WallpaperPreview wallpaperPreview = this.A01;
        ViewPropertyAnimator alpha = wallpaperPreview.A05.animate().setDuration(250).alpha(0.0f);
        Interpolator interpolator = this.A00;
        alpha.setInterpolator(interpolator);
        wallpaperPreview.A09.animate().setDuration(250).alpha(0.0f).scaleX(wallpaperPreview.A00).scaleY(wallpaperPreview.A01).translationX((float) wallpaperPreview.A02).translationY((float) wallpaperPreview.A03).setInterpolator(interpolator).setListener(new C657131e(this));
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        WallpaperPreview wallpaperPreview = this.A01;
        ViewPropertyAnimator alpha = wallpaperPreview.A05.animate().setDuration(250).alpha(0.0f);
        Interpolator interpolator = this.A00;
        alpha.setInterpolator(interpolator);
        wallpaperPreview.A09.animate().setDuration(250).alpha(0.0f).scaleX(wallpaperPreview.A00).scaleY(wallpaperPreview.A01).translationX((float) wallpaperPreview.A02).translationY((float) wallpaperPreview.A03).setInterpolator(interpolator).setListener(new C657031d(this));
    }
}
