package X;

import java.util.Map;

/* renamed from: X.03Y  reason: invalid class name */
public class AnonymousClass03Y {
    public static final AnonymousClass03Y A02 = new AnonymousClass03Y();
    public int A00 = 64;
    public final Map A01 = new AnonymousClass03Z(this);

    public synchronized String A00(String str) {
        String str2;
        Map map = this.A01;
        synchronized (map) {
            str2 = (String) map.get(str);
        }
        return str2;
    }
}
