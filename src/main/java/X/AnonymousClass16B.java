package X;

/* renamed from: X.16B  reason: invalid class name */
public final class AnonymousClass16B {
    public final String A00;
    public final boolean A01;

    public AnonymousClass16B(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }

    public final String toString() {
        String str = this.A00;
        boolean z = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
        sb.append("{");
        sb.append(str);
        sb.append("}");
        sb.append(z);
        return sb.toString();
    }
}
