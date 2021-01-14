package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0QP  reason: invalid class name */
public class AnonymousClass0QP {
    public int A00;
    public long A01;
    public final UserJid A02;
    public transient boolean A03;

    public AnonymousClass0QP(long j, UserJid userJid, int i) {
        this.A01 = j;
        this.A02 = userJid;
        this.A00 = i;
    }

    public synchronized long A00() {
        return this.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r6.A01 == -1) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A03     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            long r4 = r6.A01     // Catch:{ all -> 0x0011 }
            r2 = -1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            monitor-exit(r6)
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QP.A01():boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0QP.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0QP r7 = (AnonymousClass0QP) obj;
        if (this.A02.equals(r7.A02) && this.A01 == r7.A01 && this.A00 == r7.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.A02.hashCode() + ((((int) this.A01) + 31) * 31)) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("CallLogParticipant[rowId=");
        A0S.append(this.A01);
        A0S.append(", jid=");
        A0S.append(this.A02);
        A0S.append(", callResult=");
        return AnonymousClass008.A0N(A0S, this.A00, "]");
    }
}
