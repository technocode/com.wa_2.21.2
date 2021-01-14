package X;

import android.os.Build;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.01f  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC002201f {
    public static HashSet A00;
    public static final Object A01 = new Object();
    public static final Pattern A02 = Pattern.compile("[a-z]{2,3}");
    public static final Pattern A03 = Pattern.compile("[A-Z]{2}|[0-9]{3}");
    public static final String[] A04 = A0B('0');

    public static int A00(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        if (!country.isEmpty()) {
            language = AnonymousClass008.A0L(language, "-", country);
        }
        AnonymousClass05W r1 = AbstractC06590Ty.A00;
        Number number = (Number) r1.get(language);
        if (number != null) {
            return number.intValue();
        }
        Number number2 = (Number) r1.getOrDefault(country, null);
        if (number2 != null) {
            return number2.intValue();
        }
        return 1;
    }

    public static String A01(Locale locale) {
        String language = locale.getLanguage();
        if ("zh".equals(language)) {
            return "Hans".equals(A02(locale)) ? "zh-Hans" : "zh-Hant";
        }
        return language;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r3.equals("zh") == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r3.equals("uz") == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r3.equals("sr") == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r3.equals("pa") == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        if (r3.equals("az") == false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(java.util.Locale r11) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC002201f.A02(java.util.Locale):java.lang.String");
    }

    public static String A03(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i < 24) {
            return Character.toString(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
        }
        android.icu.text.DecimalFormatSymbols instance = android.icu.text.DecimalFormatSymbols.getInstance(locale);
        if (i >= 28) {
            return instance.getDigitStrings()[0];
        }
        return Character.toString(instance.getZeroDigit());
    }

    public static String A04(Locale locale) {
        String language = locale.getLanguage();
        int hashCode = language.hashCode();
        if (hashCode != 3365) {
            if (hashCode != 3374) {
                if (hashCode != 3588) {
                    if (hashCode != 3704) {
                        if (hashCode == 3886 && language.equals("zh")) {
                            return "Hans".equals(A02(locale)) ? "zh-Hans" : "zh-Hant";
                        }
                    } else if (language.equals("tl")) {
                        return "fil";
                    }
                } else if (language.equals("pt")) {
                    return C06600Tz.A00.contains(locale.getCountry()) ? "pt-PT" : "pt-BR";
                }
            } else if (language.equals("iw")) {
                return "he";
            }
        } else if (language.equals("in")) {
            return "id";
        }
        return language;
    }

    public static String A05(Locale locale) {
        if (Build.VERSION.SDK_INT >= 21) {
            return locale.toLanguageTag();
        }
        return AnonymousClass0U0.A01(locale).A00.AQc();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r2.equals("fil") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        if (r2.equals("zh") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        if (r2.equals("uz") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        if (r2.equals("sr") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r2.equals("sk") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if (r2.equals("pa") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r2.equals("id") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r2.equals("he") == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        if (r2.equals("az") == false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A06(java.util.Locale r5) {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC002201f.A06(java.util.Locale):java.lang.String");
    }

    public static String A07(Locale locale, String str) {
        String[] A0B;
        Pattern compile;
        String str2;
        char charAt;
        String[] strArr = (String[]) AbstractC05380Oh.A02.get(locale.getLanguage());
        if (strArr == null) {
            return str;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            android.icu.text.DecimalFormatSymbols instance = android.icu.text.DecimalFormatSymbols.getInstance(locale);
            if (i >= 28) {
                A0B = instance.getDigitStrings();
            } else {
                char[] digits = instance.getDigits();
                A0B = new String[10];
                int i2 = 0;
                do {
                    A0B[i2] = Character.toString(digits[i2]);
                    i2++;
                } while (i2 < 10);
            }
        } else {
            A0B = A0B(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
        }
        if (Arrays.equals(strArr, A0B)) {
            compile = Pattern.compile("[0-9]");
        } else if (Arrays.equals(A04, A0B)) {
            StringBuilder sb = new StringBuilder(19);
            sb.append(strArr[0]);
            int i3 = 1;
            do {
                sb.append('|');
                sb.append(strArr[i3]);
                i3++;
            } while (i3 < 10);
            compile = Pattern.compile(sb.toString());
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("[0-9]|");
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append(strArr[0]);
            int i4 = 1;
            do {
                sb2.append('|');
                sb2.append(strArr[i4]);
                i4++;
            } while (i4 < 10);
            A0S.append(sb2.toString());
            compile = Pattern.compile(A0S.toString());
        }
        Matcher matcher = compile.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        int length = str.length();
        StringBuilder sb3 = new StringBuilder(length);
        int i5 = 0;
        do {
            int start = matcher.start();
            if (i5 < start) {
                sb3.append(str.substring(i5, start));
            }
            String group = matcher.group();
            if (group.length() != 1 || '0' > (charAt = group.charAt(0)) || charAt > '9') {
                str2 = "";
            } else {
                str2 = A0B[charAt - '0'];
            }
            if (str2.isEmpty()) {
                int i6 = 0;
                while (true) {
                    if (!group.equals(strArr[i6])) {
                        i6++;
                        if (i6 >= 10) {
                            break;
                        }
                    } else {
                        str2 = A0B[i6];
                        break;
                    }
                }
            }
            if (!str2.isEmpty()) {
                group = str2;
            }
            sb3.append(group);
            i5 = matcher.end();
        } while (matcher.find());
        if (i5 < length) {
            sb3.append(str.substring(i5));
        }
        return sb3.toString();
    }

    public static String A08(Locale[] localeArr) {
        int length = localeArr.length;
        if (length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length * 6);
        sb.append(A05(localeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(',');
            sb.append(A05(localeArr[i]));
        }
        return sb.toString();
    }

    public static Locale A09(String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            return Locale.forLanguageTag(str);
        }
        return AnonymousClass0U0.A00(str).A00.A4c(0);
    }

    public static boolean A0A(Locale locale) {
        if ("en".equals(locale.getLanguage())) {
            String str = "en-US";
            try {
                Object A012 = AnonymousClass0U2.A00.A01(locale.getCountry());
                if (A012 != null) {
                    str = A012;
                }
            } catch (IllegalArgumentException unused) {
            }
            return str.equals(str);
        }
    }

    public static String[] A0B(char c) {
        String[] strArr = new String[10];
        int i = 0;
        do {
            strArr[i] = Character.toString((char) (c + i));
            i++;
        } while (i < 10);
        return strArr;
    }
}
