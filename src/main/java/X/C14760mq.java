package X;

import java.util.Comparator;

/* renamed from: X.0mq  reason: invalid class name and case insensitive filesystem */
public final class C14760mq implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int length = bArr.length;
        int length2 = bArr2.length;
        byte b = length2;
        if (length == length2) {
            for (int i = 0; i < length; i++) {
                byte b2 = bArr[i];
                byte b3 = bArr2[i];
                if (b2 != b3) {
                    length = b2;
                    b = b3;
                }
            }
            return 0;
        }
        return length - b;
    }
}
