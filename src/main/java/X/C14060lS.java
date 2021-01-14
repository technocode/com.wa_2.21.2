package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0lS  reason: invalid class name and case insensitive filesystem */
public class C14060lS {
    public AnonymousClass0WA A00;
    public AnonymousClass0WA A01;
    public C14020lO A02 = new C14020lO();
    public AbstractC14030lP A03 = null;
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public boolean A06 = true;
    public boolean A07 = true;

    public C14060lS(AnonymousClass0WA r2) {
        this.A00 = r2;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (r20 == 0) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.AnonymousClass0WA r19, int r20) {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14060lS.A00(X.0WA, int):int");
    }

    public void A01() {
        ArrayList arrayList = this.A05;
        arrayList.clear();
        this.A01.A0c.A07();
        this.A01.A0d.A07();
        AnonymousClass0WA r1 = this.A01;
        arrayList.add(r1.A0c);
        arrayList.add(r1.A0d);
        Iterator it = ((AnonymousClass0WB) r1).A00.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            AnonymousClass0WC r12 = (AnonymousClass0WC) it.next();
            if (r12 instanceof C29811aE) {
                arrayList.add(new C451723g(r12));
            } else {
                if (r12.A0G()) {
                    C451523e r0 = r12.A0a;
                    if (r0 == null) {
                        r0 = new C451523e(r12, 0);
                        r12.A0a = r0;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r0);
                } else {
                    arrayList.add(r12.A0c);
                }
                if (r12.A0H()) {
                    C451523e r02 = r12.A0b;
                    if (r02 == null) {
                        r02 = new C451523e(r12, 1);
                        r12.A0b = r02;
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(r02);
                } else {
                    arrayList.add(r12.A0d);
                }
                if (r12 instanceof C29821aF) {
                    arrayList.add(new C451823h(r12));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC29841aH) it2.next()).A07();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC29841aH r2 = (AbstractC29841aH) it3.next();
            if (r2.A03 != this.A01) {
                r2.A05();
            }
        }
        ArrayList arrayList2 = this.A04;
        arrayList2.clear();
        C14080lU.A02 = 0;
        A06(this.A00.A0c, 0, arrayList2);
        A06(this.A00.A0d, 1, this.A04);
        this.A06 = false;
    }

