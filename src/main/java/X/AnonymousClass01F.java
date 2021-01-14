package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.01F  reason: invalid class name */
public class AnonymousClass01F extends AnonymousClass01G {
    public void A02(Collection collection) {
        synchronized (this.A00) {
            Iterator it = this.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    AnonymousClass01E r5 = (AnonymousClass01E) r1.next();
                    if (r5 instanceof AnonymousClass08P) {
                        AnonymousClass08P r52 = (AnonymousClass08P) r5;
                        AnonymousClass01B r3 = r52.A01;
                        synchronized (r3.A06) {
                            int A00 = r52.A00(collection);
                            Integer num = r3.A00;
                            if (num == null) {
                                r3.A00 = Integer.valueOf(A00);
                            } else {
                                r3.A00 = Integer.valueOf(num.intValue() + A00);
                            }
                        }
                    } else if (r5 instanceof AnonymousClass01D) {
                        AnonymousClass01D r53 = (AnonymousClass01D) r5;
                        Iterator it2 = collection.iterator();
                        while (it2.hasNext()) {
                            AnonymousClass08R r2 = r53.A00.A02;
                            r2.A01.remove(((C007003k) it2.next()).A02(AnonymousClass02N.class));
                        }
                        r53.A00.A00.post(new RunnableEBaseShape2S0200000_I0_1(r53, collection, 1));
                    }
                }
            }
        }
    }
}
