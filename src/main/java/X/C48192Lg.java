package X;

import java.util.Arrays;

/* renamed from: X.2Lg  reason: invalid class name and case insensitive filesystem */
public class C48192Lg {
    public static final C48192Lg A02 = new C48192Lg(new byte[]{2}, EnumC69973Jg.REMOVE);
    public static final C48192Lg A03 = new C48192Lg(new byte[]{1}, EnumC69973Jg.SET);
    public final EnumC69973Jg A00;
    public final byte[] A01;

    public C48192Lg(byte[] bArr, EnumC69973Jg r2) {
        this.A01 = bArr;
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48192Lg)) {
            return false;
        }
        C48192Lg r4 = (C48192Lg) obj;
        if (!Arrays.equals(this.A01, r4.A01) || this.A00 != r4.A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(this.A01) + (Arrays.hashCode(new Object[]{this.A00}) * 31);
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("SyncdOperation{bytes=");
        A0S.append(Arrays.toString(this.A01));
        A0S.append(", syncdOperation=");
        A0S.append(this.A00);
        A0S.append('}');
        return A0S.toString();
    }
}
