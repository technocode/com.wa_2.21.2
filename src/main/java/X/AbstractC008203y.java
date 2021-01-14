package X;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.03y  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC008203y extends C008103x {
    public String A00;
    public final Context A01;
    public final Map A02 = new HashMap();

    public AbstractC008203y(Context context, String str) {
        super(new File(AnonymousClass008.A0P(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str)), 1);
        this.A01 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(java.io.File r3, byte r4) {
        /*
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r2.<init>(r3, r0)
            r0 = 0
            r2.seek(r0)     // Catch:{ all -> 0x0022 }
            r2.write(r4)     // Catch:{ all -> 0x0022 }
            long r0 = r2.getFilePointer()     // Catch:{ all -> 0x0022 }
            r2.setLength(r0)     // Catch:{ all -> 0x0022 }
            java.io.FileDescriptor r0 = r2.getFD()     // Catch:{ all -> 0x0022 }
            r0.sync()     // Catch:{ all -> 0x0022 }
            r2.close()
            return
        L_0x0022:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC008203y.A00(java.io.File, byte):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0435, code lost:
        r11.A01.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0479, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x047a, code lost:
        if (r11 != null) goto L_0x047c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:?, code lost:
        r11.A01.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0481, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0537, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x053b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0542, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0543, code lost:
        if (r21 != null) goto L_0x0545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0548, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x054b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x054f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0552, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0556, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r3 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bf, code lost:
        if ((r34 & 2) == 0) goto L_0x04a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02aa A[Catch:{ Exception -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x051f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fb  */
    @Override // X.AbstractC007903v
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(int r34) {
        /*
        // Method dump skipped, instructions count: 1393
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC008203y.A01(int):void");
    }
}
