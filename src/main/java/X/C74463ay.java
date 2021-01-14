package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3ay  reason: invalid class name and case insensitive filesystem */
public final class C74463ay extends AnonymousClass27v {
    public static final Parcelable.Creator CREATOR = new C60902sB();
    public int A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public ArrayList A0F;
    public boolean A0G;

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
                this.A05 = jSONObject.optInt("v", 1);
                this.A07 = jSONObject.optString("accountProvider", null);
                this.A06 = jSONObject.optString("accountHolderName", null);
                this.A02 = jSONObject.optInt("otpLength", -1);
                this.A00 = jSONObject.optInt("atmPinLength", -1);
                this.A04 = jSONObject.optInt("upiPinLength", -1);
                this.A0A = jSONObject.optString("miscBankInfo", null);
                this.A0D = jSONObject.optString("vpaHandle", null);
                this.A0E = jSONObject.optString("vpaId", null);
                this.A09 = jSONObject.optString("bankCode", null);
                this.A03 = jSONObject.optInt("pinFormat", 0);
                this.A0G = jSONObject.optBoolean("isMpinSet", false);
                this.A08 = jSONObject.optString("accountType", null);
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiMethodData fromDBString threw: ", e);
            }
        }
    }

    public String toString() {
        int i;
        StringBuilder A0S = AnonymousClass008.A0S("[ accountProvider: ");
        A0S.append(this.A07);
        A0S.append(" issuerName: ");
        A0S.append(super.A05);
        A0S.append(" bankImageUrl: ");
        A0S.append(super.A01);
        A0S.append(" icon length: ");
        byte[] bArr = super.A09;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        A0S.append(i);
        A0S.append(" isMpinSet: ");
        A0S.append(this.A0G);
        A0S.append(" otpLength: ");
        A0S.append(this.A02);
        A0S.append(" upiPinLength: ");
        A0S.append(this.A04);
        A0S.append(" atmPinLength: ");
        A0S.append(this.A00);
        A0S.append(" vpaHandle: ");
        A0S.append(C28051Sr.A17(this.A0D));
        A0S.append(" vpaId: ");
        A0S.append(this.A0E);
        A0S.append(" bankPhoneNumber: ");
        A0S.append(super.A02);
        A0S.append(" bankCode: ");
        A0S.append(this.A09);
        A0S.append(" pinFormat: ");
        A0S.append(this.A03);
        A0S.append(" pspRouting: ");
        A0S.append(this.A0F);
        A0S.append(" supportPhoneNumber: ");
        A0S.append(this.A0B);
        A0S.append(" transactionPrefix: ");
        A0S.append(this.A0C);
        A0S.append(" banksListVersion: ");
        return AnonymousClass008.A0N(A0S, this.A01, " ]");
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeString(super.A01);
        parcel.writeString(super.A02);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeStringList(this.A0F);
        byte[] bArr = super.A09;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        parcel.writeInt(length);
        byte[] bArr2 = super.A09;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeString(super.A04);
        parcel.writeString(super.A05);
        parcel.writeString(super.A06);
        parcel.writeLong(super.A00);
        parcel.writeInt(super.A07 ? 1 : 0);
        parcel.writeInt(super.A08 ? 1 : 0);
        parcel.writeString(this.A08);
    }
}
