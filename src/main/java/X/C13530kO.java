package X;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.0kO  reason: invalid class name and case insensitive filesystem */
public final class C13530kO extends Property {
    public C13530kO() {
        super(Float.class, "thumbPos");
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).A00);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).setThumbPosition(((Number) obj2).floatValue());
    }
}
