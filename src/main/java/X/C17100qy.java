package X;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: X.0qy  reason: invalid class name and case insensitive filesystem */
public final class C17100qy extends Property {
    public Rect A00 = new Rect();

    public C17100qy() {
        super(PointF.class, "boundsOrigin");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.A00);
        Rect rect = this.A00;
        return new PointF((float) rect.left, (float) rect.top);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.A00);
        this.A00.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.A00);
    }
}
