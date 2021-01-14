package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.08P  reason: invalid class name */
public class AnonymousClass08P extends AnonymousClass01E {
    public final /* synthetic */ AnonymousClass01I A00;
    public final /* synthetic */ AnonymousClass01B A01;

    public AnonymousClass08P(AnonymousClass01B r1, AnonymousClass01I r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final int A00(Collection collection) {
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C007003k r2 = (C007003k) it.next();
            if (r2 != null && r2.A0X && r2.A08 != null && !this.A00.A09(r2.A09)) {
                i++;
            }
        }
        return i;
    }
}
