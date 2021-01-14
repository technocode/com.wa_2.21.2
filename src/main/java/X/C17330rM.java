package X;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: X.0rM  reason: invalid class name and case insensitive filesystem */
public final class C17330rM extends Property {
    public C17330rM() {
        super(Rect.class, "clipBounds");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return AnonymousClass0Q7.A0A((View) obj);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        AnonymousClass0Q7.A0c((View) obj, (Rect) obj2);
    }
}
