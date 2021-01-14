package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Ah  reason: invalid class name and case insensitive filesystem */
public class C02010Ah {
    public static volatile C02010Ah A04;
    public SharedPreferences A00;
    public final AnonymousClass00S A01;
    public final C018809u A02 = C018809u.A00("PaymentSharedPrefs", "infra", "COMMON");
    public final AnonymousClass022 A03;

    public C02010Ah(AnonymousClass00S r4, AnonymousClass022 r5) {
        this.A01 = r4;
        this.A03 = r5;
    }

    public static C02010Ah A00() {
        if (A04 == null) {
            synchronized (C02010Ah.class) {
                if (A04 == null) {
                    A04 = new C02010Ah(AnonymousClass00S.A00(), AnonymousClass022.A00());
                }
            }
        }
        return A04;
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A02("com.whatsapp_payment_preferences");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public AnonymousClass1X5 A02() {
        AnonymousClass3F5 r1;
        String string = A01().getString("payment_step_up_info", null);
        if (string != null && !C003701u.A0E(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("service");
                String string3 = jSONObject.getString("step_up_id");
                boolean optBoolean = jSONObject.optBoolean("sticky_service_hub_cta", true);
                JSONObject jSONObject2 = jSONObject.getJSONObject("step_up_challenge");
                try {
                    if (jSONObject2.getString("type").equals("WEBVIEW")) {
                        try {
                            r1 = new AnonymousClass3F5(jSONObject2.getString("challenge_id"), jSONObject2.getBoolean("auth_required"));
                        } catch (JSONException e) {
                            Log.e("PAY: WebViewChallenge fromJsonObject threw exception ", e);
                        }
                        return new AnonymousClass1X5(string2, string3, optBoolean, r1);
                    }
                } catch (JSONException e2) {
                    Log.e("PAY: PaymentStepUpChallenge fromJsonObject threw exception ", e2);
                }
                r1 = null;
                return new AnonymousClass1X5(string2, string3, optBoolean, r1);
            } catch (JSONException e3) {
                Log.e("PAY: PaymentStepUpInfo fromJsonString threw exception ", e3);
            }
        }
        return null;
    }

    public String A03() {
        return A01().getString("payments_setup_country_specific_info", "");
    }

    public String A04(boolean z) {
        if (z) {
            return A01().getString("payments_setup_completed_steps", "");
        }
        return A01().getString("payments_merchant_setup_completed_steps", "");
    }

    public void A05(boolean z) {
        if (z) {
            A01().edit().remove("payments_setup_completed_steps").remove("payments_merchant_setup_completed_steps").remove("payments_methods_last_sync_time").remove("payments_card_can_receive_payment").remove("payments_all_transactions_last_sync_time").remove("payments_pending_transactions_last_sync_time").remove("payments_nagged_transactions").remove("payments_sent_payment_with_account").remove("payments_sandbox").remove("payments_invitee_jids").remove("payments_inviter_jids").remove("payments_enabled_till").remove("payments_support_phone_number").remove("payments_device_id").remove("payment_trusted_device_credential").remove("payment_trusted_device_credential_encrypted_aes").remove("payment_kyc_info").remove("payment_step_up_info").apply();
        } else {
            A01().edit().remove("payments_merchant_setup_completed_steps").apply();
        }
    }

    public void A06(boolean z) {
        A01().edit().putBoolean("payments_sandbox", z).apply();
    }
}
