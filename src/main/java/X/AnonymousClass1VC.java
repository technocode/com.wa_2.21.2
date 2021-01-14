package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1VC  reason: invalid class name */
public class AnonymousClass1VC {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public AbstractC007503q A08;
    public final AnonymousClass00S A09;
    public final UserJid A0A;

    public AnonymousClass1VC(AnonymousClass00S r34, AnonymousClass1VC r35) {
        this(r34, r35.A0A, r35.A06, r35.A04, r35.A05, r35.A03, r35.A02, r35.A07, r35.A01, r35.A00);
        this.A08 = r35.A08;
    }

    public AnonymousClass1VC(AnonymousClass00S r3, UserJid userJid, long j, long j2, long j3, long j4, long j5, long j6, int i, int i2) {
        this.A06 = 1;
        this.A09 = r3;
        this.A0A = userJid;
        this.A06 = j;
        this.A04 = j2;
        this.A05 = j3;
        this.A03 = j4;
        this.A02 = Math.max(j5, j4);
        this.A07 = j6;
        this.A01 = i;
        this.A00 = i2;
    }

    public static String A00(AbstractC007503q r3) {
        StringBuilder A0S = AnonymousClass008.A0S("[id=");
        C007303n r1 = r3.A0n;
        A0S.append(r1.A01);
        A0S.append(", from_me=");
        A0S.append(r1.A02);
        A0S.append(", remote_resource=");
        A0S.append(r3.A07());
        A0S.append("]");
        return A0S.toString();
    }

    public synchronized AnonymousClass1VC A01() {
        return new AnonymousClass1VC(this.A09, this);
    }

    public synchronized AnonymousClass1VC A02(AbstractC007503q r9) {
        int i;
        if (this.A00 <= 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/status-revoked/ ");
            sb.append(A00(r9));
            sb.append(" last");
            Log.d(sb.toString());
            return null;
        }
        if (AnonymousClass02Z.A02(this.A0A)) {
            if (r9.A0p == this.A06) {
                this.A06 = -1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("msgstore/status-revoked/ regenerate ");
                sb2.append(A00(r9));
                sb2.append(" unseen:");
                sb2.append(this.A01);
                sb2.append(" total:");
                sb2.append(this.A00);
                Log.d(sb2.toString());
                return this;
            }
        } else if (r9.A0p == this.A04 || ((r9.A0p >= this.A03 && r9.A0p <= this.A02) || r9.A0p == this.A05 || r9.A0p == this.A06)) {
            this.A06 = -1;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("msgstore/status-revoked/ regenerate ");
            sb3.append(A00(r9));
            sb3.append(" unseen:");
            sb3.append(this.A01);
            sb3.append(" total:");
            sb3.append(this.A00);
            Log.d(sb3.toString());
            return this;
        }
        this.A00--;
        if (r9.A0p > this.A04 && (i = this.A01) > 0) {
            this.A01 = i - 1;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("msgstore/status-revoked/ ");
        sb4.append(A00(r9));
        sb4.append(" unseen:");
        sb4.append(this.A01);
        sb4.append(" total:");
        sb4.append(this.A00);
        Log.d(sb4.toString());
        return A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ((r6.A09.A05() - r6.A07) <= 86400000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r0 = r6.A0A     // Catch:{ all -> 0x001d }
            boolean r0 = X.AnonymousClass1VY.A0a(r0)     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001a
            X.00S r0 = r6.A09     // Catch:{ all -> 0x001d }
            long r4 = r0.A05()     // Catch:{ all -> 0x001d }
            long r0 = r6.A07     // Catch:{ all -> 0x001d }
            long r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r6)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VC.A03():boolean");
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("StatusInfo[jid=");
        sb.append(this.A0A);
        sb.append(", msgId=");
        sb.append(this.A06);
        sb.append(", lastRead=");
        sb.append(this.A04);
        sb.append(", lastSent=");
        sb.append(this.A05);
        sb.append(", firstUnread=");
        sb.append(this.A03);
        sb.append(", autoDownloadLimit=");
        sb.append(this.A02);
        sb.append(", ts=");
        sb.append(this.A07);
        sb.append(", unreadCount=");
        sb.append(this.A01);
        sb.append(", total=");
        sb.append(this.A00);
        sb.append(" ]");
        return sb.toString();
    }
}
