package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1X5  reason: invalid class name */
public class AnonymousClass1X5 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C62042u9();
    public final AnonymousClass3F5 A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public int describeContents() {
        return 0;
    }

    public AnonymousClass1X5(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() != 1 ? false : true;
        this.A00 = (AnonymousClass3F5) parcel.readParcelable(AnonymousClass3F5.class.getClassLoader());
    }

    public AnonymousClass1X5(String str, String str2, boolean z, AnonymousClass3F5 r4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = r4;
    }

    public static AnonymousClass1X5 A00(AnonymousClass0M5 r9) {
        AnonymousClass3F5 r1;
        try {
            String A0F = r9.A0F("step_up_id");
            String A0F2 = r9.A0F("service");
            boolean z = true;
            boolean z2 = false;
            if (r9.A05("sticky_service_hub_cta", 1) == 1) {
                z2 = true;
            }
            AnonymousClass0M5 A0E = r9.A0E("step_up_challenge");
            String A0F3 = A0E.A0F("challenge_id");
            AnonymousClass0M5 A0B = A0E.A0B();
            if (A0B.A00.equals("webview")) {
                try {
                    if (A0B.A05("auth_required", 1) != 1) {
                        z = false;
                    }
                    r1 = new AnonymousClass3F5(A0F3, z);
                } catch (AnonymousClass1XC e) {
                    Log.e("PAY: Can't build WebViewChallenge ", e);
                }
                return new AnonymousClass1X5(A0F2, A0F, z2, r1);
            }
            r1 = null;
            return new AnonymousClass1X5(A0F2, A0F, z2, r1);
        } catch (AnonymousClass1XC e2) {
            Log.e("PAY: PaymentStepUpInfo/fromProtocolTreeNode ", e2);
            return null;
        }
    }

    public JSONObject A01() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("service", this.A01);
            jSONObject.put("step_up_id", this.A02);
            jSONObject.put("sticky_service_hub_cta", this.A03);
            AnonymousClass3F5 r5 = this.A00;
            if (r5.A00.equals("WEBVIEW")) {
                if (r5 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("challenge_id", r5.A01);
                        jSONObject2.put("type", "WEBVIEW");
                        jSONObject2.put("auth_required", r5.A02);
                    } catch (JSONException e) {
                        Log.e("PAY: WebViewChallenge toJson threw exception ", e);
                    }
                    jSONObject.put("step_up_challenge", jSONObject2);
                    return jSONObject;
                }
                throw null;
            }
        } catch (JSONException e2) {
            Log.e("PAY: PaymentStepUpInfo toJson threw exception ", e2);
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeParcelable(this.A00, 0);
    }
}
