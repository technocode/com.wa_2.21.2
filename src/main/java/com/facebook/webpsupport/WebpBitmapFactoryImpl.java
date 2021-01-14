package com.facebook.webpsupport;

import X.AnonymousClass0N2;
import X.C20120wB;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactoryImpl {
    public static native Bitmap nativeDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options, float f, byte[] bArr2);

    public static native Bitmap nativeDecodeStream(InputStream inputStream, BitmapFactory.Options options, float f, byte[] bArr);

    public static native long nativeSeek(FileDescriptor fileDescriptor, long j, boolean z);

    public static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options) {
        if (options != null) {
            Bitmap bitmap = options.inBitmap;
            if (bitmap == null) {
                throw null;
            } else if (bitmap.isMutable()) {
                return options.inBitmap;
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public static byte[] getInTempStorageFromOptions(BitmapFactory.Options options) {
        byte[] bArr;
        return (options == null || (bArr = options.inTempStorage) == null) ? new byte[8192] : bArr;
    }

    public static float getScaleFromOptions(BitmapFactory.Options options) {
        float f = 1.0f;
        if (options == null) {
            return 1.0f;
        }
        int i = options.inSampleSize;
        if (i > 1) {
            f = 1.0f / ((float) i);
        }
        if (!options.inScaled) {
            return f;
        }
        int i2 = options.inDensity;
        int i3 = options.inTargetDensity;
        return (i2 == 0 || i3 == 0 || i2 == options.inScreenDensity) ? f : ((float) i3) / ((float) i2);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2) {
        return hookDecodeByteArray(bArr, i, i2, null);
    }

    public static Bitmap hookDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        AnonymousClass0N2.A0y();
        if (!C20120wB.A00 || !C20120wB.A00(bArr, i, i2)) {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
        Bitmap nativeDecodeByteArray = nativeDecodeByteArray(bArr, i, i2, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeByteArray, options);
        return nativeDecodeByteArray;
    }

    public static Bitmap hookDecodeFile(String str) {
        return hookDecodeFile(str, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeFile(java.lang.String r3, android.graphics.BitmapFactory.Options r4) {
        /*
            r2 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0015 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0015 }
            android.graphics.Bitmap r2 = hookDecodeStream(r1, r2, r4)     // Catch:{ all -> 0x000e }
            r1.close()
            return r2
        L_0x000e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x0010:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0014 }
        L_0x0014:
            throw r0
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return hookDecodeFileDescriptor(fileDescriptor, null, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        Bitmap bitmap;
        AnonymousClass0N2.A0y();
        long nativeSeek = nativeSeek(fileDescriptor, 0, false);
        if (nativeSeek != -1) {
            InputStream fileInputStream = new FileInputStream(fileDescriptor);
            if (!fileInputStream.markSupported()) {
                fileInputStream = new BufferedInputStream(fileInputStream, 20);
            }
            try {
                fileInputStream.mark(20);
                if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
                    bArr = new byte[20];
                }
                try {
                    fileInputStream.read(bArr, 0, 20);
                    fileInputStream.reset();
                } catch (IOException unused) {
                    bArr = null;
                }
                if (!C20120wB.A00 || !C20120wB.A00(bArr, 0, 20)) {
                    nativeSeek(fileDescriptor, nativeSeek, true);
                    bitmap = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
                } else {
                    bitmap = nativeDecodeStream(fileInputStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
                    setPaddingDefaultValues(rect);
                    setWebpBitmapOptions(bitmap, options);
                }
                try {
                    fileInputStream.close();
                    return bitmap;
                } catch (Throwable unused2) {
                    return bitmap;
                }
            } catch (Throwable unused3) {
            }
        } else {
            Bitmap hookDecodeStream = hookDecodeStream(new FileInputStream(fileDescriptor), rect, options);
            setPaddingDefaultValues(rect);
            return hookDecodeStream;
        }
        throw th;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i) {
        return hookDecodeResource(resources, i, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap hookDecodeResource(android.content.res.Resources r3, int r4, android.graphics.BitmapFactory.Options r5) {
        /*
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2 = 0
            java.io.InputStream r1 = r3.openRawResource(r4, r0)     // Catch:{ Exception -> 0x001d }
            android.graphics.Bitmap r2 = hookDecodeResourceStream(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x001d
            r1.close()
            goto L_0x001d
        L_0x0014:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            if (r1 == 0) goto L_0x001c
            r1.close()     // Catch:{ all -> 0x001c }
        L_0x001c:
            throw r0
        L_0x001d:
            if (r2 != 0) goto L_0x002d
            if (r5 == 0) goto L_0x002d
            android.graphics.Bitmap r0 = r5.inBitmap
            if (r0 == 0) goto L_0x002d
            java.lang.String r1 = "Problem decoding into existing bitmap"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeResource(android.content.res.Resources, int, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        if (options.inDensity == 0 && typedValue != null) {
            int i = typedValue.density;
            if (i == 0) {
                options.inDensity = 160;
            } else if (i != 65535) {
                options.inDensity = i;
            }
        }
        if (options.inTargetDensity == 0 && resources != null) {
            options.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputStream, rect, options);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream) {
        return hookDecodeStream(inputStream, null, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        byte[] bArr;
        AnonymousClass0N2.A0y();
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, 20);
        }
        inputStream.mark(20);
        if (options == null || (bArr = options.inTempStorage) == null || bArr.length < 20) {
            bArr = new byte[20];
        }
        try {
            inputStream.read(bArr, 0, 20);
            inputStream.reset();
        } catch (IOException unused) {
            bArr = null;
        }
        if (!C20120wB.A00 || !C20120wB.A00(bArr, 0, 20)) {
            return BitmapFactory.decodeStream(inputStream, rect, options);
        }
        Bitmap nativeDecodeStream = nativeDecodeStream(inputStream, options, getScaleFromOptions(options), getInTempStorageFromOptions(options));
        setWebpBitmapOptions(nativeDecodeStream, options);
        setPaddingDefaultValues(rect);
        return nativeDecodeStream;
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2) {
        return BitmapFactory.decodeByteArray(bArr, i, i2);
    }

    public static Bitmap originalDecodeByteArray(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return BitmapFactory.decodeByteArray(bArr, i, i2, options);
    }

    public static Bitmap originalDecodeFile(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap originalDecodeFile(String str, BitmapFactory.Options options) {
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor);
    }

    public static Bitmap originalDecodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i) {
        return BitmapFactory.decodeResource(resources, i);
    }

    public static Bitmap originalDecodeResource(Resources resources, int i, BitmapFactory.Options options) {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedValue, InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeResourceStream(resources, typedValue, inputStream, rect, options);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream);
    }

    public static Bitmap originalDecodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(inputStream, rect, options);
    }

    public static void setBitmapSize(BitmapFactory.Options options, int i, int i2) {
        if (options != null) {
            options.outWidth = i;
            options.outHeight = i2;
        }
    }

    public static boolean setOutDimensions(BitmapFactory.Options options, int i, int i2) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        options.outWidth = i;
        options.outHeight = i2;
        return true;
    }

    public static void setPaddingDefaultValues(Rect rect) {
        if (rect != null) {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    public static void setWebpBitmapOptions(Bitmap bitmap, BitmapFactory.Options options) {
        if (bitmap != null) {
            if (options != null) {
                int i = options.inDensity;
                if (i != 0) {
                    bitmap.setDensity(i);
                    int i2 = options.inTargetDensity;
                    if (!(i2 == 0 || i == i2 || i == options.inScreenDensity || !options.inScaled)) {
                        bitmap.setDensity(i2);
                    }
                } else if (options.inBitmap != null) {
                    bitmap.setDensity(160);
                }
            } else {
                return;
            }
        } else if (options == null) {
            return;
        }
        options.outMimeType = "image/webp";
    }

    public static boolean shouldPremultiply(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT < 19 || options == null) {
            return true;
        }
        return options.inPremultiplied;
    }
}
