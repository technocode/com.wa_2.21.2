package X;

import android.os.ConditionVariable;

/* renamed from: X.0EU  reason: invalid class name */
public class AnonymousClass0EU extends AnonymousClass01G {
    public static final AnonymousClass0EU A03 = new AnonymousClass0EU();
    public boolean A00 = false;
    public final ConditionVariable A01 = new ConditionVariable(false);
    public final Object A02 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        r3 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = r4.A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        r1 = (X.AnonymousClass0AY) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r1.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        ((X.AnonymousClass0DJ) r1.next()).ADz(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(boolean r5) {
        /*
            r4 = this;
            java.lang.Object r1 = r4.A02
            monitor-enter(r1)
            boolean r0 = r4.A00     // Catch:{ all -> 0x003b }
            if (r0 != r5) goto L_0x0009
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            return
        L_0x0009:
            r4.A00 = r5     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x000e
            goto L_0x0014
        L_0x000e:
            android.os.ConditionVariable r0 = r4.A01     // Catch:{ all -> 0x003b }
            r0.close()     // Catch:{ all -> 0x003b }
            goto L_0x0019
        L_0x0014:
            android.os.ConditionVariable r0 = r4.A01     // Catch:{ all -> 0x003b }
            r0.open()     // Catch:{ all -> 0x003b }
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            X.01s r3 = r4.A00
            monitor-enter(r3)
            X.01s r0 = r4.A00     // Catch:{ all -> 0x0038 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x0023:
            r1 = r2
            X.0AY r1 = (X.AnonymousClass0AY) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()
            X.0DJ r0 = (X.AnonymousClass0DJ) r0
            r0.ADz(r5)
            goto L_0x0023
        L_0x0036:
            monitor-exit(r3)
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EU.A02(boolean):void");
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A02) {
            z = this.A00;
        }
        return z;
    }
}
