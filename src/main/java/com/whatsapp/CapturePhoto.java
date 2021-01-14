package com.whatsapp;

import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03S;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class CapturePhoto extends ActivityC004902h {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final AnonymousClass03S A01 = AnonymousClass03S.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    public final void A09() {
        if (RequestPermissionActivity.A0K(this, this.A01, 30)) {
            try {
                startActivityForResult(new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", getIntent().getParcelableExtra("target_file_uri")).setFlags(2), 1);
            } catch (ActivityNotFoundException e) {
                Log.e("capturephoto/start-activity ", e);
                this.A00.A06(R.string.activity_not_found, 0);
            }
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            setResult(i2, intent);
            finish();
        } else if (i != 30) {
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
        setTitle(this.A02.A06(R.string.capture_photo));
        if (getCallingPackage() == null || !getCallingPackage().equals(getPackageName())) {
            finish();
        } else if (bundle == null) {
            A09();
        }
    }
}
