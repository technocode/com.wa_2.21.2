package com.whatsapp.util.crash;

import X.AnonymousClass00G;
import X.AnonymousClass04i;
import X.AnonymousClass04n;
import X.C000300f;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.regex.Pattern;

public class SigquitBasedANRDetector {
    public static volatile SigquitBasedANRDetector A0C;
    public HandlerThread A00;
    public String A01;
    public Pattern A02;
    public Pattern A03;
    public final C000300f A04;
    public final AnonymousClass04i A05;
    public final AnonymousClass04n A06;
    public final Object A07 = new Object();
    public final Object A08 = new Object();
    public volatile Handler A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    public static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z, int i);

    public static native boolean startDetector();

    public static native void stopDetector();

    public SigquitBasedANRDetector(AnonymousClass00G r3, AnonymousClass04i r4, C000300f r5, boolean z, int i) {
        AnonymousClass04n r1 = new AnonymousClass04n(r3.A00);
        this.A05 = r4;
        this.A04 = r5;
        this.A06 = r1;
        init(this, z, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.util.crash.SigquitBasedANRDetector A00() {
        /*
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0C
            if (r0 != 0) goto L_0x003d
            java.lang.Class<com.whatsapp.util.crash.SigquitBasedANRDetector> r2 = com.whatsapp.util.crash.SigquitBasedANRDetector.class
            monitor-enter(r2)
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0C     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0024
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "0."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x003a }
            r7 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            X.00G r4 = X.AnonymousClass00G.A01     // Catch:{ all -> 0x003a }
            X.04i r5 = X.AnonymousClass04i.A00()     // Catch:{ all -> 0x003a }
            X.00f r6 = X.C000300f.A00()     // Catch:{ all -> 0x003a }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x003a }
            com.whatsapp.util.crash.SigquitBasedANRDetector r3 = new com.whatsapp.util.crash.SigquitBasedANRDetector     // Catch:{ all -> 0x003a }
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x003a }
            com.whatsapp.util.crash.SigquitBasedANRDetector.A0C = r3     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x003d:
            com.whatsapp.util.crash.SigquitBasedANRDetector r0 = com.whatsapp.util.crash.SigquitBasedANRDetector.A0C
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.SigquitBasedANRDetector.A00():com.whatsapp.util.crash.SigquitBasedANRDetector");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void anrDetected(java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.crash.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }
}
