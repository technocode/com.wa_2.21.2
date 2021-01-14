package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.0ZH  reason: invalid class name */
public class AnonymousClass0ZH extends AnonymousClass0Oo {
    public AnonymousClass0QM A00;

    public AnonymousClass0ZH(C007303n r2, long j) {
        super(r2, j, (byte) 10);
    }

    public AnonymousClass0ZH(C007303n r27, AnonymousClass0QM r28) {
        super(r27, r28.A08, (byte) 10);
        ArrayList arrayList = new ArrayList();
        C007303n r6 = this.A0n;
        AnonymousClass02N r3 = r6.A00;
        UserJid of = UserJid.of(r3);
        if (!AnonymousClass1VY.A0e(of)) {
            StringBuilder A0S = AnonymousClass008.A0S("CallLog/fromFMessageMissedCall bad UserJid: ");
            A0S.append(r3);
            Log.e(A0S.toString());
        } else {
            AnonymousClass0QM r7 = new AnonymousClass0QM(new C09260ca(of, r6.A02, r6.A01, 0), this, -1, this.A0E, r28.A0E, 0, 2, 0, false, true, r28.A05, r28.A0D, Collections.emptyList(), r28.A04, null);
            for (AnonymousClass0QP r0 : r28.A0A.values()) {
                Map map = r7.A0A;
                UserJid userJid = r0.A02;
                map.put(userJid, new AnonymousClass0QP(-1, userJid, r0.A00));
            }
            arrayList.add(r7);
        }
        A0w(arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0x() {
        /*
            r4 = this;
            java.util.List r1 = r4.A02
            boolean r0 = r1.isEmpty()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r1.get(r2)
            X.0QM r0 = (X.AnonymousClass0QM) r0
            boolean r0 = r0.A0D()
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r4.A0y()
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0021
            r3 = 3
        L_0x0021:
            return r3
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            r2 = 2
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZH.A0x():int");
    }

    public boolean A0y() {
        List list = ((AnonymousClass0Oo) this).A02;
        if (list.isEmpty()) {
            return ((AnonymousClass0Oo) this).A01;
        }
        return ((AnonymousClass0QM) list.get(0)).A0E;
    }
}
