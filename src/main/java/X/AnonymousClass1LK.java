package X;

/* renamed from: X.1LK  reason: invalid class name */
public final class AnonymousClass1LK {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AnonymousClass1LK(String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A04 = str2;
        if (str3 != null) {
            this.A00 = str3;
            if (str4 != null) {
                this.A03 = str4;
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str4.length(); i++) {
                    sb.appendCodePoint((str4.charAt(i) + 61926) - 65);
                }
                this.A02 = sb.toString();
                return;
            }
            throw null;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" ");
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A04);
        sb.append(" ");
        sb.append(this.A02);
        return sb.toString();
    }
}
