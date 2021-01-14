package X;

import com.whatsapp.gif_search.GifCacheItemSerializable;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1VZ  reason: invalid class name */
public class AnonymousClass1VZ {
    public File A00;
    public ThreadPoolExecutor A01;
    public boolean A02;
    public final AnonymousClass00G A03;
    public final C54552f6 A04;
    public final String A05 = "gif/gif_cache_mem_store";
    public final String A06;

    public AnonymousClass1VZ(AnonymousClass00G r3, int i, String str) {
        this.A03 = r3;
        this.A06 = str;
        C54552f6 r1 = new C54552f6(i);
        this.A04 = r1;
        C54292eg r0 = new C54292eg(this);
        synchronized (r1) {
            r1.A00 = r0;
        }
    }

    public GifCacheItemSerializable A00(String str) {
        byte[] A3j;
        A03();
        C54552f6 r2 = this.A04;
        GifCacheItemSerializable gifCacheItemSerializable = (GifCacheItemSerializable) r2.A03(str);
        if (gifCacheItemSerializable != null) {
            if (!new File(gifCacheItemSerializable.filePath).exists()) {
                r2.A04(str);
                A02().execute(new RunnableEBaseShape3S0100000_I0_3(this, 6));
                return null;
            } else if (gifCacheItemSerializable.A00 == null && !C003701u.A0D()) {
                File file = new File(gifCacheItemSerializable.filePath);
                if (0 == 0) {
                    A3j = C002001d.A3j(C002001d.A0V(file));
                } else {
                    A3j = C002001d.A3j(C002001d.A0W(file, 0));
                }
                gifCacheItemSerializable.A00 = A3j;
            }
        }
        return gifCacheItemSerializable;
    }

    public final File A01() {
        File file = this.A00;
        if (file != null && file.exists()) {
            return this.A00;
        }
        File externalCacheDir = this.A03.A00.getExternalCacheDir();
        if (externalCacheDir == null || !externalCacheDir.exists()) {
            Log.e("diskbackedgifcache/getmappingfile/external cache dir doesn't exit");
            return null;
        }
        File file2 = new File(externalCacheDir, this.A05);
        if (file2.exists() || file2.mkdirs()) {
            File file3 = new File(file2, this.A06);
            this.A00 = file3;
            return file3;
        }
        Log.e("diskbackedgifcache/getmappingfile/disk cache dir doesn't exit");
        return null;
    }

    public final synchronized ThreadPoolExecutor A02() {
        ThreadPoolExecutor threadPoolExecutor;
        threadPoolExecutor = this.A01;
        if (threadPoolExecutor == null) {
            threadPoolExecutor = C006803i.A0P(0, 1, TimeUnit.SECONDS, "Disk backed Gif Cache Worker#");
            this.A01 = threadPoolExecutor;
        }
        return threadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03() {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1VZ.A03():void");
    }
}
