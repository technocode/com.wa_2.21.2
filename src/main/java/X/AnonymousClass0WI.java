package X;

import java.util.ArrayList;

/* renamed from: X.0WI  reason: invalid class name */
public class AnonymousClass0WI implements AnonymousClass0WJ {
    public float A00 = 0.0f;
    public AnonymousClass0WK A01;
    public AnonymousClass0WH A02 = null;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;

    public AnonymousClass0WI() {
    }

    public AnonymousClass0WI(C13940lG r2) {
        this.A01 = new C29791aC(this, r2);
    }

    public final AnonymousClass0WH A00(boolean[] zArr, AnonymousClass0WH r12) {
        EnumC13980lK r1;
        AnonymousClass0WK r7 = this.A01;
        int A5p = r7.A5p();
        AnonymousClass0WH r8 = null;
        float f = 0.0f;
        for (int i = 0; i < A5p; i++) {
            float A9e = r7.A9e(i);
            if (A9e < 0.0f) {
                AnonymousClass0WH A9d = r7.A9d(i);
                if ((zArr == null || !zArr[A9d.A02]) && A9d != r12 && (((r1 = A9d.A06) == EnumC13980lK.SLACK || r1 == EnumC13980lK.ERROR) && A9e < f)) {
                    f = A9e;
                    r8 = A9d;
                }
            }
        }
        return r8;
    }

    public void A01(AnonymousClass0WI r18, boolean z) {
        if (!(this instanceof C451223b)) {
            float AR0 = this.A01.AR0(r18, z);
            this.A00 = (r18.A00 * AR0) + this.A00;
            if (z) {
                r18.A02.A02(this);
                return;
            }
            return;
        }
        C451223b r6 = (C451223b) this;
        AnonymousClass0WH r5 = r18.A02;
        if (r5 != null) {
            AnonymousClass0WK r4 = r18.A01;
            int A5p = r4.A5p();
            for (int i = 0; i < A5p; i++) {
                AnonymousClass0WH A9d = r4.A9d(i);
                float A9e = r4.A9e(i);
                C13970lJ r12 = r6.A02;
                r12.A00 = A9d;
                boolean z2 = true;
                if (A9d.A07) {
                    int i2 = 0;
                    do {
                        float[] fArr = A9d.A09;
                        float f = (r5.A09[i2] * A9e) + fArr[i2];
                        fArr[i2] = f;
                        if (Math.abs(f) < 1.0E-4f) {
                            fArr[i2] = 0.0f;
                        } else {
                            z2 = false;
                        }
                        i2++;
                    } while (i2 < 9);
                    if (z2) {
                        r12.A01.A07(A9d);
                    }
                } else {
                    int i3 = 0;
                    do {
                        float f2 = r5.A09[i3];
                        if (f2 != 0.0f) {
                            float f3 = f2 * A9e;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            A9d.A09[i3] = f3;
                        } else {
                            A9d.A09[i3] = 0.0f;
                        }
                        i3++;
                    } while (i3 < 9);
                    r6.A06(A9d);
                }
                ((AnonymousClass0WI) r6).A00 = (r18.A00 * A9e) + ((AnonymousClass0WI) r6).A00;
            }
            r6.A07(r5);
        }
    }

    public void A02(AnonymousClass0WH r5) {
        AnonymousClass0WH r1 = this.A02;
        if (r1 != null) {
            this.A01.AME(r1, -1.0f);
            this.A02 = null;
        }
        AnonymousClass0WK r2 = this.A01;
        float AMZ = r2.AMZ(r5, true) * -1.0f;
        this.A02 = r5;
        if (AMZ != 1.0f) {
            this.A00 /= AMZ;
            r2.A3q(AMZ);
        }
    }

    public void A03(AnonymousClass0WH r5, AnonymousClass0WH r6, AnonymousClass0WH r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        if (!z) {
            this.A01.AME(r5, -1.0f);
            this.A01.AME(r6, 1.0f);
            this.A01.AME(r7, 1.0f);
            return;
        }
        this.A01.AME(r5, 1.0f);
        this.A01.AME(r6, -1.0f);
        this.A01.AME(r7, -1.0f);
    }

