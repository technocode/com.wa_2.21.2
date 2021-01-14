package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Y2  reason: invalid class name */
public final class AnonymousClass3Y2 extends AnonymousClass0RK {
    public static final Parcelable.Creator CREATOR = new C61682tZ();
    public int A00 = 1;

    @Override // X.AnonymousClass0RL, X.AnonymousClass0RK
    public void A02(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A01 = jSONObject.optLong("nextSyncTimeMillis", -1);
                }
                this.A03 = jSONObject.optString("dataHash");
            } catch (JSONException e) {
                Log.w("PAY: BrazilContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ ver: ");
        A0S.append(this.A00);
        A0S.append(" jid: ");
        A0S.append(this.A02);
        A0S.append(" isMerchant: ");
        A0S.append(this.A04);
        A0S.append(" defaultPaymentType: ");
        return AnonymousClass008.A0N(A0S, super.A00, " ]");
    }

    @Override // X.AnonymousClass0RK
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
    }
}
