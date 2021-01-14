package X;

import java.util.Iterator;

/* renamed from: X.0Kx  reason: invalid class name and case insensitive filesystem */
public class C04580Kx extends AbstractC003401r {
    public static final C04580Kx A00 = new C04580Kx();

    public void A02(AnonymousClass1VM r7) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AbstractView$OnClickListenerC32271ec r4 = ((AnonymousClass3GH) r1.next()).A00;
                C018809u r3 = r4.A0C;
                StringBuilder A0S = AnonymousClass008.A0S("paymentMethodNotificationObserver is called ");
                boolean z = true;
                boolean z2 = false;
                if (r7 != null) {
                    z2 = true;
                }
                A0S.append(z2);
                r3.A07(null, A0S.toString(), null);
                if (r4.A07 != null) {
                    z = false;
                }
                r4.A0V(r7, z);
            } else {
                return;
            }
        }
    }
}
