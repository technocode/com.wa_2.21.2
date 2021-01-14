package X;

import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.3Os  reason: invalid class name */
public class AnonymousClass3Os implements AnonymousClass0XW {
    public final /* synthetic */ DownloadableWallpaperPreviewActivity A00;

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
    }

    public AnonymousClass3Os(DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity) {
        this.A00 = downloadableWallpaperPreviewActivity;
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = this.A00;
        ((AnonymousClass1PO) downloadableWallpaperPreviewActivity).A00.setEnabled(downloadableWallpaperPreviewActivity.A07.contains(Integer.valueOf(i)));
    }
}
