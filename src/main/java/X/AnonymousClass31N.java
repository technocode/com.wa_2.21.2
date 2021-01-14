package X;

import android.content.DialogInterface;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;

/* renamed from: X.31N  reason: invalid class name */
public final /* synthetic */ class AnonymousClass31N implements DialogInterface.OnClickListener {
    public final /* synthetic */ WallpaperPicker A00;

    public /* synthetic */ AnonymousClass31N(WallpaperPicker wallpaperPicker) {
        this.A00 = wallpaperPicker;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.finish();
    }
}
