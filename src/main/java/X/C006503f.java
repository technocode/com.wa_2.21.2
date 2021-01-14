package X;

import android.app.Application;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.03f  reason: invalid class name and case insensitive filesystem */
public class C006503f {
    public static volatile C006503f A02;
    public File A00;
    public final AnonymousClass00G A01;

    public C006503f(AnonymousClass00G r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0031, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0038, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.watls13.WtPersistentSession A00(java.io.File r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L_0x0047
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0047
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ ClassNotFoundException -> 0x003f, ArrayIndexOutOfBoundsException -> 0x003d, IllegalStateException -> 0x003b, ClassCastException -> 0x0041, IOException -> 0x0039 }
            r3.<init>(r5)     // Catch:{ ClassNotFoundException -> 0x003f, ArrayIndexOutOfBoundsException -> 0x003d, IllegalStateException -> 0x003b, ClassCastException -> 0x0041, IOException -> 0x0039 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r3)     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x002b }
            boolean r0 = r1 instanceof com.whatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0024
            com.whatsapp.watls13.WtPersistentSession r1 = (com.whatsapp.watls13.WtPersistentSession) r1     // Catch:{ all -> 0x002b }
            r2.close()
            r3.close()
            return r1
        L_0x0024:
            r2.close()
            r3.close()
            return r4
        L_0x002b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0
        L_0x0032:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0
        L_0x0039:
            r1 = move-exception
            goto L_0x0042
        L_0x003b:
            r1 = move-exception
            goto L_0x0042
        L_0x003d:
            r1 = move-exception
            goto L_0x0042
        L_0x003f:
            r1 = move-exception
            goto L_0x0042
        L_0x0041:
            r1 = move-exception
        L_0x0042:
            java.lang.String r0 = "WtPersistentSessionCacheImpl/readSession: unable to deserialize persisted session"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0047:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006503f.A00(java.io.File):com.whatsapp.watls13.WtPersistentSession");
    }

    public static C006503f A01() {
        if (A02 == null) {
            synchronized (C006503f.class) {
                if (A02 == null) {
                    A02 = new C006503f(AnonymousClass00G.A01);
                }
            }
        }
        return A02;
    }

    public final File A02() {
        synchronized (this) {
            File file = this.A00;
            if (file != null) {
                return file;
            }
            Application application = this.A01.A00;
            if (application == null) {
                return null;
            }
            File file2 = new File(application.getCacheDir(), "watls-sessions");
            this.A00 = file2;
            if (file2.exists() || this.A00.mkdir()) {
                StringBuilder sb = new StringBuilder();
                sb.append("WtPersistentSessionCacheImpl/getCacheDir: using external persistent cache directory ");
                sb.append(this.A00.getAbsolutePath());
                Log.i(sb.toString());
                return this.A00;
            }
            this.A00 = null;
            return null;
        }
    }

    public synchronized void A03(byte[] bArr) {
        if (A02() != null) {
            File file = new File(A02(), Base64.encodeToString(bArr, 10));
            if (!file.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("WtPersistentSessionCacheImpl/removeSession: Error during remove session ");
                sb.append(file.getAbsolutePath());
                Log.e(sb.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A04(byte[] r5, java.lang.Object r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.A02()     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.io.File r1 = r4.A02()
            r0 = 10
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r0)
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r0)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003a }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003a }
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0033 }
            r1.<init>(r2)     // Catch:{ all -> 0x0033 }
            r1.writeObject(r6)     // Catch:{ all -> 0x002c }
            r1.close()
            r2.close()
            goto L_0x005b
        L_0x002c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0
        L_0x003a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "WtPersistentSessionCacheImpl/putSession: Error during put session "
            r1.append(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = " : "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0)
        L_0x005b:
            monitor-exit(r4)
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C006503f.A04(byte[], java.lang.Object):void");
    }
}
