package X;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: X.0r3  reason: invalid class name and case insensitive filesystem */
public final class C17150r3 extends Property {
    public C17150r3() {
        super(PointF.class, "position");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int round = Math.round(pointF.x);
        int round2 = Math.round(pointF.y);
        C17340rN.A02(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
