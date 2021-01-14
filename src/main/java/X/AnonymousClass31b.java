package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperPreview;

/* renamed from: X.31b  reason: invalid class name */
public class AnonymousClass31b extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Interpolator A01;
    public final /* synthetic */ AnonymousClass31c A02;

    public AnonymousClass31b(AnonymousClass31c r1, View view, Interpolator interpolator) {
        this.A02 = r1;
        this.A00 = view;
        this.A01 = interpolator;
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        WallpaperPreview wallpaperPreview = this.A02.A04;
        wallpaperPreview.A06.setBackgroundColor(wallpaperPreview.getResources().getColor(R.color.primary_surface));
        wallpaperPreview.A0C = false;
        wallpaperPreview.A09.setScrollEnabled(true);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        WallpaperPreview wallpaperPreview = this.A02.A04;
        wallpaperPreview.A06.setBackgroundColor(wallpaperPreview.getResources().getColor(R.color.primary_surface));
        View view = this.A00;
        if (view != null) {
            view.animate().setDuration(250).alpha(1.0f).translationY(0.0f).setInterpolator(this.A01);
        }
        wallpaperPreview.A07.animate().setDuration(250).alpha(1.0f).setInterpolator(this.A01).setListener(new C656931a(this));
    }
}
