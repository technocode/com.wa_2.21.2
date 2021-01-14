package X;

import android.graphics.Paint;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.2Nc  reason: invalid class name and case insensitive filesystem */
public class C48642Nc extends Paint {
    public final float A00;
    public final float A01;

    public C48642Nc(Paint paint, int i) {
        super(paint);
        float textSize;
        Number number;
        this.A00 = C667535u.A00(paint);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29) {
            textSize = paint.getUnderlineThickness();
        } else {
            Method method = C667535u.A01;
            if (method == null || (number = (Number) C667535u.A01(method, paint, Float.class, new Object[0])) == null) {
                textSize = paint.getTextSize() / 18.0f;
            } else {
                textSize = number.floatValue();
            }
        }
        this.A01 = textSize;
        setColor(i);
        setStrokeWidth(this.A01);
        int i2 = Build.VERSION.SDK_INT;
        setAntiAlias((i2 <= 23 || i2 >= 27) ? true : z);
    }

    public float getUnderlinePosition() {
        return this.A00;
    }

    public float getUnderlineThickness() {
        return this.A01;
    }
}
