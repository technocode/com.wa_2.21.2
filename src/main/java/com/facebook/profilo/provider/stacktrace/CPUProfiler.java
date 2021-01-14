package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;

public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    public static native boolean nativeInitialize(int i);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i, int i2, boolean z, int i3, boolean z2);

    public static native void nativeStopProfiling();

    static {
        SoLoader.A03("profilo_stacktrace");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r1.equals("5.0") != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r1.equals("5.1") != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r1.equals("6.0") != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r1.equals("7.1") != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r1.equals("5.0.1") != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r1.equals("5.0.2") != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        r1 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        if (r1.equals("5.1.0") != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        if (r1.equals("5.1.1") != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        r1 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007f, code lost:
        if (r1.equals("6.0.1") != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r1.equals("7.1.0") != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008c, code lost:
        r1 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (r0 == false) goto L_0x00ba;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean init(android.content.Context r4) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.CPUProfiler.init(android.content.Context):boolean");
    }
}
