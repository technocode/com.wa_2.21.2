package X;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: X.1V3  reason: invalid class name */
public class AnonymousClass1V3 implements SQLiteTransactionListener {
    public final /* synthetic */ Runnable A00;

    public void onBegin() {
    }

    public void onRollback() {
    }

    public AnonymousClass1V3(Runnable runnable) {
        this.A00 = runnable;
    }

    public void onCommit() {
        this.A00.run();
    }
}
