package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;

/* renamed from: X.0Ci  reason: invalid class name */
public class AnonymousClass0Ci {
    public static volatile AnonymousClass0Ci A04;
    public final AnonymousClass08V A00 = new AnonymousClass0Cj(this);
    public final AnonymousClass00S A01;
    public final AnonymousClass0BX A02;
    public final AnonymousClass00T A03;

    public AnonymousClass0Ci(AnonymousClass00S r2, AnonymousClass00T r3, AnonymousClass0BX r4) {
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass0Ci A00() {
        if (A04 == null) {
            synchronized (AnonymousClass0Ci.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass0Ci(AnonymousClass00S.A00(), C002101e.A00(), AnonymousClass0BX.A00());
                }
            }
        }
        return A04;
    }

    public final ContentValues A01(AnonymousClass1W6 r20) {
        String str = r20.A09;
        long j = (long) r20.A07;
        long j2 = r20.A08;
        long j3 = r20.A05;
        long j4 = (long) r20.A02;
        long j5 = r20.A03;
        long j6 = r20.A04;
        int i = r20.A01;
        int i2 = r20.A00;
        long j7 = r20.A06;
        ContentValues contentValues = new ContentValues();
        contentValues.put("uuid", str);
        contentValues.put("job_type", Long.valueOf(j));
        contentValues.put("create_time", Long.valueOf(j2));
        contentValues.put("transfer_start_time", Long.valueOf(j3));
        contentValues.put("last_update_time", Long.valueOf(this.A01.A05()));
        contentValues.put("user_initiated_attempt_count", Long.valueOf(j4));
        contentValues.put("overall_cumulative_time", Long.valueOf(j5));
        contentValues.put("overall_cumulative_user_visible_time", Long.valueOf(j6));
        contentValues.put("streaming_playback_count", Integer.valueOf(i));
        contentValues.put("media_key_reuse_type", Integer.valueOf(i2));
        contentValues.put("transferred_bytes", Long.valueOf(j7));
        return contentValues;
    }

    public AnonymousClass1W6 A02(int i, String str) {
        AnonymousClass00S r0 = this.A01;
        long A05 = r0.A05();
        long A052 = r0.A05();
        long A053 = r0.A05();
        boolean z = false;
        boolean z2 = false;
        if (A05 > 0) {
            z2 = true;
        }
        AnonymousClass00E.A07(z2);
        if (A053 > 0) {
            z = true;
        }
        AnonymousClass00E.A07(z);
        if (str != null) {
            AnonymousClass1W6 r5 = new AnonymousClass1W6(str, i, A05, A052, 0, 0, 0, 0, 0, 0);
            AnonymousClass008.A1S(AnonymousClass008.A0S("mediajobdb/create/"), r5.A09);
            this.A03.ANF(new RunnableEBaseShape3S0200000_I0_2(this, r5, 22));
            return r5;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00be, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass1W6 A03(java.lang.String r26, int r27) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Ci.A03(java.lang.String, int):X.1W6");
    }

    public void A04(AnonymousClass1W6 r4) {
        if (A06(r4)) {
            AnonymousClass08V r2 = this.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(r4.A09);
            sb.append(r4.A07);
            r2.A07(sb.toString(), r4);
        }
    }

    public synchronized void A05(AnonymousClass1W6 r10) {
        AnonymousClass00E.A00();
        AnonymousClass0BK r5 = null;
        try {
            r5 = this.A02.A02();
            SQLiteDatabase sQLiteDatabase = r5.A00;
            sQLiteDatabase.beginTransaction();
            String str = r10.A09;
            int i = r10.A07;
            r5.A01("media_job", "uuid = ? AND job_type = ? ", new String[]{str, Integer.toString(i)}, "MediaJobDataStore/delete");
            sQLiteDatabase.setTransactionSuccessful();
            AnonymousClass08V r1 = this.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            r1.A04(sb.toString());
            if (sQLiteDatabase.inTransaction()) {
                sQLiteDatabase.endTransaction();
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/delete", e);
            if (r5 != null) {
                SQLiteDatabase sQLiteDatabase2 = r5.A00;
                if (sQLiteDatabase2.inTransaction()) {
                    sQLiteDatabase2.endTransaction();
                }
            }
        } catch (Throwable th) {
            if (r5 != null) {
                SQLiteDatabase sQLiteDatabase3 = r5.A00;
                if (sQLiteDatabase3.inTransaction()) {
                    sQLiteDatabase3.endTransaction();
                }
            }
            throw th;
        }
    }

    public final synchronized boolean A06(AnonymousClass1W6 r10) {
        AnonymousClass00E.A00();
        try {
            this.A02.A02().A00("media_job", A01(r10), "uuid = ? AND job_type = ? ", new String[]{r10.A09, Integer.toString(r10.A07)}, "MediaJobDataStore/updateInternal");
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("mediajobdb/update", e);
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        }
        return true;
    }
}
