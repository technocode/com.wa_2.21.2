package X;

/* renamed from: X.0Ag  reason: invalid class name and case insensitive filesystem */
public class C02000Ag {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final String A03;

    public C02000Ag(String str, String str2, boolean z) {
        this.A03 = str;
        this.A00 = str2;
        this.A01 = z;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A03);
        sb.append("=");
        if (this.A02) {
            str = "skipped";
        } else {
            str = this.A00;
        }
        sb.append(str);
        return sb.toString();
    }
}
