package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;

/* renamed from: X.31O  reason: invalid class name */
public final /* synthetic */ class AnonymousClass31O implements DialogInterface.OnClickListener {
    public final /* synthetic */ WallpaperPicker A00;

    public /* synthetic */ AnonymousClass31O(WallpaperPicker wallpaperPicker) {
        this.A00 = wallpaperPicker;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
    }
}
