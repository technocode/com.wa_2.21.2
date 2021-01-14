package X;

import java.util.Arrays;

/* renamed from: X.2OM  reason: invalid class name */
public class AnonymousClass2OM implements Comparable {
    public final Class A00;
    public final Object A01;

    public AnonymousClass2OM(Object obj, Class cls) {
        if (cls != Boolean.class && cls != String.class && cls != Integer.class && cls != Float.class) {
            throw new IllegalArgumentException("Invalid type: must be one of {Boolean, Integer, Float, String}");
        } else if (cls.isInstance(obj)) {
            this.A01 = obj;
            this.A00 = cls;
        } else {
            throw new IllegalArgumentException("Mismatched args: value is not an instance of type");
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof AnonymousClass2OM) {
            AnonymousClass2OM r5 = (AnonymousClass2OM) obj;
            Object obj2 = r5.A01;
            Class cls = r5.A00;
            Class cls2 = this.A00;
            if (!cls2.equals(cls)) {
                throw new IllegalArgumentException("compareTo objects have mismatched types");
            } else if (cls2 == Boolean.class) {
                throw new IllegalArgumentException("compareTo should not be called on boolean types");
            } else if (cls2 == String.class) {
                return ((String) this.A01).compareTo((String) obj2);
            } else {
                if (cls2 == Integer.class) {
                    int intValue = ((Number) this.A01).intValue();
                    int intValue2 = ((Number) obj2).intValue();
                    if (intValue == intValue2) {
                        return 0;
                    }
                    return intValue < intValue2 ? -1 : 1;
                } else if (cls2 == Float.class) {
                    return Float.compare(((Number) this.A01).floatValue(), ((Number) obj2).floatValue());
                } else {
                    throw new IllegalStateException("Invalid type: must be one of {Boolean, Integer, Float, String}");
                }
            }
        } else {
            throw new IllegalArgumentException("compareTo o should be an instance of ConfigPrimitive");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnonymousClass2OM) {
            AnonymousClass2OM r4 = (AnonymousClass2OM) obj;
            return this.A00.equals(r4.A00) && this.A01.equals(r4.A01);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public String toString() {
        return this.A01.toString();
    }
}
