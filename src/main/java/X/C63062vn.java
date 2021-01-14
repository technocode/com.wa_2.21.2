package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2vn  reason: invalid class name and case insensitive filesystem */
public class C63062vn extends BroadcastReceiver {
    public final /* synthetic */ IndiaUpiDeviceBindActivity A00;

    public C63062vn(IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity) {
        this.A00 = indiaUpiDeviceBindActivity;
    }

    public void onReceive(Context context, Intent intent) {
        JSONObject jSONObject;
        int resultCode = getResultCode();
        IndiaUpiDeviceBindActivity indiaUpiDeviceBindActivity = this.A00;
        C018809u r6 = indiaUpiDeviceBindActivity.A0T;
        StringBuilder sb = new StringBuilder("SmsSentReceiver onReceive: ");
        sb.append(resultCode);
        r6.A07(null, sb.toString(), null);
        if (resultCode == -1) {
            indiaUpiDeviceBindActivity.A0l(true);
            C60922sD r7 = indiaUpiDeviceBindActivity.A0L;
            String A05 = r7.A05(indiaUpiDeviceBindActivity.A07);
            C68393Da r9 = indiaUpiDeviceBindActivity.A0M;
            String A0Y = indiaUpiDeviceBindActivity.A0Y(A05, r9.A07());
            String A04 = r7.A04(indiaUpiDeviceBindActivity.A07);
            synchronized (r9) {
                if (A04 == null) {
                    throw null;
                } else if (A0Y != null) {
                    try {
                        C02010Ah r10 = r9.A02;
                        String A03 = r10.A03();
                        if (TextUtils.isEmpty(A03)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(A03);
                        }
                        jSONObject.put("v", "2");
                        JSONObject A01 = C68393Da.A01(A04, jSONObject, "smsVerifDataSentToPsp");
                        if (A01 != null) {
                            A01.put("smsVerifData", A0Y);
                        }
                        AnonymousClass008.A0q(r10, "payments_setup_country_specific_info", jSONObject.toString());
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeSmsVerificationDataSent threw: ", e);
                    }
                } else {
                    throw null;
                }
            }
            C61082sT r1 = indiaUpiDeviceBindActivity.A09;
            if (r1 != null) {
                r1.A04("device-binding-sms");
            }
            StringBuilder A0Z = AnonymousClass008.A0Z("IndiaUpiPaymentBankSetupActivity: onSmsSent to psp: ", A04, " storing verification data sent: ");
            A0Z.append(C28051Sr.A16(A0Y));
            r6.A07(null, A0Z.toString(), null);
            if (!TextUtils.isEmpty(A0Y)) {
                AnonymousClass02M r2 = ((ActivityC004702f) indiaUpiDeviceBindActivity).A0F;
                r2.A02.post(new RunnableEBaseShape11S0100000_I1_6(indiaUpiDeviceBindActivity, 25));
                indiaUpiDeviceBindActivity.A0E = true;
                indiaUpiDeviceBindActivity.A0A.A00();
                indiaUpiDeviceBindActivity.A0R.AQ7();
                return;
            }
            return;
        }
        C61082sT r12 = indiaUpiDeviceBindActivity.A09;
        if (r12 != null) {
            r12.A05("device-binding-sms", resultCode);
        }
        indiaUpiDeviceBindActivity.A0l(false);
        indiaUpiDeviceBindActivity.A0h(R.string.payments_error_sms, true);
        return;
    }
}
