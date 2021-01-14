package X;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

/* renamed from: X.0qo  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17000qo {
    public final int A00;

    public AbstractC17000qo(int i) {
        this.A00 = i;
    }

    public static final void A00(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            AnonymousClass008.A1B("deleting the database file: ", str, "SupportSQLite");
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x0015 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r5 != 0) goto L_0x0015;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AbstractC16990qn r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 368
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC17000qo.A01(X.0qn, int, int):void");
    }
}
