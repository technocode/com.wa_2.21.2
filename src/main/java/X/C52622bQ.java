package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2bQ  reason: invalid class name and case insensitive filesystem */
public class C52622bQ extends AnonymousClass0PN {
    public AnonymousClass1VB A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass01I A02;
    public final AnonymousClass09V A03;
    public final C015308l A04;
    public final C014508d A05;
    public final C015408m A06;
    public final C02340Bp A07;
    public final C02350Bq A08;

    public C52622bQ(C015308l r3, AnonymousClass009 r4, AnonymousClass01I r5, C02340Bp r6, C015408m r7, AnonymousClass09V r8, C014508d r9, C02350Bq r10, AnonymousClass0PQ r11) {
        super("receipt_user", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r11);
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
        this.A07 = r6;
        this.A06 = r7;
        this.A03 = r8;
        this.A05 = r9;
        this.A08 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
        if (X.AnonymousClass1VY.A0b(r5) != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0132, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(android.database.Cursor r27) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52622bQ.A07(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A06.A03("receipt_user_ready", 2);
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
            java.lang.String r1 = "DELETE FROM receipt_user"
            java.lang.String r0 = "CLEAR_TABLE_RECEIPT_USER"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0036 }
            X.08m r1 = r5.A06     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "receipt_user_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_receipt_index"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "migration_receipt_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0036 }
            r3.A00()     // Catch:{ all -> 0x0036 }
            r3.close()
            r4.close()
            java.lang.String r0 = "ReceiptUserStore/ReceiptUserStoreDatabaseMigration/resetMigration/done"
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
        throw new UnsupportedOperationException("Method not decompiled: X.C52622bQ.A0D():void");
    }

    public final void A0P(long j, UserJid userJid, C48122Kz r9) {
        long A022 = this.A04.A02(userJid);
        if (A022 == -1) {
            this.A01.A04("ReceiptUserStoreDatabaseMigration: invalid jid", userJid.getObfuscatedString(), false);
            return;
        }
        this.A00.A06(1, j);
        this.A00.A06(2, A022);
        this.A00.A06(3, r9.A00);
        this.A00.A06(4, r9.A02);
        this.A00.A06(5, r9.A01);
        this.A00.A01();
        this.A00.A02();
    }
}
