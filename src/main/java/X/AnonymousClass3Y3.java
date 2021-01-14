package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Y3  reason: invalid class name */
public class AnonymousClass3Y3 extends AbstractC43791yx {
    public static final Parcelable.Creator CREATOR = new C61732te();
    public long A00;
    public String A01;
    public String A02;
    public String A03;

    public int describeContents() {
        return 0;
    }

    @Override // X.AbstractC43791yx, X.AnonymousClass0RL
    public void A02(String str) {
        try {
            super.A02(str);
            JSONObject jSONObject = new JSONObject(str);
            this.A00 = jSONObject.optLong("expiryTs", this.A00);
            this.A03 = jSONObject.optString("nonce", this.A03);
            this.A02 = jSONObject.optString("deviceId", this.A02);
            this.A01 = jSONObject.optString("amount", this.A01);
        } catch (JSONException e) {
            Log.w("PAY: BrazilTransactionCountryData fromDBString threw: ", e);
        }
    }

    @Override // X.AbstractC43791yx
    public void A0A(AbstractC43791yx r6) {
        super.A0A(r6);
        AnonymousClass3Y3 r62 = (AnonymousClass3Y3) r6;
        long j = r62.A00;
        if (j > 0) {
            this.A00 = j;
        }
        String str = r62.A03;
        if (str != null) {
            this.A03 = str;
        }
        String str2 = r62.A02;
        if (str2 != null) {
            this.A02 = str2;
        }
        String str3 = r62.A01;
        if (str3 != null) {
            this.A01 = str3;
        }
    }

    @Override // X.AbstractC43791yx
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(super.A01 ? (byte) 1 : 0);
        parcel.writeParcelable(super.A00, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }
}
