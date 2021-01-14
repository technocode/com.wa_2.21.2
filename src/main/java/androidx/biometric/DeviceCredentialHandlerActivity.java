package androidx.biometric;

import X.AbstractC13660kc;
import X.ActivityC004802g;
import X.AnonymousClass0WP;
import X.C13700kg;
import X.C13710kh;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.search.verification.client.R;
import java.util.concurrent.Executor;

public class DeviceCredentialHandlerActivity extends ActivityC004802g {
    public boolean A00;

    public void A0D(int i) {
        AnonymousClass0WP r3 = AnonymousClass0WP.A09;
        if (r3 == null) {
            Log.e("DeviceCredentialHandler", "onActivityResult: Bridge or callback was null!");
        } else if (i == -1) {
            r3.A01 = 1;
            r3.A08 = false;
            r3.A02 = 2;
        } else {
            r3.A01 = 2;
            r3.A08 = false;
            r3.A02 = 2;
        }
        finish();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        A0D(i2);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AbstractC13660kc r0;
        AnonymousClass0WP r3 = AnonymousClass0WP.A09;
        if (r3 == null) {
            r3 = new AnonymousClass0WP();
            AnonymousClass0WP.A09 = r3;
        }
        int i = r3.A00;
        boolean z = true;
        if (i != 0) {
            setTheme(i);
            getTheme().applyStyle(R.style.TransparentStyle, true);
        }
        super.onCreate(bundle);
        if (bundle == null || !bundle.getBoolean("did_change_configuration", false)) {
            z = false;
        }
        this.A00 = z;
        if (!z) {
            r3.A02 = 0;
        } else {
            this.A00 = false;
        }
        setTitle((CharSequence) null);
        setContentView(R.layout.device_credential_handler_activity);
        Executor executor = r3.A07;
        if (executor == null || (r0 = r3.A04) == null) {
            Log.e("DeviceCredentialHandler", "onCreate: Executor and/or callback was null!");
            finish();
            return;
        }
        new C13710kh(this, executor, r0).A02(new C13700kg(getIntent().getBundleExtra("prompt_info_bundle")));
    }

    @Override // X.ActivityC004902h
    public void onPause() {
        super.onPause();
        AnonymousClass0WP r2 = AnonymousClass0WP.A09;
        if (isChangingConfigurations() && r2 != null) {
            if (r2.A02 == 0) {
                r2.A02 = 1;
            }
            this.A00 = true;
        }
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("did_change_configuration", this.A00);
    }
}
