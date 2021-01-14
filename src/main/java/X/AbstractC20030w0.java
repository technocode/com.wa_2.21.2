package X;

import java.io.Closeable;

/* renamed from: X.0w0  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC20030w0 implements Closeable, Cloneable {
    public static final AbstractC20020vz A04 = new C32531f6();
    public static final AbstractC20050w2 A05 = new C32521f5();
    public boolean A00 = false;
    public final AbstractC20020vz A01;
    public final C20070w4 A02;
    public final Throwable A03;

    public AbstractC20030w0(C20070w4 r2, AbstractC20020vz r3, Throwable th) {
        if (r2 != null) {
            this.A02 = r2;
            synchronized (r2) {
                r2.A01();
                r2.A00++;
            }
            this.A01 = r3;
            this.A03 = th;
            return;
        }
        throw null;
    }

    public AbstractC20030w0(Object obj, AbstractC20050w2 r3, AbstractC20020vz r4, Throwable th) {
        this.A02 = new C20070w4(obj, r3);
        this.A01 = r4;
        this.A03 = th;
    }

    public static AbstractC20030w0 A00(AbstractC20030w0 r1) {
        if (r1 == null) {
            return null;
        }
        synchronized (r1) {
            if (!r1.A05()) {
                return null;
            }
            return r1.clone();
        }
    }

    public static AbstractC20030w0 A01(Object obj, AbstractC20050w2 r3, AbstractC20020vz r4) {
        Throwable th = null;
        if (obj == null) {
            return null;
        }
        if (r4.AMx()) {
            th = new Throwable();
        }
        return new C32541f7(obj, r3, r4, th);
    }

    public static boolean A02(AbstractC20030w0 r1) {
        return r1 != null && r1.A05();
    }

    /* renamed from: A03 */
    public AbstractC20030w0 clone() {
        AnonymousClass0N2.A1Z(A05());
        return new C32541f7(this.A02, this.A01, this.A03);
    }

    public synchronized Object A04() {
        boolean z = false;
        if (!this.A00) {
            z = true;
        }
        AnonymousClass0N2.A1Z(z);
        return this.A02.A00();
    }

    public synchronized boolean A05() {
        return !this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r3.A01();
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r3.A00 <= 0) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        X.AnonymousClass0N2.A1Y(r0);
        r0 = r3.A00 - 1;
        r3.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r0 != 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r5 = r3.A01;
        r3.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
        r3.A02.AMT(r5);
        r4 = X.C20070w4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0 = (java.lang.Integer) r4.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0039, code lost:
        if (r0 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        X.C19960vt.A00("SharedReference", "No entry in sLiveObjects for value of type %s", r5.getClass());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        r0 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r0 != 1) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0052, code lost:
        r4.remove(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0056, code lost:
        r4.put(r5, java.lang.Integer.valueOf(r0 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r3 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r3);
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20030w0.close():void");
    }

    @Override // java.lang.Object
    public void finalize() {
        boolean z;
        try {
            synchronized (this) {
                z = this.A00;
            }
            if (!z) {
                this.A01.AMp(this.A02, this.A03);
                close();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }
}
