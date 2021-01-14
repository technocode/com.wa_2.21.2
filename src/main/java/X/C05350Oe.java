package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0Oe  reason: invalid class name and case insensitive filesystem */
public final class C05350Oe implements Iterable {
    public static final C05350Oe A01 = new C05350Oe(Collections.emptySet());
    public final Set A00;

    public C05350Oe(Set set) {
        this.A00 = set;
    }

    public C05350Oe(Set set, C28341Ty r2) {
        this.A00 = set;
    }

    public static C05350Oe A00(Object obj) {
        HashSet hashSet = new HashSet();
        hashSet.add(obj);
        return new C05350Oe(hashSet, null);
    }

    public static C05350Oe A01(Collection collection) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        return new C05350Oe(hashSet, null);
    }

    public HashSet A02() {
        return new HashSet(this.A00);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C05350Oe.class != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C05350Oe) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C28351Tz(this.A00.iterator());
    }

    public String toString() {
        C28351Tz r2 = (C28351Tz) iterator();
        if (!r2.hasNext()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        while (true) {
            Object next = r2.next();
            if (next == this) {
                next = "(this Collection)";
            }
            sb.append(next);
            if (!r2.hasNext()) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
        }
    }
}
