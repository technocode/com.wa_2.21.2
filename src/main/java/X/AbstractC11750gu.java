package X;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.0gu  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC11750gu extends AbstractC11760gv {
    public static final long A00 = C11770gw.A00;
    public static final Logger A01 = Logger.getLogger(AbstractC11750gu.class.getName());
    public static final boolean A02 = C11770gw.A02;

    public static int A01(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int A0A(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        int i = 2;
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public AbstractC11750gu() {
    }

    public AbstractC11750gu(AnonymousClass1FI r1) {
    }

    public static int A00(int i) {
        return A01((i << 3) | 0) + 1;
    }

    public static int A02(int i, int i2) {
        int i3;
        int A012 = A01((i << 3) | 0);
        if (i2 >= 0) {
            i3 = A01(i2);
        } else {
            i3 = 10;
        }
        return A012 + i3;
    }

    public static int A03(int i, int i2) {
        int i3;
        int A012 = A01((i << 3) | 0);
        if (i2 >= 0) {
            i3 = A01(i2);
        } else {
            i3 = 10;
        }
        return i3 + A012;
    }

    public static int A04(int i, int i2) {
        return A01(i2) + A01((i << 3) | 0);
    }

    public static int A05(int i, long j) {
        return A01((i << 3) | 0) + A0A(j);
    }

    public static int A06(int i, long j) {
        return A0A(j) + A01((i << 3) | 0);
    }

    public static int A07(int i, AnonymousClass071 r3) {
        int A012 = A01((i << 3) | 0);
        int length = ((AnonymousClass072) r3).bytes.length;
        return A012 + A01(length) + length;
    }

    public static int A08(int i, AnonymousClass076 r3) {
        int A012 = A01((i << 3) | 0);
        int A90 = r3.A90();
        return A012 + A01(A90) + A90;
    }

    public static int A09(int i, String str) {
        return A0B(str) + A01((i << 3) | 0);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public static int A0B(String str) {
        int i;
        try {
            str = C11790gz.A00(str);
            i = str;
        } catch (AnonymousClass1FW unused) {
            i = str.getBytes(AnonymousClass07G.A00).length;
        }
        return A01(i) + i;
    }

    public void A0C(int i) {
        C11820h2 r4 = (C11820h2) this;
        if (!A02 || r4.A01 - r4.A00 < 10) {
            while ((i & -128) != 0) {
                try {
                    byte[] bArr = r4.A02;
                    int i2 = r4.A00;
                    r4.A00 = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new AnonymousClass1FJ(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), 1), e);
                }
            }
            byte[] bArr2 = r4.A02;
            int i3 = r4.A00;
            r4.A00 = i3 + 1;
            bArr2[i3] = (byte) i;
            return;
        }
        long j = A00 + ((long) r4.A00);
        while ((i & -128) != 0) {
            C11770gw.A00(r4.A02, j, (byte) ((i & 127) | 128));
            r4.A00++;
            i >>>= 7;
            j = 1 + j;
        }
        C11770gw.A00(r4.A02, j, (byte) i);
        r4.A00++;
    }

    public void A0D(int i, int i2) {
        C11820h2 r4 = (C11820h2) this;
        r4.A0C((i << 3) | 5);
        try {
            byte[] bArr = r4.A02;
            int i3 = r4.A00;
            int i4 = i3 + 1;
            r4.A00 = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            r4.A00 = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            r4.A00 = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            r4.A00 = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new AnonymousClass1FJ(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), 1), e);
        }
    }

    public void A0E(int i, int i2) {
        C11820h2 r2 = (C11820h2) this;
        r2.A0C((i << 3) | 0);
        if (i2 >= 0) {
            r2.A0C(i2);
        } else {
            r2.A0N((long) i2);
        }
    }

    public void A0F(int i, int i2) {
        A0C((i << 3) | 0);
        A0C(i2);
    }

    public void A0G(int i, long j) {
        C11820h2 r4 = (C11820h2) this;
        r4.A0C((i << 3) | 1);
        try {
            byte[] bArr = r4.A02;
            int i2 = r4.A00;
            int i3 = i2 + 1;
            r4.A00 = i3;
            bArr[i2] = (byte) (((int) j) & 255);
            int i4 = i3 + 1;
            r4.A00 = i4;
            bArr[i3] = (byte) (((int) (j >> 8)) & 255);
            int i5 = i4 + 1;
            r4.A00 = i5;
            bArr[i4] = (byte) (((int) (j >> 16)) & 255);
            int i6 = i5 + 1;
            r4.A00 = i6;
            bArr[i5] = (byte) (((int) (j >> 24)) & 255);
            int i7 = i6 + 1;
            r4.A00 = i7;
            bArr[i6] = (byte) (((int) (j >> 32)) & 255);
            int i8 = i7 + 1;
            r4.A00 = i8;
            bArr[i7] = (byte) (((int) (j >> 40)) & 255);
            int i9 = i8 + 1;
            r4.A00 = i9;
            bArr[i8] = (byte) (((int) (j >> 48)) & 255);
            r4.A00 = i9 + 1;
            bArr[i9] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new AnonymousClass1FJ(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(r4.A00), Integer.valueOf(r4.A01), 1), e);
        }
    }

    public void A0H(int i, long j) {
        C11820h2 r1 = (C11820h2) this;
        r1.A0C((i << 3) | 0);
        r1.A0N(j);
    }

    public final void A0I(int i, long j) {
        C11820h2 r1 = (C11820h2) this;
        r1.A0C((i << 3) | 0);
        r1.A0N(j);
    }

    public void A0J(int i, AnonymousClass071 r5) {
        A0C((i << 3) | 2);
        A0C(((AnonymousClass072) r5).bytes.length);
        AnonymousClass072 r52 = (AnonymousClass072) r5;
        A00(r52.bytes, 0, r52.bytes.length);
    }

    public void A0K(int i, AnonymousClass076 r3) {
        A0C((i << 3) | 2);
        A0C(r3.A90());
        r3.ARP(this);
    }

    public void A0L(int i, String str) {
        C11820h2 r4 = (C11820h2) this;
        r4.A0C((i << 3) | 2);
        int i2 = r4.A00;
        try {
            int length = str.length();
            int A012 = A01(length * 3);
            int A013 = A01(length);
            if (A013 == A012) {
                int i3 = i2 + A013;
                r4.A00 = i3;
                int A002 = C11790gz.A00.A00(str, r4.A02, i3, r4.A01 - r4.A00);
                r4.A00 = i2;
                r4.A0C((A002 - i2) - A013);
                r4.A00 = A002;
                return;
            }
            r4.A0C(C11790gz.A00(str));
            r4.A00 = C11790gz.A00.A00(str, r4.A02, r4.A00, r4.A01 - r4.A00);
        } catch (AnonymousClass1FW e) {
            r4.A00 = i2;
            A01.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(AnonymousClass07G.A00);
            try {
                int length2 = bytes.length;
                r4.A0C(length2);
                r4.A00(bytes, 0, length2);
            } catch (IndexOutOfBoundsException e2) {
                throw new AnonymousClass1FJ(e2);
            } catch (AnonymousClass1FJ e3) {
                throw e3;
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new AnonymousClass1FJ(e4);
        }
    }

    public void A0M(int i, boolean z) {
        C11820h2 r6 = (C11820h2) this;
        r6.A0C((i << 3) | 0);
        byte b = z ? (byte) 1 : 0;
        try {
            byte[] bArr = r6.A02;
            int i2 = r6.A00;
            r6.A00 = i2 + 1;
            bArr[i2] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new AnonymousClass1FJ(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(r6.A00), Integer.valueOf(r6.A01), 1), e);
        }
    }
}
