package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3I7  reason: invalid class name */
public class AnonymousClass3I7 extends AnonymousClass0SD {
    public AbstractC005102k A00;
    public C02270Bi A01 = new C02270Bi();
    public AnonymousClass1VM A02;
    public AnonymousClass0MH A03;
    public AnonymousClass3EC A04;
    public C08580bN A05 = new C08580bN();
    public String A06;
    public boolean A07;
    public final AnonymousClass02M A08;
    public final AnonymousClass01X A09;
    public final C018709t A0A;
    public final AnonymousClass0AD A0B;
    public final C01970Ad A0C;
    public final AnonymousClass3EL A0D;
    public final C018809u A0E = C018809u.A00("IndiaUpiMandatePaymentViewModel", "payment-settings", "IN");
    public final AnonymousClass00T A0F;

    public AnonymousClass3I7(AbstractC005102k r4, AnonymousClass02M r5, AnonymousClass00T r6, C018709t r7, AnonymousClass01X r8, C01970Ad r9, C018609s r10, AnonymousClass0AD r11, String str, AnonymousClass1VM r13, AnonymousClass3EL r14, AnonymousClass3EC r15, boolean z, String str2) {
        this.A00 = r4;
        this.A08 = r5;
        this.A0F = r6;
        this.A0A = r7;
        this.A09 = r8;
        this.A0C = r9;
        this.A0B = r11;
        this.A03 = r10.A0L(str);
        this.A02 = r13;
        this.A0D = r14;
        this.A04 = r15;
        this.A07 = z;
        this.A06 = str2;
    }

    public void A02(C63312wD r19) {
        C05900Qy r0;
        String str;
        String A012;
        String A013;
        int i = r19.A00;
        if (i == 0) {
            if (!this.A07) {
                AnonymousClass1VM A082 = this.A0A.A08(this.A03.A0D);
                this.A02 = A082;
                if (A082 == null) {
                    C63322wE r3 = new C63322wE(3);
                    AnonymousClass01X r2 = this.A09;
                    r3.A05 = r2.A06(R.string.upi_mandate_revoke_missing_payment_method_title);
                    r3.A04 = r2.A06(R.string.upi_mandate_revoke_missing_payment_method);
                    this.A05.A07(r3);
                    return;
                }
            }
            C02270Bi r32 = this.A01;
            String A062 = this.A09.A06(R.string.register_wait_message);
            C63402wM r02 = new C63402wM();
            r02.A00 = A062;
            r32.A07(r02);
            this.A0D.A00();
        } else if (i == 1) {
            String str2 = r19.A01;
            if (this.A07) {
                AnonymousClass3XM r4 = (AnonymousClass3XM) this.A03.A07;
                C74463ay r5 = (C74463ay) this.A02.A06;
                C018809u r22 = this.A0E;
                AnonymousClass00E.A04(r5, r22.A02(r22.A02, "onListKeys: Cannot get IndiaUpiMethodData").toString());
                C63322wE r33 = new C63322wE(0);
                r33.A07 = str2;
                r33.A06 = this.A02.A08;
                r33.A01 = r5.A04;
                r33.A03 = r4;
                C60892sA r23 = r4.A06.A02;
                if (r23 != null) {
                    r4.A0D = r23.A08;
                }
                if (r23 == null || (str = r23.A07) == null) {
                    r0 = this.A03.A06;
                } else {
                    r0 = C05900Qy.A00(str, C05880Qw.A01.A5z());
                }
                r33.A02 = r0;
                r33.A09 = this.A02.A0A;
                r33.A08 = r4.A09;
                this.A05.A07(r33);
                return;
            }
            AnonymousClass3XM r52 = (AnonymousClass3XM) this.A03.A07;
            C74463ay r42 = (C74463ay) this.A02.A06;
            C018809u r24 = this.A0E;
            AnonymousClass00E.A04(r42, r24.A02(r24.A02, "onListKeys: Cannot get IndiaUpiMethodData").toString());
            C63322wE r34 = new C63322wE(0);
            r34.A07 = str2;
            AnonymousClass1VM r25 = this.A02;
            r34.A06 = r25.A08;
            r34.A01 = r42.A04;
            r34.A03 = r52;
            r52.A0D = this.A06;
            r34.A02 = this.A03.A06;
            r34.A09 = r25.A0A;
            r34.A08 = r52.A09;
            this.A05.A07(r34);
        } else if (i == 2) {
            HashMap hashMap = r19.A02;
            this.A0E.A07(null, "handleCredentialBlob", null);
            C02270Bi r35 = this.A01;
            String A063 = this.A09.A06(R.string.register_wait_message);
            C63402wM r03 = new C63402wM();
            r03.A00 = A063;
            r35.A07(r03);
            AnonymousClass0MH r12 = this.A03;
            C60892sA r26 = ((AnonymousClass3XM) r12.A07).A06.A02;
            if (this.A07) {
                AnonymousClass3EC r04 = this.A04;
                AnonymousClass1VM r14 = this.A02;
                C69683Hz r15 = new C69683Hz(this, r26);
                if (r04 != null) {
                    Log.i("PAY: acceptPayeeMandate called");
                    ArrayList arrayList = new ArrayList();
                    AnonymousClass008.A1F("action", "upi-accept-mandate-request", arrayList);
                    r04.A02(arrayList, r12);
                    if (!(hashMap == null || (A013 = C60922sD.A01(hashMap, "MPIN")) == null)) {
                        AnonymousClass008.A1F("mpin", A013, arrayList);
                    }
                    if (r14 != null) {
                        arrayList.add(new AnonymousClass0OS("credential-id", r14.A07, null, (byte) 0));
                        String str3 = ((C74463ay) r14.A06).A0A;
                        if (str3 != null) {
                            AnonymousClass008.A1F("upi-bank-info", str3, arrayList);
                        }
                    }
                    AnonymousClass3EC.A00(arrayList, r26, r12, null);
                    ((C61432tA) r04).A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74603bC(r04.A00, r04.A01, r04.A02, r04.A03, ((C61432tA) r04).A00, r15), 0);
                    return;
                }
                throw null;
            }
            AnonymousClass3EC r36 = this.A04;
            AnonymousClass1VM r142 = this.A02;
            String str4 = this.A06;
            AnonymousClass3I0 r152 = new AnonymousClass3I0(this);
            if (r36 != null) {
                Log.i("PAY: revokePayerMandate called");
                ArrayList arrayList2 = new ArrayList();
                AnonymousClass008.A1F("action", "upi-revoke-mandate", arrayList2);
                r36.A02(arrayList2, r12);
                AnonymousClass3EC.A00(arrayList2, null, r12, str4);
                if (!(hashMap == null || (A012 = C60922sD.A01(hashMap, "MPIN")) == null)) {
                    AnonymousClass008.A1F("mpin", A012, arrayList2);
                }
                if (r142 != null) {
                    arrayList2.add(new AnonymousClass0OS("credential-id", r142.A07, null, (byte) 0));
                    String str5 = ((C74463ay) r142.A06).A0A;
                    if (str5 != null) {
                        AnonymousClass008.A1F("upi-bank-info", str5, arrayList2);
                    }
                }
                C61082sT r10 = ((C61432tA) r36).A00;
                if (r10 != null) {
                    r10.A03("upi-revoke-mandate");
                }
                ((C61432tA) r36).A01.A09(true, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList2.toArray(new AnonymousClass0OS[0]), null, null), new C74613bD(r36.A00, r36.A01, r36.A02, r36.A03, r10, r152), 0);
                return;
            }
            throw null;
        }
    }
}
