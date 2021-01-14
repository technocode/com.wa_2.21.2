package X;

import android.text.TextUtils;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: X.1YB  reason: invalid class name */
public class AnonymousClass1YB {
    public static final ThreadLocal A00 = new AnonymousClass36A();
    public static final ThreadLocal A01 = new AnonymousClass369();
    public static final Pattern A02 = Pattern.compile("[\\p{ASCII}&&[^\\p{Alnum}]]");

    public static AnonymousClass02R A00(String str, boolean z, AnonymousClass01X r10) {
        String A04;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return new AnonymousClass02R(arrayList2, arrayList);
        }
        String replaceAll = A02.matcher(str).replaceAll(" ");
        BreakIterator A022 = A02(r10);
        A022.setText(replaceAll);
        int first = A022.first();
        int next = A022.next();
        while (true) {
            first = next;
            if (next == -1) {
                return new AnonymousClass02R(arrayList2, arrayList);
            }
            String substring = replaceAll.substring(first, next);
            if (z) {
                A04 = C003701u.A03(substring);
            } else {
                A04 = C003701u.A04(substring);
            }
            if (!TextUtils.isEmpty(A04) && !Character.isSpaceChar(A04.codePointAt(0))) {
                arrayList2.add(Integer.valueOf(first));
                arrayList2.add(Integer.valueOf(next));
                arrayList.add(A04);
            }
            next = A022.next();
        }
    }

    public static String A01(long j, String str, AnonymousClass01X r13) {
        boolean z = false;
        if (j != 5) {
            if (j != 1) {
                AnonymousClass00E.A08(false, "Cannot tokenize for unknown tokenization version");
                return "";
            } else if (str.isEmpty()) {
                return str;
            } else {
                StringBuilder sb = new StringBuilder(str.length());
                BreakIterator A022 = A02(r13);
                A022.setText(str);
                int first = A022.first();
                int next = A022.next();
                while (true) {
                    first = next;
                    if (next == -1) {
                        break;
                    }
                    if (next - first != 1 || str.charAt(first) != ' ') {
                        sb.append((CharSequence) C003701u.A03(str.subSequence(first, next)));
                        sb.append(' ');
                    }
                    next = A022.next();
                }
                if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                return sb.toString();
            }
        } else if (str.isEmpty()) {
            return str;
        } else {
            if (!AnonymousClass1YE.A00.matcher(str).find()) {
                z = true;
                str = C003701u.A04(str);
            }
            StringBuilder sb2 = new StringBuilder(str.length());
            BreakIterator A023 = A02(r13);
            A023.setText(str);
            int first2 = A023.first();
            int next2 = A023.next();
            while (true) {
                first2 = next2;
                if (next2 == -1) {
                    break;
                }
                if (next2 - first2 != 1 || str.codePointAt(first2) != 32) {
                    CharSequence subSequence = str.subSequence(first2, next2);
                    if (!z) {
                        subSequence = C003701u.A04(subSequence);
                    }
                    sb2.append(subSequence);
                    sb2.append(' ');
                }
                next2 = A023.next();
            }
            if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            return sb2.toString();
        }
    }

    public static BreakIterator A02(AnonymousClass01X r3) {
        Locale A0I = r3.A0I();
        ThreadLocal threadLocal = A01;
        if (A0I.equals(threadLocal.get())) {
            return (BreakIterator) A00.get();
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(A0I);
        threadLocal.set(A0I);
        A00.set(wordInstance);
        return wordInstance;
    }

    public static ArrayList A03(String str, AnonymousClass01X r2) {
        Object obj = A00(str, true, r2).A01;
        if (obj != null) {
            return (ArrayList) obj;
        }
        throw null;
    }

    public static boolean A04(String str, List list, AnonymousClass01X r11, boolean z) {
        if (str == null) {
            return false;
        }
        String replaceAll = A02.matcher(str).replaceAll(" ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            BreakIterator A022 = A02(r11);
            A022.setText(replaceAll);
            int first = A022.first();
            int next = A022.next();
            while (true) {
                first = next;
                if (next == -1) {
                    return false;
                }
                String A03 = C003701u.A03(replaceAll.substring(first, next));
                if (z) {
                    if (A03.startsWith(str2)) {
                        break;
                    }
                } else if (A03.equals(str2)) {
                    break;
                }
                next = A022.next();
            }
        }
        return true;
    }
}
