package com.whatsapp.gallerypicker;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass03S;
import X.AnonymousClass0EY;
import X.AnonymousClass1VY;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;

public class GalleryPickerLauncher extends ActivityC004902h {
    public final AnonymousClass0EY A00 = AnonymousClass0EY.A00();
    public final AnonymousClass03S A01 = AnonymousClass03S.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public final void A09() {
        if (this.A01.A06()) {
            Intent intent = getIntent();
            int intExtra = intent.getIntExtra("max_items", 1);
            boolean booleanExtra = intent.getBooleanExtra("is_in_multi_select_mode_only", false);
            Intent intent2 = new Intent(this, GalleryPicker.class);
            intent2.putExtra("include_media", 1);
            intent2.putExtra("max_items", intExtra);
            intent2.putExtra("is_in_multi_select_mode_only", booleanExtra);
            intent2.putExtra("preview", false);
            intent2.putExtra("output", Uri.fromFile(this.A00.A04()));
            startActivityForResult(intent2, 1);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access;
        }
        RequestPermissionActivity.A09(this, R.string.permission_storage_need_write_access_request, i2);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            if (intent != null) {
                intent.putExtra("chat_jid", AnonymousClass1VY.A08(getIntent()));
                intent.putExtra("is_using_global_wallpaper", getIntent().getBooleanExtra("is_using_global_wallpaper", false));
            }
            finish();
        } else if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A09();
        } else {
            finish();
        }
    }

    @Override // X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(this.A02.A06(R.string.gallery_picker_label));
        if (bundle == null) {
            A09();
        }
    }
}
