package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2s9  reason: invalid class name and case insensitive filesystem */
public class C60882s9 {
    public long A00;
    public long A01;
    public C60892sA A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public C60882s9(AnonymousClass0M5 r8) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z = true;
        this.A09 = true;
        AnonymousClass0OS A0A2 = r8.A0A("mandate-no");
        String str9 = null;
        if (A0A2 != null) {
            str = A0A2.A03;
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            this.A07 = str;
        }
        AnonymousClass0OS A0A3 = r8.A0A("amount-rule");
        if (A0A3 != null) {
            str2 = A0A3.A03;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            this.A04 = str2;
        }
        AnonymousClass0OS A0A4 = r8.A0A("is-revocable");
        if (!(A0A4 == null || (str8 = A0A4.A03) == null)) {
            this.A0A = C006803i.A02(str8, 0) != 1 ? false : z;
        }
        AnonymousClass0OS A0A5 = r8.A0A("start-ts");
        str9 = A0A5 != null ? A0A5.A03 : str9;
        if (str9 != null) {
            this.A01 = C006803i.A04(str9, 0) * 1000;
        }
        AnonymousClass0OS A0A6 = r8.A0A("end-ts");
        if (!(A0A6 == null || (str7 = A0A6.A03) == null)) {
            this.A00 = C006803i.A04(str7, 0) * 1000;
        }
        AnonymousClass0OS A0A7 = r8.A0A("error-code");
        if (!(A0A7 == null || (str6 = A0A7.A03) == null)) {
            this.A05 = str6;
        }
        AnonymousClass0OS A0A8 = r8.A0A("original-amount");
        if (!(A0A8 == null || (str5 = A0A8.A03) == null)) {
            this.A08 = str5;
        }
        AnonymousClass0OS A0A9 = r8.A0A("mandate-info");
        if (!(A0A9 == null || (str4 = A0A9.A03) == null)) {
            this.A06 = str4;
        }
        AnonymousClass0OS A0A10 = r8.A0A("frequency-rule");
        if (!(A0A10 == null || (str3 = A0A10.A03) == null)) {
            if (str3.hashCode() != -602281453 || !str3.equals("ONETIME")) {
                this.A03 = "UNKNOWN";
            } else {
                this.A03 = "ONETIME";
            }
        }
        AnonymousClass0M5 A0D = r8.A0D("mandate-update");
        if (A0D != null) {
            this.A02 = new C60892sA(A0D);
        }
    }

    public C60882s9(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.A09 = jSONObject.optBoolean("isMandate", false);
                this.A0A = jSONObject.optBoolean("isRevocable", false);
                this.A01 = jSONObject.optLong("mandateStartTs", this.A01);
                this.A00 = jSONObject.optLong("mandateEndTs", this.A00);
                this.A04 = jSONObject.optString("mandateAmountRule", this.A04);
                this.A08 = jSONObject.optString("originalAmount", this.A08);
                this.A07 = jSONObject.optString("mandateNo", this.A07);
                this.A05 = jSONObject.optString("mandateErrorCode", this.A05);
                this.A06 = jSONObject.optString("mandateInfo", this.A06);
                this.A03 = jSONObject.optString("frequencyRule", this.A03);
                if (jSONObject.has("pendingMandateUpdate")) {
                    this.A02 = new C60892sA(jSONObject.optString("pendingMandateUpdate", null));
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e);
            }
        }
    }

    public String A00() {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isMandate", this.A09);
            jSONObject.put("isRevocable", this.A0A);
            long j = this.A01;
            if (j > 0) {
                jSONObject.put("mandateStartTs", j);
            }
            long j2 = this.A00;
            if (j2 > 0) {
                jSONObject.put("mandateEndTs", j2);
            }
            String str2 = this.A04;
            if (str2 != null) {
                jSONObject.put("mandateAmountRule", str2);
            }
            String str3 = this.A07;
            if (str3 != null) {
                jSONObject.put("mandateNo", str3);
            }
            String str4 = this.A05;
            if (str4 != null) {
                jSONObject.put("mandateErrorCode", str4);
            }
            String str5 = this.A08;
            if (str5 != null) {
                jSONObject.put("originalAmount", str5);
            }
            C60892sA r5 = this.A02;
            if (r5 != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    String str6 = r5.A07;
                    if (str6 != null) {
                        jSONObject2.put("pendingAmount", str6);
                    }
                    String str7 = r5.A02;
                    if (str7 != null) {
                        jSONObject2.put("isRevocable", str7);
                    }
                    long j3 = r5.A00;
                    if (j3 > 0) {
                        jSONObject2.put("mandateEndTs", j3);
                    }
                    String str8 = r5.A03;
                    if (str8 != null) {
                        jSONObject2.put("mandateAmountRule", str8);
                    }
                    String str9 = r5.A08;
                    if (str9 != null) {
                        jSONObject2.put("seqNum", str9);
                    }
                    String str10 = r5.A01;
                    if (str10 != null) {
                        jSONObject2.put("errorCode", str10);
                    }
                    String str11 = r5.A06;
                    if (str11 != null) {
                        jSONObject2.put("mandateUpdateStatus", str11);
                    }
                    String str12 = r5.A04;
                    if (str12 != null) {
                        jSONObject2.put("mandateUpdateAction", str12);
                    }
                    String str13 = r5.A05;
                    if (str13 != null) {
                        jSONObject2.put("mandateUpdateInfo", str13);
                    }
                    str = jSONObject2.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata toJsonString threw: ", e);
                    str = null;
                }
                jSONObject.put("pendingMandateUpdate", str);
            }
            String str14 = this.A06;
            if (str14 != null) {
                jSONObject.put("mandateInfo", str14);
            }
            String str15 = this.A03;
            if (str15 != null) {
                jSONObject.put("frequencyRule", str15);
            }
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e2);
            return null;
        }
    }

    public String toString() {
        String obj;
        C60892sA r0 = this.A02;
        if (r0 == null) {
            obj = "null";
        } else {
            obj = r0.toString();
        }
        StringBuilder A0S = AnonymousClass008.A0S("[ mandateNo: ");
        A0S.append(C28051Sr.A16(this.A07));
        A0S.append(" mandateErrorCode: ");
        A0S.append(this.A05);
        A0S.append(" mandateAmountRule: ");
        A0S.append(C28051Sr.A16(this.A04));
        A0S.append(" isMandate : ");
        A0S.append(this.A09);
        A0S.append(" isRevocable: ");
        A0S.append(this.A0A);
        A0S.append(" mandateStartTs: ");
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        A0S.append(C28051Sr.A16(sb.toString()));
        A0S.append(" mandateEndTs: ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.A00);
        sb2.append("");
        A0S.append(C28051Sr.A16(sb2.toString()));
        A0S.append(" mandateInfo: ");
        A0S.append(C28051Sr.A16(this.A06));
        A0S.append(" frequencyRule: ");
        A0S.append(C28051Sr.A16(this.A03));
        A0S.append(" pendingMandateUpdate: {");
        A0S.append(obj);
        A0S.append("} ]");
        return A0S.toString();
    }
}
