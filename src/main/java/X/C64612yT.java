package X;

/* renamed from: X.2yT  reason: invalid class name and case insensitive filesystem */
public class C64612yT {
    public int A00;
    public long A01;
    public String A02;
    public boolean A03;

    public C64612yT(String str, boolean z, int i, long j) {
        if (str == null || !(i == 1 || i == 2 || i == 3 || i == 4)) {
            throw new IllegalArgumentException("invalid web status");
        }
        this.A02 = str;
        this.A00 = i;
        this.A01 = j;
        this.A03 = z;
    }
}
