package X;

import android.graphics.Point;

/* renamed from: X.0ui  reason: invalid class name and case insensitive filesystem */
public final class C19250ui {
    public final C32031eE A00;
    public final C19480v6 A01 = new C19480v6();
    public final float[] A02 = new float[2];

    public static float A02(double d) {
        return ((float) (d + 180.0d)) / 360.0f;
    }

    public C19250ui(C32031eE r2) {
        this.A00 = r2;
    }

    public static double A00(double d) {
        return ((Math.atan(Math.exp((1.0d - (d * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public static float A01(double d) {
        double sin = Math.sin((d * 3.141592653589793d) / 180.0d);
        return (float) (0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d));
    }

    public double A03(float f) {
        C32061eH r0 = this.A00.A0E;
        return (double) (f / (((float) r0.A0J) * r0.A0C));
    }

    public Point A04(C07040Vr r12) {
        double d = r12.A00;
        double d2 = r12.A01;
        float[] fArr = this.A02;
        A07((double) A02(d2), (double) A01(d), fArr);
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public C07040Vr A05(float f, float f2) {
        float[] fArr = this.A02;
        A09(f, f2, fArr);
        return new C07040Vr(A00((double) fArr[1]), (((double) fArr[0]) * 360.0d) - 180.0d);
    }

    public C19690vR A06() {
        C32031eE r3 = this.A00;
        C32061eH r4 = r3.A0E;
        float f = (float) 0;
        C07040Vr A05 = A05(f, (float) (r4.A0D - r3.A04));
        C07040Vr A052 = A05((float) (r4.A0F - r3.A05), (float) (r4.A0D - r3.A04));
        C07040Vr A053 = A05(f, (float) r3.A06);
        C07040Vr A054 = A05((float) (r4.A0F - r3.A05), (float) r3.A06);
        C19620vK r42 = new C19620vK();
        r42.A00(A05);
        r42.A00(A053);
        r42.A00(A052);
        r42.A00(A054);
        return new C19690vR(A05, A052, A053, A054, new C19630vL(new C07040Vr(r42.A02, r42.A03), new C07040Vr(r42.A01, r42.A00)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if ((r4 - r11) < (r2 - r8)) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(double r11, double r13, float[] r15) {
        /*
            r10 = this;
            X.0v6 r6 = r10.A01
            r10.A0A(r6)
            double r4 = r6.A01
            int r0 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            double r1 = r6.A02
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
        L_0x0011:
            double r0 = r4 - r11
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            double r2 = (double) r0
            double r2 = r2 + r11
            double r8 = r6.A02
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            double r6 = r2 - r8
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r2 - r0
            double r4 = r4 - r11
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
        L_0x002b:
            r10.A08(r11, r13, r15)
            return
        L_0x002f:
            r11 = r2
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19250ui.A07(double, double, float[]):void");
    }

    public void A08(double d, double d2, float[] fArr) {
        C32061eH r4 = this.A00.A0E;
        double d3 = r4.A02;
        C19480v6 r1 = this.A01;
        A0A(r1);
        double d4 = r1.A01;
        if (d4 > d3 || d3 > r1.A02) {
            d3 += (double) ((int) Math.ceil(d4 - d3));
        }
        float f = (float) r4.A0J;
        fArr[0] = ((float) (d - d3)) * f;
        fArr[1] = ((float) (d2 - r4.A03)) * f;
        r4.A0k.mapVectors(fArr);
        fArr[0] = fArr[0] + r4.A04;
        fArr[1] = fArr[1] + r4.A05;
    }

    public void A09(float f, float f2, float[] fArr) {
        C32061eH r7 = this.A00.A0E;
        fArr[0] = f - r7.A04;
        fArr[1] = f2 - r7.A05;
        r7.A0l.mapVectors(fArr);
        double d = r7.A02;
        float f3 = fArr[0];
        float f4 = (float) r7.A0J;
        fArr[0] = (float) (d + ((double) (f3 / f4)));
        fArr[1] = (float) (r7.A03 + ((double) (fArr[1] / f4)));
        float f5 = fArr[0];
        if (f5 > 1.0f) {
            fArr[0] = f5 - 1.0f;
        } else if (f5 < 0.0f) {
            fArr[0] = f5 + 1.0f;
        }
    }

    public final void A0A(C19480v6 r9) {
        C32061eH r6 = this.A00.A0E;
        double d = r6.A03;
        double d2 = r6.A01;
        r9.A03 = d - d2;
        r9.A00 = d + d2;
        double d3 = r6.A02;
        double d4 = r6.A00;
        double d5 = d3 - d4;
        r9.A01 = d5;
        double d6 = d3 + d4;
        r9.A02 = d6;
        if (d5 < 0.0d) {
            double ceil = (double) ((int) Math.ceil(-d5));
            r9.A01 = d5 + ceil;
            r9.A02 = d6 + ceil;
        }
    }
}
