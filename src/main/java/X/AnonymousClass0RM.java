package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0RM  reason: invalid class name */
public final class AnonymousClass0RM extends AnonymousClass0RK {
    public static final Parcelable.Creator CREATOR = new C60872s8();
    public int A00 = 1;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    @Override // X.AnonymousClass0RL, X.AnonymousClass0RK
    public void A02(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("v", 1);
                this.A00 = optInt;
                if (optInt == 1) {
                    this.A01 = jSONObject.optString("vpaHandle", null);
                    this.A02 = jSONObject.optString("vpaId", null);
                }
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiContactData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ ver: ");
        A0S.append(this.A00);
        A0S.append(" jid: ");
        A0S.append(super.A02);
        A0S.append(" vpaHandle: ");
        A0S.append(C28051Sr.A17(this.A01));
        A0S.append(" nodal: ");
        A0S.append(this.A03);
        A0S.append(" nodalAllowed: ");
        A0S.append(this.A04);
        A0S.append(" notifAllowed: ");
        A0S.append(this.A05);
        A0S.append(" ]");
        return A0S.toString();
    }

    @Override // X.AnonymousClass0RK
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(AnonymousClass1VY.A0D(super.A02));
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
