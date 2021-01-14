package X;

import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.3I5  reason: invalid class name */
public class AnonymousClass3I5 extends AnonymousClass0SD {
    public AbstractC005102k A00;
    public C02270Bi A01 = new C02270Bi();
    public C08580bN A02 = new C08580bN();
    public final AnonymousClass01X A03;
    public final C43751yt A04;
    public final AnonymousClass3EI A05;
    public final AnonymousClass3EL A06;
    public final C018809u A07 = C018809u.A00("IndiaUpiCheckPinViewModel", "onboarding", "IN");
    public final String A08;

    public AnonymousClass3I5(AbstractC005102k r4, AnonymousClass01X r5, AnonymousClass3EL r6, AnonymousClass3EI r7, C43751yt r8, String str) {
        this.A00 = r4;
        this.A03 = r5;
        this.A06 = r6;
        this.A05 = r7;
        this.A04 = r8;
        this.A08 = str;
    }

    public void A02(C63282wA r20) {
        String A012;
        int i = r20.A00;
        if (i == 0) {
            C02270Bi r2 = this.A01;
            String A062 = this.A03.A06(R.string.register_wait_message);
            C63402wM r0 = new C63402wM();
            r0.A00 = A062;
            r2.A07(r0);
            this.A06.A00();
        } else if (i == 1) {
            String str = r20.A01;
            C43751yt r3 = this.A04;
            C63292wB r1 = new C63292wB(0);
            r1.A05 = str;
            r1.A04 = r3.A08;
            r1.A01 = (C74463ay) r3.A06;
            r1.A06 = r3.A0A;
            this.A02.A07(r1);
        } else if (i == 2) {
            HashMap hashMap = r20.A02;
            C02270Bi r22 = this.A01;
            String A063 = this.A03.A06(R.string.register_wait_message);
            C63402wM r02 = new C63402wM();
            r02.A00 = A063;
            r22.A07(r02);
            C43751yt r12 = this.A04;
            C74463ay r03 = (C74463ay) r12.A06;
            AnonymousClass3EI r23 = this.A05;
            String str2 = r03.A0D;
            String str3 = r03.A0E;
            String str4 = r03.A0A;
            String str5 = this.A08;
            String str6 = r12.A07;
            C69673Hy r122 = new C69673Hy(this);
            if (r23 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AnonymousClass0OS("action", "upi-check-balance", null, (byte) 0));
                AnonymousClass008.A1F("vpa", str2, arrayList);
                if (!TextUtils.isEmpty(str3)) {
                    AnonymousClass008.A1F("vpa-id", str3, arrayList);
                }
                arrayList.add(new AnonymousClass0OS("seq-no", str5, null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("upi-bank-info", str4, null, (byte) 0));
                arrayList.add(new AnonymousClass0OS("device-id", r23.A09, null, (byte) 0));
                AnonymousClass008.A1F("credential-id", str6, arrayList);
                if (!(hashMap == null || (A012 = C60922sD.A01(hashMap, "MPIN")) == null)) {
                    AnonymousClass008.A1F("mpin", A012, arrayList);
                }
                r23.A06.A09(false, new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]), null, null), new C74633bF(r23.A00, r23.A01, r23.A03, r23.A05, ((C61432tA) r23).A00, r122), 0);
                return;
            }
            throw null;
        }
    }
}
