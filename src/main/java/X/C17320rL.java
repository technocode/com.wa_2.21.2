package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.0rL  reason: invalid class name and case insensitive filesystem */
public final class C17320rL extends Property {
    public C17320rL() {
        super(Float.class, "translationAlpha");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return Float.valueOf(C17340rN.A04.A00((View) obj));
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        float floatValue = ((Number) obj2).floatValue();
        C17340rN.A04.A03((View) obj, floatValue);
    }
}
