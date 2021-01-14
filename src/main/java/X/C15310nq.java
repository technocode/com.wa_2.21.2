package X;

/* renamed from: X.0nq  reason: invalid class name and case insensitive filesystem */
public class C15310nq {
    public final long A00;
    public final long A01;

    public C15310nq(long j, long j2) {
        if (j2 == 0) {
            this.A00 = 1;
            return;
        }
        this.A01 = j;
        this.A00 = j2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append("/");
        sb.append(this.A00);
        return sb.toString();
    }
}
