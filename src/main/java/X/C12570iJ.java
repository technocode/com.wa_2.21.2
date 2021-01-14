package X;

/* renamed from: X.0iJ  reason: invalid class name and case insensitive filesystem */
public class C12570iJ {
    public static final byte[] A04 = new byte[1792];
    public char A00;
    public int A01;
    public final int A02;
    public final CharSequence A03;

    static {
        int i = 0;
        do {
            A04[i] = Character.getDirectionality(i);
            i++;
        } while (i < 1792);
    }

    public C12570iJ(CharSequence charSequence) {
        this.A03 = charSequence;
        this.A02 = charSequence.length();
    }

    public byte A00() {
        CharSequence charSequence = this.A03;
        char charAt = charSequence.charAt(this.A01 - 1);
        this.A00 = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.A01);
            this.A01 -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.A01--;
        char c = this.A00;
        if (c < 1792) {
            return A04[c];
        }
        return Character.getDirectionality(c);
    }
}
