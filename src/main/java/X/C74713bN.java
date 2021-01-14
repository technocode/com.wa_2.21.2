package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3bN  reason: invalid class name and case insensitive filesystem */
public class C74713bN extends AnonymousClass27v {
    public static final Parcelable.Creator CREATOR = new C61652tW();
    public int A00;
    public int A01 = 1;
    public String A02;
    public String A03;
    public boolean A04;

    public int describeContents() {
        return 0;
    }

    @Override // X.AnonymousClass0RL
    public void A02(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                super.A01 = jSONObject.optString("bankImageURL", null);
                super.A02 = jSONObject.optString("bankPhoneNumber", null);
                this.A01 = jSONObject.optInt("v", 1);
                this.A05 = jSONObject.optString("bankName");
                this.A02 = jSONObject.optString("bankCode");
                this.A00 = jSONObject.optInt("verificationStatus");
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: BrazilBankAccountMethodData fromDBString threw: ");
                sb.append(e);
                Log.w(sb.toString());
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ credentialId: ");
        A0S.append(super.A04);
        A0S.append("maskedAccountNumber: ");
        A0S.append(this.A06);
        A0S.append(" bankName: ");
        A0S.append(this.A05);
        A0S.append(" bankCode: ");
        A0S.append(this.A02);
        A0S.append(" verificationStatus: ");
        A0S.append(this.A00);
        A0S.append(" bankShortName: ");
        A0S.append(this.A03);
        A0S.append(" acceptSavings: ");
        A0S.append(this.A04);
        A0S.append("]");
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(super.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(super.A03);
        parcel.writeString(super.A04);
        parcel.writeString(this.A06);
        parcel.writeLong(super.A00);
    }
}
