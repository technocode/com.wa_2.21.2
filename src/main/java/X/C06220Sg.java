package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.0Sg  reason: invalid class name and case insensitive filesystem */
public class C06220Sg {
    public static volatile C06220Sg A01;
    public final C002701k A00;

    public C06220Sg(C002701k r1) {
        this.A00 = r1;
    }

    public static boolean A00(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        if (str2.equals("all") || str2.equals("none")) {
            throw new IllegalArgumentException("Name 'none' and 'all' are not supported");
        }
        Locale locale = Locale.US;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str2.toLowerCase(locale);
        String trim = lowerCase.trim();
        if (TextUtils.isEmpty(trim) || trim.equals("none")) {
            return false;
        }
        boolean z = false;
        for (String str3 : trim.split(";")) {
            String trim2 = str3.trim();
            if (!TextUtils.isEmpty(trim2)) {
                if (trim2.equals("all")) {
                    z = true;
                }
                if (trim2.equals(lowerCase2)) {
                    z = true;
                }
                if (trim2.startsWith("-") && lowerCase2.equals(trim2.substring(1))) {
                    return false;
                }
            }
        }
        return z;
    }

    public int A01(String str) {
        C002701k r3 = this.A00;
        if (A00(r3.A06(207), str)) {
            return 1;
        }
        if (A00(r3.A06(208), str)) {
            return 2;
        }
        String A06 = r3.A06(209);
        if (A00(r3.A06(242), str) || A00(A06, str)) {
            return 3;
        }
        return 2;
    }

    public long A02() {
        return (long) this.A00.A03(261);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject A03(java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06220Sg.A03(java.lang.String):org.json.JSONObject");
    }
}
