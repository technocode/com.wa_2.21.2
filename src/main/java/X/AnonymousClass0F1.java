package X;

import java.nio.charset.Charset;

/* renamed from: X.0F1  reason: invalid class name */
public class AnonymousClass0F1 {
    public static final byte[] A05 = "WhatsApp Patch Integrity".getBytes(Charset.forName("UTF-8"));
    public static volatile AnonymousClass0F1 A06;
    public final C000300f A00;
    public final AnonymousClass0DL A01;
    public final AnonymousClass0F3 A02;
    public final AnonymousClass0F2 A03;
    public final AnonymousClass0DU A04;

    public AnonymousClass0F1(C000300f r1, AnonymousClass0DL r2, AnonymousClass0DU r3, AnonymousClass0F2 r4, AnonymousClass0F3 r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    public static AnonymousClass0F1 A00() {
        if (A06 == null) {
            synchronized (AnonymousClass0F1.class) {
                if (A06 == null) {
                    A06 = new AnonymousClass0F1(C000300f.A00(), AnonymousClass0DL.A00(), AnonymousClass0DU.A00(), AnonymousClass0F2.A00(), AnonymousClass0F3.A00());
                }
            }
        }
        return A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (r1 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A01(java.lang.String r9, byte[] r10, java.lang.String[] r11, java.util.List r12) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0F1.A01(java.lang.String, byte[], java.lang.String[], java.util.List):byte[]");
    }
}
