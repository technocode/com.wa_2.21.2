package X;

import java.util.Locale;

/* renamed from: X.2Nn  reason: invalid class name and case insensitive filesystem */
public final class C48742Nn {
    public final String A00;
    public final Locale[] A01;

    public C48742Nn(Locale locale, String str) {
        this.A01 = new Locale[]{locale};
        this.A00 = str;
    }

    public C48742Nn(Locale[] localeArr, String str) {
        this.A01 = localeArr;
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("HsmMessagePackEvent{locales=");
        A0S.append(AbstractC002201f.A08(this.A01));
        A0S.append(", namespace='");
        A0S.append(this.A00);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
