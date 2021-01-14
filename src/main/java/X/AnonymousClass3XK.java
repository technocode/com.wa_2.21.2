package X;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: X.3XK  reason: invalid class name */
public class AnonymousClass3XK extends AnonymousClass3DB {
    public static final HashSet A01 = new HashSet(Arrays.asList("7BIT", "8BIT", "BASE64", "B"));
    public static final HashSet A02 = new HashSet(Arrays.asList("BEGIN", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID"));
    public static final HashSet A03 = new HashSet();
    public String A00;

    @Override // X.AnonymousClass3DB
    public void A05(String str) {
        try {
            super.A05(str);
        } catch (AnonymousClass3D8 unused) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                String str2 = split[0];
                String str3 = split[1];
                AnonymousClass3XG r0 = this.A0G;
                if (r0 != null) {
                    r0.A01 = str2;
                    r0.A00(str3);
                    return;
                }
                return;
            }
            throw new AnonymousClass3D8(AnonymousClass008.A0K("Unknown params value: ", str));
        }
    }
}
