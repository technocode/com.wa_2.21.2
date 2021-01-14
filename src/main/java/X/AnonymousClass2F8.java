package X;

import java.util.Arrays;

/* renamed from: X.2F8  reason: invalid class name */
public class AnonymousClass2F8 {
    public final AnonymousClass0QZ A00;
    public final AnonymousClass1VI A01;

    public AnonymousClass2F8(AnonymousClass1VI r1, AnonymousClass0QZ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (obj == null || AnonymousClass2F8.class != obj.getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        AnonymousClass2F8 r4 = (AnonymousClass2F8) obj;
        if (!r4.A01.equals(this.A01) || !r4.A00.equals(this.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }
}
