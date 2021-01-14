package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.0F2  reason: invalid class name */
public class AnonymousClass0F2 {
    public static volatile AnonymousClass0F2 A01;
    public final AnonymousClass0DK A00;

    public AnonymousClass0F2(AnonymousClass0DK r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0F2 A00() {
        if (A01 == null) {
            synchronized (AnonymousClass0F2.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass0F2(AnonymousClass0DK.A00());
                }
            }
        }
        return A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Long A01(java.lang.String r6) {
        /*
            r5 = this;
            X.0DK r0 = r5.A00
            X.0BK r4 = r0.A8g()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r3 = 0
            r2[r3] = r6
            java.lang.String r1 = "SELECT version FROM collection_versions WHERE collection_name = ?"
            java.lang.String r0 = "CollectionVersionsTable.GET_COLLECTION_VERSION"
            android.database.Cursor r2 = r4.A07(r1, r2, r0)
            if (r2 == 0) goto L_0x002c
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x002c
            long r0 = r2.getLong(r3)     // Catch:{ all -> 0x0025 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0025 }
            goto L_0x002d
        L_0x0025:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002b }
        L_0x002b:
            throw r0
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r2 == 0) goto L_0x0032
            r2.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0F2.A01(java.lang.String):java.lang.Long");
    }

    public void A02(String str, long j, byte[] bArr) {
        AnonymousClass1VB A0A = this.A00.A9x().A0A("INSERT OR REPLACE INTO collection_versions (collection_name, version, lt_hash) VALUES (?, ?, ?)", "CollectionVersionsTable.UPDATE_COLLECTION_VERSION");
        A0A.A07(1, str);
        A0A.A06(2, j);
        if (bArr != null) {
            A0A.A08(3, bArr);
        }
        if (A0A.A01() == -1) {
            StringBuilder sb = new StringBuilder("SyncDbStore/updateCollectionVersion failed for collection: ");
            sb.append(str);
            sb.append(", version: ");
            sb.append(j);
            sb.append(", ltHash: ");
            sb.append(Arrays.toString(bArr));
            Log.e(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A03(java.lang.String r6) {
        /*
            r5 = this;
            X.0DK r0 = r5.A00
            X.0BK r4 = r0.A8g()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r2 = 0
            r3[r2] = r6
            java.lang.String r1 = "SELECT lt_hash FROM collection_versions WHERE collection_name = ?"
            java.lang.String r0 = "CollectionVersionsTable.GET_LT_HASH"
            android.database.Cursor r1 = r4.A07(r1, r3, r0)
            if (r1 == 0) goto L_0x0028
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0028
            byte[] r0 = r1.getBlob(r2)     // Catch:{ all -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            if (r0 != 0) goto L_0x0034
            r0 = 128(0x80, float:1.794E-43)
            byte[] r0 = new byte[r0]
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0F2.A03(java.lang.String):byte[]");
    }
}
