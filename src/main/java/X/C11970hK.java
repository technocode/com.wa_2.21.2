package X;

import java.lang.reflect.Method;

/* renamed from: X.0hK  reason: invalid class name and case insensitive filesystem */
public class C11970hK {
    public final int A00;
    public final Method A01;

    public C11970hK(int i, Method method) {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11970hK.class != obj.getClass()) {
            return false;
        }
        C11970hK r5 = (C11970hK) obj;
        if (this.A00 != r5.A00 || !this.A01.getName().equals(r5.A01.getName())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.getName().hashCode() + (this.A00 * 31);
    }
}
