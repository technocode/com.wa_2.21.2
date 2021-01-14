package X;

/* renamed from: X.3JM  reason: invalid class name */
public enum AnonymousClass3JM {
    SANS_SERIF(0),
    SERIF(1),
    NORICAN_REGULAR(2),
    BRYNDAN_WRITE(3),
    BEBASNEUE_REGULAR(4),
    OSWALD_HEAVY(5);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass3JM(int i) {
        this.value = i;
    }

    public static AnonymousClass3JM A00(int i) {
        if (i == 0) {
            return SANS_SERIF;
        }
        if (i == 1) {
            return SERIF;
        }
        if (i == 2) {
            return NORICAN_REGULAR;
        }
        if (i == 3) {
            return BRYNDAN_WRITE;
        }
        if (i == 4) {
            return BEBASNEUE_REGULAR;
        }
        if (i != 5) {
            return null;
        }
        return OSWALD_HEAVY;
    }
}
