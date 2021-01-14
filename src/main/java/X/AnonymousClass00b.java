package X;

import android.content.Context;
import android.os.Build;
import com.facebook.soloader.SoLoader;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.00b  reason: invalid class name */
public class AnonymousClass00b {
    public static boolean A00;

    /* JADX INFO: finally extract failed */
    public static synchronized void A00(Context context) {
        ReentrantReadWriteLock reentrantReadWriteLock;
        synchronized (AnonymousClass00b.class) {
            if (A00) {
                Log.i("whatsappsoloader/init: already initialized");
                return;
            }
            if (Build.VERSION.SDK_INT < 23) {
                String A0E = C006803i.A0E();
                if (!"armeabi-v7a".equals(A0E) && !"x86".equals(A0E)) {
                    SoLoader.A02(context, 0, AnonymousClass00Q.A00());
                    C008103x r6 = new C008103x(new File(context.getFilesDir(), "decompressed/libs.spk.zst"), 1);
                    reentrantReadWriteLock = SoLoader.A09;
                    reentrantReadWriteLock.writeLock().lock();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Prepending to SO sources: ");
                    sb.append(r6);
                    android.util.Log.d("SoLoader", sb.toString());
                    SoLoader.A01();
                    r6.A01(SoLoader.A00());
                    AbstractC007903v[] r3 = SoLoader.A04;
                    int length = r3.length;
                    AbstractC007903v[] r1 = new AbstractC007903v[(length + 1)];
                    r1[0] = r6;
                    System.arraycopy(r3, 0, r1, 1, length);
                    SoLoader.A04 = r1;
                    SoLoader.A0B++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Prepended to SO sources: ");
                    sb2.append(r6);
                    android.util.Log.d("SoLoader", sb2.toString());
                    reentrantReadWriteLock.writeLock().unlock();
                    A00 = true;
                }
            }
            SoLoader.A02(context, 0, null);
            C008103x r62 = new C008103x(new File(context.getFilesDir(), "decompressed/libs.spk.zst"), 1);
            reentrantReadWriteLock = SoLoader.A09;
            reentrantReadWriteLock.writeLock().lock();
            try {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Prepending to SO sources: ");
                sb3.append(r62);
                android.util.Log.d("SoLoader", sb3.toString());
                SoLoader.A01();
                r62.A01(SoLoader.A00());
                AbstractC007903v[] r32 = SoLoader.A04;
                int length2 = r32.length;
                AbstractC007903v[] r12 = new AbstractC007903v[(length2 + 1)];
                r12[0] = r62;
                System.arraycopy(r32, 0, r12, 1, length2);
                SoLoader.A04 = r12;
                SoLoader.A0B++;
                StringBuilder sb22 = new StringBuilder();
                sb22.append("Prepended to SO sources: ");
                sb22.append(r62);
                android.util.Log.d("SoLoader", sb22.toString());
                reentrantReadWriteLock.writeLock().unlock();
                A00 = true;
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        }
    }
}
