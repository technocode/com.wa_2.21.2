package X;

/* renamed from: X.1Fr  reason: invalid class name */
public final class AnonymousClass1Fr {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08 = 1.0f;

    public AnonymousClass1Fr(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.A00 = f;
        this.A01 = f4;
        this.A02 = f7;
        this.A03 = f2;
        this.A04 = f5;
        this.A05 = f8;
        this.A06 = f3;
        this.A07 = f6;
    }

    public static AnonymousClass1Fr A00(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = ((f - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0f && f10 == 0.0f) {
            return new AnonymousClass1Fr(f3 - f, f5 - f3, f, f4 - f2, f6 - f4, f2, 0.0f, 0.0f);
        }
        float f11 = f3 - f5;
        float f12 = f7 - f5;
        float f13 = f4 - f6;
        float f14 = f8 - f6;
        float f15 = (f11 * f14) - (f12 * f13);
        float f16 = ((f14 * f9) - (f12 * f10)) / f15;
        float f17 = ((f11 * f10) - (f9 * f13)) / f15;
        return new AnonymousClass1Fr((f16 * f3) + (f3 - f), (f17 * f7) + (f7 - f), f, (f16 * f4) + (f4 - f2), (f17 * f8) + (f8 - f2), f2, f16, f17);
    }
}
