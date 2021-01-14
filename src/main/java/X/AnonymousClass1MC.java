package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializablePoint;

/* renamed from: X.1MC  reason: invalid class name */
public class AnonymousClass1MC {
    public static final AnonymousClass1MC A00 = new AnonymousClass1MC();

    public static InteractiveAnnotation A00(AnonymousClass0M3 r17, float[] fArr, float[] fArr2) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        AnonymousClass0M4 r0 = r17.A02;
        if (r0 == null || (interactiveAnnotationArr = r0.A0V) == null || interactiveAnnotationArr.length <= 0) {
            return null;
        }
        PointF pointF = new PointF(fArr2[0], fArr2[1]);
        SerializablePoint serializablePoint = new SerializablePoint((double) ((int) fArr[0]), (double) ((int) fArr[1]));
        SerializablePoint serializablePoint2 = new SerializablePoint(serializablePoint.x / ((double) pointF.x), serializablePoint.y / ((double) pointF.y));
        int i = 0;
        while (true) {
            InteractiveAnnotation[] interactiveAnnotationArr2 = r0.A0V;
            if (i >= interactiveAnnotationArr2.length) {
                return null;
            }
            InteractiveAnnotation interactiveAnnotation = interactiveAnnotationArr2[i];
            SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
            if (!(serializablePointArr == null || interactiveAnnotation.serializableLocation == null)) {
                int i2 = 0;
                boolean z = false;
                while (i2 < serializablePointArr.length) {
                    SerializablePoint serializablePoint3 = serializablePointArr[i2];
                    i2++;
                    SerializablePoint serializablePoint4 = serializablePointArr[i2 % serializablePointArr.length];
                    double d = serializablePoint3.x;
                    double d2 = serializablePoint2.x;
                    if ((d <= d2 && d2 < serializablePoint4.x) || (serializablePoint4.x <= d2 && d2 < serializablePoint3.x)) {
                        double d3 = serializablePoint2.y;
                        double d4 = serializablePoint4.y;
                        double d5 = serializablePoint3.y;
                        double d6 = serializablePoint3.x;
                        if (d3 < (((d2 - d6) * (d4 - d5)) / (serializablePoint4.x - d6)) + d5) {
                            z = !z;
                        }
                    }
                }
                if (z) {
                    return interactiveAnnotation;
                }
            }
            i++;
        }
    }

    public InteractiveAnnotation A01(ImageView imageView, AnonymousClass0M3 r9, float f, float f2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        imageView.getImageMatrix().invert(matrix);
        float[] fArr = {f - ((float) imageView.getLeft()), f2 - ((float) imageView.getTop())};
        float[] fArr2 = {(float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight()};
        matrix.mapPoints(fArr);
        return A00(r9, fArr, fArr2);
    }
}
