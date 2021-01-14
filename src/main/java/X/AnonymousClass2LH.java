package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2LH  reason: invalid class name */
public class AnonymousClass2LH implements SQLiteTransactionListener {
    public final /* synthetic */ AtomicBoolean A00;

    public void onBegin() {
    }

    public void onCommit() {
    }

    public AnonymousClass2LH(AtomicBoolean atomicBoolean) {
        this.A00 = atomicBoolean;
    }

    public void onRollback() {
        this.A00.set(false);
    }
}
