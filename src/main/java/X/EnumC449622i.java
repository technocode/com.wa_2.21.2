package X;

/* renamed from: X.22i  reason: invalid class name and case insensitive filesystem */
public enum EnumC449622i {
    UNKNOWN(0),
    CHROME(1),
    FIREFOX(2),
    IE(3),
    OPERA(4),
    SAFARI(5),
    EDGE(6),
    DESKTOP(7),
    IPAD(8),
    ANDROID_TABLET(9),
    OHANA(10),
    ALOHA(11),
    CATALINA(12);
    
    public final int value;

    /* access modifiers changed from: public */
    EnumC449622i(int i) {
        this.value = i;
    }

    public static EnumC449622i A00(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CHROME;
            case 2:
                return FIREFOX;
            case 3:
                return IE;
            case 4:
                return OPERA;
            case 5:
                return SAFARI;
            case 6:
                return EDGE;
            case 7:
                return DESKTOP;
            case 8:
                return IPAD;
            case 9:
                return ANDROID_TABLET;
            case 10:
                return OHANA;
            case 11:
                return ALOHA;
            case 12:
                return CATALINA;
            default:
                return null;
        }
    }
}
