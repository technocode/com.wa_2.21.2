package X;

import android.os.CancellationSignal;

/* renamed from: X.0Iy  reason: invalid class name and case insensitive filesystem */
public final class C04080Iy {
    public AbstractC14740mo A00;
    public Object A01;
    public boolean A02;
    public boolean A03;

    public Object A00() {
        Object obj;
        synchronized (this) {
            if (this.A01 == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.A01 = cancellationSignal;
                if (this.A03) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.A01;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        ((X.C30201av) r2).A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        ((android.os.CancellationSignal) r0).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.A02 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.A02 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A03     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            return
        L_0x0007:
            r0 = 1
            r3.A03 = r0     // Catch:{ all -> 0x0038 }
            r3.A02 = r0     // Catch:{ all -> 0x0038 }
            X.0mo r2 = r3.A00     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0038 }
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r2 == 0) goto L_0x0019
            X.1av r2 = (X.C30201av) r2
            r2.A00()     // Catch:{ all -> 0x0021 }
        L_0x0019:
            if (r0 == 0) goto L_0x002d
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0     // Catch:{ all -> 0x0021 }
            r0.cancel()     // Catch:{ all -> 0x0021 }
            goto L_0x002d
        L_0x0021:
            r0 = move-exception
            monitor-enter(r3)
            r3.A02 = r1     // Catch:{ all -> 0x002a }
            r3.notifyAll()     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x002d:
            monitor-enter(r3)
            r3.A02 = r1     // Catch:{ all -> 0x0035 }
            r3.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04080Iy.A01():void");
    }

    public void A02() {
        if (A03()) {
            throw new C14750mp();
        }
    }

    public boolean A03() {
        boolean z;
        synchronized (this) {
            z = this.A03;
        }
        return z;
    }
}
