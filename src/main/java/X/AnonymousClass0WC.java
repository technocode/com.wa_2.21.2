package X;

import java.util.ArrayList;

/* renamed from: X.0WC  reason: invalid class name */
public class AnonymousClass0WC {
    public float A00 = 0.0f;
    public float A01;
    public float A02;
    public float A03 = 1.0f;
    public float A04 = 1.0f;
    public float A05 = 1.0f;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B = -1;
    public int A0C = 0;
    public int A0D = 0;
    public int A0E = 0;
    public int A0F = 0;
    public int A0G = 0;
    public int A0H = 0;
    public int A0I;
    public int A0J;
    public int A0K = -1;
    public int A0L;
    public int A0M = -1;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public AnonymousClass0WG A0R;
    public AnonymousClass0WG A0S;
    public AnonymousClass0WG A0T;
    public AnonymousClass0WG A0U;
    public AnonymousClass0WG A0V;
    public AnonymousClass0WG A0W;
    public AnonymousClass0WG A0X;
    public AnonymousClass0WG A0Y;
    public AnonymousClass0WC A0Z;
    public C451523e A0a;
    public C451523e A0b;
    public C451923i A0c = new C451923i(this);
    public C452023j A0d = new C452023j(this);
    public Object A0e;
    public String A0f;
    public ArrayList A0g;
    public boolean A0h = false;
    public boolean A0i = false;
    public float[] A0j;
    public int[] A0k = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public int[] A0l = new int[2];
    public int[] A0m = {0, 0, 0, 0};
    public AnonymousClass0WG[] A0n;
    public AnonymousClass0WE[] A0o;
    public AnonymousClass0WC[] A0p;
    public AnonymousClass0WC[] A0q;
    public boolean[] A0r = {true, true};
    public boolean[] A0s;

    public AnonymousClass0WC() {
        AnonymousClass0WG r3 = new AnonymousClass0WG(this, EnumC13990lL.LEFT);
        this.A0W = r3;
        AnonymousClass0WG r12 = new AnonymousClass0WG(this, EnumC13990lL.TOP);
        this.A0Y = r12;
        AnonymousClass0WG r10 = new AnonymousClass0WG(this, EnumC13990lL.RIGHT);
        this.A0X = r10;
        AnonymousClass0WG r9 = new AnonymousClass0WG(this, EnumC13990lL.BOTTOM);
        this.A0S = r9;
        AnonymousClass0WG r8 = new AnonymousClass0WG(this, EnumC13990lL.BASELINE);
        this.A0R = r8;
        this.A0U = new AnonymousClass0WG(this, EnumC13990lL.CENTER_X);
        this.A0V = new AnonymousClass0WG(this, EnumC13990lL.CENTER_Y);
        AnonymousClass0WG r2 = new AnonymousClass0WG(this, EnumC13990lL.CENTER);
        this.A0T = r2;
        this.A0n = new AnonymousClass0WG[]{r3, r10, r12, r9, r8, r2};
        ArrayList arrayList = new ArrayList();
        this.A0g = arrayList;
        this.A0s = new boolean[2];
        AnonymousClass0WE r0 = AnonymousClass0WE.FIXED;
        this.A0o = new AnonymousClass0WE[]{r0, r0};
        this.A0Z = null;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        this.A0N = 0;
        this.A0f = null;
        this.A0A = 0;
        this.A0L = 0;
        this.A0j = new float[]{-1.0f, -1.0f};
        this.A0p = new AnonymousClass0WC[]{null, null};
        this.A0q = new AnonymousClass0WC[]{null, null};
        arrayList.add(this.A0W);
        ArrayList arrayList2 = this.A0g;
        arrayList2.add(this.A0Y);
        arrayList2.add(this.A0X);
        arrayList2.add(this.A0S);
        arrayList2.add(this.A0U);
        arrayList2.add(this.A0V);
        arrayList2.add(this.A0T);
        arrayList2.add(this.A0R);
    }

