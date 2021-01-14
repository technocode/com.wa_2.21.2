package X;

/* renamed from: X.1Fj  reason: invalid class name and case insensitive filesystem */
public class C25171Fj {
    public final float A00;
    public final float A01;

    public C25171Fj(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public static float A00(C25171Fj r4, C25171Fj r5) {
        float f = r4.A00;
        float f2 = r4.A01;
        float f3 = f - r5.A00;
        float f4 = f2 - r5.A01;
        return (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25171Fj)) {
            return false;
        }
        C25171Fj r4 = (C25171Fj) obj;
        if (this.A00 == r4.A00 && this.A01 == r4.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.A01) + (Float.floatToIntBits(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(25);
        sb.append('(');
        sb.append(this.A00);
        sb.append(',');
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }
}
