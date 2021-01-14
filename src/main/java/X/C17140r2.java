package X;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: X.0r2  reason: invalid class name and case insensitive filesystem */
public final class C17140r2 extends Property {
    public C17140r2() {
        super(PointF.class, "topLeft");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        C17340rN.A02(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}
