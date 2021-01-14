package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1yk  reason: invalid class name and case insensitive filesystem */
public class C43661yk extends AnonymousClass0PN {
    public final AnonymousClass01I A00;
    public final AnonymousClass09V A01;
    public final AnonymousClass090 A02;
    public final C015408m A03;
    public final AnonymousClass01N A04;
    public final C02350Bq A05;

    public C43661yk(AnonymousClass01I r3, C015408m r4, AnonymousClass09V r5, AnonymousClass01N r6, C02350Bq r7, AnonymousClass090 r8, AnonymousClass0PQ r9) {
        super("receipt_device", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r9);
        this.A00 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x019e, code lost:
        if (X.AnonymousClass1VY.A0b(r0) != false) goto L_0x01a0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(android.database.Cursor r32) {
        /*
        // Method dump skipped, instructions count: 658
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43661yk.A07(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A03.A03("receipt_device_migration_complete", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0043, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r5 = this;
            super.A0D()
            X.08d r0 = r5.A05
            X.0OQ r4 = r0.A04()
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x003d }
            X.0BK r2 = r4.A04     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "DELETE FROM receipt_device"
            java.lang.String r0 = "CLEAR_TABLE_RECEIPT_DEVICE"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0036 }
            X.08m r1 = r5.A03     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "receipt_device_migration_complete"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_receipt_device_index"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_receipt_device_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            r3.A00()     // Catch:{ all -> 0x0036 }
            r3.close()
            r4.close()
            java.lang.String r0 = "ReceiptDeviceStore/ReceiptDeviceDatabaseMigration/resetMigration/done"
            com.whatsapp.util.Log.i(r0)
            return
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        L_0x003d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43661yk.A0D():void");
    }
}
