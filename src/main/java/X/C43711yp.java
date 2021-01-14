package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.1yp  reason: invalid class name and case insensitive filesystem */
public class C43711yp extends AnonymousClass0PN {
    public final C015408m A00;
    public final C015708p A01;
    public final AnonymousClass09Y A02;

    public C43711yp(AnonymousClass09Y r3, C015408m r4, C015708p r5, AnonymousClass0PQ r6) {
        super("message_thumbnail", 2, r6);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r5;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("thumbnail");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            AnonymousClass1VB A012 = this.A01.A01("INSERT OR REPLACE INTO message_thumbnail (    message_row_id,    thumbnail) VALUES (?, ?)", "INSERT_MESSAGE_THUMBNAIL_SQL");
            j = cursor.getLong(columnIndexOrThrow);
            if (j >= 1) {
                byte[] blob = cursor.getBlob(columnIndexOrThrow2);
                A012.A06(1, j);
                if (blob == null) {
                    A012.A04(2);
                } else {
                    A012.A08(2, blob);
                }
                A012.A01();
                i++;
                this.A02.A05(AnonymousClass09Y.A01(cursor));
            } else {
                StringBuilder sb = new StringBuilder("ThumbnailMessageStore/processBatch/invalid row id, id=");
                sb.append(j);
                Log.e(sb.toString());
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00af, code lost:
        if (r7 != null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if (r6 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43711yp.A0D():void");
    }
}
