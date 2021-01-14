package X;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiChangePinActivity;
import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiResetPinActivity;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.1DU  reason: invalid class name */
public abstract class AnonymousClass1DU extends AnonymousClass1PY implements AbstractC61462tD {
    public static final HashMap A0L;
    public int A00;
    public AbstractC60932sE A01 = new C69343Gr(this);
    public C60942sF A02;
    public C61082sT A03;
    public AnonymousClass3EL A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass01I A0A = AnonymousClass01I.A00();
    public final AnonymousClass01X A0B = AnonymousClass01X.A00();
    public final C60922sD A0C = C60922sD.A00();
    public final C68393Da A0D = C68393Da.A00();
    public final AnonymousClass0GP A0E = AnonymousClass0GP.A00();
    public final C02010Ah A0F = C02010Ah.A00();
    public final C02020Ai A0G = C02020Ai.A00();
    public final C01970Ad A0H = C01970Ad.A00();
    public final C68683Ed A0I = C68683Ed.A00();
    public final C018809u A0J = C018809u.A00("IndiaUpiPinHandlerActivity", "payment-settings", "IN");
    public final C63842x6 A0K = C63842x6.A00();

    static {
        HashMap hashMap = new HashMap();
        A0L = hashMap;
        hashMap.put("karur vysya bank", 8);
        A0L.put("dena bank", 4);
    }

