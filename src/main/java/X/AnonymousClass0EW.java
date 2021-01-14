package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.0EW  reason: invalid class name */
public class AnonymousClass0EW {
    public static final AnonymousClass0EW A01 = new AnonymousClass0EW();
    public final Handler A00;

    public AnonymousClass0EW() {
        HandlerThread handlerThread = new HandlerThread("db_write", 10);
        handlerThread.start();
        this.A00 = new Handler(handlerThread.getLooper());
    }
}
