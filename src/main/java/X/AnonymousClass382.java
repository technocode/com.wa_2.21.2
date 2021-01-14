package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.382  reason: invalid class name */
public final /* synthetic */ class AnonymousClass382 implements Callable {
    public static final /* synthetic */ AnonymousClass382 A00 = new AnonymousClass382();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return new AnonymousClass39I();
        } catch (RuntimeException e) {
            Log.e(e);
            return null;
        }
    }
}
