package X;

/* renamed from: X.0FF  reason: invalid class name */
public class AnonymousClass0FF implements AnonymousClass0DJ {
    public static volatile AnonymousClass0FF A07;
    public C58612mD A00;
    public AnonymousClass0FG A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass0EU A05;
    public final AnonymousClass00T A06;

    public AnonymousClass0FF(AnonymousClass00S r1, AnonymousClass00T r2, AnonymousClass0EU r3) {
        this.A04 = r1;
        this.A06 = r2;
        this.A05 = r3;
    }

    public static AnonymousClass0FF A00() {
        if (A07 == null) {
            synchronized (AnonymousClass0FF.class) {
                if (A07 == null) {
                    A07 = new AnonymousClass0FF(AnonymousClass00S.A00(), C002101e.A00(), AnonymousClass0EU.A03);
                }
            }
        }
        return A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r6 == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A01(boolean r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            if (r6 == 0) goto L_0x000d
            boolean r0 = r5.A03     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0016
            X.0EU r0 = r5.A05     // Catch:{ all -> 0x0054 }
            r0.A00(r5)     // Catch:{ all -> 0x0054 }
            goto L_0x0016
        L_0x000d:
            boolean r0 = r5.A03     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0016
            X.0EU r0 = r5.A05     // Catch:{ all -> 0x0054 }
            r0.A01(r5)     // Catch:{ all -> 0x0054 }
        L_0x0016:
            r0 = 1
            r5.A02 = r0     // Catch:{ all -> 0x0054 }
            boolean r0 = r5.A03     // Catch:{ all -> 0x0054 }
            r5.A03 = r6     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0048
            if (r6 != 0) goto L_0x0052
            X.2mD r0 = r5.A00     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004a
            X.0FG r0 = r5.A01     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x004a
            long r3 = r0.A00     // Catch:{ all -> 0x0054 }
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r0
            X.00S r0 = r5.A04     // Catch:{ all -> 0x0054 }
            long r1 = r0.A05()     // Catch:{ all -> 0x0054 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            X.2mD r4 = r5.A00     // Catch:{ all -> 0x0054 }
            X.0FG r0 = r5.A01     // Catch:{ all -> 0x0054 }
            X.03n r3 = r0.A01     // Catch:{ all -> 0x0054 }
            boolean r2 = r0.A03     // Catch:{ all -> 0x0054 }
            boolean r1 = r0.A02     // Catch:{ all -> 0x0054 }
            X.0FE r0 = r4.A00     // Catch:{ all -> 0x0054 }
            r0.A08(r3, r2, r1)     // Catch:{ all -> 0x0054 }
            goto L_0x004a
        L_0x0048:
            if (r6 != 0) goto L_0x0052
        L_0x004a:
            r0 = 0
            r5.A01 = r0     // Catch:{ all -> 0x0050 }
            r5.A00 = r0     // Catch:{ all -> 0x0050 }
            goto L_0x0052
        L_0x0050:
            r0 = move-exception
            throw r0
        L_0x0052:
            monitor-exit(r5)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0FF.A01(boolean):void");
    }

    @Override // X.AnonymousClass0DJ
    public void ADz(boolean z) {
        boolean z2;
        if (z) {
            synchronized (this) {
                this.A02 = false;
                z2 = this.A03;
            }
            if (z2) {
                this.A06.ANO(new RunnableEBaseShape3S0100000_I0_3(this, 26), 10000);
            }
        }
    }
}
