package X;

import android.content.DialogInterface;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;

/* renamed from: X.31K  reason: invalid class name */
public final /* synthetic */ class AnonymousClass31K implements DialogInterface.OnCancelListener {
    public final /* synthetic */ WallpaperPicker A00;

    public /* synthetic */ AnonymousClass31K(WallpaperPicker wallpaperPicker) {
        this.A00 = wallpaperPicker;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        WallpaperPicker wallpaperPicker = this.A00;
        C002001d.A2N(wallpaperPicker, 1);
        wallpaperPicker.finish();
    }
}
