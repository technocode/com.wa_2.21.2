package X;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.0OZ  reason: invalid class name */
public abstract class AnonymousClass0OZ {
    public static final Pattern A00 = Pattern.compile("à\\(s\\)");
    public static final Pattern A01 = Pattern.compile("la\\(s\\)");

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r1 == 3) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.AnonymousClass01X r4, long r5) {
        /*
            java.util.Locale r0 = r4.A0I()
            java.util.Calendar r3 = java.util.Calendar.getInstance(r0)
            r3.setTimeInMillis(r5)
            X.0Nz r0 = r4.A02()
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x001e
            r2 = 224(0xe0, float:3.14E-43)
        L_0x0015:
            java.lang.String r0 = r4.A05(r2)
            java.lang.String r0 = A02(r4, r0, r3)
            return r0
        L_0x001e:
            java.util.Locale r0 = r4.A0I()
            int r1 = X.AbstractC002201f.A00(r0)
            r0 = 2
            if (r1 == r0) goto L_0x002e
            r0 = 3
            r2 = 223(0xdf, float:3.12E-43)
            if (r1 != r0) goto L_0x0015
        L_0x002e:
            r2 = 222(0xde, float:3.11E-43)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0OZ.A00(X.01X, long):java.lang.String");
    }

    public static String A01(AnonymousClass01X r5, String str, long j) {
        boolean z;
        String A04 = r5.A04();
        int hashCode = A04.hashCode();
        boolean z2 = false;
        if (hashCode != 3246) {
            if (hashCode == 3588 && A04.equals("pt")) {
                z = true;
            }
            return str;
        }
        if (A04.equals("es")) {
            z = false;
        }
        return str;
        if (z) {
            if (z) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(j);
                int i = instance.get(11);
                if (i == 0) {
                    z2 = r5.A02().A00;
                } else if (i == 1) {
                    z2 = true;
                } else if (i == 13) {
                    z2 = !r5.A02().A00;
                }
                return A00.matcher(str).replaceAll(z2 ? "à" : "às");
            }
            return str;
        }
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j);
        int i2 = instance2.get(11);
        if (i2 == 1 || (i2 == 13 && !r5.A02().A00)) {
            return A01.matcher(str).replaceAll("la");
        }
        return A01.matcher(str).replaceAll("las");
    }

    public static String A02(AnonymousClass01X r10, String str, Calendar calendar) {
        String A05;
        int[] iArr;
        int[] iArr2;
        String str2;
        String str3;
        String A052;
        String str4;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                z = !z;
            } else if (z) {
                sb.append(charAt);
            } else if ("aBhHKm".indexOf(charAt) != -1) {
                int i2 = i;
                while (i2 < length && str.charAt(i2) == charAt) {
                    i2++;
                }
                int i3 = i2 - i;
                if (charAt == 'B') {
                    Locale A0I = r10.A0I();
                    C47802Jp r8 = (C47802Jp) AbstractC47812Jq.A00.get(AbstractC002201f.A05(A0I));
                    if (r8 != null || (r8 = (C47802Jp) AbstractC47812Jq.A00.get(A0I.getLanguage())) != null) {
                        int i4 = calendar.get(11);
                        if (calendar.get(12) == 0 && (iArr = r8.A00) != null && (iArr2 = r8.A01) != null) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= iArr.length) {
                                    break;
                                } else if (iArr[i5] == i4) {
                                    A05 = r10.A05(iArr2[i5]);
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                        A05 = r10.A05(r8.A02[i4]);
                    } else if (calendar.get(9) == 0) {
                        A05 = r10.A05(210);
                    } else {
                        A05 = r10.A05(219);
                    }
                    sb.append(A05);
                } else if (charAt == 'H') {
                    Locale A0I2 = r10.A0I();
                    if (i3 == 1) {
                        str2 = "%d";
                    } else {
                        str2 = "%02d";
                    }
                    sb.append(String.format(A0I2, str2, Integer.valueOf(calendar.get(11))));
                } else if (charAt == 'K') {
                    int i6 = calendar.get(10);
                    Locale A0I3 = r10.A0I();
                    if (i3 == 1) {
                        str3 = "%d";
                    } else {
                        str3 = "%02d";
                    }
                    sb.append(String.format(A0I3, str3, Integer.valueOf(i6)));
                } else if (charAt == 'a') {
                    if (calendar.get(9) == 0) {
                        A052 = r10.A05(210);
                    } else {
                        A052 = r10.A05(219);
                    }
                    sb.append(A052);
                } else if (charAt == 'h') {
                    sb.append(A03(r10, calendar, i3));
                } else if (charAt == 'm') {
                    Locale A0I4 = r10.A0I();
                    if (i3 == 1) {
                        str4 = "%d";
                    } else {
                        str4 = "%02d";
                    }
                    sb.append(String.format(A0I4, str4, Integer.valueOf(calendar.get(12))));
                }
                i = i2 - 1;
            } else {
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }

    public static String A03(AnonymousClass01X r4, Calendar calendar, int i) {
        int i2 = calendar.get(10);
        if (i2 == 0) {
            i2 = 12;
        }
        return String.format(r4.A0I(), i == 1 ? "%d" : "%02d", Integer.valueOf(i2));
    }
}
