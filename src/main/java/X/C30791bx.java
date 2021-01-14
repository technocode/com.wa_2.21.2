package X;

import android.database.sqlite.SQLiteProgram;

/* renamed from: X.1bx  reason: invalid class name and case insensitive filesystem */
public class C30791bx implements AbstractC17040qs {
    public final SQLiteProgram A00;

    public C30791bx(SQLiteProgram sQLiteProgram) {
        this.A00 = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A00.close();
    }
}
