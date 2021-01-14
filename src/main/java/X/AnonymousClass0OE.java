package X;

/* renamed from: X.0OE  reason: invalid class name */
public class AnonymousClass0OE {
    public final AnonymousClass0E6 A00;
    public final String A01;

    public AnonymousClass0OE(String str, AnonymousClass0E6 r2) {
        this.A01 = str;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof AnonymousClass0OE)) {
            return false;
        }
        AnonymousClass0OE r4 = (AnonymousClass0OE) obj;
        if (!this.A01.equals(r4.A01) || !this.A00.equals(r4.A00)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.A01.hashCode() ^ this.A00.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OE.toString():java.lang.String");
    }
}
