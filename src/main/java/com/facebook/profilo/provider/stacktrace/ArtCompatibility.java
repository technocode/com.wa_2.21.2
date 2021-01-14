package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;
import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = new AtomicReference(null);

    public static native boolean nativeCheck(int i);

    static {
        SoLoader.A03("profilo_stacktrace");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r1.equals("5.0") != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006b, code lost:
        if (r1.equals("5.1") != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r1.equals("6.0") != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r1.equals("7.0") != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r1.equals("7.1") != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r1.equals("5.0.1") != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (r1.equals("5.0.2") != false) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        r4 = nativeCheck(1024);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        if (r1.equals("5.1.0") != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r1.equals("5.1.1") != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r4 = nativeCheck(2048);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        if (r1.equals("6.0.1") != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c2, code lost:
        r4 = nativeCheck(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (r1.equals("7.0.0") != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        r4 = nativeCheck(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00de, code lost:
        if (r1.equals("7.1.0") != false) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        r4 = nativeCheck(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0153, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0157, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCompatible(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }
}