    public int A00() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A09;
    }

    public int A01() {
        if (this.A0N == 8) {
            return 0;
        }
        return this.A0O;
    }

    public int A02() {
        AnonymousClass0WC r1 = this.A0Z;
        if (r1 == null || !(r1 instanceof AnonymousClass0WA)) {
            return this.A0P;
        }
        return ((AnonymousClass0WA) r1).A02 + this.A0P;
    }

    public int A03() {
        AnonymousClass0WC r1 = this.A0Z;
        if (r1 == null || !(r1 instanceof AnonymousClass0WA)) {
            return this.A0Q;
        }
        return ((AnonymousClass0WA) r1).A03 + this.A0Q;
    }

    public AnonymousClass0WG A04(EnumC13990lL r4) {
        if (!(this instanceof C29811aE)) {
            switch (r4.ordinal()) {
                case 0:
                    return null;
                case 1:
                    return this.A0W;
                case 2:
                    return this.A0Y;
                case 3:
                    return this.A0X;
                case 4:
                    return this.A0S;
                case 5:
                    return this.A0R;
                case 6:
                    return this.A0T;
                case 7:
                    return this.A0U;
                case 8:
                    return this.A0V;
                default:
                    throw new AssertionError(r4.name());
            }
        } else {
            C29811aE r2 = (C29811aE) this;
            switch (r4.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    return null;
                case 1:
                case 3:
                    if (r2.A01 == 1) {
                        return r2.A04;
                    }
                    break;
                case 2:
                case 4:
                    if (r2.A01 == 0) {
                        return r2.A04;
                    }
                    break;
            }
            throw new AssertionError(r4.name());
        }
    }

    public AnonymousClass0WC A05(int i) {
        AnonymousClass0WG r2;
        AnonymousClass0WG r1;
        if (i == 0) {
            AnonymousClass0WG r22 = this.A0X;
            AnonymousClass0WG r12 = r22.A03;
            if (r12 == null || r12.A03 != r22) {
                return null;
            }
            return r12.A06;
        } else if (i == 1 && (r1 = (r2 = this.A0S).A03) != null && r1.A03 == r2) {
            return r1.A06;
        } else {
            return null;
        }
    }

    public AnonymousClass0WC A06(int i) {
        AnonymousClass0WG r2;
        AnonymousClass0WG r1;
        if (i == 0) {
            AnonymousClass0WG r22 = this.A0W;
            AnonymousClass0WG r12 = r22.A03;
            if (r12 == null || r12.A03 != r22) {
                return null;
            }
            return r12.A06;
        } else if (i == 1 && (r1 = (r2 = this.A0Y).A03) != null && r1.A03 == r2) {
            return r1.A06;
        } else {
            return null;
        }
    }

    public void A07() {
        this.A0W.A01();
        this.A0Y.A01();
        this.A0X.A01();
        this.A0S.A01();
        this.A0R.A01();
        this.A0U.A01();
        this.A0V.A01();
        this.A0T.A01();
        this.A0Z = null;
        this.A00 = 0.0f;
        this.A0O = 0;
        this.A09 = 0;
        this.A01 = 0.0f;
        this.A08 = -1;
        this.A0P = 0;
        this.A0Q = 0;
        this.A07 = 0;
        this.A0J = 0;
        this.A0I = 0;
        this.A02 = 0.5f;
        this.A06 = 0.5f;
        AnonymousClass0WE[] r1 = this.A0o;
        AnonymousClass0WE r0 = AnonymousClass0WE.FIXED;
        r1[0] = r0;
        r1[1] = r0;
        this.A0e = null;
        this.A0N = 0;
        this.A0A = 0;
        this.A0L = 0;
        float[] fArr = this.A0j;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.A0B = -1;
        this.A0M = -1;
        int[] iArr = this.A0k;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.A0D = 0;
        this.A0C = 0;
        this.A04 = 1.0f;
        this.A03 = 1.0f;
        this.A0F = Integer.MAX_VALUE;
        this.A0E = Integer.MAX_VALUE;
        this.A0H = 0;
        this.A0G = 0;
        this.A0K = -1;
        this.A05 = 1.0f;
        boolean[] zArr = this.A0r;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.A0s;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void A08(int i) {
        this.A09 = i;
        int i2 = this.A0I;
        if (i < i2) {
            this.A09 = i2;
        }
    }

    public void A09(int i) {
        this.A0O = i;
        int i2 = this.A0J;
        if (i < i2) {
            this.A0O = i2;
        }
    }

    public void A0A(C13940lG r2) {
        this.A0W.A02();
        this.A0Y.A02();
        this.A0X.A02();
        this.A0S.A02();
        this.A0R.A02();
        this.A0T.A02();
        this.A0U.A02();
        this.A0V.A02();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r77v0, resolved type: X.0WC */
    /* JADX DEBUG: Multi-variable search result rejected for r78v0, resolved type: X.0WD */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01de, code lost:
        if (r3 == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01fd, code lost:
        if ((r77 instanceof X.AnonymousClass0WA) == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0090, code lost:
        if (r2 != r4) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04ca, code lost:
        if (r9 == false) goto L_0x04cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04f7, code lost:
        if (r3 == false) goto L_0x04f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x051a, code lost:
        if (r8 == -1) goto L_0x051c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0609, code lost:
        if (r4.A0X.A04() != false) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x061b, code lost:
        if (r4.A0S.A04() != false) goto L_0x061d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0797, code lost:
        if (r0.A0o[0] != r3) goto L_0x0799;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (r7[1] != r4) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04ef  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass0WD r78) {
        /*
        // Method dump skipped, instructions count: 2079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WC.A0B(X.0WD):void");
    }

    public void A0C(AnonymousClass0WD r2) {
        r2.A05(this.A0W);
        r2.A05(this.A0Y);
        r2.A05(this.A0X);
        r2.A05(this.A0S);
        if (this.A07 > 0) {
            r2.A05(this.A0R);
        }
    }

    public void A0D(AnonymousClass0WD r9) {
        int i;
        int i2;
        if (!(this instanceof C29811aE)) {
            int A002 = AnonymousClass0WD.A00(this.A0W);
            int A003 = AnonymousClass0WD.A00(this.A0Y);
            int A004 = AnonymousClass0WD.A00(this.A0X);
            int A005 = AnonymousClass0WD.A00(this.A0S);
            C451923i r1 = this.A0c;
            C29831aG r2 = r1.A05;
            if (r2.A0B) {
                C29831aG r12 = r1.A04;
                if (r12.A0B) {
                    A002 = r2.A02;
                    A004 = r12.A02;
                }
            }
            C452023j r13 = this.A0d;
            C29831aG r22 = r13.A05;
            if (r22.A0B) {
                C29831aG r14 = r13.A04;
                if (r14.A0B) {
                    A003 = r22.A02;
                    A005 = r14.A02;
                }
            }
            int i3 = A005 - A003;
            if (A004 - A002 < 0 || i3 < 0 || A002 == Integer.MIN_VALUE || A002 == Integer.MAX_VALUE || A003 == Integer.MIN_VALUE || A003 == Integer.MAX_VALUE || A004 == Integer.MIN_VALUE || A004 == Integer.MAX_VALUE || A005 == Integer.MIN_VALUE || A005 == Integer.MAX_VALUE) {
                A005 = 0;
                A002 = 0;
                A003 = 0;
                A004 = 0;
            }
            AnonymousClass0WE r23 = AnonymousClass0WE.FIXED;
            int i4 = A004 - A002;
            int i5 = A005 - A003;
            this.A0P = A002;
            this.A0Q = A003;
            if (this.A0N == 8) {
                this.A0O = 0;
                this.A09 = 0;
                return;
            }
            AnonymousClass0WE[] r15 = this.A0o;
            if (r15[0] == r23 && i4 < (i2 = this.A0O)) {
                i4 = i2;
            }
            if (r15[1] == r23 && i5 < (i = this.A09)) {
                i5 = i;
            }
            this.A0O = i4;
            this.A09 = i5;
            int i6 = this.A0I;
            if (i5 < i6) {
                this.A09 = i6;
            }
            int i7 = this.A0J;
            if (i4 < i7) {
                this.A0O = i7;
                return;
            }
            return;
        }
        C29811aE r5 = (C29811aE) this;
        AnonymousClass0WC r4 = r5.A0Z;
        if (r4 != null) {
            int A006 = AnonymousClass0WD.A00(r5.A04);
            if (r5.A01 == 1) {
                r5.A0P = A006;
                r5.A0Q = 0;
                r5.A08(r4.A00());
                r5.A09(0);
                return;
            }
            r5.A0P = 0;
            r5.A0Q = A006;
            r5.A09(r4.A01());
            r5.A08(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c1, code lost:
        if (r16 == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01f2, code lost:
        if (r17 == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f5, code lost:
        if (r18 == 0) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01f7, code lost:
        if (r17 == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f9, code lost:
        r7 = r45.A03.A06;
        r5 = r46.A03.A06;
        r8 = r35.A0Z;
        r10 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0208, code lost:
        if (r20 == false) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x020a, code lost:
        if (r2 != 0) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x020c, code lost:
        if (r6 != 0) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x020e, code lost:
        r11 = false;
        r19 = true;
        r6 = 8;
        r17 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0215, code lost:
        if (r14 == 0) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0217, code lost:
        r11 = true;
        r19 = false;
        r6 = 5;
        r17 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x021f, code lost:
        if ((r7 instanceof X.C451323c) != false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0221, code lost:
        r31 = 6;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0227, code lost:
        if ((r5 instanceof X.C451323c) == false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0229, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x022b, code lost:
        r31 = 6;
        r17 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x022f, code lost:
        if (r16 == false) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0233, code lost:
        if (r12 != r21) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0235, code lost:
        if (r7 == r8) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0237, code lost:
        r18 = false;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x023b, code lost:
        if (r11 == false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0241, code lost:
        if (r35.A0N != 8) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0243, code lost:
        r31 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0245, code lost:
        r9 = r12;
        r36.A0E(r1, r12, r45.A00(), r51, r21, r0, r46.A00(), r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0265, code lost:
        if (r35.A0N != 8) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0267, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0268, code lost:
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x026a, code lost:
        r18 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x026e, code lost:
        if (r2 != 1) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0270, code lost:
        r6 = 8;
        r11 = true;
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0275, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0279, code lost:
        if (r2 != 3) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x027e, code lost:
        if (r35.A0K != -1) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0280, code lost:
        if (r54 == false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0282, code lost:
        r31 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0284, code lost:
        if (r38 == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0286, code lost:
        r31 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0288, code lost:
        r6 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x028a, code lost:
        r11 = true;
        r19 = true;
        r17 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x028f, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0292, code lost:
        r31 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0295, code lost:
        if (r52 == false) goto L_0x02ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x029a, code lost:
        if (r57 == 2) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x029c, code lost:
        r6 = 8;
        r17 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x02a1, code lost:
        if (r57 != 1) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x02a3, code lost:
        r6 = 5;
        r17 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x02a6, code lost:
        r31 = 6;
        r11 = true;
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x02ac, code lost:
        if (r6 <= 0) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02ae, code lost:
        r31 = 6;
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02b2, code lost:
        if (r6 != 0) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02b4, code lost:
        if (r14 != 0) goto L_0x02cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02b6, code lost:
        if (r54 != false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x02b8, code lost:
        r31 = 6;
        r11 = true;
        r19 = true;
        r6 = 5;
        r17 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x02c1, code lost:
        if (r7 == r8) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x02c3, code lost:
        r6 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x02c4, code lost:
        if (r5 != r8) goto L_0x02c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x02c6, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x02c7, code lost:
        r11 = true;
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x02cb, code lost:
        r16 = true;
        r11 = true;
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x02d1, code lost:
        r16 = false;
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x02d5, code lost:
        r16 = true;
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02d8, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x02da, code lost:
        r6 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x02dd, code lost:
        if (r16 == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02df, code lost:
        if (r38 == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x02e3, code lost:
        if (r12 == r21) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02e5, code lost:
        if (r20 != false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x02e9, code lost:
        if ((r7 instanceof X.C451323c) != false) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x02ed, code lost:
        if ((r5 instanceof X.C451323c) == false) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x02ef, code lost:
        r6 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x02f0, code lost:
        r36.A0G(r1, r12, r45.A00(), r6);
        r36.A0H(r0, r21, -r46.A00(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0305, code lost:
        if (r38 == false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0307, code lost:
        if (r55 == false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x030b, code lost:
        if ((r7 instanceof X.C451323c) != false) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x030d, code lost:
        r11 = 6;
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0311, code lost:
        if ((r5 instanceof X.C451323c) == false) goto L_0x0318;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0313, code lost:
        r11 = r6;
        r4 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0316, code lost:
        if (r18 == false) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0318, code lost:
        if (r19 == false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x031a, code lost:
        if (r54 == false) goto L_0x031e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x031c, code lost:
        if (r39 == false) goto L_0x033c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x031e, code lost:
        if (r7 == r8) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0320, code lost:
        if (r5 == r8) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0322, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0325, code lost:
        if ((r7 instanceof X.C29811aE) != false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0329, code lost:
        if ((r5 instanceof X.C29811aE) == false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x032b, code lost:
        r10 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x032e, code lost:
        if ((r7 instanceof X.C451323c) != false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r2 == 4) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0332, code lost:
        if ((r5 instanceof X.C451323c) == false) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0334, code lost:
        r10 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0335, code lost:
        if (r54 == false) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0337, code lost:
        r10 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0338, code lost:
        r4 = java.lang.Math.max(r10, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x033c, code lost:
        if (r38 == false) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x033e, code lost:
        r4 = java.lang.Math.min(r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0342, code lost:
        if (r52 == false) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0344, code lost:
        if (r54 != false) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0346, code lost:
        if (r7 == r8) goto L_0x034a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0348, code lost:
        if (r5 != r8) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x034a, code lost:
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x034b, code lost:
        r36.A0F(r1, r9, r45.A00(), r4);
        r36.A0F(r0, r21, -r46.A00(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x035c, code lost:
        if (r38 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x035e, code lost:
        if (r41 != r9) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0360, code lost:
        r5 = r45.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0364, code lost:
        if (r9 == r41) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0366, code lost:
        r36.A0G(r1, r41, r5, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x036a, code lost:
        if (r20 == false) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x036c, code lost:
        if (r49 != 0) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x036e, code lost:
        if (r14 != 0) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0371, code lost:
        if (r2 != 3) goto L_0x037d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0373, code lost:
        r36.A0G(r0, r1, 0, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x037b, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x037d, code lost:
        r36.A0G(r0, r1, 0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x012b, code lost:
        if (r2 != 1) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:258:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.AnonymousClass0WD r36, boolean r37, boolean r38, boolean r39, boolean r40, X.AnonymousClass0WH r41, X.AnonymousClass0WH r42, X.AnonymousClass0WE r43, boolean r44, X.AnonymousClass0WG r45, X.AnonymousClass0WG r46, int r47, int r48, int r49, int r50, float r51, boolean r52, boolean r53, boolean r54, boolean r55, int r56, int r57, int r58, int r59, float r60, boolean r61) {
        /*
        // Method dump skipped, instructions count: 900
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WC.A0E(X.0WD, boolean, boolean, boolean, boolean, X.0WH, X.0WH, X.0WE, boolean, X.0WG, X.0WG, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void A0F(boolean z, boolean z2) {
        int i;
        int i2;
        AnonymousClass0WE r3 = AnonymousClass0WE.FIXED;
        C451923i r2 = this.A0c;
        boolean z3 = z & r2.A09;
        C452023j r1 = this.A0d;
        boolean z4 = z2 & r1.A09;
        int i3 = r2.A05.A02;
        int i4 = r1.A05.A02;
        int i5 = r2.A04.A02;
        int i6 = r1.A04.A02;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.A0P = i3;
        }
        if (z4) {
            this.A0Q = i4;
        }
        if (this.A0N == 8) {
            this.A0O = 0;
            this.A09 = 0;
            return;
        }
        if (z3) {
            if (this.A0o[0] == r3 && i8 < (i2 = this.A0O)) {
                i8 = i2;
            }
            this.A0O = i8;
            int i10 = this.A0J;
            if (i8 < i10) {
                this.A0O = i10;
            }
        }
        if (z4) {
            if (this.A0o[1] == r3 && i9 < (i = this.A09)) {
                i9 = i;
            }
            this.A09 = i9;
            int i11 = this.A0I;
            if (i9 < i11) {
                this.A09 = i11;
            }
        }
    }

    public boolean A0G() {
        AnonymousClass0WG r1 = this.A0W;
        AnonymousClass0WG r0 = r1.A03;
        if (r0 != null && r0.A03 == r1) {
            return true;
        }
        AnonymousClass0WG r12 = this.A0X;
        AnonymousClass0WG r02 = r12.A03;
        return r02 != null && r02.A03 == r12;
    }

    public boolean A0H() {
        AnonymousClass0WG r1 = this.A0Y;
        AnonymousClass0WG r0 = r1.A03;
        if (r0 != null && r0.A03 == r1) {
            return true;
        }
        AnonymousClass0WG r12 = this.A0S;
        AnonymousClass0WG r02 = r12.A03;
        return r02 != null && r02.A03 == r12;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        String str2 = this.A0f;
        if (str2 != null) {
            str = AnonymousClass008.A0O(AnonymousClass008.A0S("id: "), str2, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.A0P);
        sb.append(", ");
        sb.append(this.A0Q);
        sb.append(") - (");
        sb.append(this.A0O);
        sb.append(" x ");
        return AnonymousClass008.A0N(sb, this.A09, ")");
    }
}
