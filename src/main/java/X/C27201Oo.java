package X;

/* renamed from: X.1Oo  reason: invalid class name and case insensitive filesystem */
public class C27201Oo {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C27201Oo.class != obj.getClass()) {
            return false;
        }
        String str = this.A05;
        String str2 = ((C27201Oo) obj).A05;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }
}
