package X;

import java.util.Comparator;

/* renamed from: X.3CK  reason: invalid class name */
public class AnonymousClass3CK implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int length;
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = bArr.length;
            if (i < length && i2 < bArr2.length) {
                int i3 = bArr[i] & 255;
                int i4 = bArr2[i2] & 255;
                if (i3 != i4) {
                    return i3 - i4;
                }
                i++;
                i2++;
            }
        }
        return length - bArr2.length;
    }
}
