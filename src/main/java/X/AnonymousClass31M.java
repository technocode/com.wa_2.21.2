package X;

import android.content.DialogInterface;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;

/* renamed from: X.31M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass31M implements DialogInterface.OnClickListener {
    public final /* synthetic */ WallpaperPicker A00;

    public /* synthetic */ AnonymousClass31M(WallpaperPicker wallpaperPicker) {
        this.A00 = wallpaperPicker;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WallpaperPicker wallpaperPicker = this.A00;
        C002001d.A2N(wallpaperPicker, 1);
        wallpaperPicker.finish();
    }
}
