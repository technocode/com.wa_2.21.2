package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: X.0s1  reason: invalid class name */
public abstract class AnonymousClass0s1 {
    public static final String A00 = AbstractC17610rq.A01("WorkerFactory");

    public final ListenableWorker A00(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker listenableWorker = null;
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            if (asSubclass != null) {
                try {
                    ListenableWorker listenableWorker2 = (ListenableWorker) asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    listenableWorker = listenableWorker2;
                    if (listenableWorker2 != null && listenableWorker2.A02) {
                        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
                    }
                } catch (Exception e) {
                    AbstractC17610rq.A00().A03(A00, AnonymousClass008.A0K("Could not instantiate ", str), e);
                    return null;
                }
            }
        } catch (ClassNotFoundException unused) {
            AbstractC17610rq.A00().A03(A00, AnonymousClass008.A0K("Class not found: ", str), new Throwable[0]);
        }
        return listenableWorker;
    }
}
