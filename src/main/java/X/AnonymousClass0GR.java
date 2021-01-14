package X;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0GR  reason: invalid class name */
public class AnonymousClass0GR implements AbstractC000900m, AnonymousClass0DJ {
    public static volatile AnonymousClass0GR A0B;
    public boolean A00;
    public boolean A01;
    public final AnonymousClass02M A02;
    public final C003301q A03;
    public final AnonymousClass0EU A04;
    public final C01980Ae A05;
    public final C02050Al A06;
    public final C02010Ah A07;
    public final AnonymousClass0GS A08;
    public final C61592tQ A09;
    public final C018809u A0A = C018809u.A00("PaymentsConnectivityManager", "network", "COMMON");

    public AnonymousClass0GR(AnonymousClass02M r4, C02010Ah r5, C01980Ae r6, C02050Al r7, C61592tQ r8, C003301q r9, AnonymousClass0EU r10, AnonymousClass0GS r11) {
        this.A02 = r4;
        this.A07 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A09 = r8;
        this.A03 = r9;
        this.A04 = r10;
        this.A08 = r11;
    }

    public static AnonymousClass0GR A00() {
        if (A0B == null) {
            synchronized (AnonymousClass0GR.class) {
                if (A0B == null) {
                    A0B = new AnonymousClass0GR(AnonymousClass02M.A00(), C02010Ah.A00(), C01980Ae.A00(), C02050Al.A04, C61592tQ.A00(), C003301q.A02, AnonymousClass0EU.A03, AnonymousClass0GS.A00());
                }
            }
        }
        return A0B;
    }

    public final void A01() {
        Map map;
        Set keySet;
        AnonymousClass0GT r2;
        String str;
        C02050Al r6 = this.A06;
        synchronized (r6) {
            map = r6.A00;
            keySet = map.keySet();
        }
        for (Object obj : keySet) {
            synchronized (r6) {
                r2 = (AnonymousClass0GT) map.get(obj);
            }
            C61072sS r1 = new C61072sS(7);
            synchronized (r6) {
                str = (String) r6.A02.remove(obj);
            }
            r1.action = str;
            r2.AJU(r1);
        }
        r6.A00();
        this.A01 = false;
    }

    @Override // X.AnonymousClass0DJ
    public synchronized void ADz(boolean z) {
        C018809u r2 = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("ChatConnectivity connected: ");
        sb.append(z);
        r2.A07(null, sb.toString(), null);
        if (this.A00) {
            if (!z) {
                A01();
            } else {
                C01980Ae r0 = this.A05;
                if (r0 != null && r0.A09()) {
                    C02010Ah r1 = this.A07;
                    if (r1.A01.A05() - r1.A01().getLong("payments_pending_transactions_last_sync_time", 0) > TimeUnit.DAYS.toMillis(1)) {
                        this.A08.A01(new AnonymousClass3DM(this));
                    }
                }
            }
        }
    }

    @Override // X.AbstractC000900m
    public synchronized void AEa(AnonymousClass0JF r5) {
        C018809u r3 = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("Connectivity connected: ");
        boolean z = r5.A02;
        sb.append(z);
        r3.A07(null, sb.toString(), null);
        if (this.A00 && !z) {
            A01();
        }
    }
}
