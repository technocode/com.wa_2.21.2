package X;

import android.graphics.Color;

/* renamed from: X.02b  reason: invalid class name and case insensitive filesystem */
public final class C004402b {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static double A00(int i) {
        double pow;
        double pow2;
        double pow3;
        ThreadLocal threadLocal = A00;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length == 3) {
            double d = ((double) red) / 255.0d;
            if (d < 0.04045d) {
                pow = d / 12.92d;
            } else {
                pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
            }
            double d2 = ((double) green) / 255.0d;
            if (d2 < 0.04045d) {
                pow2 = d2 / 12.92d;
            } else {
                pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            }
            double d3 = ((double) blue) / 255.0d;
            if (d3 < 0.04045d) {
                pow3 = d3 / 12.92d;
            } else {
                pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            double d4 = pow3 * 0.9505d;
            dArr[2] = (d4 + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            return dArr[1] / 100.0d;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static double A01(int i, int i2) {
        if (Color.alpha(i2) == 255) {
            if (Color.alpha(i) < 255) {
                i = A02(i, i2);
            }
            double A002 = A00(i) + 0.05d;
            double A003 = A00(i2) + 0.05d;
            return Math.max(A002, A003) / Math.min(A002, A003);
        }
        StringBuilder A0S = AnonymousClass008.A0S("background can not be translucent: #");
        A0S.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(A0S.toString());
    }

    public static int A02(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i6 = 255 - alpha2;
        int i7 = 255 - (((255 - alpha) * i6) / 255);
        int red = Color.red(i);
        int red2 = Color.red(i2);
        if (i7 == 0) {
            i3 = 0;
        } else {
            i3 = (((red2 * alpha) * i6) + ((red * 255) * alpha2)) / (i7 * 255);
        }
        int green = Color.green(i);
        int green2 = Color.green(i2);
        if (i7 == 0) {
            i4 = 0;
        } else {
            i4 = (((green2 * alpha) * i6) + ((green * 255) * alpha2)) / (i7 * 255);
        }
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i7 == 0) {
            i5 = 0;
        } else {
            i5 = ((i6 * (blue2 * alpha)) + ((blue * 255) * alpha2)) / (i7 * 255);
        }
        return Color.argb(i7, i3, i4, i5);
    }

    public static int A03(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int A04(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    public static int A05(int i, int i2, float f) {
        int i3 = 255;
        if (Color.alpha(i2) == 255) {
            double d = (double) f;
            if (A01(A03(i, 255), i2) < d) {
                return -1;
            }
            int i4 = 0;
            int i5 = 0;
            do {
                int i6 = (i5 + i3) >> 1;
                if (A01(A03(i, i6), i2) < d) {
                    i5 = i6;
                } else {
                    i3 = i6;
                }
                i4++;
                if (i4 > 10) {
                    break;
                }
            } while (i3 - i5 > 1);
            return i3;
        }
        StringBuilder A0S = AnonymousClass008.A0S("background can not be translucent: #");
        A0S.append(Integer.toHexString(i2));
        throw new IllegalArgumentException(A0S.toString());
    }

    public static void A06(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = ((float) i) / 255.0f;
        float f3 = ((float) i2) / 255.0f;
        float f4 = ((float) i3) / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            if (max == f2) {
                f = ((f3 - f4) / f5) % 6.0f;
            } else {
                f = max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            }
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 360.0f) {
            f7 = 360.0f;
        }
        fArr[0] = f7;
        if (abs < 0.0f) {
            abs = 0.0f;
        } else if (abs > 1.0f) {
            abs = 1.0f;
        }
        fArr[1] = abs;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        fArr[2] = f6;
    }
}
