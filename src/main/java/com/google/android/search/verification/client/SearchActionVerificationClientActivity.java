package com.google.android.search.verification.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public abstract class SearchActionVerificationClientActivity extends Activity {
    public abstract Class getServiceClass();

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, getServiceClass());
        intent.putExtra(SearchActionVerificationClientService.EXTRA_INTENT, getIntent());
        if (Build.VERSION.SDK_INT >= 26) {
            startForegroundService(intent);
        } else {
            startService(intent);
        }
        finish();
    }
}
