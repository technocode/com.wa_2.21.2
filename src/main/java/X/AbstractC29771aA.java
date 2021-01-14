package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.1aA  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC29771aA implements AnonymousClass1EY {
    public static final AbstractC13850l7 A00;
    public static final Object A01 = new Object();
    public static final Logger A02 = Logger.getLogger(AbstractC29771aA.class.getName());
    public static final boolean A03 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public volatile C13890lB listeners;
    public volatile Object value;
    public volatile C13900lC waiters;

    static {
        AbstractC13850l7 r4;
        Throwable th;
        try {
            r4 = new C29751a8(AtomicReferenceFieldUpdater.newUpdater(C13900lC.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(C13900lC.class, C13900lC.class, "next"), AtomicReferenceFieldUpdater.newUpdater(AbstractC29771aA.class, C13900lC.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(AbstractC29771aA.class, C13890lB.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(AbstractC29771aA.class, Object.class, "value"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            r4 = new C29761a9();
        }
        A00 = r4;
        if (th != null) {
            A02.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    public static final Object A00(Object obj) {
        if (obj instanceof C13860l8) {
            Throwable th = ((C13860l8) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C13880lA) {
            throw new ExecutionException(((C13880lA) obj).A00);
        } else if (obj == A01) {
            return null;
        } else {
            return obj;
        }
    }

    public static void A01(AbstractC29771aA r4) {
        C13900lC r1;
        AbstractC13850l7 r2;
        C13890lB r12;
        C13890lB r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A00;
        } while (!r2.A01(r4, r1, C13900lC.A00));
        while (r1 != null) {
            Thread thread = r1.thread;
            if (thread != null) {
                r1.thread = null;
                LockSupport.unpark(thread);
            }
            r1 = r1.next;
        }
        do {
            r12 = r4.listeners;
        } while (!r2.A00(r4, r12, C13890lB.A03));
        while (r12 != null) {
            C13890lB r0 = r12.A00;
            r12.A00 = r3;
            r3 = r12;
            r12 = r0;
        }
        while (r3 != null) {
            C13890lB r22 = r3.A00;
            A02(r3.A01, r3.A02);
            r3 = r22;
        }
    }

    public static void A02(Runnable runnable, Executor executor) {
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

    public final void A03(C13900lC r6) {
        r6.thread = null;
        while (true) {
            C13900lC r3 = this.waiters;
            if (r3 != C13900lC.A00) {
                C13900lC r2 = null;
                while (r3 != null) {
                    C13900lC r1 = r3.next;
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

    public final void A04(StringBuilder sb) {
        Object obj;
        String str;
        boolean z = false;
        while (true) {
            try {
                obj = get();
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
            try {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            str = "this future";
        } else {
            str = String.valueOf(obj);
        }
        sb.append(str);
        sb.append("]");
    }

    public void A05(Throwable th) {
        if (A00.A02(this, null, new C13880lA(th))) {
            A01(this);
        }
    }

    public boolean A06(Object obj) {
        if (obj == null) {
            obj = A01;
        }
        if (!A00.A02(this, null, obj)) {
            return false;
        }
        A01(this);
        return true;
    }

    @Override // X.AnonymousClass1EY
    public final void A1o(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw null;
        } else if (executor != null) {
            C13890lB r3 = this.listeners;
            C13890lB r2 = C13890lB.A03;
            if (r3 != r2) {
                C13890lB r1 = new C13890lB(runnable, executor);
                do {
                    r1.A00 = r3;
                    if (!A00.A00(this, r3, r1)) {
                        r3 = this.listeners;
                    } else {
                        return;
                    }
                } while (r3 != r2);
            }
            A02(runnable, executor);
        } else {
            throw null;
        }
    }

    public final boolean cancel(boolean z) {
        C13860l8 r1;
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (A03) {
            r1 = new C13860l8(z, new CancellationException("Future.cancel() was called."));
        } else {
            r1 = z ? C13860l8.A03 : C13860l8.A02;
        }
        if (!A00.A02(this, obj, r1)) {
            return false;
        }
        A01(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if (obj2 != null) {
                return A00(obj2);
            }
            C13900lC r4 = this.waiters;
            C13900lC r3 = C13900lC.A00;
            if (r4 != r3) {
                C13900lC r2 = new C13900lC();
                do {
                    AbstractC13850l7 r1 = A00;
                    if (!(r1 instanceof C29761a9)) {
                        ((C29751a8) r1).A02.lazySet(r2, r4);
                    } else {
                        r2.next = r4;
                    }
                    if (!r1.A01(this, r4, r2)) {
                        r4 = this.waiters;
                    } else {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                A03(r2);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return A00(obj);
                    }
                } while (r4 != r3);
            }
            return A00(this.value);
        }
        throw new InterruptedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d8, code lost:
        if (r2 > 1000) goto L_0x00da;
     */
    @Override // java.util.concurrent.Future
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
        // Method dump skipped, instructions count: 329
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29771aA.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C13860l8;
    }

    public final boolean isDone() {
        boolean z = false;
        if (this.value != null) {
            z = true;
        }
        return true & z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.value instanceof C13860l8) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            A04(sb);
        } else {
            try {
                if (this instanceof AnonymousClass23Y) {
                    C13910lD r2 = (C13910lD) ((AnonymousClass23Y) this).A00.A01.get();
                    if (r2 == null) {
                        str = "Completer object has been garbage collected, future will fail soon";
                    } else {
                        StringBuilder A0S = AnonymousClass008.A0S("tag=[");
                        A0S.append(r2.A02);
                        A0S.append("]");
                        str = A0S.toString();
                    }
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
                A04(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
