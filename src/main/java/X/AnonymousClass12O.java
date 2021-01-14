package X;

/* renamed from: X.12O  reason: invalid class name */
public final class AnonymousClass12O {
    public static final AnonymousClass12O A02;
    public static final AnonymousClass12O A03;
    public final long A00;
    public final long A01;

    static {
        AnonymousClass12O r0 = new AnonymousClass12O(0, 0);
        A03 = r0;
        A02 = r0;
    }

    public AnonymousClass12O(long j, long j2) {
        boolean z = true;
        C002001d.A39(j >= 0);
        C002001d.A39(j2 < 0 ? false : z);
        this.A01 = j;
        this.A00 = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass12O.class != obj.getClass()) {
            return false;
        }
        AnonymousClass12O r7 = (AnonymousClass12O) obj;
        if (this.A01 == r7.A01 && this.A00 == r7.A00) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
