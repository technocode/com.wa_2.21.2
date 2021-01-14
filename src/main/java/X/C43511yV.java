package X;

import android.database.SQLException;
import android.database.sqlite.SQLiteBlobTooBigException;
import android.database.sqlite.SQLiteDatabase;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1yV  reason: invalid class name and case insensitive filesystem */
public class C43511yV extends AnonymousClass0PN {
    public final AnonymousClass0AM A00;
    public final C015408m A01;
    public final Map A02 = new HashMap();

    public C43511yV(C015408m r3, AnonymousClass0AM r4, AnonymousClass0PQ r5) {
        super("message_fts", EditorInfoCompat.IME_FLAG_FORCE_ASCII, r5);
        this.A01 = r3;
        this.A00 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A07(android.database.Cursor r19) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43511yV.A07(android.database.Cursor):android.util.Pair");
    }

    @Override // X.AnonymousClass0PN
    public void A0C() {
        super.A0C();
        this.A01.A04("fts_ready", 5);
    }

    @Override // X.AnonymousClass0PN
    public void A0D() {
        super.A0D();
        AnonymousClass00E.A07(false);
        C04600Kz r6 = new C04600Kz("FtsMessageStore/reset");
        AnonymousClass0AM r0 = this.A00;
        r0.A0J();
        C014508d r10 = r0.A0C;
        r10.A05();
        C015108j r8 = r10.A07;
        if (r8 != null) {
            C04600Kz r4 = new C04600Kz("databasehelper/createFtsTable");
            AnonymousClass0BK A9x = r8.A9x();
            try {
                SQLiteDatabase sQLiteDatabase = A9x.A00;
                sQLiteDatabase.beginTransaction();
                A9x.A0C("CREATE VIRTUAL TABLE message_ftsv2 USING FTS4(content, fts_jid, fts_namespace)", "CREATE_MESSAGE_FTS_TABLE");
                C000300f r7 = r8.A05;
                r8.A0D(sQLiteDatabase, r7, C015108j.A08(sQLiteDatabase));
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
                AnonymousClass008.A0s(r4, AnonymousClass008.A0S("databasehelper/createFtsDeprecatedTable time spent:"));
                r10.A05();
                if (r8 != null) {
                    C04600Kz r42 = new C04600Kz("databasehelper/createFtsDeprecatedTable");
                    A9x = r8.A9x();
                    try {
                        SQLiteDatabase sQLiteDatabase2 = A9x.A00;
                        sQLiteDatabase2.beginTransaction();
                        A9x.A0C("CREATE VIRTUAL TABLE messages_fts USING FTS3()", "CREATE_MESSAGES_FTS_TABLE_DEPRECATED");
                        r8.A0D(sQLiteDatabase2, r7, C015108j.A08(sQLiteDatabase2));
                        sQLiteDatabase2.setTransactionSuccessful();
                        if (sQLiteDatabase2.inTransaction()) {
                            sQLiteDatabase2.endTransaction();
                        }
                        StringBuilder A0S = AnonymousClass008.A0S("databasehelper/createFtsDeprecatedTable time spent:");
                        A0S.append(r42.A01());
                        Log.i(A0S.toString());
                        r6.A01();
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    throw null;
                }
            } finally {
                SQLiteDatabase sQLiteDatabase3 = A9x.A00;
                if (sQLiteDatabase3.inTransaction()) {
                    sQLiteDatabase3.endTransaction();
                }
            }
        } else {
            throw null;
        }
    }

    @Override // X.AnonymousClass0PN
    public boolean A0N(SQLException sQLException, int i) {
        if (i != 1 || !(sQLException instanceof SQLiteBlobTooBigException)) {
            return super.A0N(sQLException, i);
        }
        Log.e("FtsDatabaseMigration/skipping BlobTooBigException single row");
        return true;
    }
}
