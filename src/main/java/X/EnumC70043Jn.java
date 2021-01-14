package X;

/* renamed from: X.3Jn  reason: invalid class name and case insensitive filesystem */
public enum EnumC70043Jn {
    NOT_STARTED(0),
    FORCE_UPGRADE(1),
    DEVELOPMENT(2),
    PRODUCTION(3);
    
    public final int value;

    /* access modifiers changed from: public */
    EnumC70043Jn(int i) {
        this.value = i;
    }

    public static EnumC70043Jn A00(int i) {
        if (i == 0) {
            return NOT_STARTED;
        }
        if (i == 1) {
            return FORCE_UPGRADE;
        }
        if (i == 2) {
            return DEVELOPMENT;
        }
        if (i != 3) {
            return null;
        }
        return PRODUCTION;
    }
}
