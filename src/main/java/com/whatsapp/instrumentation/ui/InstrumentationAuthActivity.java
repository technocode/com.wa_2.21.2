package com.whatsapp.instrumentation.ui;

import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass2C0;
import X.AnonymousClass2RM;
import X.AnonymousClass2RN;
import X.C28631Vd;
import X.C28751Vp;
import X.C28821Vw;
import X.C28841Vy;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.security.SecureRandom;

public class InstrumentationAuthActivity extends AnonymousClass2C0 implements AnonymousClass2RM, AnonymousClass2RN {
    public DisclosureFragment A00;
    public String A01;
    public final C28631Vd A02 = C28631Vd.A00();
    public final C28821Vw A03 = C28821Vw.A00();
    public final C28841Vy A04 = C28841Vy.A00();

    public final void A0D(int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("error_code", i);
        intent.putExtra("error_message", str);
        setResult(0, intent);
        finish();
    }

    @Override // X.AnonymousClass2RM
    public void ACX() {
        Log.d("InstrumentationAuthActivity/allowButtonClicked");
        String str = this.A01;
        Intent intent = new Intent();
        String callingPackage = getCallingPackage();
        if (callingPackage != null) {
            C28821Vw r7 = this.A03;
            synchronized (r7) {
                if (r7.A02(callingPackage, str)) {
                    C28751Vp r10 = r7.A00;
                    String A012 = C28751Vp.A01(callingPackage, "request/token");
                    String A013 = C28751Vp.A01(callingPackage, "request/token_ts");
                    SharedPreferences sharedPreferences = r10.A00;
                    sharedPreferences.edit().remove(A012).remove(A013).apply();
                    sharedPreferences.edit().remove(C28751Vp.A01(callingPackage, "auth/encryption_key")).apply();
                    byte[] bArr = new byte[16];
                    new SecureRandom().nextBytes(bArr);
                    String encodeToString = Base64.encodeToString(bArr, 11);
                    String A014 = C28751Vp.A01(callingPackage, "auth/token");
                    String A015 = C28751Vp.A01(callingPackage, "auth/token_ts");
                    String A016 = C28751Vp.A01(callingPackage, "metadata/last_active_time");
                    long A05 = r10.A01.A05();
                    sharedPreferences.edit().putString(A014, encodeToString).putLong(A015, A05).putLong(A016, A05).apply();
                    if (encodeToString != null) {
                        intent.putExtra("authorization_token", encodeToString);
                        setResult(-1, intent);
                        finish();
                        return;
                    }
                }
            }
            A0D(4, "Request is not authorized!");
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2RN
    public void AI0() {
        AnonymousClass0LW A042 = A04();
        if (A042 != null) {
            AnonymousClass0QB r2 = new AnonymousClass0QB(A042);
            r2.A06(R.id.fragment_container, this.A00, null);
            r2.A08(null);
            r2.A00();
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.instrumentation_auth_title_activity));
        if (!this.A02.A01()) {
            Log.d("InstrumentationAuthActivity/Service disabled");
            A0D(3, "Feature is disabled!");
            return;
        }
        ComponentName callingActivity = getCallingActivity();
        if (callingActivity == null) {
            A0D(8, "Not started for result.");
            return;
        }
        String packageName = callingActivity.getPackageName();
        try {
            if (this.A04.A02(packageName).A03) {
                Intent intent = getIntent();
                if (intent == null || getCallingPackage() == null) {
                    str = null;
                } else {
                    str = intent.getStringExtra("request_token");
                }
                this.A01 = str;
                if (!this.A03.A02(packageName, str)) {
                    Log.e("InstrumentationAuthActivity/onCreate no correct request token!");
                    A0D(4, "Request is not authorized!");
                    return;
                }
                setContentView(R.layout.instrumentation_auth);
                this.A00 = new DisclosureFragment();
                if (bundle == null) {
                    AnonymousClass0LW A042 = A04();
                    if (A042 != null) {
                        AnonymousClass0QB r2 = new AnonymousClass0QB(A042);
                        r2.A05(R.id.fragment_container, new PermissionsFragment());
                        r2.A00();
                        return;
                    }
                    throw null;
                }
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        StringBuilder sb = new StringBuilder("Untrusted caller: ");
        sb.append(packageName);
        A0D(8, sb.toString());
    }
}
