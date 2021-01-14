package X;

/* renamed from: X.0qZ  reason: invalid class name and case insensitive filesystem */
public class C16860qZ implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public C16860qZ(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C16860qZ r3 = (C16860qZ) obj;
        int i = this.A00 - r3.A00;
        return i == 0 ? this.A01 - r3.A01 : i;
    }
}
