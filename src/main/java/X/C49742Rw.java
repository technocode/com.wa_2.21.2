package X;

/* renamed from: X.2Rw  reason: invalid class name and case insensitive filesystem */
public class C49742Rw {
    public int A00;
    public String A01;
    public String A02;
    public String A03;

    public C49742Rw(String str, String str2, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = null;
    }

    public C49742Rw(String str, String str2, int i, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C49742Rw.class != obj.getClass()) {
            return false;
        }
        C49742Rw r5 = (C49742Rw) obj;
        String str = this.A01;
        if (str == null) {
            if (r5.A01 != null) {
                return false;
            }
        } else if (!str.equals(r5.A01)) {
            return false;
        }
        String str2 = this.A02;
        if (str2 == null) {
            if (r5.A02 != null) {
                return false;
            }
        } else if (!str2.equals(r5.A02)) {
            return false;
        }
        if (this.A00 != r5.A00) {
            return false;
        }
        String str3 = this.A03;
        String str4 = r5.A03;
        if (str3 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str3.equals(str4)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A01;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        String str2 = this.A02;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (((i2 + hashCode2) * 31) + this.A00) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i3 + i;
    }
}
