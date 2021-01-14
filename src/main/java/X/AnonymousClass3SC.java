package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3SC  reason: invalid class name */
public class AnonymousClass3SC extends AnonymousClass0JW {
    public final AnonymousClass0CG A00;
    public final AnonymousClass35U A01;
    public final Set A02;

    public AnonymousClass3SC(AnonymousClass0CG r2, AnonymousClass02N r3, AnonymousClass35U r4) {
        this.A00 = r2;
        HashSet hashSet = new HashSet();
        this.A02 = hashSet;
        hashSet.add(r3);
        this.A01 = r4;
    }

    public AnonymousClass3SC(AnonymousClass0CG r2, Set set, AnonymousClass35U r4) {
        this.A00 = r2;
        this.A02 = new HashSet(set);
        this.A01 = r4;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        boolean z;
        Iterator it = this.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            AnonymousClass02N r1 = (AnonymousClass02N) it.next();
            if (!super.A00.isCancelled()) {
                if (this.A00.A01(r1) > 0) {
                    z = true;
                    break;
                }
            } else {
                return null;
            }
        }
        if (!super.A00.isCancelled()) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && !super.A00.isCancelled()) {
            this.A01.AA1(bool.booleanValue());
        }
    }
}
