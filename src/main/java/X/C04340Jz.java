package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Jz  reason: invalid class name and case insensitive filesystem */
public class C04340Jz {
    public static volatile C04340Jz A04;
    public final AnonymousClass0FZ A00;
    public final AnonymousClass0K0 A01;
    public final AnonymousClass00T A02;
    public final Map A03 = new HashMap();

    public C04340Jz(AnonymousClass00T r2, AnonymousClass0FZ r3, AnonymousClass0K0 r4) {
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public static C04340Jz A00() {
        if (A04 == null) {
            synchronized (C04340Jz.class) {
                if (A04 == null) {
                    A04 = new C04340Jz(C002101e.A00(), AnonymousClass0FZ.A00(), AnonymousClass0K0.A00());
                }
            }
        }
        return A04;
    }

    public final synchronized C50502Uy A01(AnonymousClass02N r4) {
        C50502Uy r1;
        Map map = this.A03;
        r1 = (C50502Uy) map.get(r4.getRawString());
        if (r1 == null) {
            r1 = new C50502Uy(this);
            map.put(r4.getRawString(), r1);
        }
        return r1;
    }

    public void A02(AbstractC007503q r7) {
        C007303n r5 = r7.A0n;
        AnonymousClass02N r0 = r5.A00;
        if (r0 != null) {
            C50502Uy A012 = A01(r0);
            synchronized (A012) {
                boolean z = false;
                if (A012.A01.remove(r5) != null) {
                    z = true;
                }
                boolean remove = A012.A00.remove(r5);
                StringBuilder sb = new StringBuilder();
                sb.append("media-message-send-queue/cancel ");
                sb.append(r5);
                sb.append(" ");
                sb.append(A012.toString());
                sb.append(" cancelledPending:");
                sb.append(z);
                sb.append(" cancelledReady:");
                sb.append(remove);
                Log.d(sb.toString());
                if (z) {
                    A012.A00();
                }
            }
            return;
        }
        throw null;
    }
}
