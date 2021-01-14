package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.util.AbstractMap;

/* renamed from: X.0Rk  reason: invalid class name and case insensitive filesystem */
public class C06020Rk implements Closeable {
    public boolean A00 = false;
    public boolean A01;
    public final AnonymousClass0BK A02;

    public C06020Rk(AnonymousClass0BK r5, AnonymousClass08J r6, SQLiteTransactionListener sQLiteTransactionListener) {
        this.A02 = r5;
        ThreadLocal threadLocal = r6.A00;
        Object obj = threadLocal.get();
        if (obj != null) {
            if (!((Boolean) obj).booleanValue()) {
                SQLiteDatabase sQLiteDatabase = r5.A00;
                AnonymousClass00E.A08(!sQLiteDatabase.inTransaction(), "OuterTransactionManager/already-in-transaction");
                sQLiteDatabase.beginTransactionWithListener(r6);
                threadLocal.set(Boolean.TRUE);
            } else {
                r5.A00.beginTransaction();
            }
            if (sQLiteTransactionListener != null) {
                Object obj2 = new Object();
                Object obj3 = r6.A01.get();
                if (obj3 != null) {
                    ((AbstractMap) obj3).put(obj2, sQLiteTransactionListener);
                    sQLiteTransactionListener.onBegin();
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }

    public void A00() {
        this.A01 = true;
        this.A02.A00.setTransactionSuccessful();
    }

    public boolean A01() {
        return this.A02.A00.inTransaction() && !this.A00 && !this.A01;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.A00) {
            if (!this.A01) {
                Log.w("DatabaseTransaction/close/was not set successful");
            }
            this.A02.A00.endTransaction();
            this.A00 = true;
        }
    }
}
