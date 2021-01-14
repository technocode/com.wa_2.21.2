package X;

import java.util.AbstractCollection;
import java.util.HashSet;

/* renamed from: X.0SV  reason: invalid class name */
public class AnonymousClass0SV implements AnonymousClass0SW {
    public final /* synthetic */ AnonymousClass0LW A00;

    public AnonymousClass0SV(AnonymousClass0LW r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass037 r4, C04080Iy r5) {
        int i;
        if (!r5.A03()) {
            AnonymousClass0LW r2 = this.A00;
            AbstractCollection abstractCollection = (AbstractCollection) r2.A0G.get(r4);
            if (abstractCollection != null && abstractCollection.remove(r5) && abstractCollection.isEmpty()) {
                r2.A0G.remove(r4);
                if (r4.A04 < 3) {
                    r2.A0a(r4);
                    AnonymousClass0O2 r0 = r4.A0C;
                    if (r0 == null) {
                        i = 0;
                    } else {
                        i = r0.A02;
                    }
                    r2.A0d(r4, i);
                }
            }
        }
    }

    public void A01(AnonymousClass037 r4, C04080Iy r5) {
        AnonymousClass0LW r2 = this.A00;
        if (r2.A0G.get(r4) == null) {
            r2.A0G.put(r4, new HashSet());
        }
        ((AbstractCollection) r2.A0G.get(r4)).add(r5);
    }
}
