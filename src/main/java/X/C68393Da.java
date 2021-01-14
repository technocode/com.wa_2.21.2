package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Da  reason: invalid class name and case insensitive filesystem */
public class C68393Da implements AbstractC29071Wx {
    public static volatile C68393Da A03;
    public final AnonymousClass00S A00;
    public final C01980Ae A01;
    public final C02010Ah A02;

    public C68393Da(AnonymousClass00S r1, C02010Ah r2, C01980Ae r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static C68393Da A00() {
        if (A03 == null) {
            synchronized (C68393Da.class) {
                if (A03 == null) {
                    A03 = new C68393Da(AnonymousClass00S.A00(), C02010Ah.A00(), C01980Ae.A00());
                }
            }
        }
        return A03;
    }

    public static final JSONObject A01(String str, JSONObject jSONObject, String str2) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str2);
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
                jSONObject.put(str2, optJSONObject);
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
            if (optJSONObject2 != null) {
                return optJSONObject2;
            }
            JSONObject jSONObject2 = new JSONObject();
            optJSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("PAY: IndiaUpiPaymentSharedPrefs getOrInsertFieldByPsP for field: ");
            sb.append(str2);
            sb.append(" threw: ");
            Log.w(sb.toString(), e);
            return null;
        }
    }

    public int A02() {
        String A04 = A04();
        if (A04 == null) {
            return R.string.icici_psp_name;
        }
        int hashCode = A04.hashCode();
        if (hashCode != 81882) {
            if (hashCode != 2023329) {
                if (hashCode != 2212537 || !A04.equals("HDFC")) {
                    return R.string.icici_psp_name;
                }
                return R.string.hdfc_psp_name;
            } else if (A04.equals("AXIS")) {
                return R.string.axis_psp_name;
            } else {
                return R.string.icici_psp_name;
            }
        } else if (A04.equals("SBI")) {
            return R.string.sbi_psp_name;
        } else {
            return R.string.icici_psp_name;
        }
    }

    public String A03() {
        try {
            String A032 = this.A02.A03();
            if (!TextUtils.isEmpty(A032)) {
                return new JSONObject(A032).optString("sequenceNumberPrefix", "ICIWC");
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPaymentSequenceNumberPrefix threw: ", e);
        }
        return "ICIWC";
    }

    public String A04() {
        try {
            String A032 = this.A02.A03();
            if (!TextUtils.isEmpty(A032)) {
                return new JSONObject(A032).optString("psp", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs getPsp threw: ", e);
        }
        return null;
    }

    public synchronized String A05() {
        String str;
        str = null;
        try {
            String A032 = this.A02.A03();
            if (!TextUtils.isEmpty(A032)) {
                str = new JSONObject(A032).optString("vpa", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readAccountHandle threw: ", e);
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[Catch:{ JSONException -> 0x003c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A06() {
        /*
            r10 = this;
            monitor-enter(r10)
            r6 = 0
            X.0Ah r0 = r10.A02     // Catch:{ JSONException -> 0x003c }
            java.lang.String r1 = r0.A03()     // Catch:{ JSONException -> 0x003c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x003c }
            if (r0 != 0) goto L_0x0047
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x003c }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x003c }
            java.lang.String r0 = "listKeys"
            java.lang.String r9 = r3.optString(r0, r6)     // Catch:{ JSONException -> 0x003c }
            java.lang.String r2 = "listKeysTs"
            r0 = 0
            long r7 = r3.optLong(r2, r0)     // Catch:{ JSONException -> 0x003c }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ JSONException -> 0x003c }
            r0 = 1
            long r4 = r2.toMillis(r0)     // Catch:{ JSONException -> 0x003c }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x003c }
            if (r0 != 0) goto L_0x0043
            X.00S r0 = r10.A00     // Catch:{ JSONException -> 0x003c }
            long r2 = r0.A05()     // Catch:{ JSONException -> 0x003c }
            long r2 = r2 - r7
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0044
            goto L_0x0043
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readListKeys threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            r6 = r9
        L_0x0047:
            monitor-exit(r10)
            return r6
        L_0x0049:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68393Da.A06():java.lang.String");
    }

    public synchronized String A07() {
        try {
            String A032 = this.A02.A03();
            if (!TextUtils.isEmpty(A032)) {
                return new JSONObject(A032).optString("smsVerifDataGen", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: ", e);
        }
        return null;
    }

    public synchronized String A08() {
        String str;
        str = null;
        try {
            String A032 = this.A02.A03();
            if (!TextUtils.isEmpty(A032)) {
                str = new JSONObject(A032).optString("vpaId", null);
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readVpaId threw: ", e);
        }
        return str;
    }

    public synchronized String A09(String str) {
        String str2;
        String str3;
        JSONException e;
        str2 = null;
        if (str != null) {
            try {
                String A032 = this.A02.A03();
                if (!TextUtils.isEmpty(A032)) {
                    JSONObject jSONObject = new JSONObject(A032);
                    JSONObject optJSONObject = jSONObject.optJSONObject("smsVerifDataSentToPsp");
                    JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject(str) : null;
                    str3 = optJSONObject2 != null ? optJSONObject2.optString("smsVerifData", null) : null;
                    try {
                        if (TextUtils.isEmpty(str3)) {
                            str2 = jSONObject.optString("smsVerifData", null);
                        }
                    } catch (JSONException e2) {
                        e = e2;
                        Log.w("PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataSent threw: ", e);
                        str2 = str3;
                        return str2;
                    }
                    str2 = str3;
                }
            } catch (JSONException e3) {
                e = e3;
                str3 = null;
                Log.w("PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataSent threw: ", e);
                str2 = str3;
                return str2;
            }
        } else {
            throw null;
        }
        return str2;
    }

    public synchronized void A0A() {
        JSONObject jSONObject;
        try {
            C02010Ah r2 = this.A02;
            String A032 = r2.A03();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            jSONObject.remove("listKeys");
            jSONObject.remove("listKeysTs");
            AnonymousClass008.A0q(r2, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0B() {
        JSONObject jSONObject;
        try {
            C02010Ah r2 = this.A02;
            String A032 = r2.A03();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            jSONObject.remove("token");
            jSONObject.remove("tokenTs");
            jSONObject.remove("listKeys");
            jSONObject.remove("listKeysTs");
            AnonymousClass008.A0q(r2, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0C(String str) {
        try {
            C02010Ah r2 = this.A02;
            String A032 = r2.A03();
            if (!TextUtils.isEmpty(A032)) {
                JSONObject jSONObject = new JSONObject(A032);
                if (TextUtils.isEmpty(str)) {
                    jSONObject.remove("smsVerifDataSentToPsp");
                    jSONObject.remove("devBindingByPsp");
                } else {
                    JSONObject optJSONObject = jSONObject.optJSONObject("smsVerifDataSentToPsp");
                    if (optJSONObject != null) {
                        optJSONObject.remove(str);
                    }
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("devBindingByPsp");
                    if (optJSONObject2 != null) {
                        optJSONObject2.remove(str);
                    }
                }
                jSONObject.remove("psp");
                jSONObject.remove("sequenceNumberPrefix");
                jSONObject.remove("skipDevBinding");
                jSONObject.remove("smsVerifData");
                jSONObject.remove("devBinding");
                jSONObject.remove("smsVerifDataGen");
                jSONObject.remove("device_binding_sim_iccid");
                AnonymousClass008.A0q(r2, "payments_setup_country_specific_info", jSONObject.toString());
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteDeviceBinding threw: ", e);
        }
    }

    public synchronized void A0D(String str) {
        JSONObject jSONObject;
        try {
            C02010Ah r5 = this.A02;
            String A032 = r5.A03();
            long A05 = this.A00.A05();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            jSONObject.put("v", "2");
            jSONObject.put("listKeys", str);
            jSONObject.put("listKeysTs", A05);
            AnonymousClass008.A0q(r5, "payments_setup_country_specific_info", jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            sb.append("PAY: IndiaUpiPaymentSharedPrefs storeListKeys at timestamp: ");
            sb.append(A05);
            Log.i(sb.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeListKeys threw: ", e);
        }
        return;
    }

    public synchronized void A0E(String str, String str2) {
        JSONObject jSONObject;
        try {
            C02010Ah r2 = this.A02;
            String A032 = r2.A03();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            A0H(jSONObject, str, str2);
            AnonymousClass008.A0q(r2, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeVpaHandle threw: ", e);
        }
        return;
    }

    public synchronized void A0F(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            C02010Ah r2 = this.A02;
            String A032 = r2.A03();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            A0G(jSONObject, str, str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put("device_binding_sim_iccid", str3);
            }
            AnonymousClass008.A0q(r2, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs storeDeviceBinding threw: ", e);
        }
        return;
    }

    public final synchronized void A0G(JSONObject jSONObject, String str, String str2) {
        jSONObject.put("v", "2");
        jSONObject.put("psp", str);
        jSONObject.put("sequenceNumberPrefix", str2);
        JSONObject A012 = A01(str, jSONObject, "devBindingByPsp");
        if (A012 != null) {
            A012.put("devBinding", true);
        }
    }

    public final synchronized void A0H(JSONObject jSONObject, String str, String str2) {
        jSONObject.put("v", "2");
        jSONObject.put("vpa", str);
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put("vpaId", str2);
        }
        jSONObject.put("vpaTs", this.A00.A05());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if ((r10.A00.A05() - r8) >= r4) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized byte[] A0I() {
        /*
            r10 = this;
            monitor-enter(r10)
            r6 = 0
            X.0Ah r0 = r10.A02     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r1 = r0.A03()     // Catch:{ JSONException -> 0x0046 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0046 }
            if (r0 != 0) goto L_0x004c
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0046 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r0 = "token"
            java.lang.String r7 = r3.optString(r0, r6)     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r2 = "tokenTs"
            r0 = 0
            long r8 = r3.optLong(r2, r0)     // Catch:{ JSONException -> 0x0046 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ JSONException -> 0x0046 }
            r0 = 20
            long r4 = r2.toMillis(r0)     // Catch:{ JSONException -> 0x0046 }
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0046 }
            if (r0 != 0) goto L_0x003d
            X.00S r0 = r10.A00     // Catch:{ JSONException -> 0x0046 }
            long r2 = r0.A05()     // Catch:{ JSONException -> 0x0046 }
            long r2 = r2 - r8
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x004c
            r0 = 0
            byte[] r6 = android.util.Base64.decode(r7, r0)     // Catch:{ JSONException -> 0x0046 }
            goto L_0x004c
        L_0x0046:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readToken threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x004e }
        L_0x004c:
            monitor-exit(r10)
            return r6
        L_0x004e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68393Da.A0I():byte[]");
    }

    public synchronized String[] A0J() {
        return A0K("signedQrCode", "signedQrCodeTs");
    }

    public final String[] A0K(String... strArr) {
        try {
            String A032 = this.A02.A03();
            if (!TextUtils.isEmpty(A032)) {
                JSONObject jSONObject = new JSONObject(A032);
                int length = strArr.length;
                String[] strArr2 = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr2[i] = jSONObject.optString(strArr[i], null);
                }
                return strArr2;
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs readFromPaymentInfo for keys threw: ", e);
        }
        return new String[strArr.length];
    }

    @Override // X.AbstractC29071Wx
    public void A3Z() {
        JSONObject jSONObject;
        try {
            C02010Ah r2 = this.A02;
            String A032 = r2.A03();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            jSONObject.remove("token");
            jSONObject.remove("tokenTs");
            jSONObject.remove("vpa");
            jSONObject.remove("vpaId");
            jSONObject.remove("vpaTs");
            jSONObject.remove("listKeys");
            jSONObject.remove("listKeysTs");
            jSONObject.remove("skipDevBinding");
            jSONObject.remove("devBindingByPsp");
            jSONObject.remove("psp");
            jSONObject.remove("sequenceNumberPrefix");
            jSONObject.remove("devBinding");
            jSONObject.remove("signedQrCode");
            jSONObject.remove("signedQrCodeTs");
            AnonymousClass008.A0q(r2, "payments_setup_country_specific_info", jSONObject.toString());
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteTokenAndKeys threw: ", e);
        }
    }

    @Override // X.AbstractC29071Wx
    public boolean APX(AbstractC43791yx r3) {
        return !this.A01.A09() && TextUtils.isEmpty(A05());
    }

    public String toString() {
        JSONObject jSONObject;
        String str;
        try {
            String A032 = this.A02.A03();
            if (TextUtils.isEmpty(A032)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(A032);
            }
            if (!TextUtils.isEmpty(jSONObject.optString("listKeys"))) {
                str = "[keys exist]";
            } else {
                str = "[no keys]";
            }
            jSONObject.put("listKeys", str);
            String optString = jSONObject.optString("vpa");
            if (!TextUtils.isEmpty(optString)) {
                jSONObject.put("vpa", C28051Sr.A17(optString));
            }
            String optString2 = jSONObject.optString("smsVerifDataGen");
            if (!TextUtils.isEmpty(optString2)) {
                jSONObject.put("smsVerifDataGen", C28051Sr.A16(optString2));
            }
            String optString3 = jSONObject.optString("smsVerifData");
            if (!TextUtils.isEmpty(optString2)) {
                jSONObject.put("smsVerifData", C28051Sr.A16(optString3));
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("smsVerifDataSentToPsp");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(keys.next());
                    if (optJSONObject2 != null) {
                        String optString4 = optJSONObject2.optString("smsVerifData");
                        if (!TextUtils.isEmpty(optString4)) {
                            optJSONObject2.put("smsVerifData", C28051Sr.A16(optString4));
                        }
                    }
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiPaymentSharedPrefs toString threw: ", e);
            return "";
        }
    }
}
