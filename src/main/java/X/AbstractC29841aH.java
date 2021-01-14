package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1aH  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC29841aH implements AbstractC14050lR {
    public int A00;
    public int A01 = 0;
    public AnonymousClass0WE A02;
    public AnonymousClass0WC A03;
    public C29831aG A04 = new C29831aG(this);
    public C29831aG A05 = new C29831aG(this);
    public C451623f A06 = new C451623f(this);
    public C14080lU A07;
    public EnumC14090lV A08 = EnumC14090lV.NONE;
    public boolean A09 = false;

    public AbstractC29841aH(AnonymousClass0WC r2) {
        this.A03 = r2;
    }

    public static final C29831aG A00(AnonymousClass0WG r3) {
        AnonymousClass0WG r0 = r3.A03;
        if (r0 == null) {
            return null;
        }
        AnonymousClass0WC r2 = r0.A06;
        int ordinal = r0.A05.ordinal();
        if (ordinal == 1) {
            return r2.A0c.A05;
        }
        if (ordinal == 2) {
            return r2.A0d.A05;
        }
        if (ordinal == 3) {
            return r2.A0c.A04;
        }
        if (ordinal == 4) {
            return r2.A0d.A04;
        }
        if (ordinal == 5) {
            return r2.A0d.A00;
        }
        return null;
    }

    public static final C29831aG A01(AnonymousClass0WG r3, int i) {
        AbstractC29841aH r2;
        AnonymousClass0WG r1 = r3.A03;
        if (r1 == null) {
            return null;
        }
        AnonymousClass0WC r0 = r1.A06;
        if (i == 0) {
            r2 = r0.A0c;
        } else {
            r2 = r0.A0d;
        }
        int ordinal = r1.A05.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return r2.A05;
        }
        if (ordinal == 3 || ordinal == 4) {
            return r2.A04;
        }
        return null;
    }

    public static final void A02(C29831aG r1, C29831aG r2, int i) {
        r1.A08.add(r2);
        r1.A00 = i;
        r2.A07.add(r1);
    }

    public final int A03(int i, int i2) {
        if (i2 == 0) {
            AnonymousClass0WC r0 = this.A03;
            int i3 = r0.A0F;
            int max = Math.max(r0.A0H, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            AnonymousClass0WC r02 = this.A03;
            int i4 = r02.A0E;
            int max2 = Math.max(r02.A0G, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long A04() {
        if (!(this instanceof C451523e)) {
            C451623f r1 = this.A06;
            if (r1.A0B) {
                return (long) r1.A02;
            }
            return 0;
        }
        ArrayList arrayList = ((C451523e) this).A01;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            AbstractC29841aH r5 = (AbstractC29841aH) arrayList.get(i);
            j = ((long) r5.A04.A00) + r5.A04() + j + ((long) r5.A05.A00);
        }
        return j;
    }

    public void A05() {
        AnonymousClass0WC r0;
        AnonymousClass0WC r5;
        AnonymousClass0WC r3;
        AnonymousClass0WC r52;
        if (this instanceof C451923i) {
            AnonymousClass0WE r4 = AnonymousClass0WE.MATCH_CONSTRAINT;
            AnonymousClass0WE r6 = AnonymousClass0WE.FIXED;
            AnonymousClass0WE r2 = AnonymousClass0WE.MATCH_PARENT;
            AnonymousClass0WC r32 = this.A03;
            if (r32.A0i) {
                this.A06.A01(r32.A01());
            }
            C451623f r8 = this.A06;
            if (!r8.A0B) {
                AnonymousClass0WC r7 = this.A03;
                AnonymousClass0WE r1 = r7.A0o[0];
                this.A02 = r1;
                if (r1 != r4) {
                    if (r1 == r2 && (((r52 = r7.A0Z) != null && r52.A0o[0] == r6) || r52.A0o[0] == r2)) {
                        int A012 = r52.A01();
                        int A002 = r7.A0W.A00();
                        int A003 = (A012 - A002) - r7.A0X.A00();
                        A02(this.A05, r52.A0c.A05, A002);
                        A02(this.A04, r52.A0c.A04, -this.A03.A0X.A00());
                        this.A06.A01(A003);
                        return;
                    } else if (r1 == r6) {
                        r8.A01(r7.A01());
                    }
                }
            } else if (this.A02 == r2 && (((r3 = (r5 = this.A03).A0Z) != null && r3.A0o[0] == r6) || r3.A0o[0] == r2)) {
                A02(this.A05, r3.A0c.A05, r5.A0W.A00());
                A02(this.A04, r3.A0c.A04, -this.A03.A0X.A00());
                return;
            }
            C451623f r22 = this.A06;
            if (r22.A0B) {
                AnonymousClass0WC r62 = this.A03;
                if (r62.A0i) {
                    AnonymousClass0WG[] r42 = r62.A0n;
                    AnonymousClass0WG r53 = r42[0];
                    AnonymousClass0WG r12 = r53.A03;
                    if (r12 != null) {
                        AnonymousClass0WG r23 = r42[1];
                        if (r23.A03 != null) {
                            if (r62.A0G()) {
                                this.A05.A00 = r53.A00();
                                this.A04.A00 = -r23.A00();
                                return;
                            }
                            C29831aG A004 = A00(r53);
                            if (A004 != null) {
                                C29831aG r24 = this.A05;
                                int A005 = r53.A00();
                                r24.A08.add(A004);
                                r24.A00 = A005;
                                A004.A07.add(r24);
                            }
                            AnonymousClass0WG r02 = this.A03.A0n[1];
                            C29831aG A006 = A00(r02);
                            if (A006 != null) {
                                C29831aG r25 = this.A04;
                                int i = -r02.A00();
                                r25.A08.add(A006);
                                r25.A00 = i;
                                A006.A07.add(r25);
                            }
                            this.A05.A09 = true;
                            this.A04.A09 = true;
                            return;
                        }
                    }
                    if (r12 != null) {
                        C29831aG A007 = A00(r53);
                        if (A007 != null) {
                            C29831aG r26 = this.A05;
                            int A008 = r53.A00();
                            r26.A08.add(A007);
                            r26.A00 = A008;
                            A007.A07.add(r26);
                            A02(this.A04, this.A05, this.A06.A02);
                            return;
                        }
                        return;
                    }
                    AnonymousClass0WG r13 = r42[1];
                    if (r13.A03 != null) {
                        C29831aG A009 = A00(r13);
                        if (A009 != null) {
                            C29831aG r27 = this.A04;
                            int i2 = -r13.A00();
                            r27.A08.add(A009);
                            r27.A00 = i2;
                            A009.A07.add(r27);
                            A02(this.A05, this.A04, -this.A06.A02);
                            return;
                        }
                        return;
                    } else if (!(r62 instanceof AbstractC14000lM) && r62.A0Z != null && r62.A04(EnumC13990lL.CENTER).A03 == null) {
                        AnonymousClass0WC r33 = this.A03;
                        A02(this.A05, r33.A0Z.A0c.A05, r33.A02());
                        A02(this.A04, this.A05, this.A06.A02);
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (this.A02 == r4) {
                AnonymousClass0WC r54 = this.A03;
                int i3 = r54.A0D;
                if (i3 == 2) {
                    AnonymousClass0WC r03 = r54.A0Z;
                    if (r03 != null) {
                        C451623f r14 = r03.A0d.A06;
                        r22.A08.add(r14);
                        r14.A07.add(this.A06);
                        C451623f r04 = this.A06;
                        r04.A09 = true;
                        r04.A07.add(this.A05);
                        this.A06.A07.add(this.A04);
                    }
                } else if (i3 == 3) {
                    if (r54.A0C == 3) {
                        this.A05.A03 = this;
                        this.A04.A03 = this;
                        C452023j r43 = r54.A0d;
                        r43.A05.A03 = this;
                        r43.A04.A03 = this;
                        r22.A03 = this;
                        if (r54.A0H()) {
                            r22.A08.add(r43.A06);
                            this.A03.A0d.A06.A07.add(this.A06);
                            C452023j r28 = this.A03.A0d;
                            r28.A06.A03 = this;
                            this.A06.A08.add(r28.A05);
                            this.A06.A08.add(this.A03.A0d.A04);
                            this.A03.A0d.A05.A07.add(this.A06);
                            this.A03.A0d.A04.A07.add(this.A06);
                        } else if (r54.A0G()) {
                            r43.A06.A08.add(r22);
                            this.A06.A07.add(this.A03.A0d.A06);
                        } else {
                            r43.A06.A08.add(r22);
                        }
                    } else {
                        C451623f r15 = r54.A0d.A06;
                        r22.A08.add(r15);
                        r15.A07.add(this.A06);
                        this.A03.A0d.A05.A07.add(this.A06);
                        this.A03.A0d.A04.A07.add(this.A06);
                        C451623f r05 = this.A06;
                        r05.A09 = true;
                        r05.A07.add(this.A05);
                        this.A06.A07.add(this.A04);
                        this.A05.A08.add(this.A06);
                        this.A04.A08.add(this.A06);
                    }
                }
            }
            AnonymousClass0WC r63 = this.A03;
            AnonymousClass0WG[] r29 = r63.A0n;
            AnonymousClass0WG r55 = r29[0];
            AnonymousClass0WG r16 = r55.A03;
            if (r16 != null) {
                AnonymousClass0WG r44 = r29[1];
                if (r44.A03 != null) {
                    if (r63.A0G()) {
                        this.A05.A00 = r55.A00();
                        this.A04.A00 = -r44.A00();
                        return;
                    }
                    C29831aG A0010 = A00(r55);
                    C29831aG A0011 = A00(r44);
                    A0010.A07.add(this);
                    if (A0010.A0B) {
                        AQn(this);
                    }
                    A0011.A07.add(this);
                    if (A0011.A0B) {
                        AQn(this);
                    }
                    this.A08 = EnumC14090lV.CENTER;
                    return;
                }
            }
            if (r16 != null) {
                C29831aG A0012 = A00(r55);
                if (A0012 != null) {
                    C29831aG r210 = this.A05;
                    int A0013 = r55.A00();
                    r210.A08.add(A0012);
                    r210.A00 = A0013;
                    A0012.A07.add(r210);
                    A09(this.A04, this.A05, 1, this.A06);
                    return;
                }
                return;
            }
            AnonymousClass0WG r17 = r29[1];
            if (r17.A03 != null) {
                C29831aG A0014 = A00(r17);
                if (A0014 != null) {
                    C29831aG r211 = this.A04;
                    int i4 = -r17.A00();
                    r211.A08.add(A0014);
                    r211.A00 = i4;
                    A0014.A07.add(r211);
                    A09(this.A05, this.A04, -1, this.A06);
                }
            } else if (!(r63 instanceof AbstractC14000lM) && (r0 = r63.A0Z) != null) {
                A02(this.A05, r0.A0c.A05, r63.A02());
                A09(this.A04, this.A05, 1, this.A06);
            }
        } else if (this instanceof C451823h) {
            C451823h r34 = (C451823h) this;
            AnonymousClass0WC r72 = r34.A03;
            if (r72 instanceof C451323c) {
                C29831aG r212 = r34.A05;
                r212.A09 = true;
                C451323c r73 = (C451323c) r72;
                int i5 = r73.A00;
                boolean z = r73.A02;
                int i6 = 0;
                if (i5 == 0) {
                    r212.A04 = EnumC14070lT.LEFT;
                    while (i6 < ((C29821aF) r73).A00) {
                        AnonymousClass0WC r18 = ((C29821aF) r73).A01[i6];
                        if (z || r18.A0N != 8) {
                            C29831aG r213 = r18.A0c.A05;
                            r213.A07.add(r34.A05);
                            r34.A05.A08.add(r213);
                        }
                        i6++;
                    }
                    r34.A0B(r34.A03.A0c.A05);
                    r34.A0B(r34.A03.A0c.A04);
                } else if (i5 == 1) {
                    r212.A04 = EnumC14070lT.RIGHT;
                    while (i6 < ((C29821aF) r73).A00) {
                        AnonymousClass0WC r19 = ((C29821aF) r73).A01[i6];
                        if (z || r19.A0N != 8) {
                            C29831aG r214 = r19.A0c.A04;
                            r214.A07.add(r34.A05);
                            r34.A05.A08.add(r214);
                        }
                        i6++;
                    }
                    r34.A0B(r34.A03.A0c.A05);
                    r34.A0B(r34.A03.A0c.A04);
                } else if (i5 == 2) {
                    r212.A04 = EnumC14070lT.TOP;
                    while (i6 < ((C29821aF) r73).A00) {
                        AnonymousClass0WC r110 = ((C29821aF) r73).A01[i6];
                        if (z || r110.A0N != 8) {
                            C29831aG r215 = r110.A0d.A05;
                            r215.A07.add(r34.A05);
                            r34.A05.A08.add(r215);
                        }
                        i6++;
                    }
                    r34.A0B(r34.A03.A0d.A05);
                    r34.A0B(r34.A03.A0d.A04);
                } else if (i5 == 3) {
                    r212.A04 = EnumC14070lT.BOTTOM;
                    while (i6 < ((C29821aF) r73).A00) {
                        AnonymousClass0WC r111 = ((C29821aF) r73).A01[i6];
                        if (z || r111.A0N != 8) {
                            C29831aG r216 = r111.A0d.A04;
                            r216.A07.add(r34.A05);
                            r34.A05.A08.add(r216);
                        }
                        i6++;
                    }
                    r34.A0B(r34.A03.A0d.A05);
                    r34.A0B(r34.A03.A0d.A04);
                }
            }
        } else if (!(this instanceof C451723g)) {
            C451523e r74 = (C451523e) this;
            Iterator it = r74.A01.iterator();
            while (it.hasNext()) {
                ((AbstractC29841aH) it.next()).A05();
            }
            ArrayList arrayList = r74.A01;
            int size = arrayList.size();
            if (size >= 1) {
                AnonymousClass0WC r217 = ((AbstractC29841aH) arrayList.get(0)).A03;
                AnonymousClass0WC r112 = ((AbstractC29841aH) arrayList.get(size - 1)).A03;
                if (((AbstractC29841aH) r74).A01 == 0) {
                    AnonymousClass0WG r06 = r217.A0W;
                    AnonymousClass0WG r45 = r112.A0X;
                    C29831aG A013 = A01(r06, 0);
                    int A0015 = r06.A00();
                    int i7 = 0;
                    while (true) {
                        ArrayList arrayList2 = r74.A01;
                        if (i7 >= arrayList2.size()) {
                            break;
                        }
                        AnonymousClass0WC r218 = ((AbstractC29841aH) arrayList2.get(i7)).A03;
                        if (r218.A0N != 8) {
                            A0015 = r218.A0W.A00();
                            break;
                        }
                        i7++;
                    }
                    if (A013 != null) {
                        C29831aG r113 = r74.A05;
                        r113.A08.add(A013);
                        r113.A00 = A0015;
                        A013.A07.add(r113);
                    }
                    C29831aG A014 = A01(r45, 0);
                    int A0016 = r45.A00();
                    ArrayList arrayList3 = r74.A01;
                    int size2 = arrayList3.size() - 1;
                    while (true) {
                        if (size2 < 0) {
                            break;
                        }
                        AnonymousClass0WC r219 = ((AbstractC29841aH) arrayList3.get(size2)).A03;
                        if (r219.A0N != 8) {
                            A0016 = r219.A0X.A00();
                            break;
                        }
                        size2--;
                    }
                    if (A014 != null) {
                        C29831aG r220 = r74.A04;
                        r220.A08.add(A014);
                        r220.A00 = -A0016;
                        A014.A07.add(r220);
                    }
                } else {
                    AnonymousClass0WG r07 = r217.A0Y;
                    AnonymousClass0WG r56 = r112.A0S;
                    C29831aG A015 = A01(r07, 1);
                    int A0017 = r07.A00();
                    int i8 = 0;
                    while (true) {
                        ArrayList arrayList4 = r74.A01;
                        if (i8 >= arrayList4.size()) {
                            break;
                        }
                        AnonymousClass0WC r221 = ((AbstractC29841aH) arrayList4.get(i8)).A03;
                        if (r221.A0N != 8) {
                            A0017 = r221.A0Y.A00();
                            break;
                        }
                        i8++;
                    }
                    if (A015 != null) {
                        C29831aG r114 = r74.A05;
                        r114.A08.add(A015);
                        r114.A00 = A0017;
                        A015.A07.add(r114);
                    }
                    C29831aG A016 = A01(r56, 1);
                    int A0018 = r56.A00();
                    ArrayList arrayList5 = r74.A01;
                    int size3 = arrayList5.size() - 1;
                    while (true) {
                        if (size3 < 0) {
                            break;
                        }
                        AnonymousClass0WC r222 = ((AbstractC29841aH) arrayList5.get(size3)).A03;
                        if (r222.A0N != 8) {
                            A0018 = r222.A0S.A00();
                            break;
                        }
                        size3--;
                    }
                    if (A016 != null) {
                        C29831aG r223 = r74.A04;
                        r223.A08.add(A016);
                        r223.A00 = -A0018;
                        A016.A07.add(r223);
                    }
                }
                r74.A05.A03 = r74;
                r74.A04.A03 = r74;
            }
        } else {
            C451723g r224 = (C451723g) this;
            AnonymousClass0WC r64 = r224.A03;
            C29811aE r08 = (C29811aE) r64;
            int i9 = r08.A02;
            int i10 = r08.A03;
            if (r08.A01 == 1) {
                C29831aG r09 = r224.A05;
                if (i9 != -1) {
                    r09.A08.add(r64.A0Z.A0c.A05);
                    r224.A03.A0Z.A0c.A05.A07.add(r224.A05);
                    r224.A05.A00 = i9;
                } else if (i10 != -1) {
                    r09.A08.add(r64.A0Z.A0c.A04);
                    r224.A03.A0Z.A0c.A04.A07.add(r224.A05);
                    r224.A05.A00 = -i10;
                } else {
                    r09.A09 = true;
                    r09.A08.add(r64.A0Z.A0c.A04);
                    r224.A03.A0Z.A0c.A04.A07.add(r224.A05);
                }
                r224.A0B(r224.A03.A0c.A05);
                r224.A0B(r224.A03.A0c.A04);
                return;
            }
            C29831aG r010 = r224.A05;
            if (i9 != -1) {
                r010.A08.add(r64.A0Z.A0d.A05);
                r224.A03.A0Z.A0d.A05.A07.add(r224.A05);
                r224.A05.A00 = i9;
            } else if (i10 != -1) {
                r010.A08.add(r64.A0Z.A0d.A04);
                r224.A03.A0Z.A0d.A04.A07.add(r224.A05);
                r224.A05.A00 = -i10;
            } else {
                r010.A09 = true;
                r010.A08.add(r64.A0Z.A0d.A04);
                r224.A03.A0Z.A0d.A04.A07.add(r224.A05);
            }
            r224.A0B(r224.A03.A0d.A05);
            r224.A0B(r224.A03.A0d.A04);
        }
    }

    public void A06() {
        if (this instanceof C452023j) {
            C29831aG r2 = this.A05;
            if (r2.A0B) {
                this.A03.A0Q = r2.A02;
            }
        } else if (this instanceof C451923i) {
            C29831aG r22 = this.A05;
            if (r22.A0B) {
                this.A03.A0P = r22.A02;
            }
        } else if (this instanceof C451823h) {
            AnonymousClass0WC r23 = this.A03;
            if (r23 instanceof C451323c) {
                int i = ((C451323c) r23).A00;
                if (i == 0 || i == 1) {
                    r23.A0P = this.A05.A02;
                } else {
                    r23.A0Q = this.A05.A02;
                }
            }
        } else if (!(this instanceof C451723g)) {
            C451523e r3 = (C451523e) this;
            int i2 = 0;
            while (true) {
                ArrayList arrayList = r3.A01;
                if (i2 < arrayList.size()) {
                    ((AbstractC29841aH) arrayList.get(i2)).A06();
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            AnonymousClass0WC r24 = this.A03;
            if (((C29811aE) r24).A01 == 1) {
                r24.A0P = this.A05.A02;
            } else {
                r24.A0Q = this.A05.A02;
            }
        }
    }

    public void A07() {
        if (this instanceof C452023j) {
            C452023j r1 = (C452023j) this;
            r1.A07 = null;
            r1.A05.A00();
            r1.A04.A00();
            r1.A00.A00();
            r1.A06.A00();
            r1.A09 = false;
        } else if (this instanceof C451923i) {
            this.A07 = null;
            this.A05.A00();
            this.A04.A00();
            this.A06.A00();
            this.A09 = false;
        } else if (this instanceof C451823h) {
            this.A07 = null;
            this.A05.A00();
        } else if (!(this instanceof C451723g)) {
            C451523e r12 = (C451523e) this;
            r12.A07 = null;
            Iterator it = r12.A01.iterator();
            while (it.hasNext()) {
                ((AbstractC29841aH) it.next()).A07();
            }
        } else {
            this.A05.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (((X.AbstractC29841aH) r8).A00 == 3) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass0WG r16, X.AnonymousClass0WG r17, int r18) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29841aH.A08(X.0WG, X.0WG, int):void");
    }

    public final void A09(C29831aG r3, C29831aG r4, int i, C451623f r6) {
        r3.A08.add(r4);
        r3.A08.add(this.A06);
        r3.A01 = i;
        r3.A05 = r6;
        r4.A07.add(r3);
        r6.A07.add(r3);
    }

    public boolean A0A() {
        if (!(this instanceof C452023j)) {
            if (!(this instanceof C451923i)) {
                if ((this instanceof C451823h) || (this instanceof C451723g)) {
                    return false;
                }
                ArrayList arrayList = ((C451523e) this).A01;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (!((AbstractC29841aH) arrayList.get(i)).A0A()) {
                        return false;
                    }
                }
                return true;
            } else if (this.A02 != AnonymousClass0WE.MATCH_CONSTRAINT || this.A03.A0D == 0) {
                return true;
            } else {
                return false;
            }
        } else if (this.A02 != AnonymousClass0WE.MATCH_CONSTRAINT || this.A03.A0C == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override // X.AbstractC14050lR
    public void AQn(AbstractC14050lR r11) {
        float f;
        int i;
        float f2;
        float f3;
        if (this instanceof C452023j) {
            AnonymousClass0WE r6 = AnonymousClass0WE.MATCH_CONSTRAINT;
            int ordinal = this.A08.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal != 3) {
                C451623f r5 = this.A06;
                if (r5.A0A && !r5.A0B && this.A02 == r6) {
                    AnonymousClass0WC r7 = this.A03;
                    int i2 = r7.A0C;
                    if (i2 == 2) {
                        AnonymousClass0WC r0 = r7.A0Z;
                        if (r0 != null) {
                            C451623f r2 = r0.A0d.A06;
                            if (r2.A0B) {
                                r5.A01((int) ((((float) r2.A02) * r7.A03) + 0.5f));
                            }
                        }
                    } else if (i2 == 3) {
                        C451623f r22 = r7.A0c.A06;
                        if (r22.A0B) {
                            int i3 = r7.A08;
                            if (i3 == -1) {
                                f2 = (float) r22.A02;
                                f3 = r7.A01;
                                f = f2 / f3;
                                i = (int) (f + 0.5f);
                            } else if (i3 == 0) {
                                f = ((float) r22.A02) * r7.A01;
                                i = (int) (f + 0.5f);
                            } else if (i3 != 1) {
                                i = 0;
                            } else {
                                f2 = (float) r22.A02;
                                f3 = r7.A01;
                                f = f2 / f3;
                                i = (int) (f + 0.5f);
                            }
                            r5.A01(i);
                        }
                    }
                }
                C29831aG r52 = this.A05;
                if (r52.A0A) {
                    C29831aG r1 = this.A04;
                    if (!r1.A0A) {
                        return;
                    }
                    if (!r52.A0B || !r1.A0B || !this.A06.A0B) {
                        boolean z = this.A06.A0B;
                        if (!z && this.A02 == r6) {
                            AnonymousClass0WC r12 = this.A03;
                            if (r12.A0D == 0 && !r12.A0H()) {
                                int i4 = ((C29831aG) r52.A08.get(0)).A02;
                                C29831aG r3 = this.A05;
                                int i5 = i4 + r3.A00;
                                int i6 = ((C29831aG) this.A04.A08.get(0)).A02 + this.A04.A00;
                                r3.A01(i5);
                                this.A04.A01(i6);
                                this.A06.A01(i6 - i5);
                                return;
                            }
                        }
                        if (!z && this.A02 == r6 && this.A00 == 1 && r52.A08.size() > 0 && this.A04.A08.size() > 0) {
                            int i7 = (((C29831aG) this.A04.A08.get(0)).A02 + this.A04.A00) - (((C29831aG) this.A05.A08.get(0)).A02 + this.A05.A00);
                            C451623f r13 = this.A06;
                            int i8 = r13.A00;
                            if (i7 < i8) {
                                r13.A01(i7);
                            } else {
                                r13.A01(i8);
                            }
                        }
                        if (this.A06.A0B && this.A05.A08.size() > 0 && this.A04.A08.size() > 0) {
                            C29831aG r8 = (C29831aG) this.A05.A08.get(0);
                            C29831aG r72 = (C29831aG) this.A04.A08.get(0);
                            int i9 = r8.A02;
                            C29831aG r53 = this.A05;
                            int i10 = r53.A00 + i9;
                            int i11 = r72.A02;
                            int i12 = this.A04.A00 + i11;
                            float f4 = this.A03.A06;
                            if (r8 == r72) {
                                f4 = 0.5f;
                            } else {
                                i9 = i10;
                                i11 = i12;
                            }
                            r53.A01((int) ((((float) ((i11 - i9) - this.A06.A02)) * f4) + ((float) i9) + 0.5f));
                            this.A04.A01(this.A05.A02 + this.A06.A02);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            AnonymousClass0WC r02 = this.A03;
            A08(r02.A0Y, r02.A0S, 1);
        } else if (this instanceof C451823h) {
            C451323c r62 = (C451323c) this.A03;
            int i13 = r62.A00;
            int i14 = 0;
            int i15 = -1;
            for (C29831aG r03 : this.A05.A08) {
                int i16 = r03.A02;
                if (i15 == -1 || i16 < i15) {
                    i15 = i16;
                }
                if (i14 < i16) {
                    i14 = i16;
                }
            }
            if (i13 == 0 || i13 == 2) {
                this.A05.A01(i15 + r62.A01);
            } else {
                this.A05.A01(i14 + r62.A01);
            }
        } else if (this instanceof C451723g) {
            C29831aG r14 = this.A05;
            if (r14.A0A && !r14.A0B) {
                this.A05.A01((int) ((((float) ((C29831aG) r14.A08.get(0)).A02) * ((C29811aE) this.A03).A00) + 0.5f));
            }
        }
    }
}
