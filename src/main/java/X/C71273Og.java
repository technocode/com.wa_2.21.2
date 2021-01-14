package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.whatsapp.settings.chat.wallpaper.WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.3Og  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71273Og {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass31h A01;
    public final /* synthetic */ C08390b2 A02;

    public /* synthetic */ C71273Og(C08390b2 r1, AnonymousClass31h r2, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = i;
    }

    public final void A00(C657631l r7) {
        C08390b2 r1 = this.A02;
        AnonymousClass31h r4 = this.A01;
        int i = this.A00;
        Bitmap bitmap = r7.A01;
        if (bitmap != null) {
            r4.setWallpaper(bitmap);
        }
        int i2 = r7.A00;
        if (i2 == 2) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r1.A02.A01;
            downloadableWallpaperPreviewActivity.A07.add(Integer.valueOf(i));
            if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i) {
                ((AnonymousClass1PO) downloadableWallpaperPreviewActivity).A00.setEnabled(true);
            }
            r4.A02.setVisibility(8);
        } else if (i2 == 1) {
            r4.A02.setVisibility(0);
            r4.A03.setVisibility(0);
            r4.A01.setVisibility(8);
        } else {
            C71383Or r12 = r1.A02;
            if (!r12.A00) {
                r12.A00 = true;
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity2 = r12.A01;
                if (downloadableWallpaperPreviewActivity2 != null) {
                    WallpaperDownloadFailedDialogFragment wallpaperDownloadFailedDialogFragment = new WallpaperDownloadFailedDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("ERROR_STATE_KEY", i2);
                    wallpaperDownloadFailedDialogFragment.A0N(bundle);
                    downloadableWallpaperPreviewActivity2.APm(wallpaperDownloadFailedDialogFragment);
                } else {
                    throw null;
                }
            }
            r4.A02.setVisibility(0);
            r4.A03.setVisibility(8);
            r4.A01.setVisibility(0);
        }
    }
}
