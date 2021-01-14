package X;

import java.util.ArrayList;

/* renamed from: X.2sf  reason: invalid class name and case insensitive filesystem */
public class C61202sf {
    public static volatile C61202sf A05;
    public final AnonymousClass04j A00;
    public final C02010Ah A01;
    public final C03340Fu A02;
    public final C64412y9 A03;
    public final AnonymousClass00T A04;

    public C61202sf(AnonymousClass00T r1, C02010Ah r2, C64412y9 r3, AnonymousClass04j r4, C03340Fu r5) {
        this.A04 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r5;
    }

    public static C61202sf A00() {
        if (A05 == null) {
            synchronized (C61202sf.class) {
                if (A05 == null) {
                    A05 = new C61202sf(C002101e.A00(), C02010Ah.A00(), C64412y9.A00, AnonymousClass04j.A00(), C03340Fu.A00());
                }
            }
        }
        return A05;
    }

    public void A01(C61952u0 r12, String str, AbstractC61182sd r14) {
        if ("token".equals(r12.A00.A03)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AnonymousClass02R("fbpay_pin", str));
            this.A04.ANC(new AnonymousClass3XU(this.A01, this.A03, this.A00, this.A02, arrayList, r14, 0, null), new Void[0]);
            return;
        }
        r14.AKj(str);
    }
}
