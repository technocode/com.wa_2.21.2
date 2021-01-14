package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3bO  reason: invalid class name and case insensitive filesystem */
public class C74723bO extends AbstractC460627w {
    public static final Parcelable.Creator CREATOR = new C61662tX();
    public int A00 = 0;
    public int A01;
    public int A02 = 1;
    public String A03 = null;
    public String A04;
    public String A05;
    public String A06 = null;
    public boolean A07;

    public int describeContents() {
        return 0;
    }

    @Override // X.AnonymousClass0RL
    public void A02(String str) {
        String str2;
        String str3;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.A0X = jSONObject.optBoolean("verified", false);
                this.A0A = jSONObject.optString("bankName", null);
                this.A08 = jSONObject.optString("bankCode", null);
                this.A0B = jSONObject.optString("bankPhoneNumber", null);
                this.A09 = jSONObject.optString("bankLogoUrl", this.A09);
                super.A06 = jSONObject.optLong("timeLastAdded", -1);
                this.A0O = jSONObject.optString("verificationType", null);
                this.A0T = jSONObject.optBoolean("otpNumberMatch", false);
                super.A02 = jSONObject.optInt("otpLength", 8);
                String optString = jSONObject.optString("displayState", null);
                if (TextUtils.isEmpty(optString)) {
                    optString = "ACTIVE";
                }
                this.A0I = optString;
                this.A0S = jSONObject.optBoolean("editable", false);
                this.A0W = jSONObject.optBoolean("verifiable", false);
                this.A0R = jSONObject.optBoolean("defaultEligible", false);
                if (!this.A0V || !"ACTIVE".equals(this.A0I)) {
                    str2 = "DISABLED";
                } else {
                    str2 = this.A0X ? "ENABLED" : "REQUIRES_VERIFICATION";
                }
                this.A0N = jSONObject.optString("p2pSend", str2);
                this.A0M = jSONObject.optString("p2pReceive", A07());
                if (!this.A0U || !"ACTIVE".equals(this.A0I)) {
                    str3 = "DISABLED";
                } else {
                    str3 = this.A0X ? "ENABLED" : "REQUIRES_VERIFICATION";
                }
                this.A0L = jSONObject.optString("p2mSend", str3);
                this.A0K = jSONObject.optString("p2mReceive", "DISABLED");
                this.A02 = jSONObject.optInt("v", 1);
                super.A03 = jSONObject.optInt("paymentRails", 0);
                this.A0V = jSONObject.optBoolean("p2pEligible", false);
                this.A0U = jSONObject.optBoolean("p2mEligible", false);
                this.A07 = jSONObject.optBoolean("needsDeviceBinding", false);
                this.A03 = jSONObject.optString("bindingType", null);
                this.A06 = jSONObject.optString("tokenId", null);
                this.A0C = jSONObject.optString("cardImageContentId", null);
                this.A0E = jSONObject.optString("cardImageUrl", null);
                this.A0D = jSONObject.optString("cardImageLabelColor", null);
                this.A0J = jSONObject.optString("lastFour", null);
                super.A07 = Long.valueOf(jSONObject.optLong("cardDataUpdatedTimeMillis", 0));
                this.A05 = jSONObject.optString("notificationType", null);
                this.A0F = jSONObject.optString("cardState", "UNSET");
                this.A01 = jSONObject.optInt("verificationStatus");
            } catch (JSONException e) {
                StringBuilder sb = new StringBuilder("PAY: BrazilCardMethodData fromDBString threw: ");
                sb.append(e);
                Log.w(sb.toString());
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[ verified: ");
        A0S.append(this.A0X);
        A0S.append(" accountType: ");
        A0S.append(super.A00);
        A0S.append(" bankName: ");
        A0S.append(this.A0A);
        A0S.append(" bankPhoneNumber: ");
        A0S.append(this.A0B);
        A0S.append(" bankLogoUrl: ");
        A0S.append(this.A09);
        A0S.append(" verificationType: ");
        A0S.append(this.A0O);
        A0S.append(" otpNumberMatch: ");
        A0S.append(this.A0T);
        A0S.append(" paymentRails: ");
        A0S.append(super.A03);
        A0S.append(" p2pEligible: ");
        A0S.append(this.A0V);
        A0S.append(" p2mEligible: ");
        A0S.append(this.A0U);
        A0S.append(" timeLastAdded: ");
        A0S.append(super.A06);
        A0S.append(" needsDeviceBinding: ");
        A0S.append(this.A07);
        A0S.append(" bindingType: ");
        A0S.append(this.A03);
        A0S.append(" cardImageContentId: ");
        A0S.append(this.A0C);
        A0S.append(" cardImageUrl: ");
        A0S.append(this.A0E);
        A0S.append(" cardImageLabelColor: ");
        A0S.append(this.A0D);
        A0S.append(" notificationType: ");
        A0S.append(this.A05);
        A0S.append(" lastFour: ");
        A0S.append(this.A0J);
        A0S.append("payoutVerificationStatus: ");
        A0S.append(this.A01);
        A0S.append(" displayState: ");
        A0S.append(this.A0I);
        StringBuilder sb = new StringBuilder(" capabilities { editable: ");
        sb.append(this.A0S);
        sb.append(", verifiable: ");
        sb.append(this.A0W);
        sb.append(", defaultEligible: ");
        sb.append(this.A0R);
        sb.append(", p2pSend: ");
        sb.append(this.A0N);
        sb.append(", p2pReceive: ");
        sb.append(this.A0M);
        sb.append(", p2mSend: ");
        sb.append(this.A0L);
        sb.append(", p2mReceive: ");
        sb.append(this.A0K);
        sb.append("}");
        A0S.append(sb.toString());
        A0S.append(" ]");
        return A0S.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0O);
        parcel.writeByte(this.A0T ? (byte) 1 : 0);
        parcel.writeInt(super.A03);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeByte(this.A0U ? (byte) 1 : 0);
        parcel.writeLong(super.A06);
        parcel.writeInt(super.A04);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0H);
        parcel.writeInt(super.A00);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeString(this.A0J);
        parcel.writeLong(super.A05);
        parcel.writeInt(super.A01);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeLong(super.A07.longValue());
        parcel.writeString(this.A05);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0I);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0K);
    }
}
