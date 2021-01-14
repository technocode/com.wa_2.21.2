package com.google.android.gms.common.api;

import X.AnonymousClass0LP;
import X.AnonymousClass17J;
import X.C34661ix;
import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                AnonymousClass17J A002 = AnonymousClass17J.A00(this);
                if (i2 == -1) {
                    Handler handler = A002.A05;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    C34661ix r3 = new C34661ix(13, null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!A002.A03(r3, intExtra)) {
                        Handler handler2 = A002.A05;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, r3));
                    }
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Number number = (Number) extras.get("error_code");
            if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.A00 = 1;
                } catch (IntentSender.SendIntentException e) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    finish();
                }
            } else if (number == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else {
                Dialog A03 = AnonymousClass0LP.A00.A03(this, number.intValue(), 2, this);
                if (A03 != null) {
                    AnonymousClass0LP.A02(this, A03, "GooglePlayServicesErrorDialog", this);
                }
                this.A00 = 1;
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }
}
