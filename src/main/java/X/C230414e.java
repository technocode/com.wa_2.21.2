package X;

import java.util.regex.Pattern;

/* renamed from: X.14e  reason: invalid class name and case insensitive filesystem */
public final class C230414e {
    public static final Pattern A02 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public final C233815n A00 = new C233815n();
    public final StringBuilder A01 = new StringBuilder();

    public static String A00(C233815n r6, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = r6.A01;
        int i2 = r6.A00;
        while (i < i2 && !z) {
            char c = (char) r6.A02[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        r6.A0C(i - i);
        return sb.toString();
    }

    public static String A01(C233815n r3, StringBuilder sb) {
        A02(r3);
        if (r3.A00 - r3.A01 == 0) {
            return null;
        }
        String A002 = A00(r3, sb);
        if (!"".equals(A002)) {
            return A002;
        }
        StringBuilder A0S = AnonymousClass008.A0S("");
        A0S.append((char) r3.A01());
        return A0S.toString();
    }

    public static void A02(C233815n r9) {
        while (true) {
            boolean z = true;
            while (true) {
                int i = r9.A00;
                int i2 = r9.A01;
                if (i - i2 > 0 && z) {
                    byte[] bArr = r9.A02;
                    byte b = bArr[i2];
                    char c = (char) b;
                    if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                        r9.A0C(1);
                    } else {
                        if (i2 + 2 <= i) {
                            int i3 = i2 + 1;
                            if (b == 47) {
                                int i4 = i3 + 1;
                                if (bArr[i3] == 42) {
                                    while (true) {
                                        int i5 = i4 + 1;
                                        if (i5 >= i) {
                                            break;
                                        } else if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                            i = i5 + 1;
                                            i4 = i;
                                        } else {
                                            i4 = i5;
                                        }
                                    }
                                    r9.A0C(i - i2);
                                }
                            } else {
                                continue;
                            }
                        }
                        z = false;
                    }
                } else {
                    return;
                }
            }
            r9.A0C(1);
        }
    }
}
