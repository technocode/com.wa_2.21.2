package X;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.0U0  reason: invalid class name */
public final class AnonymousClass0U0 {
    public static final AnonymousClass0U0 A01 = A01(new Locale[0]);
    public AnonymousClass0U1 A00;

    public AnonymousClass0U0(AnonymousClass0U1 r1) {
        this.A00 = r1;
    }

    public static AnonymousClass0U0 A00(String str) {
        Locale A02;
        if (str == null || str.isEmpty()) {
            return A01;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            if (Build.VERSION.SDK_INT >= 21) {
                A02 = Locale.forLanguageTag(split[i]);
            } else {
                A02 = A02(split[i]);
            }
            localeArr[i] = A02;
        }
        return A01(localeArr);
    }

    public static AnonymousClass0U0 A01(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass0U0(new AnonymousClass0U9(new LocaleList(localeArr)));
        }
        return new AnonymousClass0U0(new AnonymousClass0U8(localeArr));
    }

    public static Locale A02(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            int length = split.length;
            if (length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            int length2 = split2.length;
            if (length2 > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (length2 > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (length2 == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException(AnonymousClass008.A0L("Can not parse language tag: [", str, "]"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof AnonymousClass0U0) && this.A00.equals(((AnonymousClass0U0) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }
}
