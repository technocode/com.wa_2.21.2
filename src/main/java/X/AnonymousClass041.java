package X;

import java.lang.reflect.Method;

/* renamed from: X.041  reason: invalid class name */
public final class AnonymousClass041 implements AnonymousClass00R {
    public final /* synthetic */ Runtime A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Method A03;
    public final /* synthetic */ boolean A04;

    public AnonymousClass041(boolean z, String str, String str2, Runtime runtime, Method method) {
        this.A04 = z;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = runtime;
        this.A03 = method;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Error: Cannot load ");
        r1.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        throw new java.lang.RuntimeException(r1.toString(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        if (r3 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0064, code lost:
        r4 = X.AnonymousClass008.A0Z("Error when loading lib: ", r3, " lib hash: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = new java.io.File(r13);
        r10 = java.security.MessageDigest.getInstance("MD5");
        r9 = new java.io.FileInputStream(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r1 = new byte[4096];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0082, code lost:
        r0 = r9.read(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if (r0 > 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        r10.update(r1, 0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008d, code lost:
        r0 = java.lang.String.format("%32x", new java.math.BigInteger(1, r10.digest()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a1, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ad, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b9, code lost:
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00bd, code lost:
        r4.append(r0);
        r4.append(" search path is ");
        r4.append(r6);
        android.util.Log.e("SoLoader", r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cf, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @Override // X.AnonymousClass00R
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ABm(java.lang.String r13, int r14) {
        /*
        // Method dump skipped, instructions count: 214
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass041.ABm(java.lang.String, int):void");
    }
}
