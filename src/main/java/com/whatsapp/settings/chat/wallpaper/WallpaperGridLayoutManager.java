package com.whatsapp.settings.chat.wallpaper;

import X.AbstractC16300pa;
import X.C71243Od;
import androidx.recyclerview.widget.GridLayoutManager;

public class WallpaperGridLayoutManager extends GridLayoutManager {
    public final AbstractC16300pa A00;

    public WallpaperGridLayoutManager(AbstractC16300pa r2) {
        super(2);
        this.A00 = r2;
        ((GridLayoutManager) this).A01 = new C71243Od(this);
    }
}
