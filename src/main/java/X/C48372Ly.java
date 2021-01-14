package X;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* renamed from: X.2Ly  reason: invalid class name and case insensitive filesystem */
public class C48372Ly {
    public final int A00;
    public final short A01;
    public final String[] A02;

    public C48372Ly(String[] strArr, short s, int i) {
        this.A02 = strArr;
        this.A01 = s;
        this.A00 = i;
    }

    public static C48372Ly A00(byte[] bArr, int i) {
        short s;
        int i2;
        if (bArr != null) {
            int length = bArr.length;
            if (length >= 1) {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                int i3 = i;
                while (true) {
                    if (bArr[i3] == 0 || (bArr[i3] & 192) != 0) {
                        byte b = bArr[i3];
                    } else {
                        byte b2 = (byte) (bArr[i3] & 63);
                        int i4 = i3 + 1;
                        i3 = i4 + b2;
                        if (length >= i3 + 1) {
                            sb.setLength(0);
                            for (byte b3 = 0; b3 < b2; b3 = (byte) (b3 + 1)) {
                                sb.append((char) bArr[i4 + b3]);
                            }
                            arrayList.add(sb.toString());
                        } else {
                            throw new IllegalArgumentException("bytes is incomplete");
                        }
                    }
                }
                byte b4 = bArr[i3];
                if (b4 == 0) {
                    i2 = i3 + 1;
                    s = 0;
                } else {
                    byte b5 = (byte) (b4 & 63);
                    s = (short) ((bArr[i3 + 1] & 255) | ((b5 << 8) & 65280));
                    i2 = i3 + 2;
                }
                return new C48372Ly((String[]) arrayList.toArray(new String[0]), s, i2 - i);
            }
            throw new IllegalArgumentException("insufficient data");
        }
        throw new NullPointerException("bytes may not be null");
    }

    public static C48372Ly A01(String[] strArr) {
        int i = 0;
        for (String str : strArr) {
            try {
                int length = str.getBytes("UTF-8").length;
                if (length <= 63) {
                    i += length + 1;
                } else {
                    throw new IllegalStateException("token may not be longer than 63 bytes");
                }
            } catch (UnsupportedEncodingException e) {
                throw new Error(e);
            }
        }
        return new C48372Ly(strArr, 0, i + 1);
    }

    public void A02(OutputStream outputStream) {
        for (String str : this.A02) {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            if (length <= 63) {
                outputStream.write(length);
                outputStream.write(bytes);
            } else {
                throw new IllegalStateException("token may not be longer than 63 bytes");
            }
        }
        short s = this.A01;
        if (s != 0) {
            outputStream.write(((s >>> 8) & 63) | 192);
            outputStream.write(s & 255);
            return;
        }
        outputStream.write(0);
    }
}
