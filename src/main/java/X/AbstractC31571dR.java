package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1dR  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC31571dR implements AnonymousClass1EY {
    public static final AbstractC18210sy A00;
    public static final Object A01 = new Object();
    public static final Logger A02 = Logger.getLogger(AbstractC31571dR.class.getName());
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile C18250t2 listeners;
    public volatile Object value;
    public volatile C18260t3 waiters;

    static {
        AbstractC18210sy r4;
        Throwable th;
        try {
            r4 = new C31551dP(AtomicReferenceFieldUpdater.newUpdater(C18260t3.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C18260t3.class, C18260t3.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC31571dR.class, C18260t3.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC31571dR.class, C18250t2.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC31571dR.class, Object.class, "value"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            r4 = new C31561dQ();
        }
        A00 = r4;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static Object A00(AnonymousClass1EY r4) {
        if (r4 instanceof AbstractC31571dR) {
            Object obj = ((AbstractC31571dR) r4).value;
            if (!(obj instanceof C18220sz)) {
                return obj;
            }
            C18220sz r1 = (C18220sz) obj;
            if (!r1.A01) {
                return obj;
            }
            Throwable th = r1.A00;
            return th != null ? new C18220sz(false, th) : C18220sz.A02;
        }
        boolean isCancelled = r4.isCancelled();
        if ((!A03) && isCancelled) {
            return C18220sz.A02;
        }
        try {
            Object A022 = A02(r4);
            return A022 == null ? A01 : A022;
        } catch (ExecutionException e) {
            return new C18240t1(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C18220sz(false, e2);
            }
            StringBuilder sb = new StringBuilder("get() threw CancellationException, despite reporting isCancelled() == false: ");
            sb.append(r4);
            return new C18240t1(new IllegalArgumentException(sb.toString(), e2));
        } catch (Throwable th2) {
            return new C18240t1(th2);
        }
    }

    public static final Object A01(Object obj) {
        if (obj instanceof C18220sz) {
            Throwable th = ((C18220sz) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C18240t1) {
            throw new ExecutionException(((C18240t1) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public static Object A02(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static void A03(AbstractC31571dR r6) {
        C18250t2 r1;
        C18250t2 r2;
        C18250t2 r4 = null;
        while (true) {
            C18260t3 r12 = r6.waiters;
            AbstractC18210sy r3 = A00;
            if (r3.A01(r6, r12, C18260t3.A00)) {
                while (r12 != null) {
                    Thread thread = r12.thread;
                    if (thread != null) {
                        r12.thread = null;
                        LockSupport.unpark(thread);
                    }
                    r12 = r12.next;
                }
                do {
                    r1 = r6.listeners;
                } while (!r3.A00(r6, r1, C18250t2.A03));
                while (true) {
                    r2 = r4;
                    r4 = r1;
                    if (r1 == null) {
                        break;
                    }
                    r1 = r1.A00;
                    r4.A00 = r2;
                }
                while (r2 != null) {
                    r4 = r2.A00;
                    Runnable runnable = r2.A01;
                    if (RunnableEBaseShape5S0200000_I1_0.A09(runnable)) {
                        RunnableEBaseShape5S0200000_I1_0 runnableEBaseShape5S0200000_I1_0 = (RunnableEBaseShape5S0200000_I1_0) runnable;
                        r6 = (AbstractC31571dR) runnableEBaseShape5S0200000_I1_0.A01;
                        if (r6.value == runnableEBaseShape5S0200000_I1_0 && r3.A02(r6, runnableEBaseShape5S0200000_I1_0, A00((AnonymousClass1EY) runnableEBaseShape5S0200000_I1_0.A00))) {
                        }
                    } else {
                        A04(runnable, r2.A02);
                    }
                    r2 = r4;
                }
                return;
            }
        }
    }

    public static void A04(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A02;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), (Throwable) e);
        }
    }

    public final void A05(C18260t3 r6) {
        r6.thread = null;
        while (true) {
            C18260t3 r3 = this.waiters;
            if (r3 != C18260t3.A00) {
                C18260t3 r2 = null;
                while (r3 != null) {
                    C18260t3 r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A00.A01(this, r3, r1)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    public final void A06(StringBuilder sb) {
        String str;
        try {
            Object A022 = A02(this);
            sb.append("SUCCESS, result=[");
            if (A022 == this) {
                str = "this future";
            } else {
                str = String.valueOf(A022);
            }
            sb.append(str);
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // X.AnonymousClass1EY
    public final void A1o(Runnable runnable, Executor executor) {
        if (executor != null) {
            C18250t2 r3 = this.listeners;
            C18250t2 r2 = C18250t2.A03;
            if (r3 != r2) {
                C18250t2 r1 = new C18250t2(runnable, executor);
                do {
                    r1.A00 = r3;
                    if (!A00.A00(this, r3, r1)) {
                        r3 = this.listeners;
                    } else {
                        return;
                    }
                } while (r3 != r2);
            }
            A04(runnable, executor);
            return;
        }
        throw null;
    }

    public final boolean cancel(boolean z) {
        C18220sz r3;
        Object obj = this.value;
        boolean z2 = false;
        if (obj == null) {
            z2 = true;
        }
        if (!z2 && !RunnableEBaseShape5S0200000_I1_0.A09(obj)) {
            return false;
        }
        if (A03) {
            r3 = new C18220sz(z, new CancellationException("Future.cancel() was called."));
        } else {
            r3 = z ? C18220sz.A03 : C18220sz.A02;
        }
        boolean z3 = false;
        AbstractC31571dR r2 = this;
        while (true) {
            if (A00.A02(r2, obj, r3)) {
                A03(r2);
                if (!RunnableEBaseShape5S0200000_I1_0.A09(obj)) {
                    break;
                }
                AnonymousClass1EY r22 = (AnonymousClass1EY) ((RunnableEBaseShape5S0200000_I1_0) obj).A00;
                if (!(r22 instanceof AbstractC31571dR)) {
                    r22.cancel(z);
                    break;
                }
                r2 = (AbstractC31571dR) r22;
                obj = r2.value;
                boolean z4 = false;
                if (obj == null) {
                    z4 = true;
                }
                if (!z4 && !RunnableEBaseShape5S0200000_I1_0.A09(obj)) {
                    break;
                }
                z3 = true;
            } else {
                obj = r2.value;
                if (!RunnableEBaseShape5S0200000_I1_0.A09(obj)) {
                    return z3;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        boolean z;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            boolean z2 = false;
            if (obj2 != null) {
                z2 = true;
            }
            if (z2 && (!RunnableEBaseShape5S0200000_I1_0.A09(obj2))) {
                return A01(obj2);
            }
            C18260t3 r4 = this.waiters;
            C18260t3 r2 = C18260t3.A00;
            if (r4 != r2) {
                C18260t3 r3 = new C18260t3();
                do {
                    AbstractC18210sy r1 = A00;
                    if (!(r1 instanceof C31561dQ)) {
                        ((C31551dP) r1).A02.lazySet(r3, r4);
                    } else {
                        r3.next = r4;
                    }
                    if (!r1.A01(this, r4, r3)) {
                        r4 = this.waiters;
                    } else {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                                z = false;
                                if (obj != null) {
                                    z = true;
                                }
                            } else {
                                A05(r3);
                                throw new InterruptedException();
                            }
                        } while (!(z & (!RunnableEBaseShape5S0200000_I1_0.A09(obj))));
                        return A01(obj);
                    }
                } while (r4 != r2);
            }
            return A01(this.value);
        }
        throw new InterruptedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f9, code lost:
        if (r2 > 1000) goto L_0x00fb;
     */
    @Override // java.util.concurrent.Future
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
        // Method dump skipped, instructions count: 362
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC31571dR.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C18220sz;
    }

    public final boolean isDone() {
        Object obj = this.value;
        boolean z = false;
        if (obj != null) {
            z = true;
        }
        return (!RunnableEBaseShape5S0200000_I1_0.A09(obj)) & z;
    }

    public String toString() {
        String str;
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.value instanceof C18220sz) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            A06(sb);
        } else {
            try {
                Object obj = this.value;
                if (RunnableEBaseShape5S0200000_I1_0.A09(obj)) {
                    StringBuilder A0S = AnonymousClass008.A0S("setFuture=[");
                    Object obj2 = ((RunnableEBaseShape5S0200000_I1_0) obj).A00;
                    if (obj2 == this) {
                        valueOf = "this future";
                    } else {
                        valueOf = String.valueOf(obj2);
                    }
                    str = AnonymousClass008.A0O(A0S, valueOf, "]");
                } else if (this instanceof ScheduledFuture) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("remaining delay=[");
                    A0S2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
                    A0S2.append(" ms]");
                    str = A0S2.toString();
                } else {
                    str = null;
                }
            } catch (RuntimeException e) {
                StringBuilder A0S3 = AnonymousClass008.A0S("Exception thrown from implementation: ");
                A0S3.append(e.getClass());
                str = A0S3.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                A06(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
