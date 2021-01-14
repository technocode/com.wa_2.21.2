package X;

import android.util.Pair;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.0Da  reason: invalid class name and case insensitive filesystem */
public class C02680Da extends AnonymousClass0DZ {
    public final AnonymousClass09F A00;
    public final AnonymousClass00S A01;
    public final C014408c A02;
    public final C006903j A03;
    public final AnonymousClass01K A04;
    public final AnonymousClass0BB A05;

    public C02680Da(AnonymousClass00S r1, C014408c r2, C006903j r3, AnonymousClass09F r4, AnonymousClass01K r5, AnonymousClass0BB r6, AnonymousClass0DU r7) {
        super(r7);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }

    public final void A06(C52752bh r12, AnonymousClass02N r13) {
        C08560bL A052 = this.A03.A05(r13);
        AnonymousClass0BB r0 = this.A05;
        long j = r12.A04;
        r0.A0B(r13, j);
        if (A052 != null && A052.A0R) {
            A052.A0R = false;
            this.A02.A0C(A052);
            this.A00.A01();
            AnonymousClass0DU r1 = super.A00;
            r1.A0G(r1.A0B(Collections.singleton(new AnonymousClass2bZ(null, r13, false, j, null, false, C28191Tg.A02(this.A04, r13, false)))));
        }
    }

    public final void A07(C52752bh r10, AnonymousClass02N r11) {
        AnonymousClass0BB r6 = this.A05;
        boolean z = r6.A08(r11).A0E;
        boolean z2 = r10.A01;
        if (!z2 && z) {
            r6.A0C(r11, false, 0);
        } else if (z2 && !z) {
            AbstractCollection abstractCollection = (AbstractCollection) r6.A0F();
            if (abstractCollection.size() < 3) {
                A06(r10, r11);
                return;
            }
            Iterator it = abstractCollection.iterator();
            long j = Long.MAX_VALUE;
            AnonymousClass02N r4 = null;
            while (it.hasNext()) {
                AnonymousClass02N r3 = (AnonymousClass02N) it.next();
                long A032 = r6.A03(r3);
                if (A032 < j) {
                    r4 = r3;
                    j = A032;
                }
            }
            Pair pair = new Pair(r4, Long.valueOf(j));
            AnonymousClass02N r5 = (AnonymousClass02N) pair.first;
            if (((Number) pair.second).longValue() < r10.A04) {
                r6.A0C(r5, false, 0);
                A06(r10, r11);
            }
        }
    }
}
