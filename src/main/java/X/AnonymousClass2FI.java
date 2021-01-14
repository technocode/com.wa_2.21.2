package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2FI  reason: invalid class name */
public class AnonymousClass2FI {
    public final C05350Oe A00;
    public final AnonymousClass0M5 A01;
    public final String A02;
    public final Map A03;
    public final Map A04;

    public AnonymousClass2FI(String str, Set set, AnonymousClass0M5 r6, Map map, Map map2) {
        this.A02 = str;
        this.A01 = r6;
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        this.A00 = new C05350Oe(hashSet, null);
        this.A04 = map;
        this.A03 = map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass2FI)) {
            return false;
        }
        AnonymousClass2FI r4 = (AnonymousClass2FI) obj;
        if (!this.A02.equals(r4.A02) || !this.A00.equals(r4.A00) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A02.hashCode() ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }
}
