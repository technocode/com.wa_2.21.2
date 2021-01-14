package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: X.0qw  reason: invalid class name and case insensitive filesystem */
public class C17080qw extends SQLiteOpenHelper {
    public boolean A00;
    public final AbstractC17000qo A01;
    public final C30761bu[] A02;

    public C17080qw(Context context, String str, C30761bu[] r9, AbstractC17000qo r10) {
        super(context, str, null, r10.A00, new C17070qv(r10, r9));
        this.A01 = r10;
        this.A02 = r9;
    }

    public static C30761bu A00(C30761bu[] r2, SQLiteDatabase sQLiteDatabase) {
        C30761bu r0 = r2[0];
        if (r0 == null || r0.A00 != sQLiteDatabase) {
            r2[0] = new C30761bu(sQLiteDatabase);
        }
        return r2[0];
    }

    public synchronized AbstractC16990qn A01() {
        this.A00 = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.A00) {
            close();
            return A01();
        }
        return A00(this.A02, writableDatabase);
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        this.A02[0] = null;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        AbstractC17000qo r1 = this.A01;
        A00(this.A02, sQLiteDatabase);
        if (r1 == null) {
            throw null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r2.getInt(0) != 0) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.database.sqlite.SQLiteDatabase r8) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17080qw.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.A00 = true;
        this.A01.A01(A00(this.A02, sQLiteDatabase), i, i2);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r3.getInt(0) == 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOpen(android.database.sqlite.SQLiteDatabase r12) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17080qw.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.A00 = true;
        this.A01.A01(A00(this.A02, sQLiteDatabase), i, i2);
    }
}
