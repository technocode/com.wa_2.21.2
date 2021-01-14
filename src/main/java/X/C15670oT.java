package X;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.0oT  reason: invalid class name and case insensitive filesystem */
public class C15670oT extends FutureTask {
    public final /* synthetic */ AbstractC15710oX A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15670oT(AbstractC15710oX r1, Callable callable) {
        super(callable);
        this.A00 = r1;
    }

    public void done() {
        try {
            Object obj = get();
            AbstractC15710oX r1 = this.A00;
            if (!r1.A03.get()) {
                r1.A00(obj);
            }
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException unused) {
            AbstractC15710oX r2 = this.A00;
            if (!r2.A03.get()) {
                r2.A00(null);
            }
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
