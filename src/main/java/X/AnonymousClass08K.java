package X;

import java.util.LinkedHashMap;

/* renamed from: X.08K  reason: invalid class name */
public class AnonymousClass08K extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        return new LinkedHashMap(16, 0.75f, true);
    }
}
