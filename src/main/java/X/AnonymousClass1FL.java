package X;

/* renamed from: X.1FL  reason: invalid class name */
public class AnonymousClass1FL {
    public static final AnonymousClass1FL A00 = new AnonymousClass1FL(true);

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
    }

    public AnonymousClass1FL() {
    }

    public AnonymousClass1FL(boolean z) {
    }

    public static AnonymousClass1FL A00() {
        Class cls = AnonymousClass1FK.A00;
        if (cls != null) {
            try {
                return (AnonymousClass1FL) cls.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return A00;
    }
}
