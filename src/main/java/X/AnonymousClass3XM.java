package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3XM  reason: invalid class name */
public final class AnonymousClass3XM extends AbstractC43791yx {
    public static final Parcelable.Creator CREATOR = new C60952sG();
    public int A00;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 1;
    public long A04;
    public long A05 = -1;
    public C60882s9 A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;

    public int describeContents() {
        return 0;
    }

    @Override // X.AbstractC43791yx, X.AnonymousClass0RL
    public void A02(String str) {
        try {
            super.A02(str);
            JSONObject jSONObject = new JSONObject(str);
            this.A03 = jSONObject.optInt("v", 1);
            this.A0D = jSONObject.optString("seqNum", this.A0D);
            this.A00 = jSONObject.optInt("counter", 0);
            this.A07 = jSONObject.optString("deviceId", this.A07);
            this.A0B = jSONObject.optString("senderVpa", this.A0B);
            this.A0C = jSONObject.optString("senderVpaId", this.A0C);
            this.A09 = jSONObject.optString("receiverVpa", this.A09);
            this.A0A = jSONObject.optString("receiverVpaId", this.A0A);
            this.A0G = jSONObject.optString("blob", this.A0G);
            this.A04 = jSONObject.optLong("expiryTs", this.A04);
            this.A01 = jSONObject.optInt("previousStatus", this.A01);
            this.A02 = jSONObject.optInt("previousType", this.A02);
            this.A0H = jSONObject.optString("url", this.A0H);
            this.A0F = jSONObject.optString("upiBankInfo", this.A0F);
            this.A0E = jSONObject.optString("syncStatus", this.A0E);
            if (jSONObject.has("indiaUpiMandateMetadata")) {
                this.A06 = new C60882s9(jSONObject.optString("indiaUpiMandateMetadata", null));
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata fromDBString threw: ", e);
        }
    }

    @Override // X.AbstractC43791yx
    public void A0A(AbstractC43791yx r8) {
        super.A0A(r8);
        AnonymousClass3XM r82 = (AnonymousClass3XM) r8;
        String str = r82.A0D;
        if (str != null) {
            this.A0D = str;
        }
        String str2 = r82.A07;
        if (str2 != null) {
            this.A07 = str2;
        }
        String str3 = r82.A09;
        if (str3 != null) {
            this.A09 = str3;
        }
        String str4 = r82.A0A;
        if (str4 != null) {
            this.A0A = str4;
        }
        String str5 = r82.A0B;
        if (str5 != null) {
            this.A0B = str5;
        }
        String str6 = r82.A0C;
        if (str6 != null) {
            this.A0C = str6;
        }
        long j = r82.A04;
        if (j > 0) {
            this.A04 = j;
        }
        int i = r82.A01;
        if (i > 0) {
            this.A01 = i;
        }
        int i2 = r82.A00;
        if (i2 > 0) {
            this.A00 = i2;
        }
        int i3 = r82.A02;
        if (i3 > 0) {
            this.A02 = i3;
        }
        String str7 = r82.A0H;
        if (str7 != null) {
            this.A0H = str7;
        }
        String str8 = r82.A0F;
        if (str8 != null) {
            this.A0F = str8;
        }
        String str9 = r82.A0E;
        if (str9 != null) {
            this.A0E = str9;
        }
        C60882s9 r4 = r82.A06;
        if (r4 != null) {
            C60882s9 r3 = this.A06;
            if (r3 != null) {
                String str10 = r4.A07;
                if (str10 != null) {
                    r3.A07 = str10;
                }
                String str11 = r4.A05;
                if (str11 != null) {
                    r3.A05 = str11;
                }
                String str12 = r4.A04;
                if (str12 != null) {
                    r3.A04 = str12;
                }
                r3.A09 = r4.A09;
                r3.A0A = r4.A0A;
                long j2 = r4.A01;
                if (j2 > 0) {
                    r3.A01 = j2;
                }
                long j3 = r4.A00;
                if (j3 > 0) {
                    r3.A00 = j3;
                }
                String str13 = r4.A08;
                if (str13 != null) {
                    r3.A08 = str13;
                }
                String str14 = r4.A06;
                if (str14 != null) {
                    r3.A06 = str14;
                }
                String str15 = r4.A03;
                if (str15 != null) {
                    r3.A03 = str15;
                }
                r3.A02 = r4.A02;
                return;
            }
            throw null;
        }
    }

    public String toString() {
        String obj;
        int i;
        C60882s9 r0 = this.A06;
        if (r0 == null) {
            obj = "null";
        } else {
            obj = r0.toString();
        }
        StringBuilder A0S = AnonymousClass008.A0S("[ seq-no: ");
        A0S.append(C28051Sr.A16(this.A0D));
        A0S.append(" timestamp: ");
        A0S.append(this.A05);
        A0S.append(" deviceId: ");
        A0S.append(this.A07);
        A0S.append(" sender: ");
        A0S.append(C28051Sr.A17(this.A0B));
        A0S.append(" senderVpaId: ");
        A0S.append(this.A0C);
        A0S.append(" receiver: ");
        A0S.append(C28051Sr.A17(this.A09));
        A0S.append(" receiverVpaId: ");
        A0S.append(C28051Sr.A17(this.A0A));
        A0S.append(" encryptedKeyLength: ");
        String str = this.A0G;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        A0S.append(i);
        A0S.append(" previousType: ");
        A0S.append(this.A02);
        A0S.append(" previousStatus: ");
        A0S.append(this.A01);
        A0S.append(" url: ");
        A0S.append(C28051Sr.A16(this.A0H));
        A0S.append(" upiBankInfo: ");
        A0S.append(C28051Sr.A16(this.A0F));
        A0S.append(" indiaUpiMandateMetadata: {");
        A0S.append(obj);
        A0S.append("} ]");
        return A0S.toString();
    }

    @Override // X.AbstractC43791yx
    public void writeToParcel(Parcel parcel, int i) {
        String A002;
        parcel.writeByte(super.A01 ? (byte) 1 : 0);
        parcel.writeParcelable(super.A00, 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeLong(this.A05);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0E);
        C60882s9 r0 = this.A06;
        if (r0 == null) {
            A002 = null;
        } else {
            A002 = r0.A00();
        }
        parcel.writeString(A002);
    }
}
