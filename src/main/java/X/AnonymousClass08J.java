package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.AbstractMap;

/* renamed from: X.08J  reason: invalid class name */
public class AnonymousClass08J implements SQLiteTransactionListener {
    public final ThreadLocal A00 = new AnonymousClass08L();
    public final ThreadLocal A01 = new AnonymousClass08K();

    public void onBegin() {
    }

    public void onCommit() {
        Object obj = this.A01.get();
        if (obj != null) {
            AbstractMap abstractMap = (AbstractMap) obj;
            try {
                for (SQLiteTransactionListener sQLiteTransactionListener : abstractMap.values()) {
                    sQLiteTransactionListener.onCommit();
                }
            } finally {
                abstractMap.clear();
                this.A00.set(Boolean.FALSE);
            }
        } else {
            throw null;
        }
    }

    public void onRollback() {
        Object obj = this.A01.get();
        if (obj != null) {
            AbstractMap abstractMap = (AbstractMap) obj;
            try {
                for (SQLiteTransactionListener sQLiteTransactionListener : abstractMap.values()) {
                    sQLiteTransactionListener.onRollback();
                }
            } finally {
                abstractMap.clear();
                this.A00.set(Boolean.FALSE);
            }
        } else {
            throw null;
        }
    }
}
