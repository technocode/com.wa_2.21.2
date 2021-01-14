package X;

import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import com.whatsapp.settings.chat.wallpaper.WallpaperPicker;
import com.whatsapp.util.Log;

/* renamed from: X.31L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass31L implements DialogInterface.OnClickListener {
    public final /* synthetic */ WallpaperPicker A00;

    public /* synthetic */ AnonymousClass31L(WallpaperPicker wallpaperPicker) {
        this.A00 = wallpaperPicker;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        WallpaperPicker wallpaperPicker = this.A00;
        try {
            wallpaperPicker.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp.wallpaper")));
            z = true;
        } catch (ActivityNotFoundException e) {
            Log.e("wallpaperpicker/activity for install uri not found", e);
            z = false;
        }
        if (!z) {
            try {
                ContentResolver A06 = wallpaperPicker.A04.A06();
                if (A06 == null || Settings.Secure.getInt(A06, "install_non_market_apps") != 1) {
                    C002001d.A2N(wallpaperPicker, 1);
                    C002001d.A2O(wallpaperPicker, 2);
                    return;
                }
                try {
                    wallpaperPicker.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.whatsapp.com/android/WhatsAppWallpaper.apk")));
                } catch (ActivityNotFoundException e2) {
                    Log.e("wallpaperpicker/activity for install uri not found", e2);
                }
            } catch (Settings.SettingNotFoundException e3) {
                Log.e("wallpaperpicker/can't find setting", e3);
            }
        }
        C002001d.A2N(wallpaperPicker, 1);
        wallpaperPicker.finish();
    }
}
