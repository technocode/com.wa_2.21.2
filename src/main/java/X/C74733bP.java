package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3bP  reason: invalid class name and case insensitive filesystem */
public class C74733bP extends AbstractC59432ne {
    public static final Parcelable.Creator CREATOR = new C61702tb();
    public int A00 = 0;
    public int A01 = 1;
    public String A02;
    public String A03;
    public String A04;

    public int describeContents() {
        return 0;
    }

    @Override // X.AnonymousClass0RL
    public void A02(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                super.A00 = jSONObject.optInt("state", 0);
                this.A06 = jSONObject.optString("merchantId", null);
                this.A08 = jSONObject.optString("supportPhoneNumber", null);
                super.A02 = jSONObject.optString("businessName", null);
                String optString = jSONObject.optString("displayState", null);
                if (TextUtils.isEmpty(optString)) {
                    optString = "VERIFIED";
                }
                this.A05 = optString;
                this.A07 = jSONObject.optString("p2mReceive", "WAIT_ACTIVE");
                super.A00 = jSONObject.optInt("state", 0);
                this.A06 = jSONObject.optString("merchantId", null);
                this.A08 = jSONObject.optString("supportPhoneNumber", null);
                this.A02 = jSONObject.optString("dashboardUrl", null);
                this.A04 = jSONObject.optString("notificationType", null);
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: BrazilMerchantMethodData fromDBString threw: ");
                sb.append(e);
                Log.w(sb.toString());
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ merchantId: ");
        String str = this.A06;
        A0S.append(str);
        A0S.append(" state: ");
        A0S.append(super.A00);
        A0S.append(" supportPhoneNumber: ");
        A0S.append(this.A08);
        A0S.append(" dashboardUrl: ");
        A0S.append(this.A02);
        A0S.append(" merchantId: ");
        A0S.append(str);
        A0S.append(" businessName: ");
        A0S.append(super.A02);
        A0S.append(" displayState: ");
        return AnonymousClass008.A0O(A0S, this.A05, "]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(super.A00);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeString(super.A02);
        parcel.writeString(this.A05);
        parcel.writeString(super.A03);
        parcel.writeString(super.A04);
        parcel.writeLong(super.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
    }
}
