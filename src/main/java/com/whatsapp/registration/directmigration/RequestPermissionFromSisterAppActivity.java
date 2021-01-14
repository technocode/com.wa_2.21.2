package com.whatsapp.registration.directmigration;

import X.AnonymousClass2C0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;

public class RequestPermissionFromSisterAppActivity extends RequestPermissionActivity {
    public static final String[] A00 = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    public static boolean A00(Context context, String[] strArr) {
        PackageManager packageManager;
        for (String str : strArr) {
            if (Build.VERSION.SDK_INT >= 23 && ((packageManager = context.getPackageManager()) == null || packageManager.checkPermission(str, "com.whatsapp.w4b") != 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.whatsapp.RequestPermissionActivity
    public void A0S(Bundle bundle, String str) {
        super.A0S(bundle, A0Q(bundle, true));
    }

    @Override // com.whatsapp.RequestPermissionActivity
    public void A0U(String[] strArr, boolean z) {
        View findViewById = findViewById(R.id.submit);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            textView.setText(((AnonymousClass2C0) this).A01.A06(R.string.permission_settings_open));
            textView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 45));
            return;
        }
        throw null;
    }
}