    public static final JSONObject A04(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("payerBankName", str);
            jSONObject.put("backgroundColor", "#FFFFFF");
            jSONObject.put("color", "#00FF00");
            if (z) {
                jSONObject.put("resendOTPFeature", "true");
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public Dialog A0d(int i, String str, int i2, int i3, Runnable runnable) {
        C018809u r2 = this.A0J;
        StringBuilder sb = new StringBuilder("IndiaUpiPinHandlerActivity showMessageDialog id:");
        sb.append(i);
        sb.append(" message:");
        sb.append(str);
        r2.A07(null, sb.toString(), null);
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        AnonymousClass0MC r3 = r4.A01;
        r3.A0E = str;
        AnonymousClass01X r22 = this.A0B;
        r4.A07(r22.A06(i2), new DialogInterface$OnClickListenerC62632v6(this, i, runnable));
        r4.A05(r22.A06(i3), new DialogInterface$OnClickListenerC62622v5(this, i));
        r3.A0J = true;
        r3.A02 = new DialogInterface$OnCancelListenerC62612v4(this, i);
        return r4.A00();
    }

    public final String A0e(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (i <= 0) {
                i = 4;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "PIN");
            jSONObject2.put("subtype", "MPIN");
            jSONObject2.put("dType", "NUM");
            jSONObject2.put("dLength", i);
            jSONArray.put(jSONObject2);
            jSONObject.put("CredAllowed", jSONArray);
            return jSONObject.toString();
        } catch (JSONException e) {
            this.A0J.A08("createCredRequired threw: ", e);
            return null;
        }
    }

    public final JSONArray A0f(String str, String str2, C05900Qy r9, String str3, String str4, String str5) {
        JSONArray jSONArray = new JSONArray();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONArray.put(new JSONObject().putOpt("name", this.A0B.A06(R.string.payinfo_payeename)).putOpt("value", str));
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONArray.put(new JSONObject().putOpt("name", this.A0B.A06(R.string.payinfo_account)).putOpt("value", str2));
            }
            if (!TextUtils.isEmpty(str4)) {
                jSONArray.put(new JSONObject().putOpt("name", this.A0B.A06(R.string.payinfo_refid)).putOpt("value", str4));
            }
            if (r9 != null) {
                jSONArray.put(new JSONObject().putOpt("name", this.A0B.A06(R.string.payinfo_txnamount)).putOpt("value", r9.toString()));
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONArray.put(new JSONObject().putOpt("name", this.A0B.A06(R.string.payinfo_mobilenumber)).putOpt("value", str3));
            }
            if (!TextUtils.isEmpty(str5)) {
                jSONArray.put(new JSONObject().putOpt("name", this.A0B.A06(R.string.payinfo_refurl)).putOpt("value", str5));
            }
            return jSONArray;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public final JSONObject A0g(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("txnId", str);
            jSONObject.put("deviceId", this.A05);
            jSONObject.put("appId", "com.whatsapp");
            jSONObject.put("mobileNumber", this.A07);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void A0h() {
        if (this instanceof IndiaUpiResetPinActivity) {
            C002001d.A2O(this, 19);
        } else if (this instanceof IndiaUpiPaymentActivity) {
            this.A08 = false;
            C002001d.A2O(this, 19);
        } else if (this instanceof IndiaUpiMandatePaymentActivity) {
            ((ActivityC004702f) this).A0K.A00();
            C002001d.A2O(this, 19);
        } else if (!(this instanceof IndiaUpiCheckBalanceActivity)) {
            C002001d.A2O(this, 19);
        }
    }

    public void A0i() {
        if (this instanceof IndiaUpiResetPinActivity) {
            IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) this;
            indiaUpiResetPinActivity.A0n(C69293Gm.A00(0, ((AnonymousClass1DU) indiaUpiResetPinActivity).A03));
        } else if (this instanceof IndiaUpiPaymentActivity) {
            IndiaUpiPaymentActivity indiaUpiPaymentActivity = (IndiaUpiPaymentActivity) this;
            ((ActivityC004702f) indiaUpiPaymentActivity).A0K.A00();
            int A002 = C69293Gm.A00(0, ((AnonymousClass1DU) indiaUpiPaymentActivity).A03);
            if (A002 == R.string.payments_bank_generic_error) {
                A002 = R.string.payments_bank_error_when_pay;
            }
            indiaUpiPaymentActivity.A0u(A002, new Object[0]);
        } else if (this instanceof IndiaUpiMandatePaymentActivity) {
            int A003 = C69293Gm.A00(0, this.A03);
            A0a();
            if (A003 == 0) {
                A003 = R.string.payments_generic_error;
            }
            overridePendingTransition(0, 0);
            APo(A003);
        } else if (!(this instanceof IndiaUpiCheckBalanceActivity)) {
            int A004 = C69293Gm.A00(0, this.A03);
            A0a();
            if (A004 == 0) {
                A004 = R.string.payments_change_pin_error;
            }
            APo(A004);
        } else {
            finish();
        }
    }

    public void A0j() {
        UserJid of;
        C007003k A022;
        UserJid userJid;
        if (this instanceof IndiaUpiResetPinActivity) {
            IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) this;
            if (!((AnonymousClass1DU) indiaUpiResetPinActivity).A03.A06.contains("pin-entry-ui")) {
                C018809u r2 = indiaUpiResetPinActivity.A0F;
                StringBuilder A0S = AnonymousClass008.A0S("showMainPaneAfterPayAppRegistered: bankAccount: ");
                A0S.append(indiaUpiResetPinActivity.A04);
                A0S.append(" inSetup: ");
                A0S.append(((AnonymousClass1PY) indiaUpiResetPinActivity).A09);
                r2.A07(null, A0S.toString(), null);
                if (indiaUpiResetPinActivity.A04 == null) {
                    C10080e0 r22 = indiaUpiResetPinActivity.A06;
                    if (r22 == null) {
                        r22 = new C10080e0(indiaUpiResetPinActivity);
                        indiaUpiResetPinActivity.A06 = r22;
                    }
                    ((AnonymousClass1PY) indiaUpiResetPinActivity).A0D.ANC(r22, new Void[0]);
                    return;
                }
                indiaUpiResetPinActivity.A0m();
            }
        } else if (this instanceof IndiaUpiPaymentActivity) {
            IndiaUpiPaymentActivity indiaUpiPaymentActivity = (IndiaUpiPaymentActivity) this;
            AnonymousClass02N r23 = ((AbstractActivityC34761jB) indiaUpiPaymentActivity).A02;
            boolean A0Y = AnonymousClass1VY.A0Y(r23);
            if (!A0Y || ((AbstractActivityC34761jB) indiaUpiPaymentActivity).A03 != null) {
                if (A0Y) {
                    of = ((AbstractActivityC34761jB) indiaUpiPaymentActivity).A03;
                } else {
                    of = UserJid.of(r23);
                }
                indiaUpiPaymentActivity.A03 = of;
                if (indiaUpiPaymentActivity.ABY()) {
                    A022 = null;
                } else {
                    A022 = indiaUpiPaymentActivity.A0N.A02(indiaUpiPaymentActivity.A03);
                }
                indiaUpiPaymentActivity.A00 = A022;
                if (TextUtils.isEmpty(((AnonymousClass1PY) indiaUpiPaymentActivity).A07) && indiaUpiPaymentActivity.A03 != null) {
                    C10100e2 r24 = new C10100e2(indiaUpiPaymentActivity);
                    indiaUpiPaymentActivity.A07 = r24;
                    ((AnonymousClass1PY) indiaUpiPaymentActivity).A0D.ANC(r24, new Void[0]);
                    indiaUpiPaymentActivity.A0G(R.string.register_wait_message);
                } else if ((TextUtils.isEmpty(((AnonymousClass1PY) indiaUpiPaymentActivity).A07) || !indiaUpiPaymentActivity.A0R.A03(((AnonymousClass1PY) indiaUpiPaymentActivity).A07)) && ((userJid = indiaUpiPaymentActivity.A03) == null || !indiaUpiPaymentActivity.A0I.A0H(UserJid.of(userJid)))) {
                    indiaUpiPaymentActivity.A0t();
                } else {
                    indiaUpiPaymentActivity.A0V.A01(indiaUpiPaymentActivity, indiaUpiPaymentActivity.A03, ((AnonymousClass1PY) indiaUpiPaymentActivity).A07, true, false, new C69033Fm(indiaUpiPaymentActivity));
                }
            } else {
                indiaUpiPaymentActivity.A0W();
            }
        } else if (!(this instanceof IndiaUpiMandatePaymentActivity) && !(this instanceof IndiaUpiCheckBalanceActivity)) {
            IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
            if (!((AnonymousClass1DU) indiaUpiChangePinActivity).A03.A06.contains("pin-entry-ui")) {
                if (!(indiaUpiChangePinActivity.getIntent() == null || indiaUpiChangePinActivity.getIntent().getExtras() == null)) {
                    indiaUpiChangePinActivity.A02 = (C43751yt) indiaUpiChangePinActivity.getIntent().getExtras().get("extra_bank_account");
                }
                if (indiaUpiChangePinActivity.A02 == null) {
                    ((AnonymousClass1PY) indiaUpiChangePinActivity).A0D.ANC(new C10110e4(indiaUpiChangePinActivity), new Void[0]);
                } else {
                    indiaUpiChangePinActivity.A0m();
                }
            }
        }
    }

