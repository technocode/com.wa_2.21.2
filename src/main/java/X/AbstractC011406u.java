package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.06u  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC011406u {
    public AbstractC011406u A00(Executor executor, AbstractC011706x r5) {
        if (!(this instanceof C011506v)) {
            throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
        }
        C011506v r2 = (C011506v) this;
        r2.A03.A01(new C36201lk(executor, r5));
        r2.A06();
        return r2;
    }

    public AbstractC011406u A01(Executor executor, AbstractC011806y r5) {
        C011506v r2 = (C011506v) this;
        r2.A03.A01(new C36221lm(executor, r5));
        r2.A06();
        return r2;
    }

    public AbstractC011406u A02(Executor executor, AbstractC011906z r5) {
        C011506v r2 = (C011506v) this;
        r2.A03.A01(new C36231ln(executor, r5));
        r2.A06();
        return r2;
    }

    public Object A03() {
        Object obj;
        C011506v r3 = (C011506v) this;
        synchronized (r3.A04) {
            C001801b.A1b(r3.A02, "Task is not yet complete");
            if (!r3.A05) {
                Exception exc = r3.A00;
                if (exc == null) {
                    obj = r3.A01;
                } else {
                    throw new C24601Bp(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r1.A00 != null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            r1 = r3
            X.06v r1 = (X.C011506v) r1
            java.lang.Object r2 = r1.A04
            monitor-enter(r2)
            boolean r0 = r1.A02     // Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0013
            boolean r0 = r1.A05     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0013
            java.lang.Exception r1 = r1.A00     // Catch:{ all -> 0x0016 }
            r0 = 1
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            return r0
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC011406u.A04():boolean");
    }
}
