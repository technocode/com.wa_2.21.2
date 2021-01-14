package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3XU  reason: invalid class name */
public class AnonymousClass3XU extends AbstractC10160eB {
    public final int A00;
    public final C61172sc A01;
    public final AbstractC61182sd A02;
    public final List A03;

    public AnonymousClass3XU(C02010Ah r1, C64412y9 r2, AnonymousClass04j r3, C03340Fu r4, List list, AbstractC61182sd r6, int i, C61172sc r8) {
        super(r1, r2, r3, r4);
        this.A03 = list;
        this.A02 = r6;
        this.A00 = i;
        this.A01 = r8;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        C61072sS r0;
        AnonymousClass02R r7 = (AnonymousClass02R) obj;
        String str = (String) r7.A00;
        C61072sS r4 = (C61072sS) r7.A01;
        AbstractC61182sd r3 = this.A02;
        if (r3 != null) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("PaymentPinTokenTask token error: ");
                sb.append(r4);
                Log.i(C018809u.A01("PinTokenizer", sb.toString()));
                if (r4 != null) {
                    r0 = r4;
                } else {
                    r0 = new C61072sS();
                }
                r3.AFb(r0);
            } else {
                r3.AKj(str);
            }
        }
        C61172sc r32 = this.A01;
        if (r32 == null) {
            return;
        }
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PaymentPinTokenTask token error: ");
            sb2.append(r4);
            Log.i(C018809u.A01("PinTokenizer", sb2.toString()));
            if (r4 == null) {
                r4 = new C61072sS();
            }
            if (r32.A01.compareAndSet(false, true)) {
                r32.A02.decrementAndGet();
                r32.A00.AFb(r4);
                return;
            }
            return;
        }
        r32.A00(this.A00, str);
    }
}
