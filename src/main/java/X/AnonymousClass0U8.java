package X;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.0U8  reason: invalid class name */
public final class AnonymousClass0U8 implements AnonymousClass0U1 {
    public static final Locale A02 = AnonymousClass0U0.A02("en-Latn");
    public static final Locale[] A03 = new Locale[0];
    public final String A00;
    public final Locale[] A01;

    @Override // X.AnonymousClass0U1
    public Object A7A() {
        return null;
    }

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
    }

    public AnonymousClass0U8(Locale... localeArr) {
        int length = localeArr.length;
        if (length == 0) {
            this.A01 = A03;
            this.A00 = "";
            return;
        }
        Locale[] localeArr2 = new Locale[length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            Locale locale = localeArr[i];
            if (locale == null) {
                throw new NullPointerException(AnonymousClass008.A0G("list[", i, "] is null"));
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i < length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            } else {
                throw new IllegalArgumentException(AnonymousClass008.A0G("list[", i, "] is a repetition"));
            }
        }
        this.A01 = localeArr2;
        this.A00 = sb.toString();
    }

    @Override // X.AnonymousClass0U1
    public Locale A4c(int i) {
        if (i < 0) {
            return null;
        }
        Locale[] localeArr = this.A01;
        if (i < localeArr.length) {
            return localeArr[i];
        }
        return null;
    }

    @Override // X.AnonymousClass0U1
    public String AQc() {
        return this.A00;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0U8)) {
            return false;
        }
        Locale[] localeArr = ((AnonymousClass0U8) obj).A01;
        Locale[] localeArr2 = this.A01;
        int length = localeArr2.length;
        if (length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.A01;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.A01;
            int length = localeArr.length;
            if (i < length) {
                A0S.append(localeArr[i]);
                if (i < length - 1) {
                    A0S.append(',');
                }
                i++;
            } else {
                A0S.append("]");
                return A0S.toString();
            }
        }
    }
}
