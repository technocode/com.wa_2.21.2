package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: X.0VX  reason: invalid class name */
public class AnonymousClass0VX extends Property {
    public float A00;
    public final float A01;
    public final PathMeasure A02;
    public final PointF A03 = new PointF();
    public final Property A04;
    public final float[] A05 = new float[2];

    public AnonymousClass0VX(Property property, Path path) {
        super(Float.class, property.getName());
        this.A04 = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.A02 = pathMeasure;
        this.A01 = pathMeasure.getLength();
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return Float.valueOf(this.A00);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        float floatValue = ((Number) obj2).floatValue();
        this.A00 = floatValue;
        float[] fArr = this.A05;
        this.A02.getPosTan(floatValue * this.A01, fArr, null);
        PointF pointF = this.A03;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.A04.set(obj, pointF);
    }
}
