package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.09n  reason: invalid class name and case insensitive filesystem */
public class C018109n {
    public static volatile C018109n A04;
    public final C014408c A00;
    public final C015308l A01;
    public final C014508d A02;
    public final C015708p A03;

    public C018109n(C015308l r1, C014408c r2, C015708p r3, C014508d r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    public static C018109n A00() {
        if (A04 == null) {
            synchronized (C018109n.class) {
                if (A04 == null) {
                    A04 = new C018109n(C015308l.A00(), C014408c.A00(), C015708p.A00(), C014508d.A00());
                }
            }
        }
        return A04;
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
    public void A01(X.AnonymousClass0Z9 r6, long r7) {
        /*
            r5 = this;
            int r1 = r6.A09
            r0 = 2
            r4 = 1
            r2 = 0
            if (r1 != r0) goto L_0x0008
            r2 = 1
        L_0x0008:
            java.lang.String r0 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/message in main storage; key="
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            X.03n r0 = r6.A0n
            X.AnonymousClass008.A1R(r1, r0, r2)
            X.08d r0 = r5.A02     // Catch:{ SQLiteConstraintException -> 0x003f }
            X.0OQ r3 = r0.A04()     // Catch:{ SQLiteConstraintException -> 0x003f }
            X.08p r2 = r5.A03     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "INSERT OR REPLACE INTO message_quoted_product(message_row_id, business_owner_jid, product_id, title, description, currency_code, amount_1000, retailer_id, url, product_image_count) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
            java.lang.String r0 = "INSERT_MESSAGE_QUOTED_PRODUCT_SQL"
            X.1VB r0 = r2.A01(r1, r0)     // Catch:{ all -> 0x0038 }
            r5.A02(r6, r0, r7)     // Catch:{ all -> 0x0038 }
            long r1 = r0.A01()     // Catch:{ all -> 0x0038 }
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x002f
            r4 = 0
        L_0x002f:
            java.lang.String r0 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/inserted row should have same row_id"
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
            java.lang.String r1 = "ProductMessageStore/insertOrUpdateQuotedProductMessage/fail to insert. Error message is: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018109n.A01(X.0Z9, long):void");
    }

    public final void A02(AnonymousClass0Z9 r4, AnonymousClass1VB r5, long j) {
        r5.A06(1, j);
        UserJid userJid = r4.A01;
        if (userJid != null) {
            r5.A06(2, this.A01.A02(userJid));
        }
        String str = r4.A04;
        if (str == null) {
            r5.A04(3);
        } else {
            r5.A07(3, str);
        }
        String str2 = r4.A07;
        if (str2 == null) {
            r5.A04(4);
        } else {
            r5.A07(4, str2);
        }
        String str3 = r4.A03;
        if (str3 == null) {
            r5.A04(5);
        } else {
            r5.A07(5, str3);
        }
        String str4 = r4.A02;
        if (!(str4 == null || r4.A08 == null)) {
            r5.A07(6, str4);
            r5.A06(7, r4.A08.multiply(AnonymousClass1S6.A0A).longValue());
        }
        String str5 = r4.A06;
        if (str5 == null) {
            r5.A04(8);
        } else {
            r5.A07(8, str5);
        }
        String str6 = r4.A05;
        if (str6 == null) {
            r5.A04(9);
        } else {
            r5.A07(9, str6);
        }
        r5.A06(10, (long) r4.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r8, X.AnonymousClass0Z9 r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018109n.A03(java.lang.String, X.0Z9, java.lang.String):void");
    }
}
