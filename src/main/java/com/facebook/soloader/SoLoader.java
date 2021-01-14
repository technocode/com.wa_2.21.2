package com.facebook.soloader;

import X.AbstractC007903v;
import X.AbstractC008203y;
import X.AnonymousClass00R;
import X.AnonymousClass044;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SoLoader {
    public static int A00;
    public static AnonymousClass044 A01;
    public static AnonymousClass00R A02;
    public static boolean A03;
    public static AbstractC007903v[] A04;
    public static AbstractC008203y[] A05;
    public static final HashSet A06 = new HashSet();
    public static final Map A07 = new HashMap();
    public static final Set A08 = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final ReentrantReadWriteLock A09 = new ReentrantReadWriteLock();
    public static final boolean A0A;
    public static volatile int A0B;

    public class Api14Utils {
    }

    static {
        boolean z = false;
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                z = true;
            }
        } catch (NoClassDefFoundError | UnsatisfiedLinkError unused) {
        }
        A0A = z;
    }

    public static int A00() {
        ReentrantReadWriteLock reentrantReadWriteLock = A09;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i = 0;
            if ((A00 & 2) != 0) {
                i = 1;
            }
            return i;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public static void A01() {
        ReentrantReadWriteLock reentrantReadWriteLock = A09;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A04 == null) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if ((r20.getApplicationInfo().flags & 129) == 0) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.content.Context r20, int r21, X.AnonymousClass00R r22) {
        /*
        // Method dump skipped, instructions count: 700
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A02(android.content.Context, int, X.00R):void");
    }

    /* JADX INFO: finally extract failed */
    public static boolean A03(String str) {
        boolean contains;
        ReentrantReadWriteLock reentrantReadWriteLock = A09;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (A04 == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    A01();
                } else {
                    synchronized (SoLoader.class) {
                        contains = true ^ A06.contains(str);
                        if (contains) {
                            System.loadLibrary(str);
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return contains;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return A04(System.mapLibraryName(str), str, 2, null);
        } catch (Throwable th) {
            reentrantReadWriteLock.readLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0173, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0174, code lost:
        r19.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x017b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0182, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0183, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0184, code lost:
        r19.writeLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x018b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x018c, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x018f, code lost:
        if (r18 == false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0191, code lost:
        android.os.StrictMode.setThreadPolicy(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0194, code lost:
        if (r6 == 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0196, code lost:
        if (r6 == 3) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0199, code lost:
        r0 = X.AnonymousClass008.A0K("couldn't find DSO to load: ", r22);
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" result: ");
        r1.append(r6);
        r1 = r1.toString();
        android.util.Log.e("SoLoader", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01bb, code lost:
        throw new java.lang.UnsatisfiedLinkError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01bc, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01bd, code lost:
        if (r17 != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01bf, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c2, code lost:
        if (r18 != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c4, code lost:
        android.os.StrictMode.setThreadPolicy(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01cc, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Loaded: ");
        r1.append(r22);
        android.util.Log.d("SoLoader", r1.toString());
        r7.add(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e4, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01e7, code lost:
        if ((r24 & 16) != 0) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ed, code lost:
        if (android.text.TextUtils.isEmpty(r23) != false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ef, code lost:
        com.facebook.soloader.SoLoader.A08.contains(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f6, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01f7, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01fb, code lost:
        r0 = X.AnonymousClass008.A0K("couldn't find DSO to load: ", r22);
        r2 = r5.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0205, code lost:
        if (r2 == null) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0207, code lost:
        r2 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x020b, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" caused by: ");
        r1.append(r2);
        r0 = r1.toString();
        r5.printStackTrace();
        r1 = new java.lang.StringBuilder();
        r1.append(r0);
        r1.append(" result: ");
        r1.append(r6);
        r1 = r1.toString();
        android.util.Log.e("SoLoader", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023e, code lost:
        throw new java.lang.UnsatisfiedLinkError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x023f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Could not load: ");
        r1.append(r22);
        r1.append(" because no SO source exists");
        android.util.Log.e("SoLoader", r1.toString());
        r1 = new java.lang.StringBuilder();
        r1.append("couldn't find DSO to load: ");
        r1.append(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x026e, code lost:
        throw new java.lang.UnsatisfiedLinkError(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x026f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0270, code lost:
        r19.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0277, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0278, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0279, code lost:
        r2 = r3.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x027d, code lost:
        if (r2 == null) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0295, code lost:
        throw new X.AnonymousClass046(r3, r2.substring(r2.lastIndexOf("unexpected e_machine:")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0296, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0297, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x029d, code lost:
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        monitor-enter(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0 = r7.contains(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        monitor-exit(com.facebook.soloader.SoLoader.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("About to load: ");
        r1.append(r22);
        android.util.Log.d("SoLoader", r1.toString());
        r19 = com.facebook.soloader.SoLoader.A09;
        r19.readLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (com.facebook.soloader.SoLoader.A04 == null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006a, code lost:
        r19.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r25 != null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        r9 = android.os.StrictMode.allowThreadDiskReads();
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007e, code lost:
        r17 = com.facebook.soloader.SoLoader.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r17 == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0082, code lost:
        com.facebook.soloader.Api18TraceUtils.A00("SoLoader.loadLibrary[", r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r19.readLock().lock();
        r16 = com.facebook.soloader.SoLoader.A0B;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0096, code lost:
        if (r6 != 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1 = com.facebook.soloader.SoLoader.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if (r5 >= r1.length) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009d, code lost:
        r6 = r1[r5].A00(r22, r24, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        if (r6 != 3) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a7, code lost:
        if (com.facebook.soloader.SoLoader.A05 == null) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a9, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Trying backup SoSource for ");
        r1.append(r22);
        android.util.Log.d("SoLoader", r1.toString());
        r15 = com.facebook.soloader.SoLoader.A05;
        r14 = r15.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c2, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c5, code lost:
        if (r0 >= r14) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        r12 = r15[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c9, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r5 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cc, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1 = r5.get(r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d1, code lost:
        if (r1 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d3, code lost:
        r1 = new java.lang.Object();
        r5.put(r22, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00db, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dc, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r12.A00 = r22;
        r12.A01(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e2, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e3, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00e8, code lost:
        if (r12.A00(r22, r24, r9) != 1) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00eb, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ee, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00ef, code lost:
        r19.readLock().unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00f8, code lost:
        if ((r24 & 2) != 2) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00fa, code lost:
        if (r6 != 0) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fc, code lost:
        r19.writeLock().lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        r13 = com.facebook.soloader.SoLoader.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0105, code lost:
        if (r13 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        r14 = r13.A02.A01;
        r5 = r13.A01;
        r12 = r5.createPackageContext(r5.getPackageName(), 0);
        r5 = new java.io.File(r12.getApplicationInfo().nativeLibraryDir);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0125, code lost:
        if (r14.equals(r5) != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0127, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Native library directory updated from ");
        r1.append(r14);
        r1.append(" to ");
        r1.append(r5);
        android.util.Log.d("SoLoader", r1.toString());
        r1 = r13.A00 | 1;
        r13.A00 = r1;
        r13.A02 = new X.C008103x(r5, r1);
        r13.A01 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0151, code lost:
        com.facebook.soloader.SoLoader.A0B++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0156, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x015b, code lost:
        if (com.facebook.soloader.SoLoader.A0B == r16) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x015d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0165, code lost:
        if (r1 != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0167, code lost:
        if (r17 == false) goto L_0x018f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(java.lang.String r22, java.lang.String r23, int r24, android.os.StrictMode.ThreadPolicy r25) {
        /*
        // Method dump skipped, instructions count: 679
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.A04(java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }

    public static void init(Context context, int i) {
        A02(context, i, null);
    }
}
