package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.31Q  reason: invalid class name */
public class AnonymousClass31Q extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass31R A00;

    public AnonymousClass31Q(AnonymousClass31R r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A00.A03.A04;
        solidColorWallpaperPreview.A0B = false;
        solidColorWallpaperPreview.A09.setScrollEnabled(true);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A00.A03.A04;
        solidColorWallpaperPreview.A0B = false;
        solidColorWallpaperPreview.A09.setScrollEnabled(true);
    }
}
