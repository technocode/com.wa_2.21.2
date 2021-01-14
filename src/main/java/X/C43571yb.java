package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.1yb  reason: invalid class name and case insensitive filesystem */
public class C43571yb extends AnonymousClass0PN {
    public final C014408c A00;
    public final AnonymousClass09Z A01;
    public final C015408m A02;
    public final C015708p A03;

    public C43571yb(C014408c r3, C015408m r4, C015708p r5, AnonymousClass09Z r6, AnonymousClass0PQ r7) {
        super("message_media", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r7);
        this.A00 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r6;
    }

    public C43571yb(C014408c r3, C015408m r4, C015708p r5, AnonymousClass09Z r6, String str, AnonymousClass0PQ r8) {
        super("media_migration_fixer", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r8);
        this.A00 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0174, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0175, code lost:
        if (r5 != null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0181, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(android.database.Cursor r45) {
        /*
        // Method dump skipped, instructions count: 399
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43571yb.A07(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A02.A03("media_message_ready", 2);
    }
}
