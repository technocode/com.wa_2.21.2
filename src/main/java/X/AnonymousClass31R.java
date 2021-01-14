package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;

/* renamed from: X.31R  reason: invalid class name */
public class AnonymousClass31R extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ Interpolator A02;
    public final /* synthetic */ AnonymousClass31S A03;

    public AnonymousClass31R(AnonymousClass31S r1, Interpolator interpolator, View view, View view2) {
        this.A03 = r1;
        this.A02 = interpolator;
        this.A00 = view;
        this.A01 = view2;
    }

    public final void A00(View view) {
        if (view != null) {
            view.animate().setDuration(250).alpha(1.0f).translationY(0.0f).setInterpolator(this.A02).setListener(new AnonymousClass31Q(this));
        }
    }

    public void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A03.A04;
        solidColorWallpaperPreview.A05.setBackgroundColor(solidColorWallpaperPreview.getResources().getColor(R.color.white));
        solidColorWallpaperPreview.A0B = false;
        solidColorWallpaperPreview.A09.setScrollEnabled(true);
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A03.A04;
        solidColorWallpaperPreview.A05.setBackgroundColor(solidColorWallpaperPreview.getResources().getColor(R.color.white));
        solidColorWallpaperPreview.A06.animate().setDuration(250).alpha(1.0f).setInterpolator(this.A02);
        A00(this.A00);
        A00(this.A01);
    }
}
