package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.0J6  reason: invalid class name */
public final class AnonymousClass0J6 {
    public static final Pattern A02 = Pattern.compile("(\\d{3})(\\d{2,3})");
    public final String A00;
    public final String A01;

    public AnonymousClass0J6(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public static AnonymousClass0J6 A00(String str) {
        String str2 = "000";
        if (str == null) {
            return new AnonymousClass0J6(str2, str2);
        }
        Matcher matcher = A02.matcher(str);
        if (!matcher.matches()) {
            return new AnonymousClass0J6(str2, str2);
        }
        String group = matcher.group(1);
        try {
            str2 = String.format(Locale.US, "%03d", Integer.valueOf(Integer.valueOf(matcher.group(2)).intValue()));
        } catch (NumberFormatException e) {
            StringBuilder A0S = AnonymousClass008.A0S("mccmnc/parse mnc not parseable as integer: ");
            A0S.append(matcher.group(2));
            Log.e(A0S.toString(), e);
        }
        return new AnonymousClass0J6(group, str2);
    }

    public static String A01(String str, String str2) {
        if (str == null) {
            return str2;
        }
        Matcher matcher = A02.matcher(str);
        if (!matcher.matches()) {
            return str2;
        }
        return AnonymousClass008.A0L(matcher.group(1), "-", matcher.group(2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (AnonymousClass0J6.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0J6 r5 = (AnonymousClass0J6) obj;
        if (!TextUtils.equals(this.A00, r5.A00) || !TextUtils.equals(this.A01, r5.A01)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        String str = this.A00;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.A01;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("MccMnc<");
        A0S.append(this.A00);
        A0S.append(",");
        return AnonymousClass008.A0O(A0S, this.A01, ">");
    }
}
