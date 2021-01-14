package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

/* renamed from: X.0CB  reason: invalid class name */
public class AnonymousClass0CB {
    public static volatile AnonymousClass0CB A05;
    public final AnonymousClass01I A00;
    public final C001000o A01;
    public final AnonymousClass0CC A02;
    public final AnonymousClass01L A03;
    public final AnonymousClass02H A04;

    public AnonymousClass0CB(AnonymousClass01I r3, AnonymousClass00T r4, C001000o r5, AnonymousClass01L r6, AnonymousClass0CC r7) {
        this.A00 = r3;
        this.A03 = r6;
        this.A01 = r5;
        this.A02 = r7;
        this.A04 = new AnonymousClass02H(r4, false);
    }

    public static AnonymousClass0CB A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0CB.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0CB(AnonymousClass01I.A00(), C002101e.A00(), C001000o.A00(), AnonymousClass01L.A00(), AnonymousClass0CC.A00());
                }
            }
        }
        return A05;
    }

    public AnonymousClass1UI A01(UserJid userJid) {
        AnonymousClass0E6 A0A = C001801b.A0A(DeviceJid.of(userJid));
        C001000o r5 = this.A01;
        AnonymousClass0QZ A0A2 = r5.A0A(A0A);
        if (A0A2 == null) {
            return null;
        }
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        UserJid userJid2 = r0.A03;
        if (userJid2 != null) {
            return r5.A09(C002001d.A1o(userJid2.user), Collections.emptyList(), C002001d.A1o(A0A.A01), Collections.singletonList(A0A2.A00));
        }
        throw null;
    }
}
