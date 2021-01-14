package X;

import android.util.Pair;
import java.nio.charset.Charset;

/* renamed from: X.13N  reason: invalid class name */
public final class AnonymousClass13N {
    public static final int A00 = AnonymousClass0W2.A01("clcp");
    public static final int A01 = AnonymousClass0W2.A01("mdta");
    public static final int A02 = AnonymousClass0W2.A01("meta");
    public static final int A03 = AnonymousClass0W2.A01("sbtl");
    public static final int A04 = AnonymousClass0W2.A01("soun");
    public static final int A05 = AnonymousClass0W2.A01("subt");
    public static final int A06 = AnonymousClass0W2.A01("text");
    public static final int A07 = AnonymousClass0W2.A01("vide");
    public static final byte[] A08 = "OpusHead".getBytes(Charset.forName("UTF-8"));

    public static int A00(C233815n r3) {
        int A012 = r3.A01();
        int i = A012 & 127;
        while ((A012 & 128) == 128) {
            A012 = r3.A01();
            i = (i << 7) | (A012 & 127);
        }
        return i;
    }

    public static Pair A01(C233815n r6, int i) {
        r6.A0B(i + 8 + 4);
        r6.A0C(1);
        A00(r6);
        r6.A0C(2);
        int A012 = r6.A01();
        if ((A012 & 128) != 0) {
            r6.A0C(2);
        }
        if ((A012 & 64) != 0) {
            r6.A0C(r6.A03());
        }
        if ((A012 & 32) != 0) {
            r6.A0C(2);
        }
        r6.A0C(1);
        A00(r6);
        String A013 = C233415j.A01(r6.A01());
        if ("audio/mpeg".equals(A013) || "audio/vnd.dts".equals(A013) || "audio/vnd.dts.hd".equals(A013)) {
            return Pair.create(A013, null);
        }
        r6.A0C(12);
        r6.A0C(1);
        int A002 = A00(r6);
        byte[] bArr = new byte[A002];
        System.arraycopy(r6.A02, r6.A01, bArr, 0, A002);
        r6.A01 += A002;
        return Pair.create(A013, bArr);
    }

    public static Pair A02(C233815n r14, int i, int i2) {
        AnonymousClass13T r2;
        boolean z;
        byte[] bArr;
        int i3 = r14.A01;
        while (i3 - i < i2) {
            r14.A0B(i3);
            int A002 = r14.A00();
            boolean z2 = false;
            if (A002 > 0) {
                z2 = true;
            }
            C002001d.A3B(z2, "childAtomSize should be positive");
            if (r14.A00() == AnonymousClass13L.A0y) {
                int i4 = i3 + 8;
                int i5 = -1;
                int i6 = 0;
                String str = null;
                Integer num = null;
                while (i4 - i3 < A002) {
                    r14.A0B(i4);
                    int A003 = r14.A00();
                    int A004 = r14.A00();
                    if (A004 == AnonymousClass13L.A0W) {
                        num = Integer.valueOf(r14.A00());
                    } else if (A004 == AnonymousClass13L.A0x) {
                        r14.A0C(4);
                        str = r14.A09(4, Charset.forName("UTF-8"));
                    } else if (A004 == AnonymousClass13L.A0w) {
                        i5 = i4;
                        i6 = A003;
                    }
                    i4 += A003;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    boolean z3 = false;
                    if (num != null) {
                        z3 = true;
                    }
                    C002001d.A3B(z3, "frma atom is mandatory");
                    boolean z4 = false;
                    if (i5 != -1) {
                        z4 = true;
                    }
                    C002001d.A3B(z4, "schi atom is mandatory");
                    int i7 = i5 + 8;
                    while (true) {
                        if (i7 - i5 >= i6) {
                            r2 = null;
                            z = false;
                            break;
                        }
                        r14.A0B(i7);
                        int A005 = r14.A00();
                        if (r14.A00() == AnonymousClass13L.A1B) {
                            int A006 = (r14.A00() >> 24) & 255;
                            r14.A0C(1);
                            if (A006 == 0) {
                                r14.A0C(1);
                            } else {
                                r14.A01();
                            }
                            boolean z5 = false;
                            if (r14.A01() == 1) {
                                z5 = true;
                            }
                            int A012 = r14.A01();
                            System.arraycopy(r14.A02, r14.A01, new byte[16], 0, 16);
                            r14.A01 += 16;
                            if (!z5 || A012 != 0) {
                                bArr = null;
                            } else {
                                int A013 = r14.A01();
                                bArr = new byte[A013];
                                System.arraycopy(r14.A02, r14.A01, bArr, 0, A013);
                                r14.A01 += A013;
                            }
                            r2 = new AnonymousClass13T(str, A012, bArr);
                            z = true;
                        } else {
                            i7 += A005;
                        }
                    }
                    C002001d.A3B(z, "tenc atom is mandatory");
                    Pair create = Pair.create(num, r2);
                    if (create != null) {
                        return create;
                    }
                }
            }
            i3 += A002;
        }
        return null;
    }
}
