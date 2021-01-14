package X;

/* renamed from: X.0tm  reason: invalid class name and case insensitive filesystem */
public class C18700tm implements Cloneable {
    public float A00;
    public EnumC18880u4 A01;

    public C18700tm(float f) {
        this.A00 = f;
        this.A01 = EnumC18880u4.px;
    }

    public C18700tm(float f, EnumC18880u4 r2) {
        this.A00 = f;
        this.A01 = r2;
    }

    public float A00(float f) {
        int ordinal = this.A01.ordinal();
        if (ordinal == 0) {
            return this.A00;
        }
        if (ordinal == 3) {
            return this.A00 * f;
        }
        if (ordinal == 4) {
            return (this.A00 * f) / 2.54f;
        }
        if (ordinal == 5) {
            return (this.A00 * f) / 25.4f;
        }
        if (ordinal == 6) {
            return (this.A00 * f) / 72.0f;
        }
        if (ordinal != 7) {
            return this.A00;
        }
        return (this.A00 * f) / 6.0f;
    }

    public float A01(C18930u9 r6) {
        if (this.A01 != EnumC18880u4.percent) {
            return A02(r6);
        }
        C18910u7 r1 = r6.A03;
        C18660ti r0 = r1.A02;
        if (r0 == null && (r0 = r1.A03) == null) {
            return this.A00;
        }
        float f = r0.A03;
        float f2 = r0.A00;
        if (f == f2) {
            return (this.A00 * f) / 100.0f;
        }
        return (this.A00 * ((float) (Math.sqrt((double) ((f2 * f2) + (f * f))) / 1.414213562373095d))) / 100.0f;
    }

    public float A02(C18930u9 r4) {
        float f;
        float f2;
        float f3;
        float f4;
        switch (this.A01.ordinal()) {
            case 0:
                return this.A00;
            case 1:
                f = this.A00;
                f2 = r4.A03.A00.getTextSize();
                return f * f2;
            case 2:
                f = this.A00;
                f2 = r4.A03.A00.getTextSize() / 2.0f;
                return f * f2;
            case 3:
                f = this.A00;
                f2 = r4.A00;
                return f * f2;
            case 4:
                f3 = this.A00 * r4.A00;
                f4 = 2.54f;
                return f3 / f4;
            case 5:
                f3 = this.A00 * r4.A00;
                f4 = 25.4f;
                return f3 / f4;
            case 6:
                f3 = this.A00 * r4.A00;
                f4 = 72.0f;
                return f3 / f4;
            case 7:
                f3 = this.A00 * r4.A00;
                f4 = 6.0f;
                return f3 / f4;
            case 8:
                C18910u7 r1 = r4.A03;
                C18660ti r0 = r1.A02;
                if (r0 == null && (r0 = r1.A03) == null) {
                    return this.A00;
                }
                f3 = this.A00 * r0.A03;
                f4 = 100.0f;
                return f3 / f4;
            default:
                return this.A00;
        }
    }

    public float A03(C18930u9 r3) {
        if (this.A01 != EnumC18880u4.percent) {
            return A02(r3);
        }
        C18910u7 r1 = r3.A03;
        C18660ti r0 = r1.A02;
        if (r0 == null && (r0 = r1.A03) == null) {
            return this.A00;
        }
        return (this.A00 * r0.A00) / 100.0f;
    }

    public float A04(C18930u9 r3, float f) {
        if (this.A01 == EnumC18880u4.percent) {
            return (this.A00 * f) / 100.0f;
        }
        return A02(r3);
    }

    public boolean A05() {
        return this.A00 < 0.0f;
    }

    public boolean A06() {
        return this.A00 == 0.0f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.A00));
        sb.append(this.A01);
        return sb.toString();
    }
}
