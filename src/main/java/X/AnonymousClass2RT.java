package X;

/* renamed from: X.2RT  reason: invalid class name */
public class AnonymousClass2RT {
    public static volatile AnonymousClass2RT A04;
    public final AnonymousClass009 A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass09H A03;

    public AnonymousClass2RT(AnonymousClass009 r1, AnonymousClass09H r2, AnonymousClass01A r3, AnonymousClass00D r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass2RT A00() {
        if (A04 == null) {
            synchronized (AnonymousClass2RT.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass2RT(AnonymousClass009.A00(), AnonymousClass09H.A01(), AnonymousClass01A.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass2RT r9, java.util.Set r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2RT.A01(X.2RT, java.util.Set, java.lang.String):void");
    }

    public C08580bN A02() {
        AnonymousClass09H r13 = this.A03;
        String A022 = r13.A02();
        C08580bN r3 = new C08580bN();
        String string = this.A02.A00.getString("group_add_blacklist_hash", null);
        int i = 2;
        if (string != null) {
            i = 3;
        }
        AnonymousClass0OS[] r4 = new AnonymousClass0OS[i];
        r4[0] = new AnonymousClass0OS("name", "groupadd", null, (byte) 0);
        r4[1] = new AnonymousClass0OS("value", "contact_blacklist", null, (byte) 0);
        if (string != null) {
            r4[2] = new AnonymousClass0OS("dhash", string, null, (byte) 0);
        }
        AnonymousClass0M5 r6 = new AnonymousClass0M5("privacy", (AnonymousClass0OS[]) null, new AnonymousClass0M5("list", r4, null, null));
        r13.A07(227, A022, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A022, null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("xmlns", "privacy", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0)}, r6), new C55392gT(this, r3), 32000);
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r1 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A03() {
        /*
            r11 = this;
            X.01A r0 = r11.A01
            X.01B r4 = r0.A04
            if (r4 == 0) goto L_0x0048
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r0 = "jid"
            r6[r2] = r0
            r7 = 0
            java.lang.String r5 = "wa_group_add_black_list"
            java.lang.String r10 = "CONTACT_GROUP_ADD_BLACK_LIST"
            r8 = r7
            r9 = r7
            android.database.Cursor r1 = r4.A07(r5, r6, r7, r8, r9, r10)
            if (r1 != 0) goto L_0x0027
            java.lang.String r0 = "contact-mgr-db/unable to get block list"
            X.AnonymousClass00E.A08(r2, r0)     // Catch:{ all -> 0x003f }
            return r3
        L_0x0027:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x003f }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0027
            r3.add(r0)     // Catch:{ all -> 0x003f }
            goto L_0x0027
        L_0x003b:
            r1.close()
            return r3
        L_0x003f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            if (r1 == 0) goto L_0x0047
            r1.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0
        L_0x0048:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2RT.A03():java.util.Set");
    }
}
