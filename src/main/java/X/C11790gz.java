package X;

/* renamed from: X.0gz  reason: invalid class name and case insensitive filesystem */
public final class C11790gz {
    public static final AbstractC11810h1 A00 = ((!C11770gw.A02 || !C11770gw.A03) ? new C11800h0() : new C11830h3());

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new AnonymousClass1FW(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder A0S = AnonymousClass008.A0S("UTF-8 length does not fit in int: ");
        A0S.append(((long) i3) + 4294967296L);
        throw new IllegalArgumentException(A0S.toString());
    }
}
