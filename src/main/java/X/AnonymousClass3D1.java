package X;

/* renamed from: X.3D1  reason: invalid class name */
public class AnonymousClass3D1 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public static String A00(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (true) {
            int length = str.length();
            if (i >= length) {
                return stringBuffer.toString();
            }
            char charAt = str.charAt(i);
            if (charAt != '\\' || i >= length - 3) {
                stringBuffer.append(charAt);
            } else if (str.charAt(i + 1) == 'r' && str.charAt(i + 2) == '\\') {
                int i2 = i + 3;
                if (str.charAt(i2) == 'n') {
                    stringBuffer.append('\n');
                    i = i2;
                }
            }
            i++;
        }
    }

    public String A01() {
        StringBuilder sb = new StringBuilder();
        String str = this.A03;
        if (str != null) {
            sb.append(str);
        }
        sb.append(";");
        String str2 = this.A00;
        if (str2 != null) {
            sb.append(str2);
        }
        sb.append(";");
        String str3 = this.A02;
        if (str3 != null) {
            sb.append(str3);
        }
        sb.append(";");
        String str4 = this.A04;
        if (str4 != null) {
            sb.append(str4);
        }
        sb.append(";");
        String str5 = this.A01;
        if (str5 != null) {
            sb.append(str5);
        }
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(this.A03));
        sb.append(" ");
        sb.append(this.A00);
        sb.append(" ");
        sb.append(this.A02);
        sb.append(" ");
        sb.append(this.A04);
        sb.append(" ");
        sb.append(this.A01);
        return sb.toString();
    }
}
