package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.animated.webp.WebPFrame;
import com.facebook.animated.webp.WebPImage;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import com.whatsapp.util.WhatsAppLibLoader;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: X.0Cp  reason: invalid class name and case insensitive filesystem */
public class C02570Cp {
    public static volatile C02570Cp A04;
    public final AnonymousClass00G A00;
    public final WebpUtils A01;
    public volatile AnonymousClass2Dk A02;
    public volatile boolean A03;

    public C02570Cp(AnonymousClass00G r2, WebpUtils webpUtils) {
        this.A00 = r2;
        this.A01 = webpUtils;
        try {
            AnonymousClass00b.A00(r2.A00);
        } catch (IOException unused) {
        }
    }

    public static WebPImage A00(byte[] bArr) {
        try {
            AnonymousClass0N2.A0y();
            if (bArr != null) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                allocateDirect.put(bArr);
                allocateDirect.rewind();
                return WebPImage.nativeCreateFromDirectByteBuffer(allocateDirect);
            }
            throw null;
        } catch (UnsatisfiedLinkError e) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/unsatisfiedLinkError", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/failed to create webp image object", e2);
            return null;
        }
    }

    public static C02570Cp A01() {
        if (A04 == null) {
            synchronized (C02570Cp.class) {
                if (A04 == null) {
                    AnonymousClass00G r2 = AnonymousClass00G.A01;
                    WebpUtils A002 = WebpUtils.A00();
                    WhatsAppLibLoader.A00();
                    A04 = new C02570Cp(r2, A002);
                }
            }
        }
        return A04;
    }

    public static final String A02(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace("/", "-"));
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        return sb.toString();
    }

    public final Bitmap A03(WebPImage webPImage, int i, int i2, String str) {
        Bitmap bitmap;
        try {
            if (webPImage.getFrameCount() <= 0) {
                bitmap = null;
            } else {
                bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                WebPFrame frame = webPImage.m1getFrame(0);
                int width = frame.getWidth();
                int height = frame.getHeight();
                int width2 = webPImage.getWidth();
                int height2 = webPImage.getHeight();
                if (height2 == height && width2 == width) {
                    frame.renderFrame(i, i2, bitmap);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    frame.renderFrame(width, height, createBitmap);
                    Canvas canvas = new Canvas(bitmap);
                    canvas.scale(((float) i) / ((float) width2), ((float) i2) / ((float) height2));
                    canvas.drawBitmap(createBitmap, (float) frame.getXOffset(), (float) frame.getYOffset(), (Paint) null);
                    createBitmap.recycle();
                }
            }
            if (bitmap != null) {
                A08(str, bitmap);
            }
            return bitmap;
        } catch (IllegalStateException e) {
            Log.e("WebPImageLoader/createBitmapFromWebPImageAndCache/failed to create static image", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0028, code lost:
        if (r1 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A04(java.lang.String r4) {
        /*
            r3 = this;
            X.2Dk r0 = r3.A07()
            r2 = 0
            if (r0 == 0) goto L_0x002e
            X.2Dj r0 = r0.A08(r4)     // Catch:{ IOException -> 0x000c }
            goto L_0x0013
        L_0x000c:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/error getting bitmap from cache"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = r2
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            return r2
        L_0x0016:
            r1 = 0
            java.io.InputStream[] r0 = r0.A00     // Catch:{ IOException -> 0x002e }
            r1 = r0[r1]     // Catch:{ IOException -> 0x002e }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0024
            r1.close()
        L_0x0024:
            return r0
        L_0x0025:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            if (r1 == 0) goto L_0x002d
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02570Cp.A04(java.lang.String):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A05(java.lang.String r8, java.io.File r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02570Cp.A05(java.lang.String, java.io.File, int, int):android.graphics.Bitmap");
    }

    public Bitmap A06(String str, byte[] bArr, int i, int i2) {
        String A022 = A02(str, i, i2);
        Bitmap A042 = A04(A022);
        if (A042 != null) {
            return A042;
        }
        WebPImage A002 = A00(bArr);
        if (A002 == null) {
            return null;
        }
        return A03(A002, i, i2, A022);
    }

    public final AnonymousClass2Dk A07() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    File file = new File(this.A00.A00.getCacheDir(), "webp_static_cache");
                    if (file.exists() || file.mkdirs()) {
                        try {
                            this.A02 = AnonymousClass2Dk.A00(file, 2097152);
                        } catch (IOException e) {
                            Log.e("WebPImageLoader/getDiskLruCache error opening cache", e);
                        }
                    } else {
                        Log.e("WebPImageLoader/getDiskLruCache could not init directory");
                    }
                    this.A03 = true;
                }
            }
        }
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.lang.String r7, android.graphics.Bitmap r8) {
        /*
            r6 = this;
            X.2Dk r0 = r6.A07()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            X.2Dh r5 = r0.A07(r7)     // Catch:{ IOException -> 0x0052 }
            if (r5 == 0) goto L_0x0058
            r4 = 0
            java.io.OutputStream r2 = r5.A00()     // Catch:{ IOException -> 0x0052 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x004b }
            r3.<init>()     // Catch:{ all -> 0x004b }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0044 }
            r0 = 100
            r8.compress(r1, r0, r3)     // Catch:{ all -> 0x0044 }
            byte[] r1 = r3.toByteArray()     // Catch:{ all -> 0x0044 }
            int r0 = r1.length     // Catch:{ all -> 0x0044 }
            r2.write(r1, r4, r0)     // Catch:{ all -> 0x0044 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0037
            X.2Dk r1 = r5.A02     // Catch:{ all -> 0x0044 }
            X.AnonymousClass2Dk.A02(r1, r5, r4)     // Catch:{ all -> 0x0044 }
            X.2Di r0 = r5.A01     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x0044 }
            r1.A0B(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x003d
        L_0x0037:
            X.2Dk r1 = r5.A02     // Catch:{ all -> 0x0044 }
            r0 = 1
            X.AnonymousClass2Dk.A02(r1, r5, r0)     // Catch:{ all -> 0x0044 }
        L_0x003d:
            r3.close()
            r2.close()
            return
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        L_0x004b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0
        L_0x0052:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/saving bitmap to cache"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02570Cp.A08(java.lang.String, android.graphics.Bitmap):void");
    }
}
