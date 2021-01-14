package X;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: X.0r1  reason: invalid class name and case insensitive filesystem */
public final class C17130r1 extends Property {
    public C17130r1() {
        super(PointF.class, "bottomRight");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        C17340rN.A02(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
    }
}
