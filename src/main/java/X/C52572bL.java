package X;

/* renamed from: X.2bL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52572bL implements AbstractC28611Uz {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass0CG A01;
    public final /* synthetic */ AbstractC007503q A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C52572bL(AnonymousClass0CG r1, AbstractC007503q r2, boolean z, long j) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        throw r0;
     */
    @Override // X.AbstractC28611Uz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQo(X.AbstractC007503q r7) {
        /*
            r6 = this;
            X.0CG r5 = r6.A01
            X.03q r0 = r6.A02
            boolean r2 = r6.A03
            long r3 = r6.A00
            X.03n r1 = r7.A0n
            X.03n r0 = r0.A0n
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004c
            r7.A0j = r2
            X.0AM r5 = r5.A05
            if (r5 == 0) goto L_0x004a
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            X.08d r0 = r5.A0C
            X.0OQ r4 = r0.A04()
            X.08p r2 = r5.A0F     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "UPDATE message_ftsv2 SET fts_namespace=? WHERE docid=?"
            java.lang.String r0 = "UPDATE_FTS_NAMESPACED"
            X.1VB r3 = r2.A01(r1, r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = r5.A0F(r7)     // Catch:{ all -> 0x0043 }
            r0 = 1
            r3.A07(r0, r1)     // Catch:{ all -> 0x0043 }
            r2 = 2
            long r0 = r7.A0p     // Catch:{ all -> 0x0043 }
            r3.A06(r2, r0)     // Catch:{ all -> 0x0043 }
            r3.A00()     // Catch:{ all -> 0x0043 }
            r4.close()
            return
        L_0x0043:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            throw r0
        L_0x004a:
            r0 = 0
            throw r0
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52572bL.AQo(X.03q):void");
    }
}
