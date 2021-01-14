package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1M5  reason: invalid class name */
public final class AnonymousClass1M5 {
    public int A00;
    public int A01;
    public boolean A02;
    public final UserJid A03;
    public final ConcurrentHashMap A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass1M5(com.whatsapp.jid.UserJid r3, int r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r3)
            if (r1 == 0) goto L_0x0013
            X.1M4 r0 = new X.1M4
            r0.<init>(r1, r6)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r2.<init>(r3, r0, r4, r5)
            return
        L_0x0013:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M5.<init>(com.whatsapp.jid.UserJid, int, boolean, boolean):void");
    }

    public AnonymousClass1M5(UserJid userJid, Set set, int i, boolean z) {
        this.A04 = new ConcurrentHashMap();
        this.A03 = userJid;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass1M4 r2 = (AnonymousClass1M4) it.next();
            this.A04.put(r2.A01, r2);
        }
        this.A01 = i;
        this.A02 = z;
    }

    public C05350Oe A00() {
        return C05350Oe.A01(this.A04.values());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass1M5.class != obj.getClass()) {
            return false;
        }
        AnonymousClass1M5 r4 = (AnonymousClass1M5) obj;
        if (this.A01 == r4.A01 && this.A02 == r4.A02 && this.A03.equals(r4.A03)) {
            return this.A04.equals(r4.A04);
        }
        return false;
    }

    public int hashCode() {
        return ((((this.A04.hashCode() + (this.A03.hashCode() * 31)) * 31) + this.A01) * 31) + (this.A02 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("GroupParticipant{jid='");
        A0S.append(this.A03);
        A0S.append('\'');
        A0S.append(", rank=");
        A0S.append(this.A01);
        A0S.append(", pending=");
        A0S.append(this.A02);
        A0S.append(", participantDevices=");
        StringBuilder sb = new StringBuilder("[");
        for (Object obj : this.A04.values()) {
            sb.append(obj);
            sb.append(", ");
        }
        sb.append("]");
        A0S.append(sb.toString());
        A0S.append('}');
        return A0S.toString();
    }
}
