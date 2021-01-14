package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;

/* renamed from: X.0de  reason: invalid class name and case insensitive filesystem */
public class C09860de extends AnonymousClass0JW {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final Resources A03;
    public final C002701k A04;
    public final WallpaperImagePreview A05;
    public final WallpaperImagePreview A06;

    public C09860de(C002701k r1, Context context, WallpaperImagePreview wallpaperImagePreview, WallpaperImagePreview wallpaperImagePreview2, Resources resources, int i, int i2) {
        this.A04 = r1;
        this.A02 = context;
        this.A06 = wallpaperImagePreview;
        this.A05 = wallpaperImagePreview2;
        this.A03 = resources;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        Resources resources = this.A03;
        if (resources != null) {
            WallpaperImagePreview wallpaperImagePreview = this.A06;
            wallpaperImagePreview.setImageDrawable(resources.getDrawable(this.A00));
            wallpaperImagePreview.setVisibility(0);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!super.A00.isCancelled()) {
            this.A05.setImageBitmap(bitmap);
            this.A06.animate().setDuration(500).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new C657331g(this));
            return;
        }
        bitmap.recycle();
    }
}
