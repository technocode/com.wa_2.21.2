package X;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.0Ov  reason: invalid class name and case insensitive filesystem */
public class C05500Ov {
    public static final Pattern A00 = Pattern.compile("\r?\n");
    public static final Pattern A01 = Pattern.compile("(?<=\nEND:VCARD)\\s*\r?\n", 2);

    public static List A00(String str) {
        List asList = Arrays.asList(A01.split(str, 258));
        int i = 1;
        if (asList.size() <= 0 || !((String) asList.get(asList.size() - 1)).isEmpty()) {
            i = 0;
        }
        int min = Math.min(asList.size(), 257) - i;
        return min < asList.size() ? asList.subList(0, min) : asList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d0, code lost:
        throw new X.AnonymousClass3D8(X.AnonymousClass008.A0O(X.AnonymousClass008.A0S("END:VCARD != \""), r6.A0E, "\""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        r6.A0B = (java.lang.System.currentTimeMillis() - r15) + r6.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0169, code lost:
        if (r9 != null) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016c, code lost:
        if (r0 == false) goto L_0x0169;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.lang.String r17, X.AnonymousClass3XG r18) {
        /*
        // Method dump skipped, instructions count: 746
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05500Ov.A01(java.lang.String, X.3XG):void");
    }
}
