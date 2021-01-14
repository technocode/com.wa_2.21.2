package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity;

/* renamed from: X.3OW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3OW implements AnonymousClass0SG {
    public final /* synthetic */ WallpaperCategoriesActivity A00;

    public /* synthetic */ AnonymousClass3OW(WallpaperCategoriesActivity wallpaperCategoriesActivity) {
        this.A00 = wallpaperCategoriesActivity;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        WallpaperCategoriesActivity wallpaperCategoriesActivity = this.A00;
        int intValue = ((Number) obj).intValue();
        if (intValue == 1) {
            wallpaperCategoriesActivity.A0G(R.string.wallpaper_reset);
        } else if (intValue != 2) {
            return;
        }
        AnonymousClass02J r1 = wallpaperCategoriesActivity.A0F;
        if (r1 instanceof C02200Ba) {
            ((C02200Ba) r1).A00.A07(0);
        }
        wallpaperCategoriesActivity.setResult(-1);
        wallpaperCategoriesActivity.finish();
    }
}
