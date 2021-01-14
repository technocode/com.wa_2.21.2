package X;

/* renamed from: X.12F  reason: invalid class name */
public final class AnonymousClass12F {
    public static final AnonymousClass12F A04 = new AnonymousClass12F(1.0f, 1.0f, false);
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;

    public AnonymousClass12F(float f, float f2, boolean z) {
        boolean z2 = true;
        C002001d.A39(f > 0.0f);
        C002001d.A39(f2 <= 0.0f ? false : z2);
        this.A01 = f;
        this.A00 = f2;
        this.A03 = z;
        this.A02 = Math.round(f * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass12F.class != obj.getClass()) {
            return false;
        }
        AnonymousClass12F r5 = (AnonymousClass12F) obj;
        if (this.A01 == r5.A01 && this.A00 == r5.A00 && this.A03 == r5.A03) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.A00) + ((Float.floatToRawIntBits(this.A01) + 527) * 31)) * 31) + (this.A03 ? 1 : 0);
    }
}
