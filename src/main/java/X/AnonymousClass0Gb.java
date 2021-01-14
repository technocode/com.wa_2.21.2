package X;

/* renamed from: X.0Gb  reason: invalid class name */
public class AnonymousClass0Gb extends C03410Gc {
    public static volatile AnonymousClass0Gb A03;
    public final AnonymousClass02M A00;
    public final AnonymousClass0Gd A01;
    public final C03420Ge A02;

    public AnonymousClass0Gb(AnonymousClass02M r2, AnonymousClass0Gd r3, C03420Ge r4) {
        super(r4, 12);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass0Gb A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0Gb.class) {
                if (A03 == null) {
                    AnonymousClass02M A002 = AnonymousClass02M.A00();
                    C002101e.A00();
                    AnonymousClass0Gd r3 = AnonymousClass0Gd.A00;
                    if (C03420Ge.A03 == null) {
                        synchronized (C03420Ge.class) {
                            if (C03420Ge.A03 == null) {
                                C03420Ge.A03 = new C03420Ge(C03440Gg.A00());
                            }
                        }
                    }
                    A03 = new AnonymousClass0Gb(A002, r3, C03420Ge.A03);
                }
            }
        }
        return A03;
    }

    public void A0B(C49232Po r3) {
        super.A0A(new AnonymousClass2Q0(r3.A04));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r2 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(java.lang.String r13) {
        /*
            r12 = this;
            X.AnonymousClass00E.A00()
            java.util.Map r1 = super.A03()
            X.2Q0 r0 = new X.2Q0
            r0.<init>(r13)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            boolean r0 = r1.containsKey(r0)
            r4 = 1
            r1 = 0
            if (r0 != 0) goto L_0x005b
            X.0Ge r0 = r12.A02
            if (r0 == 0) goto L_0x0053
            java.lang.String[] r9 = new java.lang.String[r4]
            r9[r1] = r13
            java.lang.String r8 = "plaintext_hash = ?"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.A01
            r3.lock()
            X.0Gg r0 = r0.A00     // Catch:{ all -> 0x004e }
            X.0Gh r0 = r0.A01()     // Catch:{ all -> 0x004e }
            X.0BK r5 = r0.A00()     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "recent_gifs"
            r7 = 0
            java.lang.String r11 = "isGifInRecentsDB/QUERY_RECENT_GIFS"
            r10 = r7
            android.database.Cursor r2 = r5.A08(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004e }
            int r1 = r2.getCount()     // Catch:{ all -> 0x0045 }
            r0 = 0
            if (r1 <= 0) goto L_0x0041
            r0 = 1
        L_0x0041:
            r2.close()
            goto L_0x0055
        L_0x0045:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            if (r2 == 0) goto L_0x004d
            r2.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        L_0x004e:
            r0 = move-exception
            r3.unlock()
            throw r0
        L_0x0053:
            r0 = 0
            throw r0
        L_0x0055:
            r3.unlock()
            if (r0 != 0) goto L_0x005b
            r4 = 0
        L_0x005b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Gb.A0C(java.lang.String):boolean");
    }
}
