package X;

/* renamed from: X.2Kc  reason: invalid class name and case insensitive filesystem */
public class C47892Kc {
    public static volatile C47892Kc A03;
    public final C014408c A00;
    public final AnonymousClass0AM A01;
    public final C014508d A02;

    public C47892Kc(C014408c r1, AnonymousClass0AM r2, C014508d r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static C47892Kc A00() {
        if (A03 == null) {
            synchronized (C47892Kc.class) {
                if (A03 == null) {
                    A03 = new C47892Kc(C014408c.A00(), AnonymousClass0AM.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        ((android.database.CursorWrapper) r2).close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass02N r7, X.C04080Iy r8) {
        /*
            r6 = this;
            X.08d r0 = r6.A02
            X.0OQ r3 = r0.A03()
            X.0BK r5 = r3.A04     // Catch:{ all -> 0x004f }
            java.lang.String r4 = "SELECT COUNT(*) as count FROM available_message_view WHERE message_type in ('9' , '26' ) AND origin != 7 AND chat_row_id = ? "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            X.08c r0 = r6.A00     // Catch:{ all -> 0x004f }
            long r0 = r0.A05(r7)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004f }
            r1 = 0
            r2[r1] = r0     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "GET_DOCUMENT_MESSAGES_COUNT"
            android.database.Cursor r2 = r5.A06(r4, r2, r8, r0)     // Catch:{ all -> 0x004f }
            r0 = r2
            android.database.CursorWrapper r0 = (android.database.CursorWrapper) r0
            boolean r0 = r0.moveToFirst()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "count"
            r1 = r2
            android.database.CursorWrapper r1 = (android.database.CursorWrapper) r1
            int r0 = r1.getColumnIndexOrThrow(r0)
            int r0 = r1.getInt(r0)
            r1.close()
            r3.close()
            return r0
        L_0x003d:
            android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2
            r2.close()
            r3.close()
            return r1
        L_0x0046:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            android.database.CursorWrapper r2 = (android.database.CursorWrapper) r2
            r2.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0
        L_0x004f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47892Kc.A01(X.02N, X.0Iy):int");
    }
}
