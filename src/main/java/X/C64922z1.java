package X;

/* renamed from: X.2z1  reason: invalid class name and case insensitive filesystem */
public class C64922z1 implements Comparable {
    public final long A00;
    public final String A01;

    public C64922z1(String str, long j) {
        this.A00 = j;
        this.A01 = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C64922z1 r6 = (C64922z1) obj;
        long j = this.A00;
        long j2 = r6.A00;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        return this.A01.compareTo(r6.A01);
    }
}
