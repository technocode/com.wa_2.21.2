package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1eq  reason: invalid class name and case insensitive filesystem */
public class C32371eq {
    public C07070Vu A00;
    public C07070Vu A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;

    public C32371eq() {
        this.A03 = 0;
        this.A02 = 0;
        this.A04 = 0;
        this.A05 = true;
    }

    public C32371eq(int i, int i2, int i3) {
        this.A03 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A05 = false;
    }

    public static List A00(List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        C07070Vu r5 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C07070Vu r3 = (C07070Vu) list.get(i2);
            if (r3.A01 * r3.A00 <= i) {
                arrayList.add(r3);
            }
            if (r5 == null || r3.A01 * r3.A00 < r5.A01 * r5.A00) {
                r5 = r3;
            }
        }
        if (arrayList.isEmpty() && r5 != null) {
            arrayList.add(r5);
        }
        return arrayList;
    }

    public final C21170yI A01(List list, List list2, List list3, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        HashSet hashSet;
        C07070Vu r15;
        List<C07070Vu> list4 = list;
        List list5 = list2;
        C07070Vu r3 = new C07070Vu(Math.max(i, i2), Math.min(i, i2));
        int i7 = this.A03;
        if (i7 > 0) {
            float f = (float) i7;
            i4 = (int) (0.8f * f);
            i3 = (int) (f * 1.2f);
        } else {
            i3 = 3145728;
            i4 = 0;
        }
        List A002 = A00(list3, i3);
        if (list != null) {
            list4 = A00(list4, 10485760);
        }
        if (list2 != null) {
            list5 = A00(list5, 2097152);
        }
        if (list4 != null && ((i5 = this.A02) > 0 || (i5 = r3.A01 * r3.A00) > 0)) {
            Iterator it = list4.iterator();
            int i8 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = i8;
                    break;
                }
                C07070Vu A0l = AnonymousClass0N2.A0l((C07070Vu) it.next(), r3);
                int i9 = A0l.A01 * A0l.A00;
                if (i9 > i8) {
                    if (i9 >= i5) {
                        break;
                    }
                    i8 = i9;
                }
            }
        } else {
            i5 = 0;
        }
        int i10 = this.A04;
        boolean z = this.A05;
        if (i4 != 0) {
            double A003 = AnonymousClass0N2.A00(r3.A01, r3.A00);
            double sqrt = Math.sqrt(((double) i4) / A003);
            r3 = new C07070Vu((int) (A003 * sqrt), (int) sqrt);
        }
        C07070Vu r9 = null;
        if (i5 <= 0 || list4 == null) {
            hashSet = null;
            i6 = 0;
        } else {
            i6 = (int) (((double) i5) * 0.75d);
            if (z) {
                hashSet = new HashSet();
                for (C07070Vu r6 : list4) {
                    C07070Vu A0l2 = AnonymousClass0N2.A0l(r6, r3);
                    if (A0l2.A01 * A0l2.A00 >= i6) {
                        hashSet.add(Double.valueOf(AnonymousClass0N2.A00(r6.A01, r6.A00)));
                    }
                }
            } else {
                hashSet = null;
            }
        }
        double d = 0.0d;
        C07070Vu A0m = AnonymousClass0N2.A0m(A002, r3, 0.0d, hashSet);
        if (A0m == null && (A0m = AnonymousClass0N2.A0m(A002, r3, 0.0d, null)) == null) {
            throw new RuntimeException("Could not calculate preview size.");
        }
        double A004 = AnonymousClass0N2.A00(A0m.A01, A0m.A00);
        if (list4 != null) {
            if (i5 > 0) {
                double sqrt2 = Math.sqrt(((double) i6) / A004);
                r3 = new C07070Vu((int) (A004 * sqrt2), (int) sqrt2);
            }
            r15 = AnonymousClass0N2.A0m(list4, r3, A004, null);
        } else {
            r15 = null;
        }
        if (list5 != null) {
            if (i10 == 0) {
                r9 = AnonymousClass0N2.A0m(list5, A0m, A004, null);
            } else if (A004 != 0.0d) {
                int i11 = 0;
                for (int i12 = 0; i12 < list5.size(); i12++) {
                    C07070Vu r11 = (C07070Vu) list5.get(i12);
                    int i13 = r11.A01;
                    int i14 = r11.A00;
                    int i15 = i13 * i14;
                    double A005 = AnonymousClass0N2.A00(i13, i14);
                    int abs = Math.abs(i10 - i15);
                    double abs2 = Math.abs(A004 - A005);
                    if (r9 != null) {
                        double d2 = (double) i15;
                        if (((double) (((int) (abs2 * d2)) + abs)) >= ((double) (((int) (d2 * d)) + i11))) {
                        }
                    }
                    r9 = r11;
                    d = abs2;
                    i11 = abs;
                }
            }
        }
        this.A00 = r15;
        this.A01 = r9;
        return new C21170yI(A0m, r15, r9);
    }
}
