package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Mx  reason: invalid class name and case insensitive filesystem */
public class C48592Mx {
    public final AnonymousClass2N4 A00 = new AnonymousClass2N4();
    public final List A01;
    public final List A02;

    public C48592Mx() {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A02 = Collections.unmodifiableList(arrayList);
    }

    public AbstractC48582Mw A00(PointF pointF) {
        boolean z;
        boolean z2;
        List list = this.A01;
        for (int size = list.size() - 1; size >= 0; size--) {
            AbstractC48582Mw r4 = (AbstractC48582Mw) list.get(size);
            if (!(r4 instanceof C53182cf)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                float f = pointF.x;
                float f2 = pointF.y;
                if (r4 instanceof C53202ch) {
                    RectF rectF = r4.A04;
                    z2 = false;
                    if (rectF.contains(f, f2)) {
                        float centerX = f - rectF.centerX();
                        float centerY = f2 - rectF.centerY();
                        float width = rectF.width() / 2.0f;
                        float height = rectF.height() / 2.0f;
                        if (((centerY * centerY) / (height * height)) + ((centerX * centerX) / (width * width)) <= 1.0f) {
                            z2 = true;
                        }
                    }
                } else if (!(r4 instanceof AnonymousClass2cZ)) {
                    RectF rectF2 = r4.A04;
                    float centerX2 = rectF2.centerX();
                    float centerY2 = rectF2.centerY();
                    Matrix matrix = new Matrix();
                    float[] fArr = {f, f2};
                    matrix.setRotate(-r4.A00, centerX2, centerY2);
                    matrix.mapPoints(fArr);
                    z2 = rectF2.contains(fArr[0], fArr[1]);
                } else {
                    RectF rectF3 = r4.A04;
                    float centerX3 = rectF3.centerX();
                    float centerY3 = rectF3.centerY();
                    Matrix matrix2 = new Matrix();
                    float[] fArr2 = {f, f2};
                    matrix2.setRotate(-r4.A00, centerX3, centerY3);
                    matrix2.mapPoints(fArr2);
                    z2 = false;
                    float f3 = fArr2[0];
                    float f4 = fArr2[1];
                    if (rectF3.contains(f3, f4)) {
                        float f5 = rectF3.left;
                        float f6 = rectF3.bottom;
                        float f7 = rectF3.right;
                        float f8 = rectF3.top;
                        float f9 = f8 - f6;
                        float f10 = f7 - f5;
                        if (((double) Math.abs(((f7 * f6) + ((f3 * f9) - (f4 * f10))) - (f8 * f5))) / Math.sqrt((double) ((f10 * f10) + (f9 * f9))) < ((double) AbstractC48582Mw.A08)) {
                            z2 = true;
                        }
                    }
                }
                if (z2) {
                    return r4;
                }
            }
        }
        return null;
    }

    public boolean A01() {
        boolean z;
        for (AbstractC48582Mw r1 : this.A01) {
            if (r1 instanceof C59452nh) {
                z = true;
                continue;
            } else if (!(r1 instanceof C60482pY)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
