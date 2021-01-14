package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass0TX;
import X.AnonymousClass1PO;
import X.AnonymousClass1VY;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

public class DefaultWallpaperPreview extends AnonymousClass1PO {
    public ImageView A00;
    public WallpaperMockChatView A01;

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass1U5, X.AnonymousClass1PO, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Drawable A02 = AnonymousClass1VY.A02(this, getResources(), this.A0N);
        ImageView imageView = (ImageView) AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_default_view);
        this.A00 = imageView;
        imageView.setImageDrawable(A02);
        WallpaperMockChatView wallpaperMockChatView = (WallpaperMockChatView) AnonymousClass0TX.A0A(this, R.id.wallpaper_preview_default_chat_view);
        this.A01 = wallpaperMockChatView;
        wallpaperMockChatView.setMessages(getString(R.string.wallpaper_bubble_this_is_the_default_whatsapp_wallpaper), A0T());
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        setResult(0);
        finish();
        return true;
    }
}
