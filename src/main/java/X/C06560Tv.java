package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.0Tv  reason: invalid class name and case insensitive filesystem */
public final class C06560Tv {
    public static final Locale A00 = new Locale("", "");

    public static int A00(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(A00)) {
            String A002 = C14800mu.A00(locale);
            if (A002 == null) {
                byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
                if (directionality == 1 || directionality == 2) {
                    return 1;
                }
                return 0;
            } else if (A002.equalsIgnoreCase("Arab") || A002.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
