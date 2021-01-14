package X;

import android.os.PowerManager;

/* renamed from: X.2p2  reason: invalid class name and case insensitive filesystem */
public class C60242p2 extends AbstractRunnableC57132jl {
    public final PowerManager.WakeLock A00;
    public final AnonymousClass009 A01;
    public final C000300f A02;
    public final AnonymousClass00C A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass0BV A05;
    public final C002701k A06;
    public final C02240Be A07;
    public final C57102ji A08;
    public final AnonymousClass0D7 A09;
    public final AnonymousClass0AK A0A;
    public final C02220Bc A0B;

    public C60242p2(C002701k r1, AnonymousClass009 r2, C000300f r3, C02220Bc r4, AnonymousClass03P r5, C02240Be r6, AnonymousClass0BV r7, AnonymousClass00C r8, AnonymousClass0AK r9, AnonymousClass0D7 r10, C57102ji r11, PowerManager.WakeLock wakeLock) {
        super(r11);
        this.A06 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A0B = r4;
        this.A04 = r5;
        this.A07 = r6;
        this.A03 = r8;
        this.A0A = r9;
        this.A09 = r10;
        this.A08 = r11;
        this.A00 = wakeLock;
        this.A05 = r7;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0417, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x041b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x041e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0422, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0482, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0486, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        com.whatsapp.util.Log.e("ProcessImageTask/errorComputingHash", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0688, code lost:
        if (r18.isHeld() != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x070b, code lost:
        if (r18.isHeld() != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x075a, code lost:
        if (r18.isHeld() != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0776, code lost:
        if (r18.isHeld() != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0783, code lost:
        if (r18.isHeld() != false) goto L_0x0785;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0785, code lost:
        r18.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0793, code lost:
        if (r18.isHeld() != false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r18.isHeld() != false) goto L_0x0795;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e2, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00eb, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01be, code lost:
        if (r0 < 200000) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c0, code lost:
        if (r19 == false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02c2, code lost:
        r13[0] = -1;
        r13[1] = r14[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d1, code lost:
        if (X.C002001d.A3h(X.AnonymousClass2TN.A0J, r14[0]) == false) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02d3, code lost:
        r7.write(r13);
        r11 = r11 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02d9, code lost:
        r7.write(r14);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05f8 A[Catch:{ all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x064b A[Catch:{ all -> 0x068c }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0684  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0707  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x071d  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0756  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x079c  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x07de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2 A[ExcHandler: SecurityException (e java.lang.SecurityException), Splitter:B:4:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00e5 A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), Splitter:B:4:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00eb A[ExcHandler: 35k (e X.35k), Splitter:B:4:0x0031] */
    @Override // X.AbstractRunnableC57132jl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2TV A00() {
        /*
        // Method dump skipped, instructions count: 2033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60242p2.A00():X.2TV");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00be, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C57122jk A01(X.AnonymousClass0M3 r10, X.C57112jj r11, java.io.File r12) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60242p2.A01(X.0M3, X.2jj, java.io.File):X.2jk");
    }
}
