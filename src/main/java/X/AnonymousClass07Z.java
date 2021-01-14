package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.07Z  reason: invalid class name */
public class AnonymousClass07Z {
    public final AnonymousClass07Y A00;
    public final String A01;

    public AnonymousClass07Z(Set set, AnonymousClass07Y r3) {
        this.A01 = A00(set);
        this.A00 = r3;
    }

    public static String A00(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass06G r1 = (AnonymousClass06G) ((AnonymousClass06H) it.next());
            sb.append(r1.A00);
            sb.append('/');
            sb.append(r1.A01);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
