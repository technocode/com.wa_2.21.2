package X;

import java.util.Locale;

/* renamed from: X.0Jg  reason: invalid class name and case insensitive filesystem */
public class C04150Jg {
    public final String A00;
    public final Locale A01;

    public C04150Jg(Locale locale, String str) {
        this.A01 = new Locale(locale.getLanguage(), locale.getCountry());
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C04150Jg.class != obj.getClass()) {
            return false;
        }
        C04150Jg r5 = (C04150Jg) obj;
        Locale locale = this.A01;
        if (locale != null) {
            if (!locale.equals(r5.A01)) {
                return false;
            }
        } else if (r5.A01 != null) {
            return false;
        }
        String str = this.A00;
        String str2 = r5.A00;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Locale locale = this.A01;
        int i2 = 0;
        if (locale != null) {
            i = locale.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.A00;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }
}
