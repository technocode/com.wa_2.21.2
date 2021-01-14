package X;

/* renamed from: X.2Jm  reason: invalid class name and case insensitive filesystem */
public class C47772Jm {
    public final C47782Jn A00;
    public final C47782Jn A01;
    public final boolean A02;

    public C47772Jm(String str, boolean z) {
        this.A02 = z;
        int indexOf = str.indexOf(59);
        if (indexOf == -1) {
            C47782Jn r0 = new C47782Jn(str, z);
            this.A00 = r0;
            this.A01 = r0;
            return;
        }
        this.A01 = new C47782Jn(str.substring(0, indexOf), z);
        this.A00 = new C47782Jn(str.substring(indexOf + 1), z);
    }

    public String A00() {
        String str = this.A01.A00;
        String str2 = this.A00.A00;
        if (str.equals(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(";");
        sb.append(str2);
        return sb.toString();
    }
}
