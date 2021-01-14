package X;

import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.023  reason: invalid class name */
public final class AnonymousClass023 extends LinkedBlockingQueue<Runnable> {
    public AnonymousClass023() {
        super(2048);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.concurrent.BlockingQueue, java.util.Queue, java.util.concurrent.LinkedBlockingQueue
    public boolean offer(Runnable runnable) {
        if (size() == 0) {
            return super.offer(runnable);
        }
        return false;
    }
}