    public void A0k(String str, String str2, int i, AnonymousClass3XM r27, C05900Qy r28, String str3, String str4, String str5) {
        C018809u r8 = this.A0J;
        r8.A07(null, "getCredentials for pin check called", null);
        byte[] A0I2 = this.A0D.A0I();
        String A0e = A0e(i);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(A0e) || A0I2 == null) {
            r8.A07(null, "getCredentials for set got empty xml or controls or token", null);
            A0h();
            return;
        }
        JSONObject A042 = A04(str2, false);
        String str6 = r27.A0D;
        String obj = r28.toString();
        String str7 = r27.A0B;
        String str8 = r27.A09;
        JSONObject A0g = A0g(str6);
        try {
            A0g.put("txnAmount", obj);
            A0g.put("payerAddr", str7);
            A0g.put("payeeAddr", str8);
            r8.A03("getKeySaltWithTransactionDetails");
            String A002 = AnonymousClass3BE.A00(r27.A0D, r28.toString(), "com.whatsapp", this.A05, this.A07, r27.A0B, r27.A09);
            r8.A03("decrypted trust params");
            try {
                byte[] A0e2 = AnonymousClass1YV.A0e(AnonymousClass1YV.A0c(A002), A0I2);
                String encodeToString = Base64.encodeToString(A0e2, 2);
                StringBuilder sb = new StringBuilder();
                sb.append("getKeyTrustWithTransactionDetails: trust: ");
                sb.append(A0e2);
                r8.A03(sb.toString());
                Intent putExtra = new Intent(getApplicationContext(), GetCredential.class).putExtra("keyCode", "NPCI").putExtra("keyXmlPayload", str).putExtra("controls", A0e).putExtra("configuration", A042.toString()).putExtra("salt", A0g.toString()).putExtra("payInfo", A0f(str4, str3, r28, str5, ((AnonymousClass1PY) this).A06, ((AnonymousClass1PY) this).A05).toString()).putExtra("trust", encodeToString).putExtra("languagePref", this.A0B.A0I().toString());
                putExtra.setFlags(536870912);
                A0H(putExtra, 200);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0l(java.lang.String r21, java.lang.String r22, java.lang.String r23, X.C74463ay r24, int r25, java.lang.String r26) {
        /*
        // Method dump skipped, instructions count: 529
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DU.A0l(java.lang.String, java.lang.String, java.lang.String, X.3ay, int, java.lang.String):void");
    }

    @Override // X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200) {
            boolean z = false;
            if (i2 == 250) {
                HashMap hashMap = (HashMap) intent.getSerializableExtra("credBlocks");
                C018809u r3 = this.A0J;
                StringBuilder sb = new StringBuilder("onLibraryResult for credentials: ");
                sb.append(hashMap);
                r3.A05(sb.toString());
                if (hashMap != null && !hashMap.isEmpty()) {
                    z = true;
                }
                AnonymousClass00E.A07(z);
                if (this instanceof IndiaUpiResetPinActivity) {
                    IndiaUpiResetPinActivity indiaUpiResetPinActivity = (IndiaUpiResetPinActivity) this;
                    indiaUpiResetPinActivity.A03.setText(((AnonymousClass1DU) indiaUpiResetPinActivity).A0B.A06(R.string.payments_upi_pin_setup_wait_message));
                    indiaUpiResetPinActivity.A0C = hashMap;
                    C43751yt r6 = indiaUpiResetPinActivity.A04;
                    C74463ay r5 = (C74463ay) r6.A06;
                    AnonymousClass00E.A04(r5, "could not cast country data to IndiaUpiMethodData");
                    AnonymousClass3EL r14 = ((AnonymousClass1DU) indiaUpiResetPinActivity).A04;
                    String str = r5.A0D;
                    String str2 = r5.A0E;
                    String str3 = r5.A0A;
                    String str4 = r6.A07;
                    String str5 = indiaUpiResetPinActivity.A09;
                    String str6 = indiaUpiResetPinActivity.A07;
                    String str7 = indiaUpiResetPinActivity.A08;
                    String str8 = indiaUpiResetPinActivity.A0B;
                    AnonymousClass3G1 r11 = new AnonymousClass3G1(indiaUpiResetPinActivity);
                    if (r14 == null) {
                        throw null;
                    } else if (TextUtils.isEmpty(str)) {
                        AnonymousClass3EB r10 = new AnonymousClass3EB(r14.A01, r14.A02, r14.A03, r14.A09, r14.A04, ((C61432tA) r14).A01, r14.A0A, r14.A07, r14.A05, null);
                        AnonymousClass3EJ r2 = new AnonymousClass3EJ(r14, str3, str4, hashMap, str5, str6, str7, str8, r11);
                        AnonymousClass01I r0 = r10.A02;
                        r0.A04();
                        r10.A00(r0.A03, new AnonymousClass3EA(r10, r2));
                    } else {
                        r14.A03(str, str2, str3, str4, hashMap, str5, str6, str7, str8, r11);
                    }
                } else if (this instanceof IndiaUpiPaymentActivity) {
                    IndiaUpiPaymentActivity indiaUpiPaymentActivity = (IndiaUpiPaymentActivity) this;
                    if (indiaUpiPaymentActivity.A02 != null) {
                        ((AnonymousClass1DU) indiaUpiPaymentActivity).A0C.A08 = hashMap;
                        indiaUpiPaymentActivity.A0r();
                        ((ActivityC004702f) indiaUpiPaymentActivity).A0K.A00();
                        indiaUpiPaymentActivity.A0G(R.string.register_wait_message);
                        AnonymousClass3EL r4 = ((AnonymousClass1DU) indiaUpiPaymentActivity).A04;
                        String str9 = indiaUpiPaymentActivity.A02.A07;
                        UserJid userJid = indiaUpiPaymentActivity.A03;
                        AnonymousClass3XM r1 = indiaUpiPaymentActivity.A04;
                        r4.A01(str9, userJid, r1.A0B, r1.A0C, r1.A09, r1.A0A, hashMap, r1.A0D, indiaUpiPaymentActivity.A01.toString(), ((AnonymousClass1DU) indiaUpiPaymentActivity).A06);
                    }
                } else if (this instanceof IndiaUpiMandatePaymentActivity) {
                    IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) this;
                    indiaUpiMandatePaymentActivity.A06.A07(null, "onGetCredentials called", null);
                    C63312wD r12 = new C63312wD(2);
                    r12.A02 = hashMap;
                    indiaUpiMandatePaymentActivity.A00.A02(r12);
                } else if (!(this instanceof IndiaUpiCheckBalanceActivity)) {
                    IndiaUpiChangePinActivity indiaUpiChangePinActivity = (IndiaUpiChangePinActivity) this;
                    C74463ay r52 = (C74463ay) indiaUpiChangePinActivity.A02.A06;
                    C018809u r42 = indiaUpiChangePinActivity.A04;
                    AnonymousClass00E.A04(r52, r42.A02(r42.A02, "IndiaUpiChangePinActivity could not cast country data to IndiaUpiMethodData").toString());
                    AnonymousClass3EL r32 = ((AnonymousClass1DU) indiaUpiChangePinActivity).A04;
                    String str10 = r52.A0D;
                    String str11 = r52.A0E;
                    String str12 = r52.A0A;
                    String str13 = indiaUpiChangePinActivity.A02.A07;
                    String str14 = indiaUpiChangePinActivity.A03;
                    if (r32 == null) {
                        throw null;
                    } else if (TextUtils.isEmpty(str10)) {
                        AnonymousClass3EB r53 = new AnonymousClass3EB(r32.A01, r32.A02, r32.A03, r32.A09, r32.A04, ((C61432tA) r32).A01, r32.A0A, r32.A07, r32.A05, null);
                        AnonymousClass3EK r62 = new AnonymousClass3EK(r32, str12, str13, hashMap, str14);
                        AnonymousClass01I r02 = r53.A02;
                        r02.A04();
                        r53.A00(r02.A03, new AnonymousClass3EA(r53, r62));
                    } else {
                        r32.A02(str10, str11, str12, str13, hashMap, str14);
                    }
                } else {
                    IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity = (IndiaUpiCheckBalanceActivity) this;
                    indiaUpiCheckBalanceActivity.A06.A07(null, "onGetCredentials called", null);
                    C63282wA r13 = new C63282wA(2);
                    r13.A02 = hashMap;
                    indiaUpiCheckBalanceActivity.A01.A02(r13);
                }
            } else if (i2 == 251) {
                A0h();
            } else if (i2 == 252) {
                this.A0J.A07(null, "user canceled", null);
                this.A09 = false;
                if (this.A08) {
                    this.A08 = false;
                    return;
                }
                A0Z();
                finish();
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass1PY, X.AbstractActivityC34761jB, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01I r12 = this.A0A;
        r12.A04();
        UserJid userJid = r12.A03;
        if (userJid != null) {
            String str = userJid.user;
            if (str != null) {
                this.A07 = str;
                C63842x6 r0 = this.A0K;
                this.A05 = r0.A02();
                C60922sD r11 = this.A0C;
                this.A03 = r11.A04;
                AnonymousClass02M r15 = ((ActivityC004702f) this).A0F;
                AnonymousClass00T r10 = ((AnonymousClass1PY) this).A0D;
                C02010Ah r9 = this.A0F;
                AnonymousClass04j r8 = ((ActivityC004702f) this).A0H;
                C03340Fu r7 = ((AbstractActivityC34761jB) this).A0J;
                C02020Ai r6 = this.A0G;
                C68683Ed r5 = this.A0I;
                AnonymousClass0GP r4 = this.A0E;
                C68393Da r3 = this.A0D;
                this.A02 = new C60942sF(this, r15, r12, r10, r0, r9, r8, r7, r6, r5, r4, r3, getApplicationContext(), this.A01, this.A03);
                if (getIntent() != null) {
                    this.A06 = getIntent().getStringExtra("extra_request_id");
                }
                if (bundle != null) {
                    this.A09 = bundle.getBoolean("payAppShowPinErrorSavedInst");
                    this.A00 = bundle.getInt("showPinConfirmCountSavedInst");
                    ((AnonymousClass1PY) this).A01 = bundle.getInt("setupModeSavedInst", 1);
                }
                this.A04 = new AnonymousClass3EL(this, r15, r12, r0, this.A0H, r8, ((AbstractActivityC34761jB) this).A0I, r11, r7, r6, r5, r4, r3, this);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 19) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r4 = new AnonymousClass0MB(this);
        AnonymousClass01X r3 = this.A0B;
        String A062 = r3.A06(R.string.payments_pin_encryption_error);
        AnonymousClass0MC r2 = r4.A01;
        r2.A0E = A062;
        r4.A07(r3.A06(R.string.yes), new DialogInterface$OnClickListenerC62652v8(this));
        r4.A05(r3.A06(R.string.no), new DialogInterface$OnClickListenerC62642v7(this));
        r2.A0J = true;
        r2.A02 = new DialogInterface$OnCancelListenerC62602v3(this);
        return r4.A00();
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3EL r1 = this.A04;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A01 = null;
    }

    @Override // X.AbstractActivityC34761jB, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("payAppShowPinErrorSavedInst", this.A09);
        bundle.putInt("showPinConfirmCountSavedInst", this.A00);
        bundle.putInt("setupModeSavedInst", ((AnonymousClass1PY) this).A01);
    }
}
