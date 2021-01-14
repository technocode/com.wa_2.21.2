package X;

import java.util.HashMap;

/* renamed from: X.2NJ  reason: invalid class name */
public class AnonymousClass2NJ {
    public final AnonymousClass2NI A00;
    public final HashMap A01;

    public AnonymousClass2NJ(AnonymousClass2NI r1, HashMap hashMap) {
        this.A00 = r1;
        this.A01 = hashMap;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass2NJ)) {
            return false;
        }
        AnonymousClass2NJ r4 = (AnonymousClass2NJ) obj;
        if (!this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() + ((this.A00.hashCode() + 159) * 53);
    }
}
