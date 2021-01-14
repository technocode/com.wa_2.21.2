package X;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.3Z2  reason: invalid class name */
public class AnonymousClass3Z2 extends AbstractC08510bF {
    public HashMap A00 = new HashMap();
    public AbstractC63942xG[] A01;
    public final AnonymousClass01X A02;
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();
    public final HashSet A05 = new HashSet();

    public AnonymousClass3Z2(AnonymousClass01X r2, AbstractC63942xG[] r3) {
        this.A02 = r2;
        this.A01 = r3;
        A0G(r3);
    }

    public final void A0G(AbstractC63942xG[] r6) {
        this.A01 = r6;
        HashMap hashMap = this.A04;
        hashMap.clear();
        for (int i = 0; i < r6.length; i++) {
            String id = r6[i].getId();
            int i2 = i;
            if (!this.A02.A0M()) {
                i2 = (this.A01.length - 1) - i;
            }
            hashMap.put(id, Integer.valueOf(i2));
        }
    }
}
