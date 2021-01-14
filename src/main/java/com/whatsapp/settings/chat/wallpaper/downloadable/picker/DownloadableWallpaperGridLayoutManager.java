package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.C71353Oo;
import X.C71363Op;
import androidx.recyclerview.widget.GridLayoutManager;

public class DownloadableWallpaperGridLayoutManager extends GridLayoutManager {
    public final C71353Oo A00;

    public DownloadableWallpaperGridLayoutManager(C71353Oo r2) {
        super(3);
        this.A00 = r2;
        ((GridLayoutManager) this).A01 = new C71363Op(this);
    }
}
