package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.09i  reason: invalid class name and case insensitive filesystem */
public class C017609i {
    public static volatile C017609i A03;
    public final C015308l A00;
    public final C014508d A01;
    public final C015708p A02;

    public C017609i(C015308l r1, C015708p r2, C014508d r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static C017609i A00() {
        if (A03 == null) {
            synchronized (C017609i.class) {
                if (A03 == null) {
                    A03 = new C017609i(C015308l.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C12210hj r6, long r7) {
        /*
            r5 = this;
            int r1 = r6.A09
            r0 = 2
            r4 = 1
            r2 = 0
            if (r1 != r0) goto L_0x0008
            r2 = 1
        L_0x0008:
            java.lang.String r0 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/message in main storage; key="
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            X.03n r0 = r6.A0n
            X.AnonymousClass008.A1R(r1, r0, r2)
            X.08d r0 = r5.A01     // Catch:{ SQLiteConstraintException -> 0x003f }
            X.0OQ r3 = r0.A04()     // Catch:{ SQLiteConstraintException -> 0x003f }
            X.08p r2 = r5.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "INSERT OR REPLACE INTO message_quoted_product(message_row_id, business_owner_jid, title, description) VALUES (?, ?, ?, ?)"
            java.lang.String r0 = "INSERT_MESSAGE_QUOTED_CATALOG_SQL"
            X.1VB r0 = r2.A01(r1, r0)     // Catch:{ all -> 0x0038 }
            r5.A02(r6, r0, r7)     // Catch:{ all -> 0x0038 }
            long r1 = r0.A01()     // Catch:{ all -> 0x0038 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            r4 = 0
        L_0x002f:
            java.lang.String r0 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/inserted row should have same row_id"
            X.AnonymousClass00E.A0A(r4, r0)     // Catch:{ all -> 0x0038 }
            r3.close()
            return
        L_0x0038:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = "CatalogMessageStore/insertOrUpdateQuotedCatalogMessage/fail to insert. Error message is: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017609i.A01(X.0hj, long):void");
    }

    public final void A02(C12210hj r4, AnonymousClass1VB r5, long j) {
        r5.A06(1, j);
        UserJid userJid = r4.A00;
        if (userJid != null) {
            r5.A06(2, this.A00.A02(userJid));
        }
        String str = r4.A02;
        if (str == null) {
            r5.A04(3);
        } else {
            r5.A07(3, str);
        }
        String str2 = r4.A01;
        if (str2 == null) {
            r5.A04(4);
        } else {
            r5.A07(4, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r8, X.C12210hj r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C017609i.A03(java.lang.String, X.0hj, java.lang.String):void");
    }
}
