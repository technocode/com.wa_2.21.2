package X;

import android.net.Uri;

/* renamed from: X.2oB  reason: invalid class name and case insensitive filesystem */
public class C59722oB extends AbstractC54072eJ implements AbstractC48892Oe {
    public static final String[] A00 = {"_id", "_data", "mime_type", "media_type", "date_modified", "datetaken", "orientation", "_size"};

    public C59722oB(AnonymousClass00G r1, AnonymousClass0XO r2, C007703s r3, Uri uri, int i, String str) {
        super(r1, r2, r3, uri, i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        throw r0;
     */
    @Override // X.AbstractC48892Oe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A4z() {
        /*
            r12 = this;
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            android.net.Uri r0 = r12.A04
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "distinct"
            java.lang.String r0 = "true"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
            android.net.Uri r7 = r0.build()
            android.content.ContentResolver r6 = r12.A03
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]
            r4 = 0
            java.lang.String r0 = "bucket_display_name"
            r8[r4] = r0
            r3 = 1
            java.lang.String r0 = "bucket_id"
            r8[r3] = r0
            java.lang.String r0 = r12.A09
            if (r0 != 0) goto L_0x003d
            java.lang.String r9 = "media_type in (1, 3)"
        L_0x002d:
            if (r0 != 0) goto L_0x0038
            r10 = 0
        L_0x0030:
            r11 = 0
            android.database.Cursor r2 = r6.query(r7, r8, r9, r10, r11)
            if (r2 != 0) goto L_0x0040
            return r5
        L_0x0038:
            java.lang.String[] r10 = new java.lang.String[r3]
            r10[r4] = r0
            goto L_0x0030
        L_0x003d:
            java.lang.String r9 = "media_type in (1, 3) and bucket_id=?"
            goto L_0x002d
        L_0x0040:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = r2.getString(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r2.getString(r3)     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0052
            java.lang.String r1 = ""
        L_0x0052:
            r5.put(r0, r1)     // Catch:{ all -> 0x005a }
            goto L_0x0040
        L_0x0056:
            r2.close()
            return r5
        L_0x005a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59722oB.A4z():java.util.HashMap");
    }
}