    public void A02() {
        boolean z;
        C451623f r1;
        AnonymousClass0WE r14 = AnonymousClass0WE.FIXED;
        AnonymousClass0WE r4 = AnonymousClass0WE.MATCH_CONSTRAINT;
        AnonymousClass0WE r3 = AnonymousClass0WE.WRAP_CONTENT;
        Iterator it = ((AnonymousClass0WB) this.A00).A00.iterator();
        while (it.hasNext()) {
            AnonymousClass0WC r13 = (AnonymousClass0WC) it.next();
            if (!r13.A0i) {
                AnonymousClass0WE[] r0 = r13.A0o;
                boolean z2 = false;
                AnonymousClass0WE r7 = r0[0];
                AnonymousClass0WE r6 = r0[1];
                int i = r13.A0D;
                int i2 = r13.A0C;
                if (r7 == r3 || (r7 == r4 && i == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (r6 == r3 || (r6 == r4 && i2 == 1)) {
                    z2 = true;
                }
                C451623f r8 = r13.A0c.A06;
                boolean z3 = r8.A0B;
                C451623f r5 = r13.A0d.A06;
                boolean z4 = r5.A0B;
                if (z3) {
                    if (z4) {
                        A03(r13, r14, r8.A02, r14, r5.A02);
                        r13.A0i = true;
                    } else if (z2) {
                        A03(r13, r14, r8.A02, r3, r5.A02);
                        C451623f r12 = r13.A0d.A06;
                        int A002 = r13.A00();
                        if (r6 == r4) {
                            r12.A00 = A002;
                        } else {
                            r12.A01(A002);
                            r13.A0i = true;
                        }
                    }
                } else if (z4 && z) {
                    A03(r13, r3, r8.A02, r14, r5.A02);
                    C451623f r15 = r13.A0c.A06;
                    int A012 = r13.A01();
                    if (r7 == r4) {
                        r15.A00 = A012;
                    } else {
                        r15.A01(A012);
                        r13.A0i = true;
                    }
                }
                if (r13.A0i && (r1 = r13.A0d.A01) != null) {
                    r1.A01(r13.A07);
                }
            }
        }
    }

    public final void A03(AnonymousClass0WC r3, AnonymousClass0WE r4, int i, AnonymousClass0WE r6, int i2) {
        C14020lO r1 = this.A02;
        r1.A05 = r4;
        r1.A06 = r6;
        r1.A00 = i;
        r1.A04 = i2;
        ((C29851aI) this.A03).A00(r3, r1);
        C14020lO r12 = this.A02;
        r3.A09(r12.A03);
        r3.A08(r12.A02);
        r3.A0h = r12.A07;
        int i3 = r12.A01;
        r3.A07 = i3;
        boolean z = false;
        if (i3 > 0) {
            z = true;
        }
        r3.A0h = z;
    }

    public final void A04(AnonymousClass0WA r27) {
        AnonymousClass0WE r0;
        AnonymousClass0WE r10 = AnonymousClass0WE.MATCH_PARENT;
        AnonymousClass0WE r9 = AnonymousClass0WE.MATCH_CONSTRAINT;
        AnonymousClass0WE r8 = AnonymousClass0WE.WRAP_CONTENT;
        AnonymousClass0WE r7 = AnonymousClass0WE.FIXED;
        Iterator it = ((AnonymousClass0WB) r27).A00.iterator();
        while (it.hasNext()) {
            AnonymousClass0WC r6 = (AnonymousClass0WC) it.next();
            AnonymousClass0WE[] r02 = r6.A0o;
            AnonymousClass0WE r11 = r02[0];
            AnonymousClass0WE r3 = r02[1];
            if (r6.A0N == 8) {
                r6.A0i = true;
            } else {
                float f = r6.A04;
                if (f < 1.0f && r11 == r9) {
                    r6.A0D = 2;
                }
                float f2 = r6.A03;
                if (f2 < 1.0f && r3 == r9) {
                    r6.A0C = 2;
                }
                if (r6.A01 > 0.0f) {
                    if (r11 == r9 && (r3 == r8 || r3 == r7)) {
                        r6.A0D = 3;
                    } else if (r3 == r9 && (r11 == r8 || r11 == r7)) {
                        r6.A0C = 3;
                    } else if (r11 == r9 && r3 == r9) {
                        if (r6.A0D == 0) {
                            r6.A0D = 3;
                        }
                        if (r6.A0C == 0) {
                            r6.A0C = 3;
                        }
                    }
                }
                if (r11 == r9 && r6.A0D == 1 && (r6.A0W.A03 == null || r6.A0X.A03 == null)) {
                    r11 = r8;
                }
                if (r3 == r9 && r6.A0C == 1 && (r6.A0Y.A03 == null || r6.A0S.A03 == null)) {
                    r3 = r8;
                }
                C451923i r03 = r6.A0c;
                r03.A02 = r11;
                int i = r6.A0D;
                r03.A00 = i;
                C452023j r04 = r6.A0d;
                r04.A02 = r3;
                int i2 = r6.A0C;
                ((AbstractC29841aH) r04).A00 = i2;
                if ((r11 == r10 || r11 == r7 || r11 == r8) && (r3 == r10 || r3 == r7 || r3 == r8)) {
                    int A012 = r6.A01();
                    if (r11 == r10) {
                        A012 = (r27.A01() - r6.A0W.A01) - r6.A0X.A01;
                        r11 = r7;
                    }
                    int A002 = r6.A00();
                    if (r3 == r10) {
                        A002 = (r27.A00() - r6.A0Y.A01) - r6.A0S.A01;
                        r3 = r7;
                    }
                    A03(r6, r11, A012, r3, A002);
                    r6.A0c.A06.A01(r6.A01());
                    r6.A0d.A06.A01(r6.A00());
                    r6.A0i = true;
                } else {
                    if (r11 == r9 && (r3 == r8 || r3 == r7)) {
                        if (i == 3) {
                            if (r3 == r8) {
                                A03(r6, r8, 0, r8, 0);
                            }
                            int A003 = r6.A00();
                            A03(r6, r7, (int) ((((float) A003) * r6.A01) + 0.5f), r7, A003);
                            r6.A0c.A06.A01(r6.A01());
                            r6.A0d.A06.A01(r6.A00());
                            r6.A0i = true;
                        } else if (i == 1) {
                            A03(r6, r8, 0, r3, 0);
                            r6.A0c.A06.A00 = r6.A01();
                        } else if (i == 2) {
                            AnonymousClass0WE r05 = r27.A0o[0];
                            if (r05 == r7 || r05 == r10) {
                                A03(r6, r7, (int) ((f * ((float) r27.A01())) + 0.5f), r3, r6.A00());
                                r6.A0c.A06.A01(r6.A01());
                                r6.A0d.A06.A01(r6.A00());
                                r6.A0i = true;
                            }
                        } else {
                            AnonymousClass0WG[] r15 = r6.A0n;
                            if (r15[0].A03 == null || r15[1].A03 == null) {
                                A03(r6, r8, 0, r3, 0);
                                r6.A0c.A06.A01(r6.A01());
                                r6.A0d.A06.A01(r6.A00());
                                r6.A0i = true;
                            }
                        }
                    }
                    if (r3 == r9 && (r11 == r8 || r11 == r7)) {
                        if (i2 == 3) {
                            if (r11 == r8) {
                                A03(r6, r8, 0, r8, 0);
                            }
                            int A013 = r6.A01();
                            float f3 = r6.A01;
                            if (r6.A08 == -1) {
                                f3 = 1.0f / f3;
                            }
                            A03(r6, r7, A013, r7, (int) ((((float) A013) * f3) + 0.5f));
                            r6.A0c.A06.A01(r6.A01());
                            r6.A0d.A06.A01(r6.A00());
                            r6.A0i = true;
                        } else if (i2 == 1) {
                            A03(r6, r11, 0, r8, 0);
                            r6.A0d.A06.A00 = r6.A00();
                        } else if (i2 == 2) {
                            AnonymousClass0WE r06 = r27.A0o[1];
                            if (r06 == r7 || r06 == r10) {
                                A03(r6, r11, r6.A01(), r7, (int) ((f2 * ((float) r27.A00())) + 0.5f));
                                r6.A0c.A06.A01(r6.A01());
                                r6.A0d.A06.A01(r6.A00());
                                r6.A0i = true;
                            }
                        } else {
                            AnonymousClass0WG[] r152 = r6.A0n;
                            if (r152[2].A03 == null || r152[3].A03 == null) {
                                A03(r6, r8, 0, r3, 0);
                                r6.A0c.A06.A01(r6.A01());
                                r6.A0d.A06.A01(r6.A00());
                                r6.A0i = true;
                            }
                        }
                    }
                    if (r11 == r9 && r3 == r9) {
                        if (i == 1 || i2 == 1) {
                            A03(r6, r8, 0, r8, 0);
                            r6.A0c.A06.A00 = r6.A01();
                            r6.A0d.A06.A00 = r6.A00();
                        } else if (i2 == 2 && i == 2) {
                            AnonymousClass0WE[] r1 = r27.A0o;
                            AnonymousClass0WE r07 = r1[0];
                            if ((r07 == r7 || r07 == r7) && ((r0 = r1[1]) == r7 || r0 == r7)) {
                                A03(r6, r7, (int) ((f * ((float) r27.A01())) + 0.5f), r7, (int) ((f2 * ((float) r27.A00())) + 0.5f));
                                r6.A0c.A06.A01(r6.A01());
                                r6.A0d.A06.A01(r6.A00());
                                r6.A0i = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A05(C29831aG r16, int i, C29831aG r18, ArrayList arrayList, C14080lU r20) {
        C14080lU r8 = r20;
        AbstractC29841aH r2 = r16.A06;
        if (r2.A07 == null) {
            AnonymousClass0WA r1 = this.A00;
            if (!(r2 == r1.A0c || r2 == r1.A0d)) {
                if (r20 == null) {
                    r8 = new C14080lU(r2);
                    arrayList.add(r8);
                }
                r2.A07 = r8;
                r8.A01.add(r2);
                for (AbstractC14050lR r4 : r2.A05.A07) {
                    if (r4 instanceof C29831aG) {
                        A05((C29831aG) r4, i, r18, arrayList, r8);
                    }
                }
                for (AbstractC14050lR r42 : r2.A04.A07) {
                    if (r42 instanceof C29831aG) {
                        A05((C29831aG) r42, i, r18, arrayList, r8);
                    }
                }
                if (i == 1 && (r2 instanceof C452023j)) {
                    for (AbstractC14050lR r10 : ((C452023j) r2).A00.A07) {
                        if (r10 instanceof C29831aG) {
                            A05((C29831aG) r10, 1, r18, arrayList, r8);
                        }
                    }
                }
                for (C29831aG r43 : r2.A05.A08) {
                    A05(r43, i, r18, arrayList, r8);
                }
                for (C29831aG r44 : r2.A04.A08) {
                    A05(r44, i, r18, arrayList, r8);
                }
                if (i == 1 && (r2 instanceof C452023j)) {
                    for (C29831aG r45 : ((C452023j) r2).A00.A08) {
                        A05(r45, 1, r18, arrayList, r8);
                    }
                }
            }
        }
    }

    public final void A06(AbstractC29841aH r9, int i, ArrayList arrayList) {
        for (AbstractC14050lR r3 : r9.A05.A07) {
            if (r3 instanceof C29831aG) {
                A05((C29831aG) r3, i, r9.A04, arrayList, null);
            } else if (r3 instanceof AbstractC29841aH) {
                A05(((AbstractC29841aH) r3).A05, i, r9.A04, arrayList, null);
            }
        }
        for (AbstractC14050lR r32 : r9.A04.A07) {
            if (r32 instanceof C29831aG) {
                A05((C29831aG) r32, i, r9.A05, arrayList, null);
            } else if (r32 instanceof AbstractC29841aH) {
                A05(((AbstractC29841aH) r32).A04, i, r9.A05, arrayList, null);
            }
        }
        if (i == 1) {
            for (AbstractC14050lR r33 : ((C452023j) r9).A00.A07) {
                if (r33 instanceof C29831aG) {
                    A05((C29831aG) r33, 1, null, arrayList, null);
                }
            }
        }
    }
}
