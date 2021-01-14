package com.whatsapp.stickers;

import X.C006803i;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Random;

public class WebpUtils {
    public static final Random A00 = new Random();
    public static volatile WebpUtils A01;

    public static native boolean createFirstThumbnail(byte[] bArr, int i, String str);

    public static native byte[] fetchWebpMetadata(String str);

    public static native int getFirstWebpThumbnailMinimumFileLength(String str);

    public static native boolean insertWebpMetadata(String str, String str2, byte[] bArr);

    public static native WebpInfo verifyWebpFileIntegrity(String str);

    public static WebpUtils A00() {
        if (A01 == null) {
            synchronized (WebpUtils.class) {
                if (A01 == null) {
                    A01 = new WebpUtils();
                }
            }
        }
        return A01;
    }

    public static boolean A01(File file, byte[] bArr) {
        if (!file.exists()) {
            return false;
        }
        if (bArr == null || bArr.length == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getAbsolutePath());
        sb.append(".");
        sb.append(A00.nextLong());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        try {
            new String(bArr, "UTF-8");
            boolean insertWebpMetadata = insertWebpMetadata(file.getAbsolutePath(), file2.getAbsolutePath(), bArr);
            file.getAbsolutePath();
            if (insertWebpMetadata) {
                boolean renameTo = file2.renameTo(file);
                file2.getAbsolutePath();
                file.getAbsolutePath();
                return renameTo;
            }
            C006803i.A0m(file2);
            return false;
        } catch (UnsupportedEncodingException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("WebpUtils/insertWebpMetadata/error when converting bytes to string, input file:");
            sb2.append(file);
            Log.e(sb2.toString(), e);
            return false;
        } finally {
            C006803i.A0m(file2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bc, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.WebpUtils.A02(java.lang.String):java.lang.String");
    }
}
