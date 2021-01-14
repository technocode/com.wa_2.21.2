package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.38C  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38C implements ThreadFactory {
    public static final /* synthetic */ AnonymousClass38C A00 = new AnonymousClass38C();

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "VoIP Signaling Thread");
    }
}
