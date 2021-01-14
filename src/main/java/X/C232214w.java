package X;

import java.util.Arrays;

/* renamed from: X.14w  reason: invalid class name and case insensitive filesystem */
public final class C232214w {
    public int A00;
    public final int A01;
    public final AbstractC232114v[] A02;

    public C232214w(AbstractC232114v... r2) {
        this.A02 = r2;
        this.A01 = r2.length;
    }

    public AbstractC232114v[] A00() {
        return (AbstractC232114v[]) this.A02.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C232214w.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C232214w) obj).A02);
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = 527 + Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }
}
