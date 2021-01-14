package X;

/* renamed from: X.0j9  reason: invalid class name and case insensitive filesystem */
public class C12830j9 {
    public static C12830j9 A03;
    public int A00;
    public long A01;
    public long A02;

    public void A00(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = Math.sin(d3);
        double sin2 = Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d;
        double sin3 = sin2 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (sin * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double sin4 = Math.sin(2.0d * sin3) * -0.0069d;
        double round = sin4 + (sin * 0.0053d) + ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin3));
        double d5 = 0.01745329238474369d * d;
        double sin5 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d5))) / (Math.cos(asin) * Math.cos(d5));
        if (sin5 >= 1.0d) {
            this.A00 = 1;
            this.A02 = -1;
            this.A01 = -1;
        } else if (sin5 <= -1.0d) {
            this.A00 = 0;
            this.A02 = -1;
            this.A01 = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin5) / 6.283185307179586d));
            long round2 = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            this.A02 = round2;
            long round3 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.A01 = round3;
            if (round3 >= j || round2 <= j) {
                this.A00 = 1;
            } else {
                this.A00 = 0;
            }
        }
    }
}
