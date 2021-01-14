package X;

/* renamed from: X.1NJ  reason: invalid class name */
public class AnonymousClass1NJ {
    public AnonymousClass02N A00;
    public AnonymousClass02N A01;

    public AnonymousClass1NJ(AnonymousClass02N r1, AnonymousClass02N r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AnonymousClass1NJ)) {
            return false;
        }
        AnonymousClass1NJ r5 = (AnonymousClass1NJ) obj;
        AnonymousClass02N r1 = this.A00;
        if (r1 == null) {
            if (r5.A00 != null) {
                return false;
            }
        } else if (!r1.equals(r5.A00)) {
            return false;
        }
        AnonymousClass02N r12 = this.A01;
        AnonymousClass02N r0 = r5.A01;
        if (r12 == null) {
            if (r0 != null) {
                return false;
            }
        } else if (!r12.equals(r0)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        AnonymousClass02N r0 = this.A00;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        AnonymousClass02N r02 = this.A01;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return i2 + i;
    }
}
