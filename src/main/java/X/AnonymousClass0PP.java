package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0PP  reason: invalid class name */
public class AnonymousClass0PP extends AnonymousClass0PN {
    public static volatile AnonymousClass0PP A05;
    public final AnonymousClass01I A00;
    public final C000300f A01;
    public final C015308l A02;
    public final C015408m A03;
    public final AnonymousClass09E A04;

    public AnonymousClass0PP(C015308l r3, AnonymousClass01I r4, C000300f r5, AnonymousClass09E r6, C015408m r7, AnonymousClass0PQ r8) {
        super("blank_me_jid", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r8);
        this.A02 = r3;
        this.A00 = r4;
        this.A01 = r5;
        this.A04 = r6;
        this.A03 = r7;
    }

    public static AnonymousClass0PP A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0PP.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0PP(C015308l.A00(), AnonymousClass01I.A00(), C000300f.A00(), AnonymousClass09E.A00(), C015408m.A00(), AnonymousClass0PQ.A00());
                }
            }
        }
        return A05;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x008e */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: android.content.ContentValues */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        if (r2 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0131, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(android.database.Cursor r28) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PP.A07(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A03.A03("blank_me_jid_ready", 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r4 = this;
            super.A0D()
            X.08d r0 = r4.A05
            X.0OQ r3 = r0.A04()
            X.0Rk r2 = r3.A00()     // Catch:{ all -> 0x0034 }
            X.08m r1 = r4.A03     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "blank_me_jid_ready"
            r1.A02(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "migration_blank_me_jid_index"
            r1.A02(r0)     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "migration_blank_me_jid_retry"
            r1.A02(r0)     // Catch:{ all -> 0x002d }
            r2.A00()     // Catch:{ all -> 0x002d }
            r2.close()
            r3.close()
            java.lang.String r0 = "BlankMeJidDatabaseMigration/resetDatabaseMigration/done"
            com.whatsapp.util.Log.i(r0)
            return
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0
        L_0x0034:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003a }
        L_0x003a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PP.A0D():void");
    }
}
