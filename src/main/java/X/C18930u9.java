package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* renamed from: X.0u9  reason: invalid class name and case insensitive filesystem */
public class C18930u9 {
    public static HashSet A07;
    public float A00 = 96.0f;
    public Canvas A01;
    public C18890u5 A02;
    public C18910u7 A03;
    public Stack A04;
    public Stack A05;
    public Stack A06;

    public C18930u9(Canvas canvas) {
        this.A01 = canvas;
    }

    public static int A00(int i, float f) {
        int i2 = 255;
        int round = Math.round(((float) ((i >> 24) & 255)) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i & 16777215) | (i2 << 24);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r10 != 9) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[PHI: r3 
      PHI: (r3v2 float) = (r3v0 float), (r3v1 float) binds: [B:21:0x0057, B:26:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Matrix A01(X.C18660ti r12, X.C18660ti r13, X.C18640tg r14) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A01(X.0ti, X.0ti, X.0tg):android.graphics.Matrix");
    }

    public static final Typeface A02(String str, Integer num, EnumC18740tq r5) {
        int i;
        boolean z = false;
        if (r5 == EnumC18740tq.Italic) {
            z = true;
        }
        if (num.intValue() > 500) {
            i = 1;
            if (z) {
                i = 3;
            }
        } else {
            i = 0;
            if (z) {
                i = 2;
            }
        }
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    return Typeface.create(Typeface.SANS_SERIF, i);
                }
                return null;
            case -1431958525:
                if (str.equals("monospace")) {
                    return Typeface.create(Typeface.MONOSPACE, i);
                }
                return null;
            case -1081737434:
                if (str.equals("fantasy")) {
                    return Typeface.create(Typeface.SANS_SERIF, i);
                }
                return null;
            case 109326717:
                if (str.equals("serif")) {
                    return Typeface.create(Typeface.SERIF, i);
                }
                return null;
            case 1126973893:
                if (str.equals("cursive")) {
                    return Typeface.create(Typeface.SANS_SERIF, i);
                }
                return null;
            default:
                return null;
        }
    }

    public static final C18660ti A03(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C18660ti(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    public static void A04(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, AbstractC18720to r41) {
        double d;
        if (!(f == f6 && f2 == f7)) {
            if (f3 == 0.0f || f4 == 0.0f) {
                r41.ABk(f6, f7);
                return;
            }
            float abs = Math.abs(f3);
            float abs2 = Math.abs(f4);
            double radians = (double) ((float) Math.toRadians(((double) f5) % 360.0d));
            float cos = (float) Math.cos(radians);
            float sin = (float) Math.sin(radians);
            float f8 = (f - f6) / 2.0f;
            float f9 = (f2 - f7) / 2.0f;
            float f10 = (sin * f9) + (cos * f8);
            float f11 = (f9 * cos) + ((-sin) * f8);
            float f12 = abs * abs;
            float f13 = abs2 * abs2;
            float f14 = f10 * f10;
            float f15 = f11 * f11;
            float f16 = (f15 / f13) + (f14 / f12);
            if (f16 > 1.0f) {
                float sqrt = (float) Math.sqrt((double) f16);
                abs *= sqrt;
                abs2 *= sqrt;
                f12 = abs * abs;
                f13 = abs2 * abs2;
            }
            float f17 = 1.0f;
            if (z == z2) {
                f17 = -1.0f;
            }
            float f18 = f12 * f13;
            float f19 = f12 * f15;
            float f20 = f13 * f14;
            float f21 = ((f18 - f19) - f20) / (f19 + f20);
            if (f21 < 0.0f) {
                f21 = 0.0f;
            }
            float sqrt2 = (float) (Math.sqrt((double) f21) * ((double) f17));
            float f22 = ((abs * f11) / abs2) * sqrt2;
            float f23 = sqrt2 * (-((abs2 * f10) / abs));
            float f24 = ((cos * f22) - (sin * f23)) + ((f + f6) / 2.0f);
            float f25 = (cos * f23) + (sin * f22) + ((f2 + f7) / 2.0f);
            float f26 = (f10 - f22) / abs;
            float f27 = (f11 - f23) / abs2;
            float f28 = ((-f10) - f22) / abs;
            float f29 = ((-f11) - f23) / abs2;
            float f30 = (f27 * f27) + (f26 * f26);
            float sqrt3 = (float) Math.sqrt((double) f30);
            float f31 = 1.0f;
            if (f27 < 0.0f) {
                f31 = -1.0f;
            }
            float degrees = (float) Math.toDegrees(Math.acos((double) (f26 / sqrt3)) * ((double) f31));
            float sqrt4 = (float) Math.sqrt((double) (((f29 * f29) + (f28 * f28)) * f30));
            float f32 = (f27 * f29) + (f26 * f28);
            float f33 = 1.0f;
            if ((f26 * f29) - (f27 * f28) < 0.0f) {
                f33 = -1.0f;
            }
            double degrees2 = Math.toDegrees(Math.acos((double) (f32 / sqrt4)) * ((double) f33));
            if (z2 || degrees2 <= 0.0d) {
                d = 360.0d;
                if (z2 && degrees2 < 0.0d) {
                    degrees2 += 360.0d;
                }
            } else {
                d = 360.0d;
                degrees2 -= 360.0d;
            }
            double d2 = degrees2 % d;
            int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
            double radians2 = Math.toRadians((double) (degrees % 360.0f));
            float radians3 = (float) (Math.toRadians(d2) / ((double) ceil));
            double d3 = (double) radians3;
            double d4 = d3 / 2.0d;
            double sin2 = (Math.sin(d4) * 1.3333333333333333d) / (Math.cos(d4) + 1.0d);
            int i = ceil * 6;
            float[] fArr = new float[i];
            int i2 = 0;
            for (int i3 = 0; i3 < ceil; i3++) {
                double d5 = ((double) (((float) i3) * radians3)) + radians2;
                double cos2 = Math.cos(d5);
                double sin3 = Math.sin(d5);
                int i4 = i2 + 1;
                fArr[i2] = (float) (cos2 - (sin2 * sin3));
                int i5 = i4 + 1;
                fArr[i4] = (float) ((cos2 * sin2) + sin3);
                double d6 = d5 + d3;
                double cos3 = Math.cos(d6);
                double sin4 = Math.sin(d6);
                int i6 = i5 + 1;
                fArr[i5] = (float) ((sin2 * sin4) + cos3);
                int i7 = i6 + 1;
                fArr[i6] = (float) (sin4 - (sin2 * cos3));
                int i8 = i7 + 1;
                fArr[i7] = (float) cos3;
                i2 = i8 + 1;
                fArr[i8] = (float) sin4;
            }
            Matrix matrix = new Matrix();
            matrix.postScale(abs, abs2);
            matrix.postRotate(f5);
            matrix.postTranslate(f24, f25);
            matrix.mapPoints(fArr);
            fArr[i - 2] = f6;
            fArr[i - 1] = f7;
            for (int i9 = 0; i9 < i; i9 += 6) {
                r41.A3W(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]);
            }
        }
    }

    public static final void A05(C18910u7 r3, boolean z, AbstractC18860u2 r5) {
        Float f;
        int i;
        C18820ty r2 = r3.A04;
        if (z) {
            f = r2.A0O;
        } else {
            f = r2.A0T;
        }
        float floatValue = f.floatValue();
        if (r5 instanceof C31901dz) {
            i = ((C31901dz) r5).A00;
        } else if (r5 instanceof C31911e0) {
            i = r2.A02.A00;
        } else {
            return;
        }
        int A002 = A00(i, floatValue);
        if (z) {
            r3.A00.setColor(A002);
        } else {
            r3.A01.setColor(A002);
        }
    }

    public static void A06(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static final boolean A07(C18820ty r3, long j) {
        return (j & r3.A00) != 0;
    }

    public final Path.FillType A08() {
        EnumC18730tp r1 = this.A03.A04.A06;
        if (r1 == null || r1 != EnumC18730tp.EvenOdd) {
            return Path.FillType.WINDING;
        }
        return Path.FillType.EVEN_ODD;
    }

    public final Path A09(AnonymousClass2BE r24) {
        float f;
        C18700tm r0 = r24.A00;
        float f2 = 0.0f;
        if (r0 != null) {
            f = r0.A02(this);
        } else {
            f = 0.0f;
        }
        C18700tm r02 = r24.A01;
        if (r02 != null) {
            f2 = r02.A03(this);
        }
        float A012 = r24.A02.A01(this);
        float f3 = f - A012;
        float f4 = f2 - A012;
        float f5 = f + A012;
        float f6 = f2 + A012;
        if (((AbstractC454024p) r24).A00 == null) {
            float f7 = 2.0f * A012;
            ((AbstractC454024p) r24).A00 = new C18660ti(f3, f4, f7, f7);
        }
        float f8 = 0.5522848f * A012;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f8;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f2 + f8;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f8;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    public final Path A0A(AnonymousClass2BH r27) {
        float f;
        C18700tm r0 = r27.A00;
        float f2 = 0.0f;
        if (r0 != null) {
            f = r0.A02(this);
        } else {
            f = 0.0f;
        }
        C18700tm r02 = r27.A01;
        if (r02 != null) {
            f2 = r02.A03(this);
        }
        float A022 = r27.A02.A02(this);
        float A032 = r27.A03.A03(this);
        float f3 = f - A022;
        float f4 = f2 - A032;
        float f5 = f + A022;
        float f6 = f2 + A032;
        if (((AbstractC454024p) r27).A00 == null) {
            ((AbstractC454024p) r27).A00 = new C18660ti(f3, f4, A022 * 2.0f, 2.0f * A032);
        }
        float f7 = A022 * 0.5522848f;
        float f8 = 0.5522848f * A032;
        Path path = new Path();
        path.moveTo(f, f4);
        float f9 = f + f7;
        float f10 = f2 - f8;
        path.cubicTo(f9, f4, f5, f10, f5, f2);
        float f11 = f8 + f2;
        path.cubicTo(f5, f11, f9, f6, f, f6);
        float f12 = f - f7;
        path.cubicTo(f12, f6, f3, f11, f3, f2);
        path.cubicTo(f3, f10, f12, f4, f, f4);
        path.close();
        return path;
    }

    public final Path A0B(AnonymousClass2BL r6) {
        Path path = new Path();
        float[] fArr = r6.A00;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = r6.A00;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (r6 instanceof AnonymousClass2CI) {
            path.close();
        }
        if (((AbstractC454024p) r6).A00 == null) {
            ((AbstractC454024p) r6).A00 = A03(path);
        }
        return path;
    }

    public final Path A0C(AnonymousClass2BM r23) {
        float A022;
        float A032;
        float f;
        float f2;
        C18700tm r2 = r23.A01;
        if (r2 == null && r23.A02 == null) {
            A022 = 0.0f;
            A032 = 0.0f;
        } else {
            if (r2 == null) {
                A022 = r23.A02.A03(this);
            } else {
                C18700tm r0 = r23.A02;
                A022 = r2.A02(this);
                if (r0 != null) {
                    A032 = r23.A02.A03(this);
                }
            }
            A032 = A022;
        }
        float min = Math.min(A022, r23.A03.A02(this) / 2.0f);
        float min2 = Math.min(A032, r23.A00.A03(this) / 2.0f);
        C18700tm r02 = r23.A04;
        if (r02 != null) {
            f = r02.A02(this);
        } else {
            f = 0.0f;
        }
        C18700tm r03 = r23.A05;
        if (r03 != null) {
            f2 = r03.A03(this);
        } else {
            f2 = 0.0f;
        }
        float A023 = r23.A03.A02(this);
        float A033 = r23.A00.A03(this);
        if (((AbstractC454024p) r23).A00 == null) {
            ((AbstractC454024p) r23).A00 = new C18660ti(f, f2, A023, A033);
        }
        float f3 = f + A023;
        float f4 = f2 + A033;
        Path path = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path.moveTo(f, f2);
            path.lineTo(f3, f2);
            path.lineTo(f3, f4);
            path.lineTo(f, f4);
            path.lineTo(f, f2);
        } else {
            float f5 = min * 0.5522848f;
            float f6 = 0.5522848f * min2;
            float f7 = f2 + min2;
            path.moveTo(f, f7);
            float f8 = f7 - f6;
            float f9 = f + min;
            float f10 = f9 - f5;
            path.cubicTo(f, f8, f10, f2, f9, f2);
            float f11 = f3 - min;
            path.lineTo(f11, f2);
            float f12 = f11 + f5;
            path.cubicTo(f12, f2, f3, f8, f3, f7);
            float f13 = f4 - min2;
            path.lineTo(f3, f13);
            float f14 = f13 + f6;
            path.cubicTo(f3, f14, f12, f4, f11, f4);
            path.lineTo(f9, f4);
            path.cubicTo(f10, f4, f, f14, f, f13);
            path.lineTo(f, f7);
        }
        path.close();
        return path;
    }

    public final Path A0D(AbstractC454024p r8, C18660ti r9) {
        Path A0E;
        C18850u1 A042 = ((C18850u1) r8).A01.A04(this.A03.A04.A0W);
        boolean z = false;
        if (A042 == null) {
            A06("ClipPath reference '%s' not found", this.A03.A04.A0W);
            return null;
        }
        AnonymousClass2BF r5 = (AnonymousClass2BF) A042;
        this.A06.push(this.A03);
        this.A03 = A0H(r5);
        Boolean bool = r5.A00;
        if (bool == null || bool.booleanValue()) {
            z = true;
        }
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(r9.A01, r9.A02);
            matrix.preScale(r9.A03, r9.A00);
        }
        Matrix matrix2 = ((AnonymousClass2AE) r5).A00;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C18850u1 r1 : ((AnonymousClass28U) r5).A01) {
            if ((r1 instanceof AbstractC454024p) && (A0E = A0E((AbstractC454024p) r1, true)) != null) {
                path.op(A0E, Path.Op.UNION);
            }
        }
        if (this.A03.A04.A0W != null) {
            C18660ti r0 = ((AbstractC454024p) r5).A00;
            if (r0 == null) {
                r0 = A03(path);
                ((AbstractC454024p) r5).A00 = r0;
            }
            Path A0D = A0D(r5, r0);
            if (A0D != null) {
                path.op(A0D, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.A03 = (C18910u7) this.A06.pop();
        return path;
    }

    public final Path A0E(AbstractC454024p r11, boolean z) {
        Path path;
        Path A0D;
        float f;
        float f2;
        float f3;
        this.A06.push(this.A03);
        C18910u7 r0 = new C18910u7(this.A03);
        this.A03 = r0;
        A0g(r0, r11);
        if (!A0i() || !A0k()) {
            this.A03 = (C18910u7) this.A06.pop();
            return null;
        }
        if (r11 instanceof AnonymousClass2BS) {
            if (!z) {
                A06("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            AnonymousClass2BS r3 = (AnonymousClass2BS) r11;
            C18850u1 A042 = ((C18850u1) r11).A01.A04(r3.A04);
            if (A042 == null) {
                A06("Use reference '%s' not found", r3.A04);
                this.A03 = (C18910u7) this.A06.pop();
                return null;
            } else if (!(A042 instanceof AbstractC454024p)) {
                this.A03 = (C18910u7) this.A06.pop();
                return null;
            } else {
                path = A0E((AbstractC454024p) A042, false);
                if (path == null) {
                    return null;
                }
                if (((AbstractC454024p) r3).A00 == null) {
                    ((AbstractC454024p) r3).A00 = A03(path);
                }
                Matrix matrix = ((AnonymousClass2AE) r3).A00;
                if (matrix != null) {
                    path.transform(matrix);
                }
            }
        } else if (r11 instanceof AnonymousClass2AD) {
            AnonymousClass2AD r1 = (AnonymousClass2AD) r11;
            if (r11 instanceof AnonymousClass2BK) {
                path = new AnonymousClass1e6(((AnonymousClass2BK) r11).A00).A02;
                if (r11.A00 == null) {
                    r11.A00 = A03(path);
                }
            } else if (r11 instanceof AnonymousClass2BM) {
                path = A0C((AnonymousClass2BM) r11);
            } else if (r11 instanceof AnonymousClass2BE) {
                path = A09((AnonymousClass2BE) r11);
            } else if (r11 instanceof AnonymousClass2BH) {
                path = A0A((AnonymousClass2BH) r11);
            } else {
                if (r11 instanceof AnonymousClass2BL) {
                    path = A0B((AnonymousClass2BL) r11);
                }
                return null;
            }
            if (path != null) {
                if (((AbstractC454024p) r1).A00 == null) {
                    ((AbstractC454024p) r1).A00 = A03(path);
                }
                Matrix matrix2 = r1.A00;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(A08());
            }
            return null;
        } else if (r11 instanceof AnonymousClass2CM) {
            AnonymousClass2CM r32 = (AnonymousClass2CM) r11;
            List list = ((AnonymousClass2BR) r32).A02;
            float f4 = 0.0f;
            if (list == null || list.size() == 0) {
                f = 0.0f;
            } else {
                f = ((C18700tm) ((AnonymousClass2BR) r32).A02.get(0)).A02(this);
            }
            List list2 = ((AnonymousClass2BR) r32).A03;
            if (list2 == null || list2.size() == 0) {
                f2 = 0.0f;
            } else {
                f2 = ((C18700tm) ((AnonymousClass2BR) r32).A03.get(0)).A03(this);
            }
            List list3 = ((AnonymousClass2BR) r32).A00;
            if (list3 == null || list3.size() == 0) {
                f3 = 0.0f;
            } else {
                f3 = ((C18700tm) ((AnonymousClass2BR) r32).A00.get(0)).A02(this);
            }
            List list4 = ((AnonymousClass2BR) r32).A01;
            if (!(list4 == null || list4.size() == 0)) {
                f4 = ((C18700tm) ((AnonymousClass2BR) r32).A01.get(0)).A03(this);
            }
            if (this.A03.A04.A0C != EnumC18780tu.Start) {
                C32001eA r02 = new C32001eA(this);
                A0d(r32, r02);
                float f5 = r02.A00;
                if (this.A03.A04.A0C == EnumC18780tu.Middle) {
                    f5 /= 2.0f;
                }
                f -= f5;
            }
            if (((AbstractC454024p) r32).A00 == null) {
                C31991e9 r12 = new C31991e9(this, f, f2);
                A0d(r32, r12);
                RectF rectF = r12.A02;
                ((AbstractC454024p) r32).A00 = new C18660ti(rectF.left, rectF.top, rectF.width(), r12.A02.height());
            }
            path = new Path();
            A0d(r32, new C31981e8(this, f + f3, f2 + f4, path));
            Matrix matrix3 = r32.A00;
            if (matrix3 != null) {
                path.transform(matrix3);
            }
            path.setFillType(A08());
        } else {
            A06("Invalid %s element found in clipPath definition", r11.A00());
            return null;
        }
        if (!(this.A03.A04.A0W == null || (A0D = A0D(r11, r11.A00)) == null)) {
            path.op(A0D, Path.Op.INTERSECT);
        }
        this.A03 = (C18910u7) this.A06.pop();
        return path;
    }

    public final C18660ti A0F(C18700tm r6, C18700tm r7, C18700tm r8, C18700tm r9) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if (r6 != null) {
            f = r6.A02(this);
        } else {
            f = 0.0f;
        }
        if (r7 != null) {
            f4 = r7.A03(this);
        }
        C18910u7 r1 = this.A03;
        C18660ti r0 = r1.A02;
        if (r0 == null) {
            r0 = r1.A03;
        }
        if (r8 != null) {
            f2 = r8.A02(this);
        } else {
            f2 = r0.A03;
        }
        if (r9 != null) {
            f3 = r9.A03(this);
        } else {
            f3 = r0.A00;
        }
        return new C18660ti(f, f4, f2, f3);
    }

    public final EnumC18780tu A0G() {
        EnumC18780tu r1;
        C18820ty r2 = this.A03.A04;
        if (r2.A0E == EnumC18800tw.LTR || (r1 = r2.A0C) == EnumC18780tu.Middle) {
            return r2.A0C;
        }
        EnumC18780tu r0 = EnumC18780tu.Start;
        return r1 == r0 ? EnumC18780tu.End : r0;
    }

    public final C18910u7 A0H(C18850u1 r3) {
        C18910u7 r1 = new C18910u7();
        A0f(r1, C18820ty.A00());
        A0b(r3, r1);
        return r1;
    }

    public final String A0I(String str, boolean z, boolean z2) {
        if (this.A03.A07) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void A0J() {
        this.A01.restore();
        this.A03 = (C18910u7) this.A06.pop();
    }

    public final void A0K() {
        this.A01.save();
        this.A06.push(this.A03);
        this.A03 = new C18910u7(this.A03);
    }

    public final void A0L() {
        int i;
        C18820ty r2 = this.A03.A04;
        AbstractC18860u2 r1 = r2.A0K;
        if (r1 instanceof C31901dz) {
            i = ((C31901dz) r1).A00;
        } else if (r1 instanceof C31911e0) {
            i = r2.A02.A00;
        } else {
            return;
        }
        Float f = r2.A0U;
        if (f != null) {
            i = A00(i, f.floatValue());
        }
        this.A01.drawColor(i);
    }

    public final void A0M(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C18670tj r0 = this.A03.A04.A01;
        if (r0 != null) {
            f += r0.A01.A02(this);
            f2 += this.A03.A04.A01.A03.A03(this);
            f5 -= this.A03.A04.A01.A02.A02(this);
            f6 -= this.A03.A04.A01.A00.A03(this);
        }
        this.A01.clipRect(f, f2, f5, f6);
    }

    public final void A0N(Path path) {
        C18910u7 r2 = this.A03;
        if (r2.A04.A0F == EnumC18810tx.NonScalingStroke) {
            Matrix matrix = this.A01.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.A01.setMatrix(new Matrix());
            Shader shader = this.A03.A01.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.A01.drawPath(path2, this.A03.A01);
            this.A01.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.A01.drawPath(path, r2.A01);
    }

    public final void A0O(AbstractC453724m r5, String str) {
        C18850u1 A042 = ((C18850u1) r5).A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Gradient reference '%s' not found", str));
        } else if (!(A042 instanceof AbstractC453724m)) {
            A06("Gradient href attributes must point to other gradient elements", new Object[0]);
        } else if (A042 == r5) {
            A06("Circular reference in gradient href attribute '%s'", str);
        } else {
            AbstractC453724m r2 = (AbstractC453724m) A042;
            if (r5.A02 == null) {
                r5.A02 = r2.A02;
            }
            if (r5.A00 == null) {
                r5.A00 = r2.A00;
            }
            if (r5.A01 == null) {
                r5.A01 = r2.A01;
            }
            if (r5.A04.isEmpty()) {
                r5.A04 = r2.A04;
            }
            try {
                if (r5 instanceof AnonymousClass28W) {
                    AnonymousClass28W r1 = (AnonymousClass28W) r5;
                    AnonymousClass28W r3 = (AnonymousClass28W) A042;
                    if (r1.A00 == null) {
                        r1.A00 = r3.A00;
                    }
                    if (r1.A02 == null) {
                        r1.A02 = r3.A02;
                    }
                    if (r1.A01 == null) {
                        r1.A01 = r3.A01;
                    }
                    if (r1.A03 == null) {
                        r1.A03 = r3.A03;
                    }
                } else {
                    AnonymousClass28X r12 = (AnonymousClass28X) r5;
                    AnonymousClass28X r32 = (AnonymousClass28X) A042;
                    if (r12.A00 == null) {
                        r12.A00 = r32.A00;
                    }
                    if (r12.A01 == null) {
                        r12.A01 = r32.A01;
                    }
                    if (r12.A04 == null) {
                        r12.A04 = r32.A04;
                    }
                    if (r12.A02 == null) {
                        r12.A02 = r32.A02;
                    }
                    if (r12.A03 == null) {
                        r12.A03 = r32.A03;
                    }
                }
            } catch (ClassCastException unused) {
            }
            String str2 = r2.A03;
            if (str2 != null) {
                A0O(r5, str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0168  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P(X.AnonymousClass2AD r26) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0P(X.2AD):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Q(X.AnonymousClass2CG r12, X.C18900u6 r13) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0Q(X.2CG, X.0u6):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(X.AnonymousClass2AF r7, X.AbstractC454024p r8) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0R(X.2AF, X.24p):void");
    }

    public final void A0S(AnonymousClass2CH r5, String str) {
        C18850u1 A042 = ((C18850u1) r5).A01.A04(str);
        if (A042 == null) {
            Log.w("SVGAndroidRenderer", String.format("Pattern reference '%s' not found", str));
        } else if (!(A042 instanceof AnonymousClass2CH)) {
            A06("Pattern href attributes must point to other pattern elements", new Object[0]);
        } else if (A042 == r5) {
            A06("Circular reference in pattern href attribute '%s'", str);
        } else {
            AnonymousClass2CH r1 = (AnonymousClass2CH) A042;
            if (r5.A06 == null) {
                r5.A06 = r1.A06;
            }
            if (r5.A05 == null) {
                r5.A05 = r1.A05;
            }
            if (r5.A00 == null) {
                r5.A00 = r1.A00;
            }
            if (r5.A03 == null) {
                r5.A03 = r1.A03;
            }
            if (r5.A04 == null) {
                r5.A04 = r1.A04;
            }
            if (r5.A02 == null) {
                r5.A02 = r1.A02;
            }
            if (r5.A01 == null) {
                r5.A01 = r1.A01;
            }
            if (((AnonymousClass28U) r5).A01.isEmpty()) {
                ((AnonymousClass28U) r5).A01 = ((AnonymousClass28U) r1).A01;
            }
            if (((AnonymousClass2BN) r5).A00 == null) {
                ((AnonymousClass2BN) r5).A00 = ((AnonymousClass2BN) r1).A00;
            }
            if (((AnonymousClass2AG) r5).A00 == null) {
                ((AnonymousClass2AG) r5).A00 = ((AnonymousClass2AG) r1).A00;
            }
            String str2 = r1.A07;
            if (str2 != null) {
                A0S(r5, str2);
            }
        }
    }

    public final void A0T(AnonymousClass2CJ r5, C18660ti r6, C18660ti r7, C18640tg r8) {
        if (r6.A03 != 0.0f && r6.A00 != 0.0f) {
            if (r8 == null && (r8 = ((AnonymousClass2AG) r5).A00) == null) {
                r8 = C18640tg.A02;
            }
            A0g(this.A03, r5);
            if (A0i()) {
                C18910u7 r0 = this.A03;
                r0.A03 = r6;
                if (!r0.A04.A0M.booleanValue()) {
                    A0M(r6.A01, r6.A02, r6.A03, r6.A00);
                }
                A0Z(r5, this.A03.A03);
                Canvas canvas = this.A01;
                if (r7 != null) {
                    canvas.concat(A01(this.A03.A03, r7, r8));
                    this.A03.A02 = ((AnonymousClass2BN) r5).A00;
                } else {
                    C18660ti r02 = this.A03.A03;
                    canvas.translate(r02.A01, r02.A02);
                }
                boolean A0j = A0j();
                A0L();
                A0U(r5, true);
                if (A0j) {
                    A0W(r5);
                }
                A0X(r5);
            }
        }
    }

    public final void A0U(AbstractC18840u0 r3, boolean z) {
        if (z) {
            this.A05.push(r3);
            this.A04.push(this.A01.getMatrix());
        }
        for (C18850u1 r0 : r3.A5H()) {
            A0a(r0);
        }
        if (z) {
            this.A05.pop();
            this.A04.pop();
        }
    }

    public final void A0V(AbstractC454024p r4) {
        AbstractC18860u2 r2 = this.A03.A04.A0G;
        if (r2 instanceof C31921e1) {
            A0h(true, r4.A00, (C31921e1) r2);
        }
        AbstractC18860u2 r22 = this.A03.A04.A0J;
        if (r22 instanceof C31921e1) {
            A0h(false, r4.A00, (C31921e1) r22);
        }
    }

    public final void A0W(AbstractC454024p r7) {
        if (this.A03.A04.A0a != null) {
            Paint paint = new Paint();
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.A01.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            this.A01.saveLayer(null, paint2, 31);
            AnonymousClass2AF r3 = (AnonymousClass2AF) this.A02.A04(this.A03.A04.A0a);
            A0R(r3, r7);
            this.A01.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            this.A01.saveLayer(null, paint3, 31);
            A0R(r3, r7);
            this.A01.restore();
            this.A01.restore();
        }
        A0J();
    }

    public final void A0X(AbstractC454024p r11) {
        if (((C18850u1) r11).A00 != null && r11.A00 != null) {
            Matrix matrix = new Matrix();
            if (((Matrix) this.A04.peek()).invert(matrix)) {
                C18660ti r3 = r11.A00;
                float f = r3.A01;
                float f2 = r3.A02;
                float f3 = f + r3.A03;
                int i = 2;
                float f4 = f2 + r3.A00;
                float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
                matrix.preConcat(this.A01.getMatrix());
                matrix.mapPoints(fArr);
                float f5 = fArr[0];
                float f6 = fArr[1];
                RectF rectF = new RectF(f5, f6, f5, f6);
                do {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    int i2 = i + 1;
                    if (fArr[i2] < rectF.top) {
                        rectF.top = fArr[i2];
                    }
                    if (fArr[i2] > rectF.bottom) {
                        rectF.bottom = fArr[i2];
                    }
                    i += 2;
                } while (i <= 6);
                AbstractC454024p r5 = (AbstractC454024p) this.A05.peek();
                C18660ti r7 = r5.A00;
                if (r7 == null) {
                    float f7 = rectF.left;
                    float f8 = rectF.top;
                    r5.A00 = new C18660ti(f7, f8, rectF.right - f7, rectF.bottom - f8);
                    return;
                }
                float f9 = rectF.left;
                float f10 = rectF.top;
                float f11 = rectF.right - f9;
                float f12 = rectF.bottom - f10;
                float f13 = r7.A01;
                if (f9 < f13) {
                    r7.A01 = f9;
                    f13 = f9;
                }
                float f14 = r7.A02;
                if (f10 < f14) {
                    r7.A02 = f10;
                    f14 = f10;
                }
                float f15 = f9 + f11;
                if (f15 > r7.A03 + f13) {
                    r7.A03 = f15 - f13;
                }
                float f16 = f10 + f12;
                if (f16 > r7.A00 + f14) {
                    r7.A00 = f16 - f14;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
        if (r0.booleanValue() != false) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r0.booleanValue() == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y(X.AbstractC454024p r19, android.graphics.Path r20) {
        /*
        // Method dump skipped, instructions count: 517
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0Y(X.24p, android.graphics.Path):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0.booleanValue() != false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Z(X.AbstractC454024p r7, X.C18660ti r8) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0Z(X.24p, X.0ti):void");
    }

    public final void A0a(C18850u1 r12) {
        float f;
        float f2;
        float f3;
        Path.FillType fillType;
        float A022;
        float A032;
        float A023;
        C18700tm r1;
        C18700tm r13;
        Path.FillType fillType2;
        C18700tm r0;
        String str;
        int indexOf;
        float f4;
        float f5;
        Set A9I;
        C18700tm r02;
        float f6;
        float f7;
        Boolean bool;
        EnumC18730tp r3 = EnumC18730tp.EvenOdd;
        if (!(r12 instanceof AbstractC18710tn)) {
            A0K();
            if ((r12 instanceof AbstractC31941e3) && (bool = ((AbstractC31941e3) r12).A02) != null) {
                this.A03.A07 = bool.booleanValue();
            }
            if (r12 instanceof AnonymousClass2CJ) {
                AnonymousClass2CJ r122 = (AnonymousClass2CJ) r12;
                A0T(r122, A0F(r122.A02, r122.A03, r122.A01, r122.A00), ((AnonymousClass2BN) r122).A00, ((AnonymousClass2AG) r122).A00);
            } else {
                int i = 0;
                float f8 = 0.0f;
                if (r12 instanceof AnonymousClass2BS) {
                    AnonymousClass2BS r123 = (AnonymousClass2BS) r12;
                    EnumC18880u4 r7 = EnumC18880u4.percent;
                    C18700tm r03 = r123.A01;
                    if ((r03 == null || !r03.A06()) && ((r02 = r123.A00) == null || !r02.A06())) {
                        A0g(this.A03, r123);
                        if (A0i()) {
                            C18850u1 A042 = ((C18850u1) r123).A01.A04(r123.A04);
                            if (A042 == null) {
                                A06("Use reference '%s' not found", r123.A04);
                            } else {
                                Matrix matrix = ((AnonymousClass2AE) r123).A00;
                                if (matrix != null) {
                                    this.A01.concat(matrix);
                                }
                                C18700tm r04 = r123.A02;
                                if (r04 != null) {
                                    f6 = r04.A02(this);
                                } else {
                                    f6 = 0.0f;
                                }
                                C18700tm r05 = r123.A03;
                                if (r05 != null) {
                                    f7 = r05.A03(this);
                                } else {
                                    f7 = 0.0f;
                                }
                                this.A01.translate(f6, f7);
                                A0Z(r123, ((AbstractC454024p) r123).A00);
                                boolean A0j = A0j();
                                this.A05.push(r123);
                                this.A04.push(this.A01.getMatrix());
                                if (A042 instanceof AnonymousClass2CJ) {
                                    AnonymousClass2CJ r32 = (AnonymousClass2CJ) A042;
                                    C18660ti A0F = A0F(null, null, r123.A01, r123.A00);
                                    A0K();
                                    A0T(r32, A0F, ((AnonymousClass2BN) r32).A00, ((AnonymousClass2AG) r32).A00);
                                    A0J();
                                } else if (A042 instanceof AnonymousClass2CK) {
                                    C18700tm r2 = r123.A01;
                                    if (r2 == null) {
                                        r2 = new C18700tm(100.0f, r7);
                                    }
                                    C18700tm r06 = r123.A00;
                                    if (r06 == null) {
                                        r06 = new C18700tm(100.0f, r7);
                                    }
                                    C18660ti A0F2 = A0F(null, null, r2, r06);
                                    A0K();
                                    AnonymousClass2BN r33 = (AnonymousClass2BN) A042;
                                    if (!(A0F2.A03 == 0.0f || A0F2.A00 == 0.0f)) {
                                        C18640tg r6 = ((AnonymousClass2AG) r33).A00;
                                        if (r6 == null) {
                                            r6 = C18640tg.A02;
                                        }
                                        A0g(this.A03, r33);
                                        C18910u7 r07 = this.A03;
                                        r07.A03 = A0F2;
                                        if (!r07.A04.A0M.booleanValue()) {
                                            A0M(A0F2.A01, A0F2.A02, A0F2.A03, A0F2.A00);
                                        }
                                        C18660ti r22 = r33.A00;
                                        if (r22 != null) {
                                            this.A01.concat(A01(this.A03.A03, r22, r6));
                                            this.A03.A02 = r33.A00;
                                        } else {
                                            Canvas canvas = this.A01;
                                            C18660ti r08 = this.A03.A03;
                                            canvas.translate(r08.A01, r08.A02);
                                        }
                                        boolean A0j2 = A0j();
                                        A0U(r33, true);
                                        if (A0j2) {
                                            A0W(r33);
                                        }
                                        A0X(r33);
                                    }
                                    A0J();
                                } else {
                                    A0a(A042);
                                }
                                this.A05.pop();
                                this.A04.pop();
                                if (A0j) {
                                    A0W(r123);
                                }
                                A0X(r123);
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2BO) {
                    AnonymousClass2AE r124 = (AnonymousClass2AE) r12;
                    A0g(this.A03, r124);
                    if (A0i()) {
                        Matrix matrix2 = r124.A00;
                        if (matrix2 != null) {
                            this.A01.concat(matrix2);
                        }
                        A0Z(r124, ((AbstractC454024p) r124).A00);
                        boolean A0j3 = A0j();
                        String language = Locale.getDefault().getLanguage();
                        Iterator it = ((AnonymousClass28U) r124).A01.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C18850u1 r23 = (C18850u1) it.next();
                            if (r23 instanceof AbstractC18830tz) {
                                AbstractC18830tz r4 = (AbstractC18830tz) r23;
                                if (r4.A8j() == null && ((A9I = r4.A9I()) == null || (!A9I.isEmpty() && A9I.contains(language)))) {
                                    Set A8k = r4.A8k();
                                    if (A8k != null) {
                                        if (A07 == null) {
                                            synchronized (C18930u9.class) {
                                                HashSet hashSet = new HashSet();
                                                A07 = hashSet;
                                                hashSet.add("Structure");
                                                A07.add("BasicStructure");
                                                A07.add("ConditionalProcessing");
                                                A07.add("Image");
                                                A07.add("Style");
                                                A07.add("ViewportAttribute");
                                                A07.add("Shape");
                                                A07.add("BasicText");
                                                A07.add("PaintAttribute");
                                                A07.add("BasicPaintAttribute");
                                                A07.add("OpacityAttribute");
                                                A07.add("BasicGraphicsAttribute");
                                                A07.add("Marker");
                                                A07.add("Gradient");
                                                A07.add("Pattern");
                                                A07.add("Clip");
                                                A07.add("BasicClip");
                                                A07.add("Mask");
                                                A07.add("View");
                                            }
                                        }
                                        if (A8k.isEmpty()) {
                                            continue;
                                        } else if (!A07.containsAll(A8k)) {
                                            continue;
                                        }
                                    }
                                    Set A8m = r4.A8m();
                                    if (A8m == null) {
                                        Set A8l = r4.A8l();
                                        if (A8l == null) {
                                            A0a(r23);
                                            break;
                                        }
                                        A8l.isEmpty();
                                    } else {
                                        A8m.isEmpty();
                                    }
                                }
                            }
                        }
                        if (A0j3) {
                            A0W(r124);
                        }
                        A0X(r124);
                    }
                } else if (r12 instanceof AnonymousClass2AE) {
                    AnonymousClass2AE r125 = (AnonymousClass2AE) r12;
                    A0g(this.A03, r125);
                    if (A0i()) {
                        Matrix matrix3 = r125.A00;
                        if (matrix3 != null) {
                            this.A01.concat(matrix3);
                        }
                        A0Z(r125, ((AbstractC454024p) r125).A00);
                        boolean A0j4 = A0j();
                        A0U(r125, true);
                        if (A0j4) {
                            A0W(r125);
                        }
                        A0X(r125);
                    }
                } else if (r12 instanceof AnonymousClass2BI) {
                    AnonymousClass2BI r126 = (AnonymousClass2BI) r12;
                    C18700tm r09 = r126.A02;
                    if (!(r09 == null || r09.A06() || (r0 = r126.A01) == null || r0.A06() || (str = r126.A05) == null)) {
                        C18640tg r72 = ((AnonymousClass2AG) r126).A00;
                        if (r72 == null) {
                            r72 = C18640tg.A02;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) != -1 && indexOf >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            if (decodeByteArray != null) {
                                C18660ti r62 = new C18660ti(0.0f, 0.0f, (float) decodeByteArray.getWidth(), (float) decodeByteArray.getHeight());
                                A0g(this.A03, r126);
                                if (A0i() && A0k()) {
                                    Matrix matrix4 = r126.A00;
                                    if (matrix4 != null) {
                                        this.A01.concat(matrix4);
                                    }
                                    C18700tm r010 = r126.A03;
                                    if (r010 != null) {
                                        f4 = r010.A02(this);
                                    } else {
                                        f4 = 0.0f;
                                    }
                                    C18700tm r011 = r126.A04;
                                    if (r011 != null) {
                                        f5 = r011.A03(this);
                                    } else {
                                        f5 = 0.0f;
                                    }
                                    float A024 = r126.A02.A02(this);
                                    float A025 = r126.A01.A02(this);
                                    C18910u7 r012 = this.A03;
                                    C18660ti r9 = new C18660ti(f4, f5, A024, A025);
                                    r012.A03 = r9;
                                    if (!r012.A04.A0M.booleanValue()) {
                                        A0M(r9.A01, r9.A02, r9.A03, r9.A00);
                                    }
                                    ((AbstractC454024p) r126).A00 = this.A03.A03;
                                    A0X(r126);
                                    A0Z(r126, ((AbstractC454024p) r126).A00);
                                    boolean A0j5 = A0j();
                                    A0L();
                                    this.A01.save();
                                    this.A01.concat(A01(this.A03.A03, r62, r72));
                                    if (this.A03.A04.A0B != EnumC18770tt.optimizeSpeed) {
                                        i = 2;
                                    }
                                    this.A01.drawBitmap(decodeByteArray, 0.0f, 0.0f, new Paint(i));
                                    this.A01.restore();
                                    if (A0j5) {
                                        A0W(r126);
                                    }
                                }
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2BK) {
                    AnonymousClass2BK r127 = (AnonymousClass2BK) r12;
                    if (r127.A00 != null) {
                        A0g(this.A03, r127);
                        if (A0i() && A0k()) {
                            C18910u7 r14 = this.A03;
                            if (r14.A06 || r14.A05) {
                                Matrix matrix5 = ((AnonymousClass2AD) r127).A00;
                                if (matrix5 != null) {
                                    this.A01.concat(matrix5);
                                }
                                Path path = new AnonymousClass1e6(r127.A00).A02;
                                if (((AbstractC454024p) r127).A00 == null) {
                                    ((AbstractC454024p) r127).A00 = A03(path);
                                }
                                A0X(r127);
                                A0V(r127);
                                A0Z(r127, ((AbstractC454024p) r127).A00);
                                boolean A0j6 = A0j();
                                C18910u7 r15 = this.A03;
                                if (r15.A05) {
                                    EnumC18730tp r013 = r15.A04.A07;
                                    if (r013 == null || r013 != r3) {
                                        fillType2 = Path.FillType.WINDING;
                                    } else {
                                        fillType2 = Path.FillType.EVEN_ODD;
                                    }
                                    path.setFillType(fillType2);
                                    A0Y(r127, path);
                                }
                                if (this.A03.A06) {
                                    A0N(path);
                                }
                                A0P(r127);
                                if (A0j6) {
                                    A0W(r127);
                                }
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2BM) {
                    AnonymousClass2BM r128 = (AnonymousClass2BM) r12;
                    C18700tm r014 = r128.A03;
                    if (r014 != null && (r13 = r128.A00) != null && !r014.A06() && !r13.A06()) {
                        A0g(this.A03, r128);
                        if (A0i() && A0k()) {
                            Matrix matrix6 = ((AnonymousClass2AD) r128).A00;
                            if (matrix6 != null) {
                                this.A01.concat(matrix6);
                            }
                            Path A0C = A0C(r128);
                            A0X(r128);
                            A0V(r128);
                            A0Z(r128, ((AbstractC454024p) r128).A00);
                            boolean A0j7 = A0j();
                            if (this.A03.A05) {
                                A0Y(r128, A0C);
                            }
                            if (this.A03.A06) {
                                A0N(A0C);
                            }
                            if (A0j7) {
                                A0W(r128);
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2BE) {
                    AnonymousClass2BE r129 = (AnonymousClass2BE) r12;
                    C18700tm r015 = r129.A02;
                    if (r015 != null && !r015.A06()) {
                        A0g(this.A03, r129);
                        if (A0i() && A0k()) {
                            Matrix matrix7 = ((AnonymousClass2AD) r129).A00;
                            if (matrix7 != null) {
                                this.A01.concat(matrix7);
                            }
                            Path A09 = A09(r129);
                            A0X(r129);
                            A0V(r129);
                            A0Z(r129, ((AbstractC454024p) r129).A00);
                            boolean A0j8 = A0j();
                            if (this.A03.A05) {
                                A0Y(r129, A09);
                            }
                            if (this.A03.A06) {
                                A0N(A09);
                            }
                            if (A0j8) {
                                A0W(r129);
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2BH) {
                    AnonymousClass2BH r1210 = (AnonymousClass2BH) r12;
                    C18700tm r016 = r1210.A02;
                    if (r016 != null && (r1 = r1210.A03) != null && !r016.A06() && !r1.A06()) {
                        A0g(this.A03, r1210);
                        if (A0i() && A0k()) {
                            Matrix matrix8 = ((AnonymousClass2AD) r1210).A00;
                            if (matrix8 != null) {
                                this.A01.concat(matrix8);
                            }
                            Path A0A = A0A(r1210);
                            A0X(r1210);
                            A0V(r1210);
                            A0Z(r1210, ((AbstractC454024p) r1210).A00);
                            boolean A0j9 = A0j();
                            if (this.A03.A05) {
                                A0Y(r1210, A0A);
                            }
                            if (this.A03.A06) {
                                A0N(A0A);
                            }
                            if (A0j9) {
                                A0W(r1210);
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2BJ) {
                    AnonymousClass2BJ r1211 = (AnonymousClass2BJ) r12;
                    A0g(this.A03, r1211);
                    if (A0i() && A0k() && this.A03.A06) {
                        Matrix matrix9 = ((AnonymousClass2AD) r1211).A00;
                        if (matrix9 != null) {
                            this.A01.concat(matrix9);
                        }
                        C18700tm r017 = r1211.A00;
                        if (r017 == null) {
                            A022 = 0.0f;
                        } else {
                            A022 = r017.A02(this);
                        }
                        C18700tm r018 = r1211.A02;
                        if (r018 == null) {
                            A032 = 0.0f;
                        } else {
                            A032 = r018.A03(this);
                        }
                        C18700tm r019 = r1211.A01;
                        if (r019 == null) {
                            A023 = 0.0f;
                        } else {
                            A023 = r019.A02(this);
                        }
                        C18700tm r020 = r1211.A03;
                        if (r020 != null) {
                            f8 = r020.A03(this);
                        }
                        if (((AbstractC454024p) r1211).A00 == null) {
                            ((AbstractC454024p) r1211).A00 = new C18660ti(Math.min(A022, A023), Math.min(A032, f8), Math.abs(A023 - A022), Math.abs(f8 - A032));
                        }
                        Path path2 = new Path();
                        path2.moveTo(A022, A032);
                        path2.lineTo(A023, f8);
                        A0X(r1211);
                        A0V(r1211);
                        A0Z(r1211, ((AbstractC454024p) r1211).A00);
                        boolean A0j10 = A0j();
                        A0N(path2);
                        A0P(r1211);
                        if (A0j10) {
                            A0W(r1211);
                        }
                    }
                } else if (r12 instanceof AnonymousClass2CI) {
                    AnonymousClass2BL r1212 = (AnonymousClass2BL) r12;
                    A0g(this.A03, r1212);
                    if (A0i() && A0k()) {
                        C18910u7 r16 = this.A03;
                        if (r16.A06 || r16.A05) {
                            Matrix matrix10 = ((AnonymousClass2AD) r1212).A00;
                            if (matrix10 != null) {
                                this.A01.concat(matrix10);
                            }
                            if (r1212.A00.length >= 2) {
                                Path A0B = A0B(r1212);
                                A0X(r1212);
                                A0V(r1212);
                                A0Z(r1212, ((AbstractC454024p) r1212).A00);
                                boolean A0j11 = A0j();
                                if (this.A03.A05) {
                                    A0Y(r1212, A0B);
                                }
                                if (this.A03.A06) {
                                    A0N(A0B);
                                }
                                A0P(r1212);
                                if (A0j11) {
                                    A0W(r1212);
                                }
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2BL) {
                    AnonymousClass2BL r1213 = (AnonymousClass2BL) r12;
                    A0g(this.A03, r1213);
                    if (A0i() && A0k()) {
                        C18910u7 r17 = this.A03;
                        if (r17.A06 || r17.A05) {
                            Matrix matrix11 = ((AnonymousClass2AD) r1213).A00;
                            if (matrix11 != null) {
                                this.A01.concat(matrix11);
                            }
                            if (r1213.A00.length >= 2) {
                                Path A0B2 = A0B(r1213);
                                A0X(r1213);
                                EnumC18730tp r021 = this.A03.A04.A07;
                                if (r021 == null || r021 != r3) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                A0B2.setFillType(fillType);
                                A0V(r1213);
                                A0Z(r1213, ((AbstractC454024p) r1213).A00);
                                boolean A0j12 = A0j();
                                if (this.A03.A05) {
                                    A0Y(r1213, A0B2);
                                }
                                if (this.A03.A06) {
                                    A0N(A0B2);
                                }
                                A0P(r1213);
                                if (A0j12) {
                                    A0W(r1213);
                                }
                            }
                        }
                    }
                } else if (r12 instanceof AnonymousClass2CM) {
                    AnonymousClass2CM r1214 = (AnonymousClass2CM) r12;
                    A0g(this.A03, r1214);
                    if (A0i()) {
                        Matrix matrix12 = r1214.A00;
                        if (matrix12 != null) {
                            this.A01.concat(matrix12);
                        }
                        List list = ((AnonymousClass2BR) r1214).A02;
                        if (list == null || list.size() == 0) {
                            f = 0.0f;
                        } else {
                            f = ((C18700tm) ((AnonymousClass2BR) r1214).A02.get(0)).A02(this);
                        }
                        List list2 = ((AnonymousClass2BR) r1214).A03;
                        if (list2 == null || list2.size() == 0) {
                            f2 = 0.0f;
                        } else {
                            f2 = ((C18700tm) ((AnonymousClass2BR) r1214).A03.get(0)).A03(this);
                        }
                        List list3 = ((AnonymousClass2BR) r1214).A00;
                        if (list3 == null || list3.size() == 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = ((C18700tm) ((AnonymousClass2BR) r1214).A00.get(0)).A02(this);
                        }
                        List list4 = ((AnonymousClass2BR) r1214).A01;
                        if (!(list4 == null || list4.size() == 0)) {
                            f8 = ((C18700tm) ((AnonymousClass2BR) r1214).A01.get(0)).A03(this);
                        }
                        EnumC18780tu A0G = A0G();
                        if (A0G != EnumC18780tu.Start) {
                            C32001eA r022 = new C32001eA(this);
                            A0d(r1214, r022);
                            float f9 = r022.A00;
                            if (A0G == EnumC18780tu.Middle) {
                                f9 /= 2.0f;
                            }
                            f -= f9;
                        }
                        if (((AbstractC454024p) r1214).A00 == null) {
                            C31991e9 r18 = new C31991e9(this, f, f2);
                            A0d(r1214, r18);
                            RectF rectF = r18.A02;
                            ((AbstractC454024p) r1214).A00 = new C18660ti(rectF.left, rectF.top, rectF.width(), r18.A02.height());
                        }
                        A0X(r1214);
                        A0V(r1214);
                        A0Z(r1214, ((AbstractC454024p) r1214).A00);
                        boolean A0j13 = A0j();
                        A0d(r1214, new C31971e7(this, f + f3, f2 + f8));
                        if (A0j13) {
                            A0W(r1214);
                        }
                    }
                }
            }
            A0J();
        }
    }

    public final void A0b(C18850u1 r3, C18910u7 r4) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (r3 instanceof AbstractC31941e3) {
                arrayList.add(0, r3);
            }
            AbstractC18840u0 r32 = r3.A00;
            if (r32 == null) {
                break;
            }
            r3 = (C18850u1) r32;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0g(r4, (AbstractC31941e3) it.next());
        }
        C18910u7 r1 = this.A03;
        r4.A02 = r1.A02;
        r4.A03 = r1.A03;
    }

    public final void A0c(C18850u1 r10, boolean z, Path path, Matrix matrix) {
        Path A0B;
        float f;
        float f2;
        float f3;
        if (A0i()) {
            this.A01.save();
            this.A06.push(this.A03);
            C18910u7 r1 = new C18910u7(this.A03);
            this.A03 = r1;
            if (r10 instanceof AnonymousClass2BS) {
                if (z) {
                    AnonymousClass2BS r102 = (AnonymousClass2BS) r10;
                    A0g(r1, r102);
                    if (A0i() && A0k()) {
                        Matrix matrix2 = ((AnonymousClass2AE) r102).A00;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        C18850u1 A042 = ((C18850u1) r102).A01.A04(r102.A04);
                        if (A042 == null) {
                            A06("Use reference '%s' not found", r102.A04);
                        } else {
                            A0Z(r102, ((AbstractC454024p) r102).A00);
                            A0c(A042, false, path, matrix);
                        }
                    }
                } else {
                    A06("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (r10 instanceof AnonymousClass2BK) {
                AnonymousClass2BK r103 = (AnonymousClass2BK) r10;
                A0g(r1, r103);
                if (A0i() && A0k()) {
                    Matrix matrix3 = ((AnonymousClass2AD) r103).A00;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path2 = new AnonymousClass1e6(r103.A00).A02;
                    C18660ti r0 = ((AbstractC454024p) r103).A00;
                    if (r0 == null) {
                        r0 = A03(path2);
                        ((AbstractC454024p) r103).A00 = r0;
                    }
                    A0Z(r103, r0);
                    path.setFillType(A08());
                    path.addPath(path2, matrix);
                }
            } else if (r10 instanceof AnonymousClass2CM) {
                AnonymousClass2CM r104 = (AnonymousClass2CM) r10;
                A0g(r1, r104);
                if (A0i()) {
                    Matrix matrix4 = r104.A00;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = ((AnonymousClass2BR) r104).A02;
                    float f4 = 0.0f;
                    if (list == null || list.size() == 0) {
                        f = 0.0f;
                    } else {
                        f = ((C18700tm) ((AnonymousClass2BR) r104).A02.get(0)).A02(this);
                    }
                    List list2 = ((AnonymousClass2BR) r104).A03;
                    if (list2 == null || list2.size() == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = ((C18700tm) ((AnonymousClass2BR) r104).A03.get(0)).A03(this);
                    }
                    List list3 = ((AnonymousClass2BR) r104).A00;
                    if (list3 == null || list3.size() == 0) {
                        f3 = 0.0f;
                    } else {
                        f3 = ((C18700tm) ((AnonymousClass2BR) r104).A00.get(0)).A02(this);
                    }
                    List list4 = ((AnonymousClass2BR) r104).A01;
                    if (!(list4 == null || list4.size() == 0)) {
                        f4 = ((C18700tm) ((AnonymousClass2BR) r104).A01.get(0)).A03(this);
                    }
                    if (this.A03.A04.A0C != EnumC18780tu.Start) {
                        C32001eA r02 = new C32001eA(this);
                        A0d(r104, r02);
                        float f5 = r02.A00;
                        if (this.A03.A04.A0C == EnumC18780tu.Middle) {
                            f5 /= 2.0f;
                        }
                        f -= f5;
                    }
                    C18660ti r6 = ((AbstractC454024p) r104).A00;
                    if (r6 == null) {
                        C31991e9 r62 = new C31991e9(this, f, f2);
                        A0d(r104, r62);
                        RectF rectF = r62.A02;
                        r6 = new C18660ti(rectF.left, rectF.top, rectF.width(), r62.A02.height());
                        ((AbstractC454024p) r104).A00 = r6;
                    }
                    A0Z(r104, r6);
                    Path path3 = new Path();
                    A0d(r104, new C31981e8(this, f + f3, f2 + f4, path3));
                    path.setFillType(A08());
                    path.addPath(path3, matrix);
                }
            } else if (r10 instanceof AnonymousClass2AD) {
                AnonymousClass2AD r105 = (AnonymousClass2AD) r10;
                A0g(r1, r105);
                if (A0i() && A0k()) {
                    Matrix matrix5 = r105.A00;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (r105 instanceof AnonymousClass2BM) {
                        A0B = A0C((AnonymousClass2BM) r105);
                    } else if (r105 instanceof AnonymousClass2BE) {
                        A0B = A09((AnonymousClass2BE) r105);
                    } else if (r105 instanceof AnonymousClass2BH) {
                        A0B = A0A((AnonymousClass2BH) r105);
                    } else if (r105 instanceof AnonymousClass2BL) {
                        A0B = A0B((AnonymousClass2BL) r105);
                    }
                    A0Z(r105, ((AbstractC454024p) r105).A00);
                    path.setFillType(A08());
                    path.addPath(A0B, matrix);
                }
            } else {
                A06("Invalid %s element found in clipPath definition", r10.toString());
            }
            this.A01.restore();
            this.A03 = (C18910u7) this.A06.pop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        if (r0.size() <= 0) goto L_0x0149;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0d(X.AnonymousClass2AH r16, X.AbstractC18920u8 r17) {
        /*
        // Method dump skipped, instructions count: 575
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0d(X.2AH, X.0u8):void");
    }

    public final void A0e(AnonymousClass2AH r6, StringBuilder sb) {
        Iterator it = ((AnonymousClass28U) r6).A01.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C18850u1 r1 = (C18850u1) it.next();
            if (r1 instanceof AnonymousClass2AH) {
                A0e((AnonymousClass2AH) r1, sb);
            } else if (r1 instanceof C31951e4) {
                sb.append(A0I(((C31951e4) r1).A00, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r6 == X.C31901dz.A02) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r6 == X.C31901dz.A02) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0f(X.C18910u7 r14, X.C18820ty r15) {
        /*
        // Method dump skipped, instructions count: 983
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0f(X.0u7, X.0ty):void");
    }

    public final void A0g(C18910u7 r5, AbstractC31941e3 r6) {
        boolean z = false;
        if (((C18850u1) r6).A00 == null) {
            z = true;
        }
        C18820ty r3 = r5.A04;
        Boolean bool = Boolean.TRUE;
        r3.A0L = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        r3.A0M = bool;
        r3.A01 = null;
        r3.A0W = null;
        Float valueOf = Float.valueOf(1.0f);
        r3.A0P = valueOf;
        r3.A0I = C31901dz.A01;
        r3.A0R = valueOf;
        r3.A0a = null;
        r3.A0H = null;
        r3.A0Q = valueOf;
        r3.A0K = null;
        r3.A0U = valueOf;
        r3.A0F = EnumC18810tx.None;
        C18820ty r0 = r6.A00;
        if (r0 != null) {
            A0f(r5, r0);
        }
        List list = this.A02.A01.A00;
        if (list != null && !list.isEmpty()) {
            for (C18530tV r2 : this.A02.A01.A00) {
                if (C18590tb.A04(null, r2.A00, r6)) {
                    A0f(r5, r2.A02);
                }
            }
        }
        C18820ty r02 = r6.A01;
        if (r02 != null) {
            A0f(r5, r02);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r2.booleanValue() == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0116, code lost:
        if (r2.booleanValue() == false) goto L_0x0118;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0h(boolean r25, X.C18660ti r26, X.C31921e1 r27) {
        /*
        // Method dump skipped, instructions count: 899
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18930u9.A0h(boolean, X.0ti, X.1e1):void");
    }

    public final boolean A0i() {
        Boolean bool = this.A03.A04.A0L;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean A0j() {
        C18850u1 A042;
        C18820ty r2 = this.A03.A04;
        float floatValue = r2.A0P.floatValue();
        if (floatValue >= 1.0f && r2.A0a == null) {
            return false;
        }
        Canvas canvas = this.A01;
        int i = (int) (floatValue * 256.0f);
        if (i < 0) {
            i = 0;
        } else if (i > 255) {
            i = 255;
        }
        canvas.saveLayerAlpha(null, i, 31);
        this.A06.push(this.A03);
        C18910u7 r0 = new C18910u7(this.A03);
        this.A03 = r0;
        String str = r0.A04.A0a;
        if (str != null && ((A042 = this.A02.A04(str)) == null || !(A042 instanceof AnonymousClass2AF))) {
            A06("Mask reference '%s' not found", this.A03.A04.A0a);
            this.A03.A04.A0a = null;
        }
        return true;
    }

    public final boolean A0k() {
        Boolean bool = this.A03.A04.A0N;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
