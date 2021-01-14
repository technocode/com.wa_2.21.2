package X;

/* renamed from: X.03N  reason: invalid class name */
public final class AnonymousClass03N {
    public final Object A00;

    public AnonymousClass03N(Object obj) {
        double d;
        if (obj != null) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    d = 1.0d;
                } else {
                    d = 0.0d;
                }
                obj = Double.valueOf(d);
            } else if (obj instanceof Number) {
                obj = Double.valueOf(((Number) obj).doubleValue());
            } else if (!(obj instanceof String)) {
                throw new IllegalArgumentException("Attribute type must be Boolean, Number, or String");
            }
            this.A00 = obj;
        }
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass03N.class != obj.getClass()) {
            return false;
        }
        AnonymousClass03N r5 = (AnonymousClass03N) obj;
        Object obj3 = this.A00;
        if (obj3 == null || (obj2 = r5.A00) == null) {
            if (obj3 != r5.A00) {
                return false;
            }
            return true;
        } else if (obj3 == obj2 || obj3.equals(obj2)) {
            return true;
        } else {
            return false;
        }
    }
}
