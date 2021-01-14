package X;

import java.util.HashMap;

/* renamed from: X.0BD  reason: invalid class name */
public class AnonymousClass0BD {
    public static volatile AnonymousClass0BD A02;
    public final AnonymousClass0AR A00;
    public final HashMap A01 = new HashMap();

    public AnonymousClass0BD(AnonymousClass0AR r2) {
        this.A00 = r2;
    }

    public static AnonymousClass0BD A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0BD.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass0BD(AnonymousClass0AR.A00());
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        if (r5 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r5 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0093, code lost:
        com.whatsapp.util.Log.e("backupcipher/db/get/ioerror ", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[Catch:{ all -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(java.util.List r12, java.lang.Runnable r13) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BD.A01(java.util.List, java.lang.Runnable):int");
    }

    public C28391Ud A02(AnonymousClass1Q8 r4) {
        return (C28391Ud) this.A01.get(new C28401Ue(r4.A00, r4.A04));
    }
}
