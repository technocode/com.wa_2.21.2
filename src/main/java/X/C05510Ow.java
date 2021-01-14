package X;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.0Ow  reason: invalid class name and case insensitive filesystem */
public final class C05510Ow extends LinkedBlockingDeque<Runnable> {
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.LinkedBlockingDeque, java.util.concurrent.BlockingQueue, java.util.Queue, java.util.Deque
    public boolean offer(Runnable runnable) {
        return isEmpty() && super.offer(runnable);
    }
}
