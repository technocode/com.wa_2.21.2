package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;

/* renamed from: X.3Br  reason: invalid class name and case insensitive filesystem */
public final class C68093Br {
    static {
        try {
            AccessController.doPrivileged(new C68083Bq());
        } catch (Exception unused) {
            try {
                String.format("%n", new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public static String A00(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static byte[] A01(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            try {
                int length = cArr.length;
                if (i >= length) {
                    return byteArrayOutputStream.toByteArray();
                }
                char c = cArr[i];
                if (c < 128) {
                    byteArrayOutputStream.write(c);
                } else if (c < 2048) {
                    byteArrayOutputStream.write((c >> 6) | 192);
                    byteArrayOutputStream.write((c & '?') | 128);
                } else if (c < 55296 || c > 57343) {
                    byteArrayOutputStream.write((c >> '\f') | 224);
                    byteArrayOutputStream.write(((c >> 6) & 63) | 128);
                    byteArrayOutputStream.write((c & '?') | 128);
                } else {
                    i++;
                    if (i < length) {
                        char c2 = cArr[i];
                        if (c <= 56319) {
                            int i2 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                            byteArrayOutputStream.write((i2 >> 18) | 240);
                            byteArrayOutputStream.write(((i2 >> 12) & 63) | 128);
                            byteArrayOutputStream.write(((i2 >> 6) & 63) | 128);
                            byteArrayOutputStream.write((i2 & 63) | 128);
                        } else {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                    } else {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                }
                i++;
            } catch (IOException unused) {
                throw new IllegalStateException("cannot encode string to byte array!");
            }
        }
    }
}
