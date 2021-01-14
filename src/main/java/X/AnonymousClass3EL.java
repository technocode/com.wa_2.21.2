package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3EL  reason: invalid class name */
public class AnonymousClass3EL extends C61432tA {
    public AbstractC61462tD A00;
    public final Context A01;
    public final AnonymousClass02M A02;
    public final AnonymousClass01I A03;
    public final AnonymousClass04j A04;
    public final C68393Da A05;
    public final C01980Ae A06;
    public final AnonymousClass0GP A07;
    public final C02020Ai A08;
    public final C01970Ad A09;
    public final C68683Ed A0A;
    public final C63842x6 A0B;

    public AnonymousClass3EL(Context context, AnonymousClass02M r3, AnonymousClass01I r4, C63842x6 r5, C01970Ad r6, AnonymousClass04j r7, C01980Ae r8, C60922sD r9, C03340Fu r10, C02020Ai r11, C68683Ed r12, AnonymousClass0GP r13, C68393Da r14, AbstractC61462tD r15) {
        super(r10, r9.A04);
        this.A01 = context;
        this.A02 = r3;
        this.A03 = r4;
        this.A0B = r5;
        this.A09 = r6;
        this.A04 = r7;
        this.A06 = r8;
        this.A08 = r11;
        this.A0A = r12;
        this.A07 = r13;
        this.A05 = r14;
        this.A00 = r15;
    }

    public void A00() {
        this.A0A.AQ7();
        Log.i("PAY: IndiaUpiPaymentSetup sendGetListKeys called");
        String A062 = this.A05.A06();
        if (!TextUtils.isEmpty(A062)) {
            StringBuilder A0S = AnonymousClass008.A0S("PAY: IndiaUpiPaymentSetup got cached listkeys; callback: ");
            A0S.append(this.A00);
            Log.i(A0S.toString());
            AbstractC61462tD r0 = this.A00;
            if (r0 != null) {
                r0.AH0(A062, null);
                return;
            }
            return;
        }
        C61082sT r10 = super.A00;
        r10.A03("upi-list-keys");
        Log.i("PAY: IndiaUPIPaymentBankSetup sendGetListKeys");
        super.A01.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "upi-list-keys", null, (byte) 0)}, null, null), new C74643bG(this, this.A01, this.A02, this.A04, this.A07, r10), 0);
    }

    public void A01(String str, UserJid userJid, String str2, String str3, String str4, String str5, HashMap hashMap, String str6, String str7, String str8) {
        String A012;
        this.A0A.AQ7();
        Log.i("PAY: IndiaUpiPaymentSetup sendCheckPin called");
        C61082sT r10 = super.A00;
        r10.A03("upi-check-mpin");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "upi-check-mpin", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("credential-id", str, null, (byte) 0));
        if (userJid != null) {
            arrayList.add(new AnonymousClass0OS("receiver", userJid));
            arrayList.add(new AnonymousClass0OS("sender-vpa", str2, null, (byte) 0));
            if (!TextUtils.isEmpty(str3)) {
                arrayList.add(new AnonymousClass0OS("sender-vpa-id", str3, null, (byte) 0));
            }
            arrayList.add(new AnonymousClass0OS("receiver-vpa", str4, null, (byte) 0));
            if (!TextUtils.isEmpty(str5)) {
                arrayList.add(new AnonymousClass0OS("receiver-vpa-id", str5, null, (byte) 0));
            }
        }
        arrayList.add(new AnonymousClass0OS("device-id", this.A0B.A02(), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("seq-no", str6, null, (byte) 0));
        if (!(hashMap == null || (A012 = C60922sD.A01(hashMap, "MPIN")) == null)) {
            arrayList.add(new AnonymousClass0OS("mpin", A012, null, (byte) 0));
        }
        if (str7 != null) {
            arrayList.add(new AnonymousClass0OS("amount", str7, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(str8)) {
            arrayList.add(new AnonymousClass0OS("request-id", str8, null, (byte) 0));
        }
        if (!TextUtils.isEmpty(null)) {
            arrayList.add(new AnonymousClass0OS("upi-bank-info", null, null, (byte) 0));
        }
        super.A01.A09(false, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74663bI(this, this.A01, this.A02, this.A04, this.A07, r10), 0);
    }

    public final void A02(String str, String str2, String str3, String str4, HashMap hashMap, String str5) {
        this.A0A.AQ7();
        Log.i("PAY: IndiaUpiPaymentSetup sendChangePin called");
        C61082sT r12 = super.A00;
        r12.A03("upi-change-mpin");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "upi-change-mpin", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AnonymousClass0OS("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new AnonymousClass0OS("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("credential-id", str4, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("device-id", this.A0B.A02(), null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("seq-no", str5, null, (byte) 0));
        if (hashMap != null) {
            String A012 = C60922sD.A01(hashMap, "MPIN");
            if (A012 != null) {
                arrayList.add(new AnonymousClass0OS("old-mpin", A012, null, (byte) 0));
            }
            String A013 = C60922sD.A01(hashMap, "NMPIN");
            if (A013 != null) {
                arrayList.add(new AnonymousClass0OS("new-mpin", A013, null, (byte) 0));
            }
        }
        super.A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74673bJ(this, this.A01, this.A02, this.A04, this.A07, r12), 0);
    }

    public final void A03(String str, String str2, String str3, String str4, HashMap hashMap, String str5, String str6, String str7, String str8, AbstractC62022u7 r30) {
        this.A0A.AQ7();
        Log.i("PAY: IndiaUpiPaymentSetup sendSetPin called");
        C61082sT r12 = super.A00;
        r12.A03("upi-set-mpin");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "upi-set-mpin", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("vpa", str, null, (byte) 0));
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AnonymousClass0OS("vpa-id", str2, null, (byte) 0));
        }
        arrayList.add(new AnonymousClass0OS("upi-bank-info", str3, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("credential-id", str4, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("device-id", this.A0B.A02(), null, (byte) 0));
        if (hashMap != null) {
            String A012 = C60922sD.A01(hashMap, "SMS");
            if (A012 != null) {
                arrayList.add(new AnonymousClass0OS("otp", A012, null, (byte) 0));
            }
            String A013 = C60922sD.A01(hashMap, "MPIN");
            if (A013 != null) {
                arrayList.add(new AnonymousClass0OS("mpin", A013, null, (byte) 0));
            }
            String A014 = C60922sD.A01(hashMap, "ATMPIN");
            if (A014 != null) {
                arrayList.add(new AnonymousClass0OS("atm-pin", A014, null, (byte) 0));
            }
        }
        arrayList.add(new AnonymousClass0OS("debit-last-6", str5, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("debit-exp-month", str6, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("debit-exp-year", str7, null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("default-debit", "1", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("default-credit", "1", null, (byte) 0));
        arrayList.add(new AnonymousClass0OS("seq-no", str8, null, (byte) 0));
        super.A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74653bH(this, this.A01, this.A02, this.A04, this.A07, r12, r30), 0);
    }
}
