package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.2ad  reason: invalid class name and case insensitive filesystem */
public class C52132ad implements AbstractC28311Tv {
    public final /* synthetic */ C52142ae A00;
    public final /* synthetic */ WallPaperView A01;
    public final /* synthetic */ Runnable A02;

    public C52132ad(C52142ae r1, Runnable runnable, WallPaperView wallPaperView) {
        this.A00 = r1;
        this.A02 = runnable;
        this.A01 = wallPaperView;
    }

    @Override // X.AbstractC28311Tv
    public void A2k() {
        WallPaperView wallPaperView = this.A01;
        wallPaperView.A02 = false;
        wallPaperView.setImageDrawable(null);
        wallPaperView.invalidate();
    }

    @Override // X.AbstractC28311Tv
    public void APM(Drawable drawable) {
        this.A00.A01(drawable);
    }

    @Override // X.AbstractC28311Tv
    public void ARJ() {
        this.A02.run();
    }
}
