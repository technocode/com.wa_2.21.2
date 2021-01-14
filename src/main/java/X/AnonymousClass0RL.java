package X;

import android.os.Parcelable;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0RL  reason: invalid class name */
public abstract class AnonymousClass0RL implements Parcelable {
    public abstract void A02(String str);

    public String A00() {
        if ((this instanceof AnonymousClass3Y3) || (this instanceof AnonymousClass3XM)) {
            return null;
        }
        if (this instanceof AnonymousClass3DY) {
            throw new UnsupportedOperationException("PAY: IndiaUpiPaymentData does not support toDBString");
        } else if (this instanceof C74733bP) {
            C74733bP r4 = (C74733bP) this;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("state", ((AbstractC59432ne) r4).A00);
                if (!TextUtils.isEmpty(r4.A06)) {
                    jSONObject.put("merchantId", r4.A06);
                }
                if (!TextUtils.isEmpty(r4.A08)) {
                    jSONObject.put("supportPhoneNumber", r4.A08);
                }
                if (!TextUtils.isEmpty(((AbstractC59432ne) r4).A02)) {
                    jSONObject.put("businessName", ((AbstractC59432ne) r4).A02);
                }
                if (!TextUtils.isEmpty(r4.A05)) {
                    jSONObject.put("displayState", r4.A05);
                }
                try {
                    jSONObject.put("p2mReceive", r4.A07);
                } catch (JSONException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PAY: PaymentMethodMerchantCountryData/addCapabilitiesToJson threw: ");
                    sb.append(e);
                    Log.w(sb.toString());
                }
            } catch (JSONException e2) {
                StringBuilder sb2 = new StringBuilder("PAY: MerchantMethodData toDBJSONObject threw: ");
                sb2.append(e2);
                Log.w(sb2.toString());
            }
            try {
                jSONObject.put("v", 1);
                if (!TextUtils.isEmpty(r4.A02)) {
                    jSONObject.put("dashboardUrl", r4.A02);
                }
                if (!TextUtils.isEmpty(r4.A04)) {
                    jSONObject.put("notificationType", r4.A04);
                }
                return jSONObject.toString();
            } catch (JSONException e3) {
                StringBuilder sb3 = new StringBuilder("PAY: BrazilMerchantMethodData toDBString threw: ");
                sb3.append(e3);
                Log.w(sb3.toString());
                return null;
            }
        } else if (this instanceof C74723bO) {
            C74723bO r3 = (C74723bO) this;
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("verified", r3.A0X);
                    String str = r3.A0A;
                    if (str != null) {
                        jSONObject2.put("bankName", str);
                    }
                    String str2 = r3.A08;
                    if (str2 != null) {
                        jSONObject2.put("bankCode", str2);
                    }
                    String str3 = r3.A0B;
                    if (str3 != null) {
                        jSONObject2.put("bankPhoneNumber", str3);
                    }
                    String str4 = r3.A09;
                    if (str4 != null) {
                        jSONObject2.put("bankLogoUrl", str4);
                    }
                    long j = ((AbstractC460627w) r3).A06;
                    if (j >= 0) {
                        jSONObject2.put("timeLastAdded", j);
                    }
                    String str5 = r3.A0O;
                    if (str5 != null) {
                        jSONObject2.put("verificationType", str5);
                    }
                    if ("otp".equals(r3.A0O)) {
                        jSONObject2.put("otpNumberMatch", r3.A0T);
                    }
                    int i = ((AbstractC460627w) r3).A02;
                    if (i >= 0) {
                        jSONObject2.put("otpLength", i);
                    }
                    String str6 = r3.A0I;
                    if (str6 != null) {
                        jSONObject2.put("displayState", str6);
                    }
                    try {
                        jSONObject2.put("editable", r3.A0S);
                        jSONObject2.put("verifiable", r3.A0W);
                        jSONObject2.put("defaultEligible", r3.A0R);
                        jSONObject2.put("p2pSend", r3.A0N);
                        jSONObject2.put("p2pReceive", r3.A0M);
                        jSONObject2.put("p2mSend", r3.A0L);
                        jSONObject2.put("p2mReceive", r3.A0K);
                    } catch (JSONException e4) {
                        StringBuilder sb4 = new StringBuilder("PAY: PaymentMethodCardCountryData/addCapabilitiesToJson threw: ");
                        sb4.append(e4);
                        Log.w(sb4.toString());
                    }
                } catch (JSONException e5) {
                    StringBuilder sb5 = new StringBuilder("PAY: PaymentMethodCardCountryData toJSONObject threw: ");
                    sb5.append(e5);
                    Log.w(sb5.toString());
                }
                jSONObject2.put("v", r3.A02);
                jSONObject2.put("paymentRails", ((AbstractC460627w) r3).A03);
                jSONObject2.put("needsDeviceBinding", r3.A07);
                String str7 = r3.A03;
                if (str7 != null) {
                    jSONObject2.put("bindingType", str7);
                }
                String str8 = r3.A06;
                if (str8 != null) {
                    jSONObject2.put("tokenId", str8);
                }
                String str9 = r3.A0C;
                if (str9 != null) {
                    jSONObject2.put("cardImageContentId", str9);
                }
                String str10 = r3.A0E;
                if (str10 != null) {
                    jSONObject2.put("cardImageUrl", str10);
                }
                String str11 = r3.A0D;
                if (str11 != null) {
                    jSONObject2.put("cardImageLabelColor", str11);
                }
                String str12 = r3.A0J;
                if (str12 != null) {
                    jSONObject2.put("lastFour", str12);
                }
                Long l = ((AbstractC460627w) r3).A07;
                if (l != null) {
                    jSONObject2.put("cardDataUpdatedTimeMillis", l);
                }
                jSONObject2.put("notificationType", r3.A05);
                jSONObject2.put("cardState", r3.A0F);
                jSONObject2.put("p2pEligible", r3.A0V);
                jSONObject2.put("p2mEligible", r3.A0U);
                jSONObject2.put("verificationStatus", r3.A01);
                return jSONObject2.toString();
            } catch (JSONException e6) {
                StringBuilder sb6 = new StringBuilder("PAY: BrazilCardMethodData toDBString threw: ");
                sb6.append(e6);
                Log.w(sb6.toString());
                return null;
            }
        } else if (this instanceof C74713bN) {
            C74713bN r32 = (C74713bN) this;
            try {
                JSONObject A07 = r32.A07();
                A07.put("v", r32.A01);
                A07.put("bankName", r32.A05);
                A07.put("bankCode", r32.A02);
                A07.put("verificationStatus", r32.A00);
                return A07.toString();
            } catch (JSONException e7) {
                StringBuilder sb7 = new StringBuilder("PAY: BrazilBankAccountMethodData toDBString threw: ");
                sb7.append(e7);
                Log.w(sb7.toString());
                return null;
            }
        } else if (!(this instanceof C74463ay)) {
            AnonymousClass0RK r6 = (AnonymousClass0RK) this;
            if (r6 instanceof AnonymousClass3Y2) {
                AnonymousClass3Y2 r62 = (AnonymousClass3Y2) r6;
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("v", r62.A00);
                    long j2 = r62.A01;
                    if (j2 != -1) {
                        jSONObject3.put("nextSyncTimeMillis", j2);
                    }
                    if (!TextUtils.isEmpty(r62.A03)) {
                        jSONObject3.put("dataHash", r62.A03);
                    }
                    return jSONObject3.toString();
                } catch (JSONException e8) {
                    Log.w("PAY: BrazilContactData toDBString threw: ", e8);
                    return null;
                }
            } else if (!(r6 instanceof AnonymousClass0RM)) {
                return null;
            } else {
                AnonymousClass0RM r63 = (AnonymousClass0RM) r6;
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("v", r63.A00);
                    String str13 = r63.A01;
                    if (str13 != null) {
                        jSONObject4.put("vpaHandle", str13);
                    }
                    String str14 = r63.A02;
                    if (str14 != null) {
                        jSONObject4.put("vpaId", str14);
                    }
                    return jSONObject4.toString();
                } catch (JSONException e9) {
                    Log.w("PAY: IndiaUpiContactData toDBString threw: ", e9);
                    return null;
                }
            }
        } else {
            C74463ay r33 = (C74463ay) this;
            try {
                JSONObject A072 = r33.A07();
                A072.put("v", r33.A05);
                String str15 = r33.A07;
                if (str15 != null) {
                    A072.put("accountProvider", str15);
                }
                if (!TextUtils.isEmpty(r33.A06)) {
                    A072.put("accountHolderName", r33.A06);
                }
                int i2 = r33.A02;
                if (i2 >= 0) {
                    A072.put("otpLength", i2);
                }
                int i3 = r33.A00;
                if (i3 >= 0) {
                    A072.put("atmPinLength", i3);
                }
                int i4 = r33.A04;
                if (i4 >= 0) {
                    A072.put("upiPinLength", i4);
                }
                String str16 = r33.A0A;
                if (str16 != null) {
                    A072.put("miscBankInfo", str16);
                }
                String str17 = r33.A0D;
                if (str17 != null) {
                    A072.put("vpaHandle", str17);
                }
                String str18 = r33.A0E;
                if (str18 != null) {
                    A072.put("vpaId", str18);
                }
                String str19 = r33.A09;
                if (str19 != null) {
                    A072.put("bankCode", str19);
                }
                int i5 = r33.A03;
                if (i5 >= 0) {
                    A072.put("pinFormat", i5);
                }
                A072.put("isMpinSet", r33.A0G);
                String str20 = r33.A08;
                if (str20 != null) {
                    A072.put("accountType", str20);
                }
                return A072.toString();
            } catch (JSONException e10) {
                Log.w("PAY: IndiaUpiMethodData toDBString threw: ", e10);
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r1 == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r1 != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r10, X.AnonymousClass0M5 r11) {
        /*
        // Method dump skipped, instructions count: 2106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RL.A01(int, X.0M5):void");
    }
}
