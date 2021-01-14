package X;

/* renamed from: X.121  reason: invalid class name */
public final class AnonymousClass121 implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final AnonymousClass12K A03;

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        AnonymousClass121 r6 = (AnonymousClass121) obj;
        Object obj2 = this.A02;
        boolean z = false;
        if (obj2 == null) {
            z = true;
        }
        boolean z2 = false;
        if (r6.A02 == null) {
            z2 = true;
        }
        if (z != z2) {
            return obj2 != null ? -1 : 1;
        }
        if (obj2 == null) {
            return 0;
        }
        int i = this.A00 - r6.A00;
        if (i != 0) {
            return i;
        }
        long j = this.A01;
        long j2 = r6.A01;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
