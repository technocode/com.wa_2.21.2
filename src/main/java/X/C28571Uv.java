package X;

/* renamed from: X.1Uv  reason: invalid class name and case insensitive filesystem */
public class C28571Uv implements Comparable {
    public int A00;
    public long A01;

    public C28571Uv() {
    }

    public C28571Uv(C28561Uu r1) {
    }

    /* renamed from: A00 */
    public int compareTo(C28571Uv r8) {
        if (r8 == this) {
            return 0;
        }
        long j = (long) (this.A00 - r8.A00);
        if (j == 0) {
            j = this.A01 - r8.A01;
        }
        if (j < 0) {
            return -1;
        }
        if (j > 0) {
            return 1;
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A01);
        return sb.toString();
    }
}
