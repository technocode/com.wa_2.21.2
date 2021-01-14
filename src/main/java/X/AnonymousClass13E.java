package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.13E  reason: invalid class name */
public final class AnonymousClass13E {
    public static final Pattern A02 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int A00 = -1;
    public int A01 = -1;

    public final boolean A00(String str) {
        Matcher matcher = A02.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.A00 = parseInt;
            this.A01 = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
