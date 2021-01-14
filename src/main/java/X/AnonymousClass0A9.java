package X;

import java.util.Collections;

/* renamed from: X.0A9  reason: invalid class name */
public class AnonymousClass0A9 {
    public static volatile AnonymousClass0A9 A02;
    public final AnonymousClass0AA A00 = new AnonymousClass0AA();
    public final C014508d A01;

    public AnonymousClass0A9(C014508d r3) {
        Collections.synchronizedMap(new AnonymousClass04h(200));
        this.A01 = r3;
    }

    public static AnonymousClass0A9 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass0A9.class) {
                if (A02 == null) {
                    C015308l.A00();
                    AnonymousClass009.A00();
                    C015408m.A00();
                    C014508d A002 = C014508d.A00();
                    AnonymousClass096.A00();
                    AnonymousClass094.A00();
                    A02 = new AnonymousClass0A9(A002);
                }
            }
        }
        return A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        if (r3 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28501Uo A01(long r11) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0A9.A01(long):X.1Uo");
    }

    public void A02() {
        AnonymousClass0AA r3 = this.A00;
        synchronized (r3) {
            for (C28501Uo r1 : r3.A03.values()) {
                r1.A00 = -1;
            }
        }
    }
}
