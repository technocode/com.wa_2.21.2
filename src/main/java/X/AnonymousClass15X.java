package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.15X  reason: invalid class name */
public final /* synthetic */ class AnonymousClass15X implements ThreadFactory {
    public final /* synthetic */ String A00 = "Loader:ExtractorMediaPeriod";

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.A00);
    }
}
