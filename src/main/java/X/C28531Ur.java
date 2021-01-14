package X;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Ur  reason: invalid class name and case insensitive filesystem */
public class C28531Ur implements SQLiteTransactionListener {
    public final /* synthetic */ C015108j A00;
    public final /* synthetic */ AtomicBoolean A01;

    public C28531Ur(C015108j r1, AtomicBoolean atomicBoolean) {
        this.A00 = r1;
        this.A01 = atomicBoolean;
    }

    public void onBegin() {
        this.A01.set(false);
    }

    public void onCommit() {
        this.A01.set(true);
    }

    public void onRollback() {
        this.A01.set(false);
    }
}
