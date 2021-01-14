package X;

/* renamed from: X.1G5  reason: invalid class name */
public enum AnonymousClass1G5 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);
    
    public final int bits;
    public final int[] characterCountBitsForVersions;

    /* access modifiers changed from: public */
    AnonymousClass1G5(int[] iArr, int i) {
        this.characterCountBitsForVersions = iArr;
        this.bits = i;
    }

    public int A00(AnonymousClass1G9 r4) {
        char c;
        int i = r4.A01;
        if (i <= 9) {
            c = 0;
        } else {
            c = 2;
            if (i <= 26) {
                c = 1;
            }
        }
        return this.characterCountBitsForVersions[c];
    }
}
