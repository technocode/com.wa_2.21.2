package X;

/* renamed from: X.3JD  reason: invalid class name */
public enum AnonymousClass3JD {
    TEXT(0),
    IMAGE(1),
    DOCUMENT(2),
    VIDEO(3),
    LOCATION(4);
    
    public final int value;

    /* access modifiers changed from: public */
    AnonymousClass3JD(int i) {
        this.value = i;
    }

    public static AnonymousClass3JD A00(int i) {
        if (i == 0) {
            return TEXT;
        }
        if (i == 1) {
            return IMAGE;
        }
        if (i == 2) {
            return DOCUMENT;
        }
        if (i == 3) {
            return VIDEO;
        }
        if (i != 4) {
            return null;
        }
        return LOCATION;
    }
}
