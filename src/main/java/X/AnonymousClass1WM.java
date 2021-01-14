package X;

import java.util.List;

/* renamed from: X.1WM  reason: invalid class name */
public class AnonymousClass1WM {
    public final String A00;
    public final String A01;
    public final List A02;

    public AnonymousClass1WM(String str, String str2, List list) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass1WM.class != obj.getClass()) {
            return false;
        }
        AnonymousClass1WM r5 = (AnonymousClass1WM) obj;
        if (!this.A01.equals(r5.A01) || !this.A00.equals(r5.A00)) {
            return false;
        }
        List list = this.A02;
        List list2 = r5.A02;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (this.A00.hashCode() + (this.A01.hashCode() * 31)) * 31;
        List list = this.A02;
        return hashCode + (list != null ? list.hashCode() : 0);
    }
}
