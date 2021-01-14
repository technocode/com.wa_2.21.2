package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3aI  reason: invalid class name and case insensitive filesystem */
public class C74173aI extends AnonymousClass3R1 implements AbstractC662633n {
    public final C662733o A00;
    public final boolean A01;
    public volatile int A02;
    public volatile int A03;
    public volatile List A04 = new ArrayList(0);
    public volatile List A05 = new ArrayList(0);

    public C74173aI(C662733o r3, C03570Gt r4, boolean z) {
        super(r4);
        this.A00 = r3;
        ((AnonymousClass3R1) this).A00 = this;
        this.A01 = z;
    }

    @Override // X.AnonymousClass3R1
    public Void A04(Void... voidArr) {
        C662733o r1 = this.A00;
        C03570Gt r2 = r1.A07;
        this.A03 = ((AbstractCollection) r2.A0E()).size();
        C04230Jo r12 = r1.A04;
        this.A02 = r12.A02().size();
        if (this.A01) {
            this.A04 = r12.A0C();
            this.A05 = r2.A0E();
        }
        super.A04(voidArr);
        return null;
    }

    @Override // X.AbstractC662633n
    public void AIA(AnonymousClass33N r5) {
        C662733o r3 = this.A00;
        HashSet hashSet = r3.A0B;
        String str = r5.A0D;
        hashSet.remove(str);
        if (r3.A03 != null) {
            for (int i = 0; i < r3.A03.size(); i++) {
                if (((AnonymousClass33N) r3.A03.get(i)).A0D.equals(str)) {
                    r3.A03.set(i, r5);
                    r3.A04(r3.A03, null);
                    return;
                }
            }
        }
    }

    @Override // X.AbstractC662633n
    public void AIB(List list) {
        C662733o r3;
        boolean z = true;
        boolean z2 = false;
        if (this.A02 > 0) {
            z2 = true;
        }
        if (this.A03 <= 0) {
            z = false;
        }
        if (z2) {
            r3 = this.A00;
            C662733o.A00(r3, list, "recents");
        } else if (z) {
            r3 = this.A00;
            C662733o.A00(r3, list, "starred");
        } else if (list.size() > 0) {
            r3 = this.A00;
            C662733o.A00(r3, list, ((AnonymousClass33N) list.get(0)).A0D);
        } else {
            r3 = this.A00;
            C662733o.A00(r3, list, null);
        }
        if (this.A01) {
            List list2 = this.A04;
            List list3 = this.A05;
            AbstractC63982xK r1 = r3.A00;
            if (r1 != null) {
                r1.AJt(r3.A01(list2, list3));
            }
        }
    }

    @Override // X.AbstractC662633n
    public void AIC() {
        this.A00.A01 = null;
    }

    @Override // X.AbstractC662633n
    public void AID(String str) {
        C662733o r2 = this.A00;
        r2.A0B.remove(str);
        if (r2.A03 != null) {
            for (int i = 0; i < r2.A03.size(); i++) {
                if (((AnonymousClass33N) r2.A03.get(i)).A0D.equals(str)) {
                    r2.A03.remove(i);
                    r2.A04(r2.A03, null);
                    return;
                }
            }
        }
    }
}
