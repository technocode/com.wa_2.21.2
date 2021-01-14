package X;

/* renamed from: X.1UH  reason: invalid class name */
public class AnonymousClass1UH {
    public final String A00;
    public final String A01;

    public AnonymousClass1UH(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public String A00() {
        String str = this.A00;
        String str2 = this.A01;
        if (str.compareTo(str2) <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        return sb2.toString();
    }
}
