package com.whatsapp.payments.ui;

import X.AbstractView$OnClickListenerC32241eZ;
import X.AnonymousClass1VM;
import X.C42931xW;
import X.C62952vc;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class BrazilPaymentSettingsActivity extends AbstractView$OnClickListenerC32241eZ {
    public C62952vc A00 = C62952vc.A00();
    public final C42931xW A01 = C42931xW.A00();

    @Override // X.AnonymousClass3HB
    public String A7Q(AnonymousClass1VM r2) {
        return null;
    }

    @Override // X.AbstractC63102vr
    public String A7S(AnonymousClass1VM r2) {
        return null;
    }

    @Override // X.AbstractC63152vw
    public void ACc(boolean z) {
    }

    @Override // X.AbstractC63152vw
    public void AIN(AnonymousClass1VM r1) {
    }

    @Override // X.AbstractView$OnClickListenerC32241eZ, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            startActivity(new Intent(this, BrazilFbPayHubActivity.class));
        }
    }

    @Override // X.AnonymousClass2C0, X.AbstractView$OnClickListenerC32241eZ, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42931xW r3 = this.A01;
        Log.d("Bloks: BloksPayloadUtil: shouldConnectIgServer = false");
        if (!r3.A02() || !r3.A06()) {
            r3.A05("payment_settings", true, null);
        }
    }

    @Override // X.AbstractView$OnClickListenerC32241eZ, X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (this.A01 == null) {
            throw null;
        }
    }
}
