package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0no  reason: invalid class name and case insensitive filesystem */
public class C15290no {
    public final int A00;
    public final int A01;
    public final byte[] A02;

    public C15290no(int i, int i2, byte[] bArr) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = bArr;
    }

    public static C15290no A00(int i, ByteOrder byteOrder) {
        return A03(new int[]{i}, byteOrder);
    }

    public static C15290no A01(long j, ByteOrder byteOrder) {
        return A04(new long[]{j}, byteOrder);
    }

    public static C15290no A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append((char) 0);
        byte[] bytes = sb.toString().getBytes(C15320nr.A0K);
        return new C15290no(2, bytes.length, bytes);
    }

    public static C15290no A03(int[] iArr, ByteOrder byteOrder) {
        int i = C15320nr.A0V[3];
        int length = iArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * length)]);
        wrap.order(byteOrder);
        for (int i2 : iArr) {
            wrap.putShort((short) i2);
        }
        return new C15290no(3, length, wrap.array());
    }

    public static C15290no A04(long[] jArr, ByteOrder byteOrder) {
        int i = C15320nr.A0V[4];
        int length = jArr.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * length)]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new C15290no(4, length, wrap.array());
    }

    public static C15290no A05(C15310nq[] r8, ByteOrder byteOrder) {
        int i = C15320nr.A0V[5];
        int length = r8.length;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(i * length)]);
        wrap.order(byteOrder);
        for (C15310nq r3 : r8) {
            wrap.putInt((int) r3.A01);
            wrap.putInt((int) r3.A00);
        }
        return new C15290no(5, length, wrap.array());
    }

    public int A06(ByteOrder byteOrder) {
        Object A07 = A07(byteOrder);
        if (A07 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (A07 instanceof String) {
            return Integer.parseInt((String) A07);
        } else {
            if (A07 instanceof long[]) {
                long[] jArr = (long[]) A07;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (A07 instanceof int[]) {
                int[] iArr = (int[]) A07;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0190 A[SYNTHETIC, Splitter:B:137:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x019d A[SYNTHETIC, Splitter:B:146:0x019d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A07(java.nio.ByteOrder r14) {
        /*
        // Method dump skipped, instructions count: 450
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15290no.A07(java.nio.ByteOrder):java.lang.Object");
    }

    public String A08(ByteOrder byteOrder) {
        Object A07 = A07(byteOrder);
        if (A07 == null) {
            return null;
        }
        if (A07 instanceof String) {
            return (String) A07;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (A07 instanceof long[]) {
            long[] jArr = (long[]) A07;
            while (true) {
                int length = jArr.length;
                if (i >= length) {
                    return sb.toString();
                }
                sb.append(jArr[i]);
                i++;
                if (i != length) {
                    sb.append(",");
                }
            }
        } else if (A07 instanceof int[]) {
            int[] iArr = (int[]) A07;
            while (true) {
                int length2 = iArr.length;
                if (i >= length2) {
                    return sb.toString();
                }
                sb.append(iArr[i]);
                i++;
                if (i != length2) {
                    sb.append(",");
                }
            }
        } else if (A07 instanceof double[]) {
            double[] dArr = (double[]) A07;
            while (true) {
                int length3 = dArr.length;
                if (i >= length3) {
                    return sb.toString();
                }
                sb.append(dArr[i]);
                i++;
                if (i != length3) {
                    sb.append(",");
                }
            }
        } else if (!(A07 instanceof C15310nq[])) {
            return null;
        } else {
            C15310nq[] r7 = (C15310nq[]) A07;
            while (true) {
                int length4 = r7.length;
                if (i >= length4) {
                    return sb.toString();
                }
                C15310nq r2 = r7[i];
                sb.append(r2.A01);
                sb.append('/');
                sb.append(r2.A00);
                i++;
                if (i != length4) {
                    sb.append(",");
                }
            }
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("(");
        A0S.append(C15320nr.A0g[this.A00]);
        A0S.append(", data length:");
        return AnonymousClass008.A0N(A0S, this.A02.length, ")");
    }
}
