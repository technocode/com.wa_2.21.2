package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.09y  reason: invalid class name and case insensitive filesystem */
public class C019209y {
    public static volatile C019209y A03;
    public final C019309z A00;
    public final C015308l A01;
    public final C014508d A02;

    public C019209y(C015308l r1, C014508d r2, C019309z r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static C019209y A00() {
        if (A03 == null) {
            synchronized (C019209y.class) {
                if (A03 == null) {
                    A03 = new C019209y(C015308l.A00(), C014508d.A00(), C019309z.A01());
                }
            }
        }
        return A03;
    }

    public AbstractC007503q A01(AbstractC007503q r5, UserJid userJid, Map map, long j) {
        C007303n r3 = r5.A0n;
        C007303n r1 = new C007303n(userJid, true, r3.A01);
        AnonymousClass00E.A07(r5 instanceof AbstractC02870Du);
        AnonymousClass00E.A07(r5.A0f);
        AbstractC007503q A2n = ((AbstractC02870Du) r5).A2n(r1);
        A2n.A0a = null;
        A2n.A0Y(r3.A00);
        C007103l A022 = this.A00.A02(A2n, j);
        if (A022 != null) {
            map.put(DeviceJid.of(userJid), A022);
        }
        return A2n;
    }
}
