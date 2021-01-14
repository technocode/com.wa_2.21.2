package com.whatsapp.payments.ui;

import X.AnonymousClass00S;
import X.AnonymousClass022;
import X.AnonymousClass0OY;
import X.C018609s;
import X.C018709t;
import X.C05900Qy;
import X.C63802x2;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;

public class BrazilSmbPaymentActivity extends BrazilPaymentActivity {
    public final AnonymousClass00S A00 = AnonymousClass00S.A00();
    public final C018609s A01;
    public final C018709t A02 = C018709t.A01();
    public final C63802x2 A03;

    public BrazilSmbPaymentActivity() {
        if (C63802x2.A02 == null) {
            synchronized (C63802x2.class) {
                if (C63802x2.A02 == null) {
                    AnonymousClass00S.A00();
                    C63802x2.A02 = new C63802x2(AnonymousClass022.A00());
                }
            }
        }
        this.A03 = C63802x2.A02;
        this.A01 = C018609s.A04();
    }

    public void A0a(String str, C05900Qy r2) {
        super.AJQ(str, r2);
    }

    public /* synthetic */ void A0b(String str, C05900Qy r2) {
        super.AJQ(str, r2);
    }

    @Override // X.AbstractC63672wp, com.whatsapp.payments.ui.BrazilPaymentActivity
    public void AJQ(String str, C05900Qy r11) {
        SharedPreferences sharedPreferences;
        Pair pair;
        C63802x2 r3 = this.A03;
        synchronized (r3) {
            sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A01("com.whatsapp_br_payment_preferences");
                r3.A00 = sharedPreferences;
            }
        }
        String string = sharedPreferences.getString("br_payment_smb_up_sell_nudge_timestamp", "");
        if (!TextUtils.isEmpty(string)) {
            String[] split = string.split(":");
            if (split.length == 2) {
                pair = new Pair(Long.valueOf(Long.parseLong(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
                if (AnonymousClass0OY.A00(((Number) pair.first).longValue(), this.A00.A05()) <= 30 || ((Number) pair.second).intValue() >= 3) {
                    super.AJQ(str, r11);
                    return;
                }
                this.A0Q.ANF(new RunnableEBaseShape1S1300000_I1(this, pair, r11, str, 2));
            }
        }
        pair = null;
        this.A0Q.ANF(new RunnableEBaseShape1S1300000_I1(this, pair, r11, str, 2));
    }
}
