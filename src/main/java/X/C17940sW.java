package X;

/* renamed from: X.0sW  reason: invalid class name and case insensitive filesystem */
public class C17940sW {
    public Long A00;
    public String A01;

    public C17940sW() {
        this.A01 = "reschedule_needed";
        this.A00 = 0L;
    }

    public C17940sW(String str, long j) {
        this.A01 = str;
        this.A00 = Long.valueOf(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17940sW)) {
            return false;
        }
        C17940sW r5 = (C17940sW) obj;
        if (!this.A01.equals(r5.A01)) {
            return false;
        }
        Long l = this.A00;
        Long l2 = r5.A00;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A01.hashCode() * 31;
        Long l = this.A00;
        return hashCode + (l != null ? l.hashCode() : 0);
    }
}
