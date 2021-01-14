package X;

import android.app.ActivityManager;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.00L  reason: invalid class name */
public class AnonymousClass00L extends AnonymousClass009 {
    public static final Object A0E = new Object();
    public AbstractC000900m A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AnonymousClass01I A02;
    public final AnonymousClass03B A03;
    public final C003301q A04;
    public final AnonymousClass00C A05;
    public final AnonymousClass03P A06;
    public final AnonymousClass00G A07;
    public final AnonymousClass00D A08;
    public final AnonymousClass00Y A09;
    public final AnonymousClass03U A0A;
    public final C03190Fd A0B;
    public final AnonymousClass03A A0C;
    public final AnonymousClass00T A0D;

    public AnonymousClass00L(AnonymousClass00G r3, AnonymousClass01I r4, AnonymousClass03A r5, AnonymousClass00T r6, AnonymousClass03B r7, AnonymousClass00Y r8, C03190Fd r9, AnonymousClass03P r10, AnonymousClass00C r11, AnonymousClass03U r12, AnonymousClass00D r13, C003301q r14) {
        this.A07 = r3;
        this.A02 = r4;
        this.A0C = r5;
        this.A0D = r6;
        this.A03 = r7;
        this.A09 = r8;
        this.A0B = r9;
        this.A06 = r10;
        this.A05 = r11;
        this.A0A = r12;
        this.A08 = r13;
        this.A04 = r14;
    }

    public static AnonymousClass00L A01() {
        if (AnonymousClass009.A00 == null) {
            synchronized (AnonymousClass00L.class) {
                if (AnonymousClass009.A00 == null) {
                    AnonymousClass00G r3 = AnonymousClass00G.A01;
                    AnonymousClass01I A002 = AnonymousClass01I.A00();
                    AnonymousClass03A A003 = AnonymousClass03A.A00();
                    AnonymousClass00T A004 = C002101e.A00();
                    AnonymousClass03B A005 = AnonymousClass03B.A00();
                    AnonymousClass00Y A006 = AnonymousClass00Y.A00();
                    C03190Fd A007 = C03190Fd.A00();
                    AnonymousClass03P A008 = AnonymousClass03P.A00();
                    AnonymousClass01X.A00();
                    AnonymousClass009.A00 = new AnonymousClass00L(r3, A002, A003, A004, A005, A006, A007, A008, AnonymousClass00C.A00(), AnonymousClass03U.A00(), AnonymousClass00D.A00(), C003301q.A02);
                }
            }
        }
        return (AnonymousClass00L) AnonymousClass009.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0037, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0046, code lost:
        com.whatsapp.util.Log.w("app/CrashLogs/copyFileToCache: Could not close stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0050, code lost:
        com.whatsapp.util.Log.w("app/CrashLogs/copyFileToCache: Could not close stream", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0041 A[SYNTHETIC, Splitter:B:32:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x004b A[SYNTHETIC, Splitter:B:37:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0058 A[SYNTHETIC, Splitter:B:46:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0062 A[SYNTHETIC, Splitter:B:51:0x0062] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A02(java.io.File r7, java.io.File r8) {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00L.A02(java.io.File, java.io.File):java.io.File");
    }

    public static String A03(HashSet hashSet) {
        StringBuilder sb = new StringBuilder();
        if (hashSet != null && !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(',');
            }
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public final AnonymousClass0J4 A08(String str) {
        int memoryClass;
        ActivityManager A012 = this.A06.A01();
        if (A012 == null) {
            Log.w("memorydumpuploadservice/get-upload-params am=null");
            memoryClass = 16;
        } else {
            memoryClass = A012.getMemoryClass();
        }
        AnonymousClass03A.A01(this.A07, "2.21.2.4-play-beta", false);
        return new AnonymousClass0J4(memoryClass, str);
    }

    public final File A09() {
        File file = new File(this.A07.A00.getCacheDir(), "Crashes");
        file.mkdirs();
        return file;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037 A[Catch:{ IOException -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045 A[Catch:{ IOException -> 0x004d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A0A(java.io.File r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 != 0) goto L_0x0004
            return r4
        L_0x0004:
            java.io.File r1 = r5.A09()     // Catch:{ IOException -> 0x004d }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x004d }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x004d }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x004d }
            r0 = 0
        L_0x0016:
            int r2 = r0 + 1
            r1 = 10
            if (r0 >= r1) goto L_0x0035
            boolean r0 = r3.mkdirs()     // Catch:{ IOException -> 0x004d }
            if (r0 != 0) goto L_0x0035
            java.io.File r1 = r5.A09()     // Catch:{ IOException -> 0x004d }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ IOException -> 0x004d }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x004d }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x004d }
            r3.<init>(r1, r0)     // Catch:{ IOException -> 0x004d }
            r0 = r2
            goto L_0x0016
        L_0x0035:
            if (r2 > r1) goto L_0x0045
            java.lang.String r1 = r6.getName()     // Catch:{ IOException -> 0x004d }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004d }
            r0.<init>(r3, r1)     // Catch:{ IOException -> 0x004d }
            java.io.File r0 = A02(r6, r0)     // Catch:{ IOException -> 0x004d }
            return r0
        L_0x0045:
            java.lang.String r1 = "max retries reached while creating attachment temp directory"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x004d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x004d }
            throw r0     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00L.A0A(java.io.File):java.io.File");
    }

    public final File A0B(File file, long j) {
        File A092 = A09();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(".log");
        return A02(file, new File(A092, sb.toString()));
    }

    public void A0C() {
        this.A01.post(new RunnableEBaseShape4S0100000_I0_4(this, 38));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r5 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        com.whatsapp.util.Log.w("app/CrashLogs/serializeCrashData: Could not close stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[SYNTHETIC, Splitter:B:17:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[Catch:{ IOException -> 0x005d }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068 A[SYNTHETIC, Splitter:B:30:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d A[Catch:{ IOException -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(X.AnonymousClass1YH r9) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00L.A0D(X.1YH):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if ("log_files_upload".equals(r26) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0E(java.lang.String r21, java.lang.String r22, java.lang.String r23, boolean r24, boolean r25, java.lang.String r26, java.lang.String r27) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00L.A0E(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String):boolean");
    }
}
