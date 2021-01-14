package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3az  reason: invalid class name and case insensitive filesystem */
public class C74473az extends C73483Xm {
    public final /* synthetic */ C68403Db A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74473az(C68403Db r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13) {
        super(context, r10, r11, r12, r13, "upi-get-token");
        this.A00 = r8;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r4) {
        super.A01(r4);
        C68403Db r2 = this.A00;
        r2.A06.ABo(2, r4);
        AbstractC60932sE r1 = r2.A04;
        if (r1 != null) {
            r1.AGX(false, r4);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r4) {
        super.A02(r4);
        C68403Db r2 = this.A00;
        r2.A06.ABo(2, r4);
        AbstractC60932sE r1 = r2.A04;
        if (r1 != null) {
            r1.AGX(false, r4);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r16) {
        JSONObject jSONObject;
        super.A03(r16);
        AnonymousClass0M5 A0D = r16.A0D("account");
        if (A0D != null) {
            this.A00.A06.ABo(2, null);
            String A0G = A0D.A0G("token", null);
            if (!TextUtils.isEmpty(A0G)) {
                Log.i("PAY: IndiaUpiSetupCoordinator/token stored");
                C68393Da r6 = this.A00.A03;
                synchronized (r6) {
                    try {
                        String A03 = r6.A02.A03();
                        long A05 = r6.A00.A05();
                        if (TextUtils.isEmpty(A03)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(A03);
                        }
                        jSONObject.put("v", "2");
                        jSONObject.put("token", A0G);
                        jSONObject.put("tokenTs", A05);
                        AnonymousClass008.A0q(r6.A02, "payments_setup_country_specific_info", jSONObject.toString());
                    } catch (JSONException e) {
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs storeToken threw: ", e);
                    }
                }
                byte[] decode = Base64.decode(A0G, 0);
                AbstractC60932sE r0 = this.A00.A04;
                boolean z = true;
                if (r0 != null) {
                    r0.AGX(true, null);
                }
                C68403Db r02 = this.A00;
                AnonymousClass3BB r11 = r02.A0A;
                String str = r02.A09;
                AbstractC60932sE r14 = r02.A04;
                AnonymousClass00T r3 = r02.A08;
                C63842x6 r10 = r02.A07;
                synchronized (C60942sF.class) {
                    Log.d("PAY: IndiaUpiSetupCoordinator/registerApp called");
                    String A02 = r10.A02();
                    try {
                        StringBuilder sb = new StringBuilder();
                        sb.append("com.whatsapp");
                        sb.append("|");
                        sb.append(str);
                        sb.append("|");
                        sb.append(A02);
                        String encodeToString = Base64.encodeToString(AnonymousClass1YV.A0e(AnonymousClass1YV.A0c(sb.toString()), decode), 2);
                        if (encodeToString != null) {
                            boolean z2 = false;
                            if (!TextUtils.isEmpty("com.whatsapp")) {
                                z2 = true;
                            }
                            AnonymousClass00E.A07(z2);
                            boolean z3 = false;
                            if (!TextUtils.isEmpty(str)) {
                                z3 = true;
                            }
                            AnonymousClass00E.A07(z3);
                            boolean z4 = false;
                            if (!TextUtils.isEmpty(A02)) {
                                z4 = true;
                            }
                            AnonymousClass00E.A07(z4);
                            if (TextUtils.isEmpty(encodeToString)) {
                                z = false;
                            }
                            AnonymousClass00E.A07(z);
                            C10170eC r9 = new C10170eC(r10, r11, encodeToString, str, r14);
                            C60942sF.A08 = r9;
                            r3.ANC(r9, new Void[0]);
                        }
                    } catch (Exception e2) {
                        Log.e("PAY: IndiaUpiSetupCoordinator/registerApp threw: ", e2);
                    }
                    Log.w("PAY: IndiaUpiSetupCoordinator/registerApp got null intent");
                    if (r14 != null) {
                        r14.AJD(false);
                    }
                }
                return;
            }
            AbstractC60932sE r03 = this.A00.A04;
            if (r03 != null) {
                r03.AGX(false, null);
                return;
            }
            return;
        }
        Log.e("PAY: IndiaUpiSetupCoordinator/token missing account node");
        AbstractC60932sE r04 = this.A00.A04;
        if (r04 != null) {
            r04.AGX(false, null);
            return;
        }
        return;
    }
}
