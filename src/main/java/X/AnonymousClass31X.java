package X;

import android.graphics.drawable.Drawable;
import android.widget.SeekBar;
import com.whatsapp.settings.chat.wallpaper.WallpaperCurrentPreviewActivity;

/* renamed from: X.31X  reason: invalid class name */
public class AnonymousClass31X implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ WallpaperCurrentPreviewActivity A00;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public AnonymousClass31X(WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity) {
        this.A00 = wallpaperCurrentPreviewActivity;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity;
        AnonymousClass31V r0;
        Drawable drawable;
        if (seekBar != null && z && (r0 = (wallpaperCurrentPreviewActivity = this.A00).A08) != null && (drawable = r0.A00) != null) {
            AnonymousClass1VY.A0J(wallpaperCurrentPreviewActivity, drawable, seekBar.getProgress());
            wallpaperCurrentPreviewActivity.A09.setImageDrawable(drawable);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            int progress = seekBar.getProgress();
            WallpaperCurrentPreviewActivity wallpaperCurrentPreviewActivity = this.A00;
            AnonymousClass02N A08 = AnonymousClass1VY.A08(wallpaperCurrentPreviewActivity.getIntent());
            AnonymousClass02J r4 = wallpaperCurrentPreviewActivity.A07;
            if (r4 instanceof C02200Ba) {
                C02200Ba r42 = (C02200Ba) r4;
                Object obj = r42.A0A(A08, wallpaperCurrentPreviewActivity).A00;
                if (obj != null) {
                    AnonymousClass0BH r0 = (AnonymousClass0BH) obj;
                    r42.A0F(A08, new AnonymousClass0BH(r0.A01, r0.A02, Integer.valueOf(progress)), wallpaperCurrentPreviewActivity);
                    return;
                }
                throw null;
            }
        }
    }
}
