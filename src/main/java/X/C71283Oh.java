package X;

import android.widget.Button;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;

/* renamed from: X.3Oh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C71283Oh implements AnonymousClass0SG {
    public final /* synthetic */ Button A00;
    public final /* synthetic */ DownloadableWallpaperPickerActivity A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C71283Oh(DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity, boolean z, Button button) {
        this.A01 = downloadableWallpaperPickerActivity;
        this.A02 = z;
        this.A00 = button;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity = this.A01;
        boolean z = this.A02;
        Button button = this.A00;
        C657831n r9 = (C657831n) obj;
        int i = r9.A00;
        int i2 = 1;
        if (i == 2) {
            C657731m r0 = r9.A01;
            if (z) {
                if (r0 != null) {
                    downloadableWallpaperPickerActivity.A06 = r0.A01;
                } else {
                    throw null;
                }
            } else if (r0 != null) {
                downloadableWallpaperPickerActivity.A06 = r0.A00;
            } else {
                throw null;
            }
            downloadableWallpaperPickerActivity.A02.setVisibility(8);
            downloadableWallpaperPickerActivity.A01.setVisibility(8);
            downloadableWallpaperPickerActivity.A04.setVisibility(0);
            button.setEnabled(false);
            AnonymousClass02R r2 = downloadableWallpaperPickerActivity.A03;
            if (r2 == null) {
                i2 = 0;
            }
            downloadableWallpaperPickerActivity.A05.A08(downloadableWallpaperPickerActivity.A06, r2, i2);
        } else if (i == 1) {
            button.setEnabled(false);
            downloadableWallpaperPickerActivity.A02.setVisibility(0);
            downloadableWallpaperPickerActivity.A01.setVisibility(8);
            downloadableWallpaperPickerActivity.A04.setVisibility(8);
        } else {
            downloadableWallpaperPickerActivity.A02.setVisibility(8);
            downloadableWallpaperPickerActivity.A01.setVisibility(0);
            downloadableWallpaperPickerActivity.A04.setVisibility(8);
            button.setEnabled(true);
        }
    }
}
