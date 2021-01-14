package X;

/* renamed from: X.26U  reason: invalid class name */
public class AnonymousClass26U extends AbstractC35671kk {
    public static AnonymousClass26U A00;

    public AnonymousClass26U(C242819u r1) {
        super(r1);
    }

    public static String A02(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Number) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            long abs = Math.abs(((Number) obj).longValue());
            int i = (abs > 100 ? 1 : (abs == 100 ? 0 : -1));
            String valueOf = String.valueOf(obj);
            if (i < 0) {
                return valueOf;
            }
            if (valueOf.charAt(0) != '-') {
                str = "";
            }
            String valueOf2 = String.valueOf(abs);
            StringBuilder A0S = AnonymousClass008.A0S(str);
            int length = valueOf2.length();
            A0S.append(Math.round(Math.pow(10.0d, (double) (length - 1))));
            A0S.append("...");
            A0S.append(str);
            A0S.append(Math.round(Math.pow(10.0d, (double) length) - 1.0d));
            return A0S.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
    }

    public final void A0D(AnonymousClass1A9 r4, String str) {
        A08(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), r4.toString());
    }
}
