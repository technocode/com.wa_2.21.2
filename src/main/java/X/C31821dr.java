package X;

/* renamed from: X.1dr  reason: invalid class name and case insensitive filesystem */
public class C31821dr extends C19010uH {
    public static final int A01(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        int i2 = 65;
        if (i < 65 || i > 70) {
            i2 = 97;
            if (i < 97 || i > 102) {
                return -1;
            }
        }
        return (i - i2) + 10;
    }

    public C31821dr(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public String A0G() {
        if (A0C()) {
            return null;
        }
        char charAt = this.A03.charAt(this.A01);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.A01++;
        int intValue = A08().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = A08().intValue();
                if (intValue == -1) {
                    break;
                } else if (intValue == 10 || intValue == 13 || intValue == 12) {
                    intValue = A08().intValue();
                } else {
                    int A01 = A01(intValue);
                    if (A01 != -1) {
                        int i = 1;
                        do {
                            intValue = A08().intValue();
                            int A012 = A01(intValue);
                            if (A012 == -1) {
                                break;
                            }
                            A01 = (A01 << 4) + A012;
                            i++;
                        } while (i <= 5);
                        sb.append((char) A01);
                    }
                }
            }
            sb.append((char) intValue);
            intValue = A08().intValue();
        }
        return sb.toString();
    }

    public String A0H() {
        int i;
        int i2;
        if (A0C()) {
            i2 = this.A01;
            i = i2;
        } else {
            i = this.A01;
            int charAt = this.A03.charAt(i);
            if (charAt == 45) {
                charAt = A04();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i2 = i;
            } else {
                int A04 = A04();
                while (true) {
                    if ((A04 < 65 || A04 > 90) && ((A04 < 97 || A04 > 122) && !((A04 >= 48 && A04 <= 57) || A04 == 45 || A04 == 95))) {
                        break;
                    }
                    A04 = A04();
                }
                i2 = this.A01;
            }
            this.A01 = i;
        }
        if (i2 == i) {
            return null;
        }
        String substring = this.A03.substring(i, i2);
        this.A01 = i2;
        return substring;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:263:0x004a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:255:0x0394 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:262:0x004a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0tR] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0tN, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r7v34, types: [X.0tZ] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.0tR] */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.0tR] */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x027a, code lost:
        if (r11 == X.EnumC18520tU.nth_of_type) goto L_0x027c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0286, code lost:
        if (r11 == X.EnumC18520tU.nth_last_of_type) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02ea, code lost:
        if (A0E('-') == false) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0339, code lost:
        if (r2 == false) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03e5, code lost:
        throw new X.C18440tM("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03fa, code lost:
        throw new X.C18440tM(X.AnonymousClass008.A0K("Invalid or missing parameter section for pseudo class: ", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0405, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0407, code lost:
        if (r0 == null) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x040d, code lost:
        if (r0.isEmpty() != false) goto L_0x0412;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x040f, code lost:
        r6.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0412, code lost:
        return r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03da A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0403 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0I() {
        /*
        // Method dump skipped, instructions count: 1096
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31821dr.A0I():java.util.List");
    }
}
