package X;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3IX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IX {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C69703Ib A01;

    public /* synthetic */ AnonymousClass3IX(C69703Ib r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void A00(String str, C61072sS r10) {
        C61992u4 A002;
        JSONObject jSONObject;
        C69703Ib r5 = this.A01;
        int i = this.A00;
        if (r10 == null && !TextUtils.isEmpty(str) && (A002 = C61992u4.A00(Uri.parse(str))) != null && A002.A06 != null) {
            r5.A01.A07(A002);
            if (A002.A03 == null) {
                C68393Da r6 = r5.A0A;
                synchronized (r6) {
                    try {
                        C02010Ah r7 = r6.A02;
                        String A03 = r7.A03();
                        if (TextUtils.isEmpty(A03)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(A03);
                        }
                        jSONObject.put("signedQrCode", str);
                        jSONObject.put("signedQrCodeTs", r6.A00.A05());
                        AnonymousClass008.A0q(r7, "payments_setup_country_specific_info", jSONObject.toString());
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeQrSignature threw: ", e);
                    }
                }
            }
        }
        r5.A02.A07(new C63892xB(0, i));
        return;
    }
}
