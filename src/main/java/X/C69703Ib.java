package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3Ib  reason: invalid class name and case insensitive filesystem */
public class C69703Ib extends AnonymousClass0SD {
    public AbstractC005102k A00;
    public AnonymousClass0Yj A01 = new AnonymousClass0Yj();
    public AnonymousClass0Yj A02 = new AnonymousClass0Yj();
    public C02270Bi A03 = new C02270Bi();
    public final AnonymousClass02M A04;
    public final C000300f A05;
    public final AnonymousClass04j A06;
    public final AnonymousClass00S A07;
    public final AnonymousClass00G A08;
    public final AnonymousClass00D A09;
    public final C68393Da A0A;
    public final AnonymousClass0GP A0B;
    public final C03340Fu A0C;
    public final C02020Ai A0D;

    public C69703Ib(AbstractC005102k r5, AnonymousClass00S r6, AnonymousClass02M r7, AnonymousClass00G r8, C000300f r9, AnonymousClass00D r10, AnonymousClass04j r11, C03340Fu r12, C02020Ai r13, AnonymousClass0GP r14, C68393Da r15) {
        this.A00 = r5;
        this.A07 = r6;
        this.A04 = r7;
        this.A08 = r8;
        this.A05 = r9;
        this.A09 = r10;
        this.A06 = r11;
        this.A0C = r12;
        this.A0D = r13;
        this.A0B = r14;
        this.A0A = r15;
        this.A02.A07(new C63892xB(0, -1));
        this.A01.A07(new C61992u4());
        this.A01.A09(this.A03, new AnonymousClass3IW(this));
    }

    public C61992u4 A02() {
        Object A012 = this.A01.A01();
        if (A012 != null) {
            return (C61992u4) A012;
        }
        throw null;
    }

    public final void A03(int i) {
        if (this.A05.A0D(AbstractC000400g.A20)) {
            this.A02.A07(new C63892xB(2, -1));
            C68393Da r8 = this.A0A;
            synchronized (r8) {
                String[] strArr = {"signedQrCode", "signedQrCodeTs"};
                try {
                    C02010Ah r7 = r8.A02;
                    String A032 = r7.A03();
                    if (!TextUtils.isEmpty(A032)) {
                        JSONObject jSONObject = new JSONObject(A032);
                        int i2 = 0;
                        do {
                            jSONObject.remove(strArr[i2]);
                            i2++;
                        } while (i2 < 2);
                        AnonymousClass008.A0q(r7, "payments_setup_country_specific_info", jSONObject.toString());
                    }
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteFromPaymentInfo for keys threw: ", e);
                }
            }
            C61992u4 A022 = A02();
            A022.A06 = null;
            this.A01.A07(A022);
            AnonymousClass3EM r10 = new AnonymousClass3EM(this.A08.A00, this.A06, this.A0C, new C61082sT(), this.A04, this.A0B);
            String A052 = A02().A05();
            AnonymousClass3IX r72 = new AnonymousClass3IX(this, i);
            ((C61432tA) r10).A01.A09(false, new AnonymousClass0M5("account", new AnonymousClass0OS[]{new AnonymousClass0OS("action", "upi-sign-qr-code", null, (byte) 0), new AnonymousClass0OS("qr-code", A052, null, (byte) 0)}, null, null), new C74683bK(r10.A00, r10.A01, r10.A02, r10.A03, ((C61432tA) r10).A00, r72), 0);
            return;
        }
        this.A02.A07(new C63892xB(0, i));
    }

    public void A04(int i, C63882xA r10) {
        String str;
        if (i == 0) {
            String[] A0J = this.A0A.A0J();
            if (!this.A05.A0D(AbstractC000400g.A20) || (!TextUtils.isEmpty(A0J[0]) && !TextUtils.isEmpty(A0J[1]) && this.A07.A05() - Long.parseLong(A0J[1]) <= 259200000)) {
                this.A02.A07(new C63892xB(0, -1));
                return;
            }
            A03(-1);
        } else if (i == 1) {
            this.A02.A07(new C63892xB(1, -1));
        } else if (i == 2 || i == 3) {
            A03(-1);
        } else if (i == 4) {
            if (r10 != null) {
                str = r10.A00;
            } else {
                str = "";
            }
            A05(str, 0);
        }
    }

    public final void A05(String str, int i) {
        C61992u4 r4 = (C61992u4) this.A01.A01();
        if (str.equals(r4.A03)) {
            this.A02.A07(new C63892xB(3, i));
            return;
        }
        C02020Ai r1 = this.A0D;
        C05900Qy A7X = r1.A01().A7X();
        C05900Qy A002 = C05900Qy.A00(str, r1.A01().A5z());
        if (A002 == null || A002.A00.compareTo(A7X.A00) < 0) {
            r4.A03 = null;
            this.A01.A07(r4);
            this.A02.A07(new C63892xB(0, i));
            return;
        }
        r4.A03 = str;
        this.A01.A07(r4);
        A03(i);
    }
}
