package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0Vi  reason: invalid class name and case insensitive filesystem */
public class animation.InterpolatorC06950Vi implements Interpolator {
    public float[] A00;
    public float[] A01;

    public animation.InterpolatorC06950Vi(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        String string;
        TypedArray A0T = AnonymousClass0N2.A0T(context.getResources(), context.getTheme(), attributeSet, AnonymousClass0VE.A05);
        if (AnonymousClass0N2.A1m(xmlPullParser, "pathData")) {
            if (!AnonymousClass0N2.A1m(xmlPullParser, "pathData")) {
                string = null;
            } else {
                string = A0T.getString(4);
            }
            Path A0U = AnonymousClass0N2.A0U(string);
            if (A0U != null) {
                A00(A0U);
            } else {
                throw new InflateException(AnonymousClass008.A0K("The path is null, which is created from ", string));
            }
        } else if (!AnonymousClass0N2.A1m(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (AnonymousClass0N2.A1m(xmlPullParser, "controlY1")) {
            float A012 = AnonymousClass0N2.A01(A0T, xmlPullParser, "controlX1", 0, 0.0f);
            float A013 = AnonymousClass0N2.A01(A0T, xmlPullParser, "controlY1", 1, 0.0f);
            boolean A1m = AnonymousClass0N2.A1m(xmlPullParser, "controlX2");
            if (A1m != AnonymousClass0N2.A1m(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!A1m) {
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.quadTo(A012, A013, 1.0f, 1.0f);
                A00(path);
            } else {
                float A014 = AnonymousClass0N2.A01(A0T, xmlPullParser, "controlX2", 2, 0.0f);
                float A015 = AnonymousClass0N2.A01(A0T, xmlPullParser, "controlY2", 3, 0.0f);
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(A012, A013, A014, A015, 1.0f, 1.0f);
                A00(path2);
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        A0T.recycle();
    }

    public final void A00(Path path) {
        int i;
        float[] fArr;
        float[] fArr2;
        int i2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.A00 = new float[min];
            this.A01 = new float[min];
            float[] fArr3 = new float[2];
            int i3 = 0;
            do {
                i = min - 1;
                pathMeasure.getPosTan((((float) i3) * length) / ((float) i), fArr3, null);
                fArr = this.A00;
                fArr[i3] = fArr3[0];
                fArr2 = this.A01;
                fArr2[i3] = fArr3[1];
                i3++;
            } while (i3 < min);
            float f = fArr[0];
            if (((double) Math.abs(f)) > 1.0E-5d || ((double) Math.abs(fArr2[0])) > 1.0E-5d || ((double) Math.abs(fArr[i] - 1.0f)) > 1.0E-5d || ((double) Math.abs(fArr2[i] - 1.0f)) > 1.0E-5d) {
                StringBuilder A0S = AnonymousClass008.A0S("The Path must start at (0,0) and end at (1,1) start: ");
                A0S.append(f);
                A0S.append(",");
                A0S.append(this.A01[0]);
                A0S.append(" end:");
                int i4 = min - 1;
                A0S.append(this.A00[i4]);
                A0S.append(",");
                A0S.append(this.A01[i4]);
                throw new IllegalArgumentException(A0S.toString());
            }
            float f2 = 0.0f;
            int i5 = 0;
            do {
                int i6 = i5 + 1;
                float f3 = fArr[i5];
                if (f3 >= f2) {
                    fArr[i2] = f3;
                    i2++;
                    f2 = f3;
                    i5 = i6;
                } else {
                    StringBuilder sb = new StringBuilder("The Path cannot loop back on itself, x :");
                    sb.append(f3);
                    throw new IllegalArgumentException(sb.toString());
                }
            } while (i2 < min);
            if (pathMeasure.nextContour()) {
                throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("The Path has a invalid length ");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        float[] fArr = this.A00;
        int length = fArr.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) >> 1;
            if (f < fArr[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float f2 = fArr[length];
        float f3 = fArr[i];
        float f4 = f2 - f3;
        if (f4 == 0.0f) {
            return this.A01[i];
        }
        float[] fArr2 = this.A01;
        float f5 = fArr2[i];
        return ((fArr2[length] - f5) * ((f - f3) / f4)) + f5;
    }
}
