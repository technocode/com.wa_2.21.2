package com.whatsapp.biometric;

import X.ActivityC004902h;
import X.AnonymousClass02M;
import X.AnonymousClass02i;
import X.AnonymousClass082;
import X.AnonymousClass0SL;
import X.AnonymousClass1RJ;
import X.C004302a;
import X.C04040Iu;
import X.C13690kf;
import X.C13700kg;
import X.C13710kh;
import X.C41711vV;
import android.app.KeyguardManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

public class BiometricAuthPlugin implements AnonymousClass0SL {
    public C04040Iu A00;
    public C13700kg A01;
    public C13710kh A02;
    public final int A03 = R.string.linked_device_unlock_to_link;
    public final ActivityC004902h A04;
    public final C41711vV A05;

    public BiometricAuthPlugin(ActivityC004902h r2, AnonymousClass02M r3, AnonymousClass1RJ r4) {
        this.A04 = r2;
        this.A05 = new C41711vV(r2, r3, r4);
        ((AnonymousClass02i) r2).A03.A00(this);
    }

    public boolean A00() {
        if (Build.VERSION.SDK_INT >= 23) {
            C04040Iu r1 = this.A00;
            if (r1 == null) {
                r1 = new C04040Iu(this.A04);
                this.A00 = r1;
            }
            return r1.A00() == 0;
        }
    }

    @OnLifecycleEvent(AnonymousClass082.ON_CREATE)
    public void onCreate() {
        if (!A00()) {
            Log.d("BiometricAuthPlugin/cannot-authenticate");
            return;
        }
        ActivityC004902h r4 = this.A04;
        this.A02 = new C13710kh(r4, C004302a.A05(r4), this.A05);
        C13690kf r3 = new C13690kf();
        String string = r4.getString(this.A03);
        Bundle bundle = r3.A00;
        bundle.putCharSequence("title", string);
        bundle.putBoolean("require_confirmation", false);
        KeyguardManager keyguardManager = (KeyguardManager) r4.getSystemService("keyguard");
        if (keyguardManager == null || !keyguardManager.isDeviceSecure()) {
            bundle.putCharSequence("negative_text", r4.getString(R.string.biometric_prompt_negative_button));
        } else {
            bundle.putBoolean("allow_device_credential", true);
        }
        this.A01 = r3.A00();
    }
}
