package X;

/* renamed from: X.11d  reason: invalid class name and case insensitive filesystem */
public enum EnumC223611d {
    FLEX(0),
    NONE(1);
    
    public final int mIntValue;

    /* access modifiers changed from: public */
    EnumC223611d(int i) {
        this.mIntValue = i;
    }

    public static EnumC223611d A00(int i) {
        if (i == 0) {
            return FLEX;
        }
        if (i == 1) {
            return NONE;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("Unknown enum value: ", i));
    }
}
