package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Gr  reason: invalid class name and case insensitive filesystem */
public class C69343Gr implements AbstractC60932sE {
    public final /* synthetic */ AnonymousClass1DU A00;

    public C69343Gr(AnonymousClass1DU r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC60932sE
    public void AGR() {
        AnonymousClass1DU r3 = this.A00;
        r3.A0J.A08("onGetChallengeFailure got; showErrorAndFinish", null);
        r3.A0i();
    }

    @Override // X.AbstractC60932sE
    public void AGX(boolean z, C61072sS r8) {
        JSONObject jSONObject;
        AnonymousClass1DU r3 = this.A00;
        ((ActivityC004702f) r3).A0K.A00();
        if (!z) {
            C018809u r5 = r3.A0J;
            r5.A08("onGetToken got; failure", null);
            if (r3.A03.A06("upi-get-token")) {
                r5.A08("retry get token", null);
                C68393Da r4 = r3.A0D;
                synchronized (r4) {
                    try {
                        C02010Ah r2 = r4.A02;
                        String A03 = r2.A03();
                        if (TextUtils.isEmpty(A03)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(A03);
                        }
                        jSONObject.remove("token");
                        jSONObject.remove("tokenTs");
                        AnonymousClass008.A0q(r2, "payments_setup_country_specific_info", jSONObject.toString());
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
                    }
                }
                if (r3 instanceof IndiaUpiResetPinActivity) {
                    IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) r3;
                    indiaUpiResetPinActivity.A02.setText(((AnonymousClass1DU) indiaUpiResetPinActivity).A0B.A06(R.string.payments_still_working));
                } else if (r3 instanceof IndiaUpiPaymentActivity) {
                    r3.A0G(R.string.payments_still_working);
                } else if (!(r3 instanceof IndiaUpiMandatePaymentActivity) && !(r3 instanceof IndiaUpiCheckBalanceActivity)) {
                    IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) r3;
                    indiaUpiChangePinActivity.A01.setText(((AnonymousClass1DU) indiaUpiChangePinActivity).A0B.A06(R.string.payments_still_working));
                }
                r3.A02.A00();
            } else if (r8 != null) {
                StringBuilder sb = new StringBuilder("onGetToken showErrorAndFinish error: ");
                sb.append(r8);
                r5.A08(sb.toString(), null);
                if (!C69293Gm.A02(r3, "upi-get-token", r8.code, true)) {
                    r3.A0i();
                }
            } else {
                r5.A08("onGetToken showErrorAndFinish", null);
                r3.A0i();
            }
        }
    }

    @Override // X.AbstractC60932sE
    public void AJD(boolean z) {
        if (z) {
            AnonymousClass1DU r6 = this.A00;
            r6.A03.A02("upi-register-app");
            boolean z2 = r6.A09;
            C018809u r4 = r6.A0J;
            if (z2) {
                r4.A08("internal error ShowPinError", null);
                int i = r6.A00;
                if (i < 3) {
                    AnonymousClass3EL r0 = r6.A04;
                    if (r0 != null) {
                        r0.A00();
                        return;
                    }
                    return;
                }
                StringBuilder A0S = AnonymousClass008.A0S("startShowPinFlow at count: ");
                A0S.append(i);
                A0S.append(" max: ");
                A0S.append(3);
                A0S.append("; showErrorAndFinish");
                r4.A07(null, A0S.toString(), null);
                r6.A0i();
                return;
            }
            r4.A07(null, "onRegisterApp registered ShowMainPane", null);
            r6.A0j();
            return;
        }
        AnonymousClass1DU r2 = this.A00;
        r2.A0J.A08("onRegisterApp not registered; showErrorAndFinish", null);
        r2.A0i();
    }
}
