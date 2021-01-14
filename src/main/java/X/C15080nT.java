package X;

/* renamed from: X.0nT  reason: invalid class name and case insensitive filesystem */
public class C15080nT {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 0;
    public int A04 = 0;
    public int A05;
    public int A06;
    public int A07;
    public long A08 = 0;
    public long A09 = Long.MIN_VALUE;
    public long A0A = -1;

    public final float A00(long j) {
        long j2 = this.A09;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.A0A;
        if (j3 < 0 || j < j3) {
            float f = ((float) (j - j2)) / ((float) this.A07);
            if (f > 1.0f) {
                f = 1.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
            return f * 0.5f;
        }
        float f2 = this.A00;
        float f3 = 1.0f - f2;
        float f4 = ((float) (j - j3)) / ((float) this.A05);
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return (f4 * f2) + f3;
    }
}
