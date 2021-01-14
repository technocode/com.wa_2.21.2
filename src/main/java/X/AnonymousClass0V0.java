package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.0V0  reason: invalid class name */
public class AnonymousClass0V0 extends AbstractC06850Uy {
    public final Object A00 = new Object();
    public final ExecutorService A01 = Executors.newFixedThreadPool(4, new AnonymousClass0V1());
    public volatile Handler A02;

    @Override // X.AbstractC06850Uy
    public void A01(Runnable runnable) {
        Handler handler;
        if (this.A02 == null) {
            synchronized (this.A00) {
                if (this.A02 == null) {
                    Looper mainLooper = Looper.getMainLooper();
                    if (Build.VERSION.SDK_INT >= 28) {
                        handler = Handler.createAsync(mainLooper);
                    } else {
                        try {
                            handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                            handler = new Handler(mainLooper);
                        } catch (InvocationTargetException unused2) {
                            handler = new Handler(mainLooper);
                        }
                    }
                    this.A02 = handler;
                }
            }
        }
        this.A02.post(runnable);
    }
}
