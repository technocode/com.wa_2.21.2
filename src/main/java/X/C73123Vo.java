package X;

/* renamed from: X.3Vo  reason: invalid class name and case insensitive filesystem */
public class C73123Vo implements AnonymousClass09O {
    public final /* synthetic */ AbstractC67753Ac A00;
    public final /* synthetic */ C67763Ad A01;
    public final /* synthetic */ String A02;

    public C73123Vo(C67763Ad r1, AbstractC67753Ac r2, String str) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = str;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A00.AJS(null, this.A02, new AnonymousClass1XC(AnonymousClass008.A0K("WaBloksIqBuilder - delivery failure iqId=", str)));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r8) {
        this.A00.AJS(null, this.A02, Integer.parseInt(r8.A0D("error").A0G("code", null)) == 475 ? new C73143Vq(this.A01, AnonymousClass008.A0K("WaBloksIqBuilder - sendIq error iqId=", str)) : new AnonymousClass1XC(AnonymousClass008.A0K("WaBloksIqBuilder - sendIq error iqId=", str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        if (r3 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKk(java.lang.String r7, X.AnonymousClass0M5 r8) {
        /*
            r6 = this;
            r5 = 0
            java.lang.String r0 = "layout"
            X.0M5 r0 = r8.A0D(r0)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            if (r0 == 0) goto L_0x0035
            byte[] r0 = r0.A01     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            int r0 = r0.length     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            if (r0 == 0) goto L_0x0027
            java.util.zip.InflaterInputStream r3 = new java.util.zip.InflaterInputStream     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0031, all -> 0x002f }
            X.3Ac r1 = r6.A00     // Catch:{ Exception -> 0x0025 }
            java.lang.String r0 = r6.A02     // Catch:{ Exception -> 0x0025 }
            r1.AJS(r3, r0, r5)     // Catch:{ Exception -> 0x0025 }
            r3.close()     // Catch:{ IOException -> 0x0047 }
            return
        L_0x0025:
            r2 = move-exception
            goto L_0x003a
        L_0x0027:
            java.lang.String r1 = "WaBloksIqBuilder - Received Zero-Length Payload"
            X.1XC r0 = new X.1XC
            r0.<init>(r1)
            throw r0
        L_0x002f:
            r1 = move-exception
            goto L_0x0050
        L_0x0031:
            r2 = move-exception
            r3 = r4
            goto L_0x003a
        L_0x0034:
            throw r5
        L_0x0035:
            throw r5
        L_0x0036:
            r1 = move-exception
            throw r1
        L_0x0038:
            r2 = move-exception
            r3 = r5
        L_0x003a:
            X.3Ac r1 = r6.A00     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x004c }
            r1.AJS(r5, r0, r2)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x004b
            r3.close()
            return
        L_0x0047:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
        L_0x004b:
            return
        L_0x004c:
            r1 = move-exception
            r4 = r3
            if (r3 == 0) goto L_0x0058
        L_0x0050:
            r4.close()     // Catch:{ IOException -> 0x0054 }
            throw r1
        L_0x0054:
            r0 = move-exception
            com.whatsapp.util.Log.e(r0)
        L_0x0058:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73123Vo.AKk(java.lang.String, X.0M5):void");
    }
}
