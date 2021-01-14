package X;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: X.04q  reason: invalid class name */
public class AnonymousClass04q {
    public static volatile AnonymousClass04q A03;
    public AnonymousClass04r A00;
    public AnonymousClass04t A01;
    public final Handler A02;

    public AnonymousClass04q(AnonymousClass04r r3, AnonymousClass04t r4) {
        this.A00 = r3;
        this.A01 = r4;
        HandlerThread handlerThread = new HandlerThread("SQL Logger");
        handlerThread.start();
        this.A02 = new AnonymousClass04u(handlerThread.getLooper(), r3);
    }

    public static AnonymousClass04q A00() {
        if (A03 == null) {
            synchronized (AnonymousClass04q.class) {
                if (A03 == null) {
                    if (AnonymousClass04r.A02 == null) {
                        synchronized (AnonymousClass04r.class) {
                            if (AnonymousClass04r.A02 == null) {
                                AnonymousClass04r.A02 = new AnonymousClass04r(AnonymousClass00Y.A00());
                            }
                        }
                    }
                    AnonymousClass04r r2 = AnonymousClass04r.A02;
                    if (AnonymousClass04t.A00 == null) {
                        synchronized (AnonymousClass04t.class) {
                            if (AnonymousClass04t.A00 == null) {
                                AnonymousClass04t.A00 = new AnonymousClass04t();
                            }
                        }
                    }
                    A03 = new AnonymousClass04q(r2, AnonymousClass04t.A00);
                }
            }
        }
        return A03;
    }
}
