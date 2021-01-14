package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;

/* renamed from: X.31a  reason: invalid class name and case insensitive filesystem */
public class C656931a extends AnimatorListenerAdapter {
    public final /* synthetic */ AnonymousClass31b A00;

    public C656931a(AnonymousClass31b r1) {
        this.A00 = r1;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        WallpaperPreview wallpaperPreview = this.A00.A02.A04;
        wallpaperPreview.A0C = false;
        wallpaperPreview.A09.setScrollEnabled(true);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        WallpaperPreview wallpaperPreview = this.A00.A02.A04;
        wallpaperPreview.A0C = false;
        wallpaperPreview.A09.setScrollEnabled(true);
    }
}
