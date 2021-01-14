package X;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.util.Log;
import java.io.FileDescriptor;
import java.util.WeakHashMap;

/* renamed from: X.2Ox  reason: invalid class name and case insensitive filesystem */
public class C49072Ox {
    public static C49072Ox A01;
    public final WeakHashMap A00 = new WeakHashMap();

    public static synchronized C49072Ox A00() {
        C49072Ox r0;
        synchronized (C49072Ox.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C49072Ox();
                A01 = r0;
            }
        }
        return r0;
    }

    public Bitmap A01(ContentResolver contentResolver, long j, int i, BitmapFactory.Options options) {
        Thread currentThread = Thread.currentThread();
        C49062Ow A03 = A03(currentThread);
        if (!A04(currentThread)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(currentThread);
            sb.append(" is not allowed to decode.");
            Log.d("BitmapManager", sb.toString());
            return null;
        }
        try {
            synchronized (A03) {
                A03.A02 = true;
            }
            Bitmap thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, j, currentThread.getId(), i, options);
            synchronized (A03) {
                A03.A02 = false;
                A03.notifyAll();
            }
            return thumbnail;
        } catch (Throwable th) {
            synchronized (A03) {
                A03.A02 = false;
                A03.notifyAll();
                throw th;
            }
        }
    }

    public Bitmap A02(FileDescriptor fileDescriptor, BitmapFactory.Options options) {
        if (options.mCancel) {
            return null;
        }
        Thread currentThread = Thread.currentThread();
        if (!A04(currentThread)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(currentThread);
            sb.append(" is not allowed to decode.");
            Log.d("BitmapManager", sb.toString());
            return null;
        }
        synchronized (this) {
            A03(currentThread).A01 = options;
        }
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        synchronized (this) {
            ((C49062Ow) this.A00.get(currentThread)).A01 = null;
        }
        return decodeFileDescriptor;
    }

    public final synchronized C49062Ow A03(Thread thread) {
        C49062Ow r1;
        WeakHashMap weakHashMap = this.A00;
        r1 = (C49062Ow) weakHashMap.get(thread);
        if (r1 == null) {
            r1 = new C49062Ow(null);
            weakHashMap.put(thread, r1);
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 != 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A04(java.lang.Thread r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.WeakHashMap r0 = r2.A00     // Catch:{ all -> 0x0013 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0013 }
            X.2Ow r0 = (X.C49062Ow) r0     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            int r1 = r0.A00     // Catch:{ all -> 0x0013 }
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49072Ox.A04(java.lang.Thread):boolean");
    }
}
