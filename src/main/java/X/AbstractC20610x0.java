package X;

import java.io.Closeable;

/* renamed from: X.0x0  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC20610x0 implements Closeable {
    public boolean A00() {
        boolean z;
        boolean z2;
        if (!(this instanceof C32841fh)) {
            C32831fg r0 = (C32831fg) this;
            synchronized (this) {
                C20340wY r1 = r0.A00;
                z2 = false;
                if (r1 == null) {
                    z2 = true;
                }
            }
            return z2;
        }
        C32841fh r02 = (C32841fh) this;
        synchronized (this) {
            AbstractC20030w0 r12 = r02.A00;
            z = false;
            if (r12 == null) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0013, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (0 == 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001e, code lost:
        return;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r4 = this;
            r3 = r4
            boolean r0 = r4 instanceof X.C32841fh
            if (r0 != 0) goto L_0x0022
            r2 = r4
            X.1fg r2 = (X.C32831fg) r2
            monitor-enter(r3)
            X.0wY r1 = r2.A00     // Catch:{ all -> 0x001f }
            if (r1 != 0) goto L_0x000f
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            return
        L_0x000f:
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x001f }
            monitor-exit(r3)     // Catch:{ all -> 0x001f }
            monitor-enter(r1)
            if (r0 == 0) goto L_0x001d
            r0.close()     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x001d:
            monitor-exit(r1)
            return
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0022:
            r2 = r4
            X.1fh r2 = (X.C32841fh) r2
            monitor-enter(r3)
            X.0w0 r1 = r2.A00     // Catch:{ all -> 0x0034 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0034 }
            r2.A01 = r0     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)
            if (r1 == 0) goto L_0x0033
            r1.close()
        L_0x0033:
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20610x0.close():void");
    }

    @Override // java.lang.Object
    public void finalize() {
        if (!A00()) {
            C19960vt.A00.A00(5, "CloseableImage", String.format(null, "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this))));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
