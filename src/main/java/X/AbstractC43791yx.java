package X;

import android.os.Parcel;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1yx  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC43791yx extends AnonymousClass0RL {
    public AnonymousClass2bX A00;
    public boolean A01;

    @Override // X.AnonymousClass0RL
    public void A02(String str) {
        AnonymousClass2bX r0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.A01 = jSONObject.optBoolean("messageDeleted", false);
            JSONObject optJSONObject = jSONObject.optJSONObject("money");
            if (optJSONObject != null) {
                new AnonymousClass2bX(0, 1, C05880Qw.A02);
                long optLong = optJSONObject.optLong("value", -1);
                int optInt = optJSONObject.optInt("offset", -1);
                AbstractC05890Qx A012 = AnonymousClass1VK.A01(optJSONObject.optString("currency", C05880Qw.A02.A5e()));
                if (optInt <= 0) {
                    r0 = new AnonymousClass2bX(optLong, 1, A012);
                } else {
                    r0 = new AnonymousClass2bX(optLong, optInt, A012);
                }
                this.A00 = r0;
            }
        } catch (JSONException e) {
            Log.w("PAY: PaymentTransactionCountryData fromDBString threw: ", e);
        }
    }

    public int A03() {
        if (!(this instanceof AnonymousClass3Y3)) {
            return ((AnonymousClass3XM) this).A00;
        }
        return 0;
    }

    public long A04() {
        if (!(this instanceof AnonymousClass3Y3)) {
            return ((AnonymousClass3XM) this).A04;
        }
        return ((AnonymousClass3Y3) this).A00;
    }

    public String A05() {
        if (!(this instanceof AnonymousClass3Y3)) {
            return ((AnonymousClass3XM) this).A0D;
        }
        return null;
    }

    public String A06() {
        if (!(this instanceof AnonymousClass3Y3)) {
            return ((AnonymousClass3XM) this).A09;
        }
        return null;
    }

    public String A07() {
        if (!(this instanceof AnonymousClass3Y3)) {
            return ((AnonymousClass3XM) this).A0B;
        }
        return null;
    }

    public String A08() {
        if (!(this instanceof AnonymousClass3Y3)) {
            AnonymousClass3XM r3 = (AnonymousClass3XM) this;
            try {
                JSONObject A09 = r3.A09();
                A09.put("v", r3.A03);
                String str = r3.A0D;
                if (str != null) {
                    A09.put("seqNum", str);
                }
                String str2 = r3.A07;
                if (str2 != null) {
                    A09.put("deviceId", str2);
                }
                long j = r3.A04;
                if (j > 0) {
                    A09.put("expiryTs", j);
                }
                int i = r3.A01;
                if (i > 0) {
                    A09.put("previousStatus", i);
                }
                String str3 = r3.A09;
                if (str3 != null) {
                    A09.put("receiverVpa", str3);
                }
                String str4 = r3.A0A;
                if (str4 != null) {
                    A09.put("receiverVpaId", str4);
                }
                String str5 = r3.A0B;
                if (str5 != null) {
                    A09.put("senderVpa", str5);
                }
                String str6 = r3.A0C;
                if (str6 != null) {
                    A09.put("senderVpaId", str6);
                }
                int i2 = r3.A00;
                if (i2 > 0) {
                    A09.put("counter", i2);
                }
                int i3 = r3.A02;
                if (i3 > 0) {
                    A09.put("previousType", i3);
                }
                String str7 = r3.A0H;
                if (str7 != null) {
                    A09.put("url", str7);
                }
                String str8 = r3.A0E;
                if (str8 != null) {
                    A09.put("syncStatus", str8);
                }
                String str9 = r3.A0F;
                if (str9 != null) {
                    A09.put("upiBankInfo", str9);
                }
                C60882s9 r0 = r3.A06;
                if (r0 != null) {
                    A09.put("indiaUpiMandateMetadata", r0.A00());
                }
                return A09.toString();
            } catch (JSONException e) {
                Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e);
                return null;
            }
        } else {
            AnonymousClass3Y3 r6 = (AnonymousClass3Y3) this;
            try {
                JSONObject A092 = r6.A09();
                long j2 = r6.A00;
                if (j2 > 0) {
                    A092.put("expiryTs", j2);
                }
                String str10 = r6.A03;
                if (str10 != null) {
                    A092.put("nonce", str10);
                }
                String str11 = r6.A01;
                if (str11 != null) {
                    A092.put("amount", str11);
                }
                String str12 = r6.A02;
                if (str12 != null) {
                    A092.put("deviceId", str12);
                }
                return A092.toString();
            } catch (JSONException e2) {
                Log.w("PAY: BrazilTransactionCountryData toDBString threw: ", e2);
                return null;
            }
        }
    }

    public JSONObject A09() {
        JSONObject jSONObject = new JSONObject();
        boolean z = this.A01;
        if (z) {
            jSONObject.put("messageDeleted", z);
        }
        AnonymousClass2bX r8 = this.A00;
        if (r8 != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                double doubleValue = r8.A02.A00.doubleValue();
                int i = r8.A00;
                jSONObject2.put("value", (int) (doubleValue * ((double) i)));
                jSONObject2.put("offset", i);
                jSONObject2.put("currency", r8.A01.A5e());
            } catch (JSONException e) {
                Log.w("PAY: PaymentMoney toJson threw: ", e);
            }
            jSONObject.put("money", jSONObject2);
        }
        return jSONObject;
    }

    public void A0A(AbstractC43791yx r2) {
        this.A01 = r2.A01;
        this.A00 = r2.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A00, 0);
    }
}
