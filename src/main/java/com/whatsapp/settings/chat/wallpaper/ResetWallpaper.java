package com.whatsapp.settings.chat.wallpaper;

import X.ActivityC004802g;
import X.AnonymousClass01X;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;

public class ResetWallpaper extends ActivityC004802g {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.A00.A06(R.string.no_wallpaper));
        Intent intent = new Intent();
        intent.putExtra("is_reset", true);
        setResult(-1, intent);
        finish();
    }
}
