package X;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: X.0wB  reason: invalid class name and case insensitive filesystem */
public class C20120wB {
    public static final boolean A00;
    public static final byte[] A01 = A01("WEBP");
    public static final byte[] A02 = A01("RIFF");

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i <= 17) {
            z = true;
        }
        A00 = z;
        if (i >= 17 && i == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
        }
        A01("VP8 ");
        A01("VP8L");
        A01("VP8X");
    }

    public static boolean A00(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int length;
        int length2;
        if (i2 < 20 || (bArr2 = A02) == null || bArr == null || (length = bArr2.length) + i > (length2 = bArr.length)) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3++) {
            if (bArr[i3 + i] != bArr2[i3]) {
                return false;
            }
        }
        int i4 = i + 8;
        byte[] bArr3 = A01;
        if (bArr3 == null || bArr == null) {
            return false;
        }
        int length3 = bArr3.length;
        if (length3 + i4 > length2) {
            return false;
        }
        for (int i5 = 0; i5 < length3; i5++) {
            if (bArr[i5 + i4] != bArr3[i5]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] A01(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }
}
