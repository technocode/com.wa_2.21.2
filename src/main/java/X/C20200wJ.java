package X;

/* renamed from: X.0wJ  reason: invalid class name and case insensitive filesystem */
public class C20200wJ {
    public static String A00(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(AnonymousClass008.A0I("Cannot internalEncode negative integer ", j));
        } else if (j <= (1 << Math.min(63, 66)) - 1) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            do {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((int) (j % 64)));
                j >>= 6;
                i++;
            } while (i < 11);
            if (j <= 0) {
                sb.reverse();
                return sb.toString();
            }
            throw new IllegalArgumentException("Number won't fit in string");
        } else {
            StringBuilder sb2 = new StringBuilder("Cannot internalEncode integer ");
            sb2.append(j);
            sb2.append(" in ");
            sb2.append(11);
            sb2.append(" chars");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
