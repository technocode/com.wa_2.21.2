package com.whatsapp.payments.ui;

import X.AbstractView$OnClickListenerC33371gd;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass1VM;
import X.AnonymousClass3DO;
import X.AnonymousClass3HB;
import X.C018709t;
import X.C01980Ae;
import X.C02040Ak;
import X.C28051Sr;
import X.C60852s6;
import X.C61902tv;
import X.C61932ty;
import X.C61942tz;
import X.C62942vb;
import X.C62952vc;
import android.content.Intent;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import java.util.HashMap;

public class BrazilFbPayHubActivity extends AbstractView$OnClickListenerC33371gd implements AnonymousClass3HB {
    public final AnonymousClass01I A00 = AnonymousClass01I.A00();
    public final C60852s6 A01;
    public final C01980Ae A02;
    public final C02040Ak A03;
    public final C61902tv A04;
    public final C61932ty A05;
    public final C61942tz A06;
    public final C62942vb A07;
    public final C62952vc A08;

    @Override // X.AnonymousClass3HB
    public String A7Q(AnonymousClass1VM r2) {
        return null;
    }

    @Override // X.AbstractC63102vr
    public String A7S(AnonymousClass1VM r2) {
        return null;
    }

    @Override // X.AnonymousClass3HB
    public boolean APa() {
        return true;
    }

    public BrazilFbPayHubActivity() {
        C018709t.A01();
        this.A05 = C61932ty.A00();
        this.A02 = C01980Ae.A00();
        this.A07 = C62942vb.A00();
        this.A06 = C61942tz.A00();
        this.A03 = C02040Ak.A00();
        this.A04 = C61902tv.A00();
        if (C60852s6.A01 == null) {
            synchronized (AnonymousClass3DO.class) {
                if (C60852s6.A01 == null) {
                    C60852s6.A01 = new C60852s6(AnonymousClass01X.A00());
                }
            }
        }
        this.A01 = C60852s6.A01;
        this.A08 = C62952vc.A00();
    }

    @Override // X.AbstractC63152vw
    public void ACc(boolean z) {
        String str;
        String A022 = this.A08.A02(true);
        Intent intent = new Intent(this, BrazilPayBloksActivity.class);
        if (A022 != null) {
            intent.putExtra("screen_name", A022);
        } else {
            HashMap hashMap = new HashMap();
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("verification_needed", str);
            hashMap.put("referral_screen", "fbpay_payment_settings");
            intent.putExtra("screen_params", hashMap);
            intent.putExtra("screen_name", "brpay_p_add_card");
        }
        A0I(intent, false);
    }

    @Override // X.AbstractC63152vw
    public void AIN(AnonymousClass1VM r3) {
        if (r3.A04() != 5) {
            Intent intent = new Intent(this, BrazilPaymentCardDetailsActivity.class);
            intent.putExtra("extra_bank_account", r3);
            startActivity(intent);
        }
    }

    @Override // X.AnonymousClass3HB
    public void APj(AnonymousClass1VM r2, PaymentMethodRow paymentMethodRow) {
        if (C28051Sr.A1s(r2)) {
            this.A07.A03(r2, paymentMethodRow);
        }
    }
}
