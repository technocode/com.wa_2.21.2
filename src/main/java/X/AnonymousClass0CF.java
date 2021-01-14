package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0CF  reason: invalid class name */
public class AnonymousClass0CF {
    public static volatile AnonymousClass0CF A09;
    public final AnonymousClass09V A00;
    public final C014408c A01;
    public final C006903j A02;
    public final AnonymousClass0AP A03;
    public final C02070An A04;
    public final C014508d A05;
    public final AnonymousClass095 A06;
    public final AnonymousClass096 A07;
    public final AnonymousClass0CG A08;

    public AnonymousClass0CF(C014408c r1, C006903j r2, AnonymousClass095 r3, AnonymousClass0AP r4, C02070An r5, AnonymousClass09V r6, C014508d r7, AnonymousClass0CG r8, AnonymousClass096 r9) {
        this.A01 = r1;
        this.A02 = r2;
        this.A06 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r6;
        this.A05 = r7;
        this.A08 = r8;
        this.A07 = r9;
    }

    public static AnonymousClass0CF A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0CF.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0CF(C014408c.A00(), C006903j.A00(), AnonymousClass095.A00(), AnonymousClass0AP.A00(), C02070An.A00(), AnonymousClass09V.A00(), C014508d.A00(), AnonymousClass0CG.A00(), AnonymousClass096.A00());
                }
            }
        }
        return A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(X.AnonymousClass02N r6) {
        /*
            r5 = this;
            X.03j r0 = r5.A02
            X.0bL r4 = r0.A05(r6)
            if (r4 != 0) goto L_0x000a
            r0 = -1
            return r0
        L_0x000a:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r0 = 999999(0xf423f, float:1.401297E-39)
            int r0 = r1.nextInt(r0)
            int r3 = r0 + 1
            X.08d r0 = r5.A05
            X.0OQ r2 = r0.A04()
            X.0Rk r1 = r2.A00()     // Catch:{ all -> 0x004e }
            r4.A07 = r3     // Catch:{ all -> 0x0047 }
            X.08c r0 = r5.A01     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.A0H(r4)     // Catch:{ all -> 0x0047 }
            r1.A00()     // Catch:{ all -> 0x0047 }
            r1.close()
            r2.close()
            if (r0 != 0) goto L_0x0046
            java.lang.String r1 = "msgStore/updateWebModTag/none/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0)
        L_0x0046:
            return r3
        L_0x0047:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        L_0x004e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CF.A01(X.02N):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.AnonymousClass1VY.A0Y(r8) != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02(X.AnonymousClass02N r8, long r9, java.lang.Integer r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CF.A02(X.02N, long, java.lang.Integer, java.lang.String):java.util.List");
    }

    public List A03(AnonymousClass02N r10, C007303n r11, Integer num, String str) {
        long A032;
        if (r11 == null) {
            A032 = this.A06.A06(r10);
        } else {
            A032 = AnonymousClass0FI.A03(this.A00.A05(r11));
        }
        if (A032 != 1) {
            return A02(r10, A032, num, str);
        }
        StringBuilder sb = new StringBuilder("msgstore/get/newer no id for ");
        sb.append(r11);
        Log.i(sb.toString());
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bd, code lost:
        if (r2 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (X.AnonymousClass1VY.A0Y(r5) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A04(X.C007303n r13, int r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0CF.A04(X.03n, int, java.lang.String):java.util.List");
    }
}
