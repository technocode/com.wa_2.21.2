package X;

/* renamed from: X.06Q  reason: invalid class name */
public final class AnonymousClass06Q implements AnonymousClass05n, Cloneable {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public AnonymousClass06R A06;
    public AnonymousClass06R A07;
    public C009405x A08;
    public C009405x A09;
    public boolean A0A = false;

    public AnonymousClass06Q() {
        C009405x r0 = C009405x.A02;
        this.A09 = r0;
        this.A08 = r0;
    }

    public int A00(AnonymousClass05r r3) {
        C009405x r1 = this.A08;
        if (r1 != C009405x.A02) {
            return r1.A00(r3).intValue();
        }
        int i = this.A03;
        if (i != 0) {
            return i;
        }
        return r1.A00(r3).intValue();
    }

    public AnonymousClass06Q A01() {
        try {
            return (AnonymousClass06Q) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
