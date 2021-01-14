package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1VA  reason: invalid class name */
public class AnonymousClass1VA {
    public int A00;
    public final C014508d A01;
    public final Map A02 = new HashMap();

    public AnonymousClass1VA(int i, C014508d r3) {
        this.A00 = i;
        this.A01 = r3;
    }

    public void A00() {
        Map map = this.A02;
        for (AnonymousClass1VB r1 : map.values()) {
            if (r1 != null) {
                if (!(r1 instanceof AnonymousClass2bY)) {
                    r1.A00.close();
                } else {
                    AnonymousClass2bY r12 = (AnonymousClass2bY) r1;
                    ((AnonymousClass1VB) r12).A00.close();
                    r12.A00 = null;
                }
            }
        }
        map.clear();
    }
}
