package com.whatsapp.preference;

import X.AnonymousClass01X;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.preference.RingtonePreference;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class WaRingtonePreference extends RingtonePreference {
    public String A00;

    public WaRingtonePreference(Context context) {
        super(context);
        AnonymousClass01X.A00();
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass01X.A00();
    }

    public WaRingtonePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass01X.A00();
    }

    public View onCreateView(ViewGroup viewGroup) {
        View onCreateView = super.onCreateView(viewGroup);
        WaPreference.A00(onCreateView);
        return onCreateView;
    }

    public void onPrepareRingtonePickerIntent(Intent intent) {
        Intent intent2 = new Intent("android.intent.action.RINGTONE_PICKER");
        super.onPrepareRingtonePickerIntent(intent2);
        if (!(!getShowDefault() || (getRingtoneType() & 1) == 0 || (getRingtoneType() & 2) == 0)) {
            intent2.putExtra("android.intent.extra.ringtone.DEFAULT_URI", Settings.System.DEFAULT_NOTIFICATION_URI);
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            intent2.putExtra("android.intent.extra.ringtone.TYPE", 2);
        }
        intent.setAction("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INTENT", intent2);
    }

    public Uri onRestoreRingtone() {
        if (TextUtils.isEmpty(this.A00)) {
            return super.onRestoreRingtone();
        }
        return Uri.parse(this.A00);
    }
}
