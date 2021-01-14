package X;

import android.database.Cursor;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.0PO  reason: invalid class name */
public class AnonymousClass0PO extends AnonymousClass0PN {
    public static volatile AnonymousClass0PO A02;
    public final AnonymousClass009 A00;
    public final C014408c A01;

    @Override // X.AnonymousClass0PN
    public void A0D() {
    }

    public AnonymousClass0PO(AnonymousClass0PQ r3) {
        super("migration_chat_store", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r3);
        C014408c r0 = r3.A0A;
        if (r0 != null) {
            this.A01 = r0;
            AnonymousClass009 r02 = r3.A01;
            if (r02 != null) {
                this.A00 = r02;
                return;
            }
            throw null;
        }
        throw null;
    }

    public static AnonymousClass0PO A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0PO.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0PO(AnonymousClass0PQ.A00());
                }
            }
        }
        return A02;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        return new Pair(0L, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03f1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03f2, code lost:
        if (r3 != null) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03f7, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0472, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0476, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0479, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x047a, code lost:
        if (r18 != null) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x047f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x02ef, code lost:
        if (r2 == 0) goto L_0x02f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0368, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0369, code lost:
        if (r15 != null) goto L_0x036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x036e, code lost:
        throw r2;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0O(X.AnonymousClass0PS r46) {
        /*
        // Method dump skipped, instructions count: 1244
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PO.A0O(X.0PS):boolean");
    }
}
