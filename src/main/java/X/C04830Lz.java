package X;

import android.text.TextUtils;

/* renamed from: X.0Lz  reason: invalid class name and case insensitive filesystem */
public class C04830Lz extends AbstractC007503q implements AbstractC02870Du, AbstractC02880Dv, AnonymousClass0M0 {
    public String A00;
    public String A01;
    public AnonymousClass1Z5 A02;

    public C04830Lz(C007303n r2, long j) {
        super(r2, j, (byte) 4);
        super.A01 = 0;
    }

    public C04830Lz(C007303n r4, long j, C75823dY r7) {
        super(r4, j, (byte) 4);
        super.A01 = 0;
        if ((r7.A00 & 2) == 2) {
            A0w(r7.A03);
        }
        if ((r7.A00 & 1) != 1 ? false : true) {
            this.A00 = r7.A02;
        }
    }

    public C04830Lz(C007303n r2, long j, String str, String str2) {
        super(r2, j, (byte) 4);
        super.A01 = 0;
        A0w(str);
        this.A00 = str2;
    }

    public C04830Lz(C04830Lz r2, C007303n r3, long j, boolean z) {
        super(r2, r3, j, z);
        super.A01 = 0;
        this.A00 = r2.A00;
        this.A01 = r2.A0u();
    }

    @Override // X.AbstractC007503q
    public void A0d(String str) {
        synchronized (this.A0o) {
            super.A0d(str);
            this.A01 = str;
        }
    }

    public String A0u() {
        String str;
        synchronized (this.A0o) {
            str = this.A01;
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = new X.AnonymousClass1Z5(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        r4.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r1 = X.AnonymousClass1Z4.A05(r5, r6, r7, r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass1Z5 A0v(X.AnonymousClass00G r5, X.AnonymousClass01A r6, X.AnonymousClass01X r7, X.C017009c r8) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0o
            monitor-enter(r3)
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x0024 }
            X.1Z5 r0 = r4.A02     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            if (r2 == 0) goto L_0x0022
            monitor-exit(r3)     // Catch:{ all -> 0x0024 }
            X.1Z4 r1 = X.AnonymousClass1Z4.A05(r5, r6, r7, r8, r2)
            monitor-enter(r3)
            if (r1 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = 0
            goto L_0x001b
        L_0x0016:
            X.1Z5 r0 = new X.1Z5     // Catch:{ all -> 0x001f }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x001f }
        L_0x001b:
            r4.A02 = r0     // Catch:{ all -> 0x001f }
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0022:
            monitor-exit(r3)
            return r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04830Lz.A0v(X.00G, X.01A, X.01X, X.09c):X.1Z5");
    }

    public void A0w(String str) {
        synchronized (this.A0o) {
            this.A01 = str;
            this.A02 = null;
            super.A0d(str);
        }
    }

    @Override // X.AbstractC02880Dv
    public void A2N(C64552yN r7) {
        C04970Mo r5 = r7.A01;
        C75823dY r0 = ((C02840Dr) r5.A00).A08;
        if (r0 == null) {
            r0 = C75823dY.A04;
        }
        AbstractC04160Jh A0B = r0.AQb();
        if (!TextUtils.isEmpty(this.A00)) {
            String str = this.A00;
            A0B.A02();
            C75823dY r1 = (C75823dY) A0B.A00;
            if (str != null) {
                r1.A00 |= 1;
                r1.A02 = str;
            } else {
                throw null;
            }
        }
        String A0u = A0u();
        A0B.A02();
        C75823dY r12 = (C75823dY) A0B.A00;
        if (A0u != null) {
            r12.A00 |= 2;
            r12.A03 = A0u;
            C007103l r3 = r7.A02;
            byte[] bArr = r7.A05;
            if (AnonymousClass0ZG.A0M(this, r3, bArr)) {
                C75423cu A022 = AnonymousClass0ZG.A02(r7.A00, this, r7.A03, r3, bArr);
                A0B.A02();
                C75823dY r13 = (C75823dY) A0B.A00;
                if (A022 != null) {
                    r13.A01 = A022;
                    r13.A00 |= 4;
                } else {
                    throw null;
                }
            }
            r5.A02();
            C02840Dr r14 = (C02840Dr) r5.A00;
            if (r14 != null) {
                r14.A08 = (C75823dY) A0B.A01();
                r14.A00 |= 8;
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass0M0
    public AbstractC007503q A2m(C007303n r7, long j) {
        return new C04830Lz(this, r7, j, false);
    }

    @Override // X.AbstractC02870Du
    public AbstractC007503q A2n(C007303n r7) {
        return new C04830Lz(this, r7, this.A0E, true);
    }
}
