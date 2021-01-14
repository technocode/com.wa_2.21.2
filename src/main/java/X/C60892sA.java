package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2sA  reason: invalid class name and case insensitive filesystem */
public class C60892sA {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public C60892sA(AnonymousClass0M5 r5) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AnonymousClass0OS A0A = r5.A0A("amount");
        String str9 = null;
        if (!(A0A == null || (str8 = A0A.A03) == null)) {
            this.A07 = str8;
        }
        AnonymousClass0OS A0A2 = r5.A0A("amount-rule");
        str9 = A0A2 != null ? A0A2.A03 : str9;
        if (!TextUtils.isEmpty(str9)) {
            this.A03 = str9;
        }
        AnonymousClass0OS A0A3 = r5.A0A("is-revocable");
        if (!(A0A3 == null || (str7 = A0A3.A03) == null)) {
            this.A02 = str7;
        }
        AnonymousClass0OS A0A4 = r5.A0A("end-ts");
        if (!(A0A4 == null || (str6 = A0A4.A03) == null)) {
            this.A00 = C006803i.A04(str6, 0) * 1000;
        }
        AnonymousClass0OS A0A5 = r5.A0A("seq-no");
        if (!(A0A5 == null || (str5 = A0A5.A03) == null)) {
            this.A08 = str5;
        }
        AnonymousClass0OS A0A6 = r5.A0A("error-code");
        if (!(A0A6 == null || (str4 = A0A6.A03) == null)) {
            this.A01 = str4;
        }
        AnonymousClass0OS A0A7 = r5.A0A("mandate-update-info");
        if (!(A0A7 == null || (str3 = A0A7.A03) == null)) {
            this.A05 = str3;
        }
        AnonymousClass0OS A0A8 = r5.A0A("status");
        this.A06 = (A0A8 == null || (str = A0A8.A03) == null) ? "INIT" : str;
        AnonymousClass0OS A0A9 = r5.A0A("action");
        this.A04 = (A0A9 == null || (str2 = A0A9.A03) == null) ? "UNKNOWN" : str2;
    }

    public C60892sA(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.A07 = jSONObject.optString("pendingAmount", this.A07);
                this.A02 = jSONObject.optString("isRevocable", this.A02);
                this.A00 = jSONObject.optLong("mandateEndTs", this.A00);
                this.A03 = jSONObject.optString("mandateAmountRule", this.A03);
                this.A08 = jSONObject.optString("seqNum", this.A08);
                this.A01 = jSONObject.optString("errorCode", this.A01);
                this.A06 = jSONObject.optString("mandateUpdateStatus", this.A06);
                this.A04 = jSONObject.optString("mandateUpdateAction", this.A04);
                this.A05 = jSONObject.optString("mandateUpdateInfo", this.A05);
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata threw: ", e);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00() {
        /*
            r5 = this;
            java.lang.String r4 = r5.A04
            int r1 = r4.hashCode()
            r0 = 433141802(0x19d1382a, float:2.1632778E-23)
            r3 = 0
            r2 = 1
            if (r1 == r0) goto L_0x0025
            r0 = 1924835592(0x72baa908, float:7.3943754E30)
            if (r1 != r0) goto L_0x0039
            java.lang.String r0 = "ACCEPT"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "PENDING"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0025:
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0039
            java.lang.String r1 = r5.A06
            java.lang.String r0 = "INIT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0038:
            return r3
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60892sA.A00():boolean");
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ pendingAmount: ");
        A0S.append(C28051Sr.A16(this.A07));
        A0S.append(" errorCode: ");
        A0S.append(this.A01);
        A0S.append(" mandateAmountRule: ");
        A0S.append(C28051Sr.A16(this.A03));
        A0S.append(" isRevocable: ");
        A0S.append(C28051Sr.A16(this.A02));
        A0S.append(" seqNum: ");
        A0S.append(C28051Sr.A16(this.A08));
        A0S.append(" mandateUpdateInfo: ");
        A0S.append(this.A05);
        A0S.append(" mandateUpdateAction: ");
        A0S.append(this.A04);
        A0S.append(" mandateUpdateStatus: ");
        return AnonymousClass008.A0O(A0S, this.A06, "]");
    }
}
