package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.2vc  reason: invalid class name and case insensitive filesystem */
public class C62952vc {
    public static volatile C62952vc A05;
    public final AnonymousClass01X A00;
    public final C01980Ae A01;
    public final C02060Am A02;
    public final C02040Ak A03;
    public final C61942tz A04;

    public C62952vc(AnonymousClass01X r1, C01980Ae r2, C02040Ak r3, C61942tz r4, C02060Am r5) {
        this.A00 = r1;
        this.A03 = r3;
        this.A01 = r2;
        this.A04 = r4;
        this.A02 = r5;
    }

    public static C62952vc A00() {
        if (A05 == null) {
            synchronized (C62952vc.class) {
                if (A05 == null) {
                    A05 = new C62952vc(AnonymousClass01X.A00(), C01980Ae.A00(), C02040Ak.A00(), C61942tz.A00(), C02060Am.A00());
                }
            }
        }
        return A05;
    }

    public Intent A01(Context context, C43761yu r5, String str) {
        Intent intent = new Intent(context, BrazilPayBloksActivity.class);
        intent.putExtra("screen_params", A03(r5, str));
        intent.putExtra("screen_name", "brpay_p_card_verify_options");
        intent.putExtra("payment_method_credential_id", r5.A07);
        return intent;
    }

    public String A02(boolean z) {
        if (z) {
            C02000Ag A002 = this.A01.A00();
            if (A002 == null) {
                return null;
            }
            String str = A002.A03;
            if (str.equals("tos_no_wallet")) {
                return "brpay_p_tos";
            }
            if (!this.A04.A04()) {
                return "brpay_p_pin_nux_create";
            }
            if (str.equals("add_card")) {
                return "brpay_p_compliance_kyc_next_screen_router";
            }
            return null;
        }
        this.A03.A01();
        return null;
    }

    public HashMap A03(C43761yu r4, String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("credential_id", r4.A07);
        if (str != null) {
            hashMap.put("verify_methods", str);
        }
        hashMap.put("source", "pay_flow");
        int i = r4.A01;
        if (i != 1) {
            str2 = i != 2 ? i != 3 ? i != 4 ? "unknown" : "discover" : "amex" : "mastercard";
        } else {
            str2 = "visa";
        }
        hashMap.put("network_name", str2);
        AbstractC460627w r1 = (AbstractC460627w) r4.A06;
        if (r1 != null && !TextUtils.isEmpty(r1.A0E)) {
            hashMap.put("card_image_url", r1.A0E);
        }
        hashMap.put("readable_name", C28051Sr.A0u(this.A00, r4));
        if (((AbstractC460627w) r4.A06).A0X) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        hashMap.put("verified_state", str3);
        return hashMap;
    }
}
