package X;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2tz  reason: invalid class name and case insensitive filesystem */
public class C61942tz {
    public static volatile C61942tz A02;
    public final C02010Ah A00;
    public final C018809u A01 = C018809u.A00("PaymentPinSharedPrefs", "infra", "COMMON");

    public C61942tz(C02010Ah r4) {
        this.A00 = r4;
    }

    public static C61942tz A00() {
        if (A02 == null) {
            synchronized (C61942tz.class) {
                if (A02 == null) {
                    A02 = new C61942tz(C02010Ah.A00());
                }
            }
        }
        return A02;
    }

    public synchronized long A01() {
        long j;
        JSONObject optJSONObject;
        j = 0;
        try {
            String A03 = this.A00.A03();
            if (!TextUtils.isEmpty(A03) && (optJSONObject = new JSONObject(A03).optJSONObject("pin")) != null) {
                j = optJSONObject.optLong("pin_next_retry_ts");
            }
        } catch (JSONException e) {
            C018809u r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("getNextRetryTs threw: ");
            sb.append(e);
            r2.A04(sb.toString());
        }
        return j;
    }

    public synchronized void A02() {
        JSONObject jSONObject;
        try {
            C02010Ah r5 = this.A00;
            String A03 = r5.A03();
            if (TextUtils.isEmpty(A03)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A03);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pinSet", true);
            jSONObject.put("pin", optJSONObject);
            AnonymousClass008.A0q(r5, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            C018809u r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("setPinSet threw: ");
            sb.append(e);
            r2.A04(sb.toString());
        }
        return;
    }

    public synchronized void A03(long j) {
        JSONObject jSONObject;
        try {
            C02010Ah r5 = this.A00;
            String A03 = r5.A03();
            if (TextUtils.isEmpty(A03)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A03);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("pin");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            optJSONObject.put("v", "1");
            optJSONObject.put("pin_next_retry_ts", j);
            jSONObject.put("pin", optJSONObject);
            AnonymousClass008.A0q(r5, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            C018809u r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("setPinSet threw: ");
            sb.append(e);
            r2.A04(sb.toString());
        }
        return;
    }

    public synchronized boolean A04() {
        boolean z;
        JSONObject optJSONObject;
        z = false;
        try {
            String A03 = this.A00.A03();
            if (!TextUtils.isEmpty(A03) && (optJSONObject = new JSONObject(A03).optJSONObject("pin")) != null) {
                z = optJSONObject.optBoolean("pinSet");
            }
        } catch (JSONException e) {
            C018809u r2 = this.A01;
            StringBuilder sb = new StringBuilder();
            sb.append("isPinSet threw: ");
            sb.append(e);
            r2.A04(sb.toString());
        }
        return z;
    }
}
