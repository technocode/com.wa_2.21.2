package X;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Collections;

/* renamed from: X.08v  reason: invalid class name and case insensitive filesystem */
public class C016308v {
    public static volatile C016308v A03;
    public AnonymousClass0PU A00;
    public final AnonymousClass00S A01;
    public final C016408w A02;

    public C016308v(AnonymousClass00S r3, AnonymousClass00G r4, AnonymousClass04q r5) {
        this.A01 = r3;
        this.A02 = new C016408w(r4.A00, r5);
    }

    public static C016308v A00() {
        if (A03 == null) {
            synchronized (C016308v.class) {
                if (A03 == null) {
                    A03 = new C016308v(AnonymousClass00S.A00(), AnonymousClass00G.A01, AnonymousClass04q.A00());
                }
            }
        }
        return A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        if (r2 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0PU A01() {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016308v.A01():X.0PU");
    }

    public void A02(C05350Oe r7) {
        AnonymousClass0BK A002 = this.A02.A00();
        SQLiteDatabase sQLiteDatabase = A002.A00;
        sQLiteDatabase.beginTransaction();
        try {
            synchronized (this) {
                String[] A0g = AnonymousClass1VY.A0g(r7.A02());
                String join = TextUtils.join(", ", Collections.nCopies(A0g.length, "?"));
                StringBuilder sb = new StringBuilder();
                sb.append("device_id IN (");
                sb.append(join);
                sb.append(")");
                A002.A01("devices", sb.toString(), A0g, "removeDevices/DELETE_DEVICES");
                sQLiteDatabase.setTransactionSuccessful();
                this.A00 = null;
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
