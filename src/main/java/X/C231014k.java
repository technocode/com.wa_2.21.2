package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.14k  reason: invalid class name and case insensitive filesystem */
public final class C231014k {
    public static final Pattern A01 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern A02 = Pattern.compile("(\\S+?):(\\S+)");
    public final StringBuilder A00 = new StringBuilder();

    public static int A00(String str) {
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    return 1;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    return 1;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    return 2;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    return 0;
                }
                break;
        }
        AnonymousClass008.A1B("Invalid anchor value: ", str, "WebvttCueParser");
        return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008e, code lost:
        if (r4.equals("left") != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r4.equals("end") != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (r4.equals("center") != false) goto L_0x00af;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.lang.String r9, X.C230714h r10) {
        /*
        // Method dump skipped, instructions count: 318
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231014k.A01(java.lang.String, X.14h):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0194 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(java.lang.String r17, X.C230814i r18, android.text.SpannableStringBuilder r19, java.util.List r20, java.util.List r21) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C231014k.A02(java.lang.String, X.14i, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    public static void A03(String str, String str2, C230714h r19, List list) {
        String str3;
        String str4;
        int hashCode;
        String[] strArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = str2.length();
            str3 = "";
            if (i >= length) {
                break;
            }
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i, indexOf);
                    int hashCode2 = substring.hashCode();
                    if (hashCode2 == 3309) {
                        if (substring.equals("gt")) {
                            spannableStringBuilder.append('>');
                        }
                        StringBuilder sb = new StringBuilder("ignoring unsupported entity: '&");
                        sb.append(substring);
                        sb.append(";'");
                        Log.w("WebvttCueParser", sb.toString());
                    } else if (hashCode2 == 3464) {
                        if (substring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        }
                        StringBuilder sb2 = new StringBuilder("ignoring unsupported entity: '&");
                        sb2.append(substring);
                        sb2.append(";'");
                        Log.w("WebvttCueParser", sb2.toString());
                    } else if (hashCode2 != 96708) {
                        if (hashCode2 == 3374865 && substring.equals("nbsp")) {
                            spannableStringBuilder.append(' ');
                        }
                        StringBuilder sb22 = new StringBuilder("ignoring unsupported entity: '&");
                        sb22.append(substring);
                        sb22.append(";'");
                        Log.w("WebvttCueParser", sb22.toString());
                    } else {
                        if (substring.equals("amp")) {
                            spannableStringBuilder.append('&');
                        }
                        StringBuilder sb222 = new StringBuilder("ignoring unsupported entity: '&");
                        sb222.append(substring);
                        sb222.append(";'");
                        Log.w("WebvttCueParser", sb222.toString());
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < length) {
                    boolean z = false;
                    if (str2.charAt(i2) == '/') {
                        z = true;
                    }
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 + 1;
                    if (indexOf3 == -1) {
                        i2 = length;
                    }
                    int i3 = i2 - 2;
                    boolean z2 = false;
                    if (str2.charAt(i3) == '/') {
                        z2 = true;
                    }
                    int i4 = 1;
                    if (z) {
                        i4 = 2;
                    }
                    int i5 = i + i4;
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i5, i3);
                    String trim = substring2.trim();
                    C230814i r2 = null;
                    if (!trim.isEmpty() && (str4 = trim.split("[ \\.]", 2)[0]) != null && ((hashCode = str4.hashCode()) == 98 ? str4.equals("b") : !(hashCode == 99 ? !str4.equals("c") : hashCode == 105 ? !str4.equals("i") : hashCode == 3314158 ? !str4.equals("lang") : hashCode == 117 ? !str4.equals("u") : hashCode != 118 || !str4.equals("v")))) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                C230814i r0 = (C230814i) arrayDeque.pop();
                                A02(str, r0, spannableStringBuilder, list, arrayList);
                                if (r0.A01.equals(str4)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            int length2 = spannableStringBuilder.length();
                            String trim2 = substring2.trim();
                            if (!trim2.isEmpty()) {
                                int indexOf4 = trim2.indexOf(" ");
                                if (indexOf4 != -1) {
                                    str3 = trim2.substring(indexOf4).trim();
                                    trim2 = trim2.substring(0, indexOf4);
                                }
                                String[] split = trim2.split("\\.", -1);
                                String str5 = split[0];
                                int length3 = split.length;
                                if (length3 > 1) {
                                    strArr = (String[]) Arrays.copyOfRange(split, 1, length3);
                                } else {
                                    strArr = C230814i.A04;
                                }
                                r2 = new C230814i(str5, length2, str3, strArr);
                            }
                            arrayDeque.push(r2);
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            A02(str, (C230814i) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        A02(str, new C230814i(str3, 0, str3, new String[0]), spannableStringBuilder, list, arrayList);
        r19.A09 = spannableStringBuilder;
    }

    public static boolean A04(String str, Matcher matcher, C233815n r6, C230714h r7, StringBuilder sb, List list) {
        try {
            r7.A07 = C231114l.A01(matcher.group(1));
            r7.A06 = C231114l.A01(matcher.group(2));
            A01(matcher.group(3), r7);
            sb.setLength(0);
            while (true) {
                String A07 = r6.A07();
                if (!TextUtils.isEmpty(A07)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(A07.trim());
                } else {
                    A03(str, sb.toString(), r7, list);
                    return true;
                }
            }
        } catch (NumberFormatException unused) {
            StringBuilder A0S = AnonymousClass008.A0S("Skipping cue with bad header: ");
            A0S.append(matcher.group());
            Log.w("WebvttCueParser", A0S.toString());
            return false;
        }
    }
}