    public void A04(AnonymousClass0WH r5, AnonymousClass0WH r6, AnonymousClass0WH r7, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            this.A00 = (float) i;
        }
        if (!z) {
            this.A01.AME(r5, -1.0f);
            this.A01.AME(r6, 1.0f);
            this.A01.AME(r7, -1.0f);
            return;
        }
        this.A01.AME(r5, 1.0f);
        this.A01.AME(r6, -1.0f);
        this.A01.AME(r7, 1.0f);
    }

    public void A05(AnonymousClass0WH r5, boolean z) {
        if (r5.A08) {
            AnonymousClass0WK r3 = this.A01;
            float A4a = r3.A4a(r5);
            this.A00 = (r5.A00 * A4a) + this.A00;
            r3.AMZ(r5, z);
            if (z) {
                r5.A02(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r2 != 5) goto L_0x0028;
     */
    @Override // X.AnonymousClass0WJ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1k(X.AnonymousClass0WH r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C451223b
            if (r0 != 0) goto L_0x002b
            int r2 = r5.A04
            r0 = 1
            if (r2 == r0) goto L_0x0028
            r0 = 2
            if (r2 != r0) goto L_0x0014
            r1 = 1148846080(0x447a0000, float:1000.0)
        L_0x000e:
            X.0WK r0 = r4.A01
            r0.AME(r5, r1)
            return
        L_0x0014:
            r0 = 3
            if (r2 != r0) goto L_0x001b
            r1 = 1232348160(0x49742400, float:1000000.0)
            goto L_0x000e
        L_0x001b:
            r0 = 4
            if (r2 != r0) goto L_0x0022
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L_0x000e
        L_0x0022:
            r0 = 5
            r1 = 1399379109(0x5368d4a5, float:1.0E12)
            if (r2 == r0) goto L_0x000e
        L_0x0028:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x000e
        L_0x002b:
            r3 = r4
            X.23b r3 = (X.C451223b) r3
            X.0lJ r0 = r3.A02
            r0.A00 = r5
            float[] r1 = r5.A09
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            float[] r2 = r5.A09
            int r1 = r5.A04
            r0 = 1065353216(0x3f800000, float:1.0)
            r2[r1] = r0
            r3.A06(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WI.A1k(X.0WH):void");
    }

    @Override // X.AnonymousClass0WJ
    public AnonymousClass0WH A8N(AnonymousClass0WD r11, boolean[] zArr) {
        if (!(this instanceof C451223b)) {
            return A00(zArr, null);
        }
        C451223b r7 = (C451223b) this;
        int i = -1;
        for (int i2 = 0; i2 < r7.A01; i2++) {
            AnonymousClass0WH[] r1 = r7.A03;
            AnonymousClass0WH r8 = r1[i2];
            if (!zArr[r8.A02]) {
                r7.A02.A00 = r8;
                int i3 = 8;
                if (i == -1) {
                    while (true) {
                        float f = r8.A09[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            break;
                        }
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                    }
                } else {
                    AnonymousClass0WH r3 = r1[i];
                    while (true) {
                        float f2 = r3.A09[i3];
                        float f3 = r8.A09[i3];
                        if (f3 == f2) {
                            i3--;
                            if (i3 < 0) {
                                break;
                            }
                        } else if (f3 >= f2) {
                        }
                    }
                }
                i = i2;
            }
        }
        if (i != -1) {
            return r7.A03[i];
        }
        return null;
    }

    @Override // X.AnonymousClass0WJ
    public void clear() {
        if (!(this instanceof C451223b)) {
            this.A01.clear();
            this.A02 = null;
            this.A00 = 0.0f;
            return;
        }
        C451223b r1 = (C451223b) this;
        r1.A01 = 0;
        ((AnonymousClass0WI) r1).A00 = 0.0f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WI.toString():java.lang.String");
    }
}
