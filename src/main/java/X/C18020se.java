package X;

import java.util.List;

/* renamed from: X.0se  reason: invalid class name and case insensitive filesystem */
public class C18020se {
    public int A00;
    public C17550rj A01;
    public AnonymousClass0VU A02;
    public String A03;
    public List A04;
    public List A05;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18020se)) {
            return false;
        }
        C18020se r5 = (C18020se) obj;
        if (this.A00 != r5.A00) {
            return false;
        }
        String str = this.A03;
        if (str != null) {
            if (!str.equals(r5.A03)) {
                return false;
            }
        } else if (r5.A03 != null) {
            return false;
        }
        if (this.A02 != r5.A02) {
            return false;
        }
        C17550rj r1 = this.A01;
        if (r1 != null) {
            if (!r1.equals(r5.A01)) {
                return false;
            }
        } else if (r5.A01 != null) {
            return false;
        }
        List list = this.A05;
        if (list != null) {
            if (!list.equals(r5.A05)) {
                return false;
            }
        } else if (r5.A05 != null) {
            return false;
        }
        List list2 = this.A04;
        List list3 = r5.A04;
        if (list2 != null) {
            return list2.equals(list3);
        }
        if (list3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.A03;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        AnonymousClass0VU r0 = this.A02;
        if (r0 != null) {
            i2 = r0.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        C17550rj r02 = this.A01;
        if (r02 != null) {
            i3 = r02.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (((i7 + i3) * 31) + this.A00) * 31;
        List list = this.A05;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        List list2 = this.A04;
        if (list2 != null) {
            i5 = list2.hashCode();
        }
        return i9 + i5;
    }
}
