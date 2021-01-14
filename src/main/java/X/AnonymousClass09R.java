package X;

import android.database.Cursor;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

/* renamed from: X.09R  reason: invalid class name */
public class AnonymousClass09R {
    public static volatile AnonymousClass09R A02;
    public final AnonymousClass03R A00;
    public final AnonymousClass00S A01;

    public AnonymousClass09R(AnonymousClass00S r1, AnonymousClass03R r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static AnonymousClass09R A00() {
        if (A02 == null) {
            synchronized (AnonymousClass09R.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass09R(AnonymousClass00S.A00(), AnonymousClass03R.A00());
                }
            }
        }
        return A02;
    }

    public static void A01(int i, Object obj, AnonymousClass1VB r4) {
        if (obj == null) {
            r4.A04(i);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
        r4.A08(i, byteArrayOutputStream.toByteArray());
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.AbstractC007503q r7, X.AnonymousClass1VB r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 250
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09R.A02(X.03q, X.1VB, int, int):void");
    }

    public static boolean A03(Cursor cursor, int i) {
        return cursor.getLong(i) == 1;
    }

    public void A04(AbstractC007503q r7, AnonymousClass1VB r8) {
        long j;
        long j2;
        double d;
        double d2;
        String str;
        C007303n r3 = r7.A0n;
        AnonymousClass02N r0 = r3.A00;
        if (r0 != null) {
            r8.A07(1, r0.getRawString());
            if (r3.A02) {
                j = 1;
            } else {
                j = 0;
            }
            r8.A06(2, j);
            r8.A07(3, r3.A01);
            r8.A06(4, (long) r7.A08);
            if (r7.A0f) {
                j2 = 2;
            } else {
                j2 = 0;
            }
            r8.A06(5, j2);
            A02(r7, r8, 22, 6);
            r8.A06(7, r7.A0E);
            String A0K = r7.A0K();
            if (A0K == null) {
                r8.A04(8);
            } else {
                r8.A07(8, A0K);
            }
            String A0I = r7.A0I();
            if (A0I == null) {
                r8.A04(9);
            } else {
                r8.A07(9, A0I);
            }
            r8.A06(10, (long) r7.A0m);
            r8.A06(11, r7.A05());
            String A0J = r7.A0J();
            if (A0J == null) {
                r8.A04(12);
            } else {
                r8.A07(12, A0J);
            }
            String A0F = r7.A0F();
            if (A0F == null) {
                r8.A04(13);
            } else {
                r8.A07(13, A0F);
            }
            String A0H = r7.A0H();
            if (A0H == null) {
                r8.A04(14);
            } else {
                r8.A07(14, A0H);
            }
            r8.A06(15, (long) r7.A02());
            r8.A06(16, (long) r7.A04);
            if (!(r7 instanceof AbstractC02860Dt)) {
                d = 0.0d;
            } else {
                d = ((AbstractC02860Dt) r7).A00;
            }
            r8.A05(17, d);
            if (!(r7 instanceof AbstractC02860Dt)) {
                d2 = 0.0d;
            } else {
                d2 = ((AbstractC02860Dt) r7).A01;
            }
            r8.A05(18, d2);
            A01(19, C001801b.A0L(r7.A0C(), this.A00), r8);
            String A0E = r7.A0E();
            if (A0E == null) {
                r8.A04(20);
            } else {
                r8.A07(20, A0E);
            }
            long j3 = r7.A0C;
            if (j3 == 0) {
                j3 = this.A01.A05();
            }
            r8.A06(21, j3);
            String str2 = r7.A0a;
            if (str2 == null) {
                r8.A04(23);
            } else {
                r8.A07(23, str2);
            }
            r8.A06(24, (long) r7.A06);
            r8.A06(25, r7.A0B);
            String A0M = C006803i.A0M(r7.A0c);
            if (A0M == null) {
                r8.A04(26);
            } else {
                r8.A07(26, A0M);
            }
            if (!(r7 instanceof AnonymousClass0M3)) {
                str = null;
            } else {
                str = ((AnonymousClass0M3) r7).A0A;
            }
            if (str == null) {
                r8.A04(27);
            } else {
                r8.A07(27, str);
            }
            r8.A06(28, (long) r7.A00);
            String A0G = r7.A0G();
            if (A0G == null) {
                r8.A04(29);
            } else {
                r8.A07(29, A0G);
            }
            String str3 = r7.A0b;
            if (str3 == null) {
                r8.A04(30);
            } else {
                r8.A07(30, str3);
            }
            r8.A06(31, (long) r7.A04());
            r8.A06(32, (long) r7.A03());
            r8.A06(33, r7.A06());
            return;
        }
        throw null;
    }

    public final void A05(AbstractC007503q r4, AnonymousClass1VB r5) {
        long j;
        double d;
        double d2;
        r5.A06(1, (long) r4.A08);
        if (r4.A0f) {
            j = 2;
        } else {
            j = 0;
        }
        r5.A06(2, j);
        A02(r4, r5, 4, 3);
        r5.A06(5, r4.A0E);
        String A0K = r4.A0K();
        if (A0K == null) {
            r5.A04(6);
        } else {
            r5.A07(6, A0K);
        }
        String A0I = r4.A0I();
        if (A0I == null) {
            r5.A04(7);
        } else {
            r5.A07(7, A0I);
        }
        r5.A06(8, (long) r4.A0m);
        r5.A06(9, r4.A05());
        String A0J = r4.A0J();
        if (A0J == null) {
            r5.A04(10);
        } else {
            r5.A07(10, A0J);
        }
        String A0F = r4.A0F();
        if (A0F == null) {
            r5.A04(11);
        } else {
            r5.A07(11, A0F);
        }
        String A0H = r4.A0H();
        if (A0H == null) {
            r5.A04(12);
        } else {
            r5.A07(12, A0H);
        }
        r5.A06(13, (long) r4.A02());
        r5.A06(14, (long) r4.A04);
        if (!(r4 instanceof AbstractC02860Dt)) {
            d = 0.0d;
        } else {
            d = ((AbstractC02860Dt) r4).A00;
        }
        r5.A05(15, d);
        if (!(r4 instanceof AbstractC02860Dt)) {
            d2 = 0.0d;
        } else {
            d2 = ((AbstractC02860Dt) r4).A01;
        }
        r5.A05(16, d2);
        String A0M = C006803i.A0M(r4.A0c);
        if (A0M == null) {
            r5.A04(17);
        } else {
            r5.A07(17, A0M);
        }
        A01(18, C001801b.A0L(r4.A0C(), this.A00), r5);
        r5.A06(19, (long) r4.A00);
        String A0G = r4.A0G();
        if (A0G == null) {
            r5.A04(20);
        } else {
            r5.A07(20, A0G);
        }
        String str = r4.A0b;
        if (str == null) {
            r5.A04(21);
        } else {
            r5.A07(21, str);
        }
        r5.A06(22, (long) r4.A04());
        r5.A06(23, (long) r4.A03());
        r5.A06(24, r4.A0B);
        r5.A06(25, r4.A06());
    }

    public final void A06(AbstractC007503q r4, AnonymousClass1VB r5) {
        double d;
        double d2;
        r5.A06(1, (long) r4.A08);
        r5.A06(2, 2);
        A02(r4, r5, 4, 3);
        r5.A06(5, r4.A0E);
        String A0K = r4.A0K();
        if (A0K == null) {
            r5.A04(6);
        } else {
            r5.A07(6, A0K);
        }
        String A0I = r4.A0I();
        if (A0I == null) {
            r5.A04(7);
        } else {
            r5.A07(7, A0I);
        }
        r5.A06(8, (long) r4.A0m);
        r5.A06(9, r4.A05());
        String A0J = r4.A0J();
        if (A0J == null) {
            r5.A04(10);
        } else {
            r5.A07(10, A0J);
        }
        String A0F = r4.A0F();
        if (A0F == null) {
            r5.A04(11);
        } else {
            r5.A07(11, A0F);
        }
        String A0H = r4.A0H();
        if (A0H == null) {
            r5.A04(12);
        } else {
            r5.A07(12, A0H);
        }
        r5.A06(13, (long) r4.A02());
        r5.A06(14, (long) r4.A04);
        if (!(r4 instanceof AbstractC02860Dt)) {
            d = 0.0d;
        } else {
            d = ((AbstractC02860Dt) r4).A00;
        }
        r5.A05(15, d);
        if (!(r4 instanceof AbstractC02860Dt)) {
            d2 = 0.0d;
        } else {
            d2 = ((AbstractC02860Dt) r4).A01;
        }
        r5.A05(16, d2);
        String A0M = C006803i.A0M(r4.A0c);
        if (A0M == null) {
            r5.A04(17);
        } else {
            r5.A07(17, A0M);
        }
        A01(18, C001801b.A0L(r4.A0C(), this.A00), r5);
        String A0G = r4.A0G();
        if (A0G == null) {
            r5.A04(19);
        } else {
            r5.A07(19, A0G);
        }
    }
}
