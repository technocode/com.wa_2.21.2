package X;

import android.graphics.Bitmap;
import com.facebook.animated.gif.GifImage;
import java.io.Closeable;

/* renamed from: X.0Me  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC04880Me implements Closeable {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r2 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C04890Mf A00(android.content.ContentResolver r2, X.C007703s r3, android.net.Uri r4) {
        /*
            if (r2 == 0) goto L_0x0050
            r3.A03(r4)
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r4, r0)     // Catch:{ SecurityException -> 0x0038 }
            if (r2 == 0) goto L_0x0018
            r3.A04(r2)     // Catch:{ all -> 0x002f }
            X.0Mf r0 = X.C04900Mh.A02(r2)     // Catch:{ all -> 0x002f }
            r2.close()
            return r0
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "gifdecoder/getmetadata/cannot open uri, pfd=null, uri="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x002f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            if (r2 == 0) goto L_0x0037
            r2.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0
        L_0x0038:
            r2 = move-exception
            java.lang.String r1 = "gifdecoder/getmetadata/failed to read uri "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L_0x0050:
            java.lang.String r1 = "gifdecoder/getmetadata/cannot open uri, cr=null"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC04880Me.A00(android.content.ContentResolver, X.03s, android.net.Uri):X.0Mf");
    }

    public Bitmap A01(int i) {
        C04900Mh r3 = (C04900Mh) this;
        boolean z = true;
        boolean z2 = false;
        if (i >= 0) {
            z2 = true;
        }
        AnonymousClass00E.A06(z2);
        GifImage gifImage = r3.A01;
        if (i >= gifImage.getFrameCount()) {
            z = false;
        }
        AnonymousClass00E.A06(z);
        Bitmap createBitmap = Bitmap.createBitmap(gifImage.getWidth(), gifImage.getHeight(), Bitmap.Config.ARGB_8888);
        r3.A02.A00(i, createBitmap);
        return createBitmap;
    }
}
