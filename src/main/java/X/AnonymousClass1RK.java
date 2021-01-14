package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1RK  reason: invalid class name */
public class AnonymousClass1RK {
    public static final Bitmap A05 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    public AnonymousClass2Dk A00;
    public final long A01;
    public final AnonymousClass08V A02;
    public final File A03;
    public final Object A04 = new Object();

    public AnonymousClass1RK(File file, long j) {
        this.A03 = file;
        this.A01 = j;
        this.A02 = new AnonymousClass08Y((int) (Runtime.getRuntime().maxMemory() / 8192));
    }

    public Bitmap A00(String str, int i, int i2) {
        AnonymousClass2Dj r0;
        Throwable th;
        A01();
        synchronized (this.A04) {
            AnonymousClass2Dk r02 = this.A00;
            Bitmap bitmap = null;
            if (r02 != null) {
                try {
                    r0 = r02.A08(str);
                } catch (IOException unused) {
                    Log.e("bitmapcache/journal corrupted");
                    r0 = null;
                }
                if (r0 != null) {
                    try {
                        InputStream inputStream = r0.A00[0];
                        if (inputStream != null) {
                            try {
                                Bitmap bitmap2 = C002001d.A0o(inputStream, new AnonymousClass02K(i, i2)).A02;
                                if (bitmap2 == null) {
                                    try {
                                        Log.e("bitmapcache/decode failed");
                                        try {
                                            inputStream.close();
                                            return null;
                                        } catch (IOException unused2) {
                                            bitmap = bitmap2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            throw th;
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                } else {
                                    bitmap = bitmap2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (IOException unused4) {
                    }
                }
            }
            return bitmap;
        }
        throw th;
    }

    public final void A01() {
        synchronized (this.A04) {
            AnonymousClass2Dk r0 = this.A00;
            if (r0 == null || r0.A03 == null) {
                File file = this.A03;
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("bitmapcache/initDiskCache: unable to create cache dir ");
                    sb.append(file);
                    Log.e(sb.toString());
                }
                long usableSpace = file.getUsableSpace();
                long j = this.A01;
                if (usableSpace > j) {
                    try {
                        this.A00 = AnonymousClass2Dk.A00(file, j);
                    } catch (IOException e) {
                        Log.e("bitmapcache/initDiskCache ", e);
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r7, java.io.InputStream r8) {
        /*
            r6 = this;
            r6.A01()
            java.lang.Object r2 = r6.A04
            monitor-enter(r2)
            X.2Dk r0 = r6.A00     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x005f
            X.2Dj r0 = r0.A08(r7)     // Catch:{ Exception -> 0x004a }
            r5 = 0
            if (r0 != 0) goto L_0x0042
            X.2Dk r0 = r6.A00     // Catch:{ Exception -> 0x004a }
            X.2Dh r4 = r0.A07(r7)     // Catch:{ Exception -> 0x004a }
            if (r4 == 0) goto L_0x005b
            java.io.OutputStream r3 = r4.A00()     // Catch:{ Exception -> 0x004a }
            X.C006803i.A0d(r8, r3)     // Catch:{ all -> 0x003b }
            boolean r0 = r4.A00     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0031
            X.2Dk r1 = r4.A02     // Catch:{ all -> 0x003b }
            X.AnonymousClass2Dk.A02(r1, r4, r5)     // Catch:{ all -> 0x003b }
            X.2Di r0 = r4.A01     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x003b }
            r1.A0B(r0)     // Catch:{ all -> 0x003b }
            goto L_0x0037
        L_0x0031:
            X.2Dk r1 = r4.A02     // Catch:{ all -> 0x003b }
            r0 = 1
            X.AnonymousClass2Dk.A02(r1, r4, r0)     // Catch:{ all -> 0x003b }
        L_0x0037:
            r3.close()
            goto L_0x005b
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0
        L_0x0042:
            java.io.InputStream[] r0 = r0.A00
            r0 = r0[r5]
            r0.close()
            goto L_0x005b
        L_0x004a:
            r1 = move-exception
            java.lang.String r0 = "bitmapcache/download "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0055 }
            X.2Dk r0 = r6.A00
            monitor-enter(r0)
            monitor-exit(r0)
            goto L_0x005f
        L_0x0055:
            r1 = move-exception
            X.2Dk r0 = r6.A00
            monitor-enter(r0)
            monitor-exit(r0)
            throw r1
        L_0x005b:
            X.2Dk r0 = r6.A00
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x005f:
            monitor-exit(r2)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1RK.A02(java.lang.String, java.io.InputStream):void");
    }

    public void A03(boolean z) {
        AnonymousClass08V r1 = this.A02;
        synchronized (r1) {
            r1.A06(-1);
        }
        synchronized (this.A04) {
            AnonymousClass2Dk r0 = this.A00;
            if (r0 != null) {
                if (z) {
                    try {
                        r0.close();
                        AnonymousClass2Dk.A04(r0.A07);
                    } catch (IOException e) {
                        Log.e("bitmapcache/close ", e);
                    }
                }
                AnonymousClass2Dk r12 = this.A00;
                if (r12.A03 != null) {
                    r12.close();
                }
                this.A00 = null;
            }
        }
    }
}
