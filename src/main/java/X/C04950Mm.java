package X;

/* renamed from: X.0Mm  reason: invalid class name and case insensitive filesystem */
public final class C04950Mm extends Thread {
    public C04950Mm() {
        super("DestructorThread");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|(3:3|(3:5|(2:7|20)(1:21)|8)|19)|9|(1:11)|12|(2:14|17)(1:16)|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:15:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
        L_0x0000:
            java.lang.ref.ReferenceQueue r0 = X.C04910Mi.A03     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.ref.Reference r4 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
            X.049 r4 = (X.AnonymousClass049) r4     // Catch:{ InterruptedException -> 0x0000 }
            r4.destruct()     // Catch:{ InterruptedException -> 0x0000 }
            X.049 r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 != 0) goto L_0x0034
            X.0Mj r0 = X.C04910Mi.A01     // Catch:{ InterruptedException -> 0x0000 }
            java.util.concurrent.atomic.AtomicReference r1 = r0.A00     // Catch:{ InterruptedException -> 0x0000 }
            r0 = 0
            java.lang.Object r3 = r1.getAndSet(r0)     // Catch:{ InterruptedException -> 0x0000 }
            X.049 r3 = (X.AnonymousClass049) r3     // Catch:{ InterruptedException -> 0x0000 }
        L_0x001a:
            if (r3 == 0) goto L_0x0034
            X.049 r2 = r3.next     // Catch:{ InterruptedException -> 0x0000 }
            X.0Mk r0 = X.C04910Mi.A00     // Catch:{ InterruptedException -> 0x0000 }
            X.049 r1 = r0.A00     // Catch:{ InterruptedException -> 0x0000 }
            X.049 r0 = r1.next     // Catch:{ InterruptedException -> 0x0000 }
            r3.next = r0     // Catch:{ InterruptedException -> 0x0000 }
            r1.next = r3     // Catch:{ InterruptedException -> 0x0000 }
            X.049 r0 = r3.next     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 == 0) goto L_0x0030
            X.049 r0 = r3.next     // Catch:{ InterruptedException -> 0x0000 }
            r0.previous = r3     // Catch:{ InterruptedException -> 0x0000 }
        L_0x0030:
            r3.previous = r1     // Catch:{ InterruptedException -> 0x0000 }
            r3 = r2
            goto L_0x001a
        L_0x0034:
            X.049 r1 = r4.next     // Catch:{ InterruptedException -> 0x0000 }
            if (r1 == 0) goto L_0x003c
            X.049 r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            r1.previous = r0     // Catch:{ InterruptedException -> 0x0000 }
        L_0x003c:
            X.049 r0 = r4.previous     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 == 0) goto L_0x0000
            r0.next = r1     // Catch:{ InterruptedException -> 0x0000 }
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04950Mm.run():void");
    }
}
