package X;

import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0UA  reason: invalid class name */
public class AnonymousClass0UA {
    public AnonymousClass34X A00;
    public AnonymousClass0UB A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public AnonymousClass0UA(InputStream inputStream, List list, MappedByteBuffer mappedByteBuffer) {
        if (mappedByteBuffer != null) {
            this.A01 = new AnonymousClass0UB(list, mappedByteBuffer);
        } else {
            this.A00 = new AnonymousClass34X(inputStream, list);
        }
    }

    public String A00(int i, Object obj, AbstractC06580Tx r20, boolean z) {
        char c;
        AnonymousClass0UB r7;
        ConcurrentHashMap concurrentHashMap = this.A02;
        Integer valueOf = Integer.valueOf(i);
        String[] strArr = (String[]) concurrentHashMap.get(valueOf);
        if (strArr == null) {
            if (!z || (r7 = this.A01) == null) {
                AnonymousClass34X r13 = this.A00;
                if (r13 == null) {
                    return null;
                }
                for (int length = r13.A03.length - 1; length >= 0; length--) {
                    int i2 = r13.A03[length];
                    int A002 = r13.A00(i2);
                    int i3 = i2 + 2;
                    int A003 = r13.A00(i3);
                    int i4 = i3 + 2;
                    byte[] bArr = r13.A02;
                    int i5 = (A002 << 3) + i4;
                    if (bArr.length < i5) {
                        C04690Lj.A00(String.format(Locale.US, "LoadedStringPack/readTranslations: header for locale incomplete, input.length=%d, caret=%d, numStrings=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(A002)));
                    } else {
                        for (int i6 = 0; i6 < A003; i6++) {
                            int A004 = r13.A00(i5);
                            int i7 = i5 + 2;
                            int i8 = i7 + 1;
                            byte b = r13.A02[i7];
                            if (A004 == i) {
                                strArr = new String[6];
                                int i9 = 0;
                                while (i9 < b) {
                                    byte[] bArr2 = r13.A02;
                                    int i10 = i8 + 1;
                                    byte b2 = bArr2[i8];
                                    int A012 = r13.A01(i10);
                                    int i11 = i10 + 4;
                                    strArr[b2] = new String(bArr2, r13.A00 + A012, r13.A00(i11), r13.A01);
                                    i9++;
                                    i8 = i11 + 2;
                                }
                            } else {
                                i5 = (b * 7) + i8;
                            }
                        }
                        continue;
                    }
                }
                return null;
            }
            synchronized (r7) {
                int i12 = r7.A01.get(i);
                if (i12 == 0) {
                    return null;
                }
                MappedByteBuffer mappedByteBuffer = r7.A03;
                mappedByteBuffer.position(i12);
                int position = mappedByteBuffer.position();
                byte b3 = mappedByteBuffer.get(position);
                int i13 = position + 1;
                strArr = new String[6];
                for (int i14 = 0; i14 < b3; i14++) {
                    byte b4 = mappedByteBuffer.get(i13);
                    int i15 = i13 + 1;
                    int A013 = r7.A01(i15);
                    int i16 = i15 + 4;
                    int A005 = r7.A00(i16);
                    i13 = i16 + 2;
                    byte[] bArr3 = new byte[A005];
                    mappedByteBuffer.position(r7.A00 + A013);
                    mappedByteBuffer.get(bArr3, 0, A005);
                    strArr[b4] = new String(bArr3, 0, A005, r7.A04);
                }
            }
            concurrentHashMap.put(valueOf, strArr);
        }
        int A04 = r20.A04(obj);
        if (A04 != 1) {
            c = 2;
            if (A04 != 2) {
                c = 4;
                if (A04 == 4) {
                    c = 3;
                } else if (A04 != 8) {
                    c = 5;
                    if (A04 != 16) {
                        c = 0;
                    }
                }
            }
        } else {
            c = 1;
        }
        String str = strArr[c];
        if (str != null) {
            return str;
        }
        return strArr[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[LOOP:0: B:19:0x0055->B:26:0x0090, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(int r15, boolean r16) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UA.A01(int, boolean):java.lang.String");
    }
}
