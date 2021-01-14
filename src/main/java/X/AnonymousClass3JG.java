package X;

/* renamed from: X.3JG  reason: invalid class name */
public enum AnonymousClass3JG {
    ZERO(0),
    ONE(1),
    TWO(2),
    FEW(3),
    MANY(4),
    OTHER(5);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass3JG(int i) {
        this.value = i;
    }

    public static AnonymousClass3JG A00(int i) {
        if (i == 0) {
            return ZERO;
        }
        if (i == 1) {
            return ONE;
        }
        if (i == 2) {
            return TWO;
        }
        if (i == 3) {
            return FEW;
        }
        if (i == 4) {
            return MANY;
        }
        if (i != 5) {
            return null;
        }
        return OTHER;
    }
}
