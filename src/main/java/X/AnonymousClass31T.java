package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.31T  reason: invalid class name */
public class AnonymousClass31T extends AnimatorListenerAdapter {
    public final /* synthetic */ SolidColorWallpaperPreview A00;

    public AnonymousClass31T(SolidColorWallpaperPreview solidColorWallpaperPreview) {
        this.A00 = solidColorWallpaperPreview;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.A00.finish();
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.finish();
    }
}
