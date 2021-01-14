package X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;

/* renamed from: X.1U5  reason: invalid class name */
public abstract class AnonymousClass1U5 extends ActivityC004602e {
    public AnonymousClass02N A00 = null;
    public boolean A01 = false;

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int i;
        View findViewById;
        super.onCreate(bundle);
        if (!(this instanceof DownloadableWallpaperPickerActivity)) {
            AnonymousClass1PO r1 = (AnonymousClass1PO) this;
            if (r1 instanceof GalleryWallpaperPreview) {
                boolean A0D = ((ActivityC004702f) r1).A0G.A0D(AbstractC000400g.A2e);
                i = R.layout.gallery_wallpaper_preview;
                if (A0D) {
                    i = R.layout.gallery_wallpaper_preview_v2;
                }
            } else if (!(r1 instanceof DefaultWallpaperPreview)) {
                boolean A0D2 = ((ActivityC004702f) r1).A0G.A0D(AbstractC000400g.A2e);
                i = R.layout.wallpaper_preview;
                if (A0D2) {
                    i = R.layout.wallpaper_preview_v2;
                }
            } else {
                i = R.layout.wallpaper_preview_default;
            }
        } else {
            i = R.layout.activity_downloadable_wallpaper_picker;
        }
        setContentView(i);
        this.A01 = getIntent().getBooleanExtra("is_using_global_wallpaper", false);
        this.A00 = AnonymousClass1VY.A08(getIntent());
        A0C((Toolbar) AnonymousClass0TX.A0A(this, R.id.toolbar));
        A09().A0A(true);
        if (Build.VERSION.SDK_INT >= 21 && (findViewById = findViewById(R.id.separator)) != null) {
            findViewById.setVisibility(8);
        }
    }
}
