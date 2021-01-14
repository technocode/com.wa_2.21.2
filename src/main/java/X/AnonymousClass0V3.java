package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0V3  reason: invalid class name */
public abstract class AnonymousClass0V3 {
    public int A00 = -1;
    public boolean A01;
    public final AnonymousClass0SG A02;
    public final /* synthetic */ AbstractC02280Bj A03;

    public AnonymousClass0V3(AbstractC02280Bj r2, AnonymousClass0SG r3) {
        this.A03 = r2;
        this.A02 = r3;
    }

    public void A00(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            AbstractC02280Bj r3 = this.A03;
            int i = r3.A00;
            int i2 = 1;
            boolean z2 = false;
            if (i == 0) {
                z2 = true;
            }
            if (!z) {
                i2 = -1;
            }
            r3.A00 = i + i2;
            if (z2 && z) {
                if (r3 instanceof C08890bv) {
                    C15650oR r1 = ((C08890bv) r3).A05;
                    r1.A06 = true;
                    r1.A05 = false;
                    r1.A02 = false;
                    r1.A02();
                } else if (r3 instanceof AnonymousClass0Yj) {
                    Iterator it = ((AnonymousClass0Yj) r3).A00.iterator();
                    while (true) {
                        AbstractC11200fs r12 = (AbstractC11200fs) it;
                        if (!r12.hasNext()) {
                            break;
                        }
                        ((C08710ba) ((Map.Entry) r12.next()).getValue()).A00();
                    }
                }
            }
            if (r3.A00 == 0 && !this.A01) {
                if (r3 instanceof C08890bv) {
                    C15650oR r13 = ((C08890bv) r3).A05;
                    r13.A06 = false;
                    if (r13 instanceof C59322nS) {
                        r13.A05();
                    } else if (r13 instanceof C59292nP) {
                        r13.A05();
                    } else if (r13 instanceof AnonymousClass27K) {
                        r13.A05();
                    } else if (r13 instanceof AnonymousClass27H) {
                        r13.A05();
                    }
                } else if (r3 instanceof AnonymousClass0Yj) {
                    Iterator it2 = ((AnonymousClass0Yj) r3).A00.iterator();
                    while (true) {
                        AbstractC11200fs r14 = (AbstractC11200fs) it2;
                        if (!r14.hasNext()) {
                            break;
                        }
                        C08710ba r15 = (C08710ba) ((Map.Entry) r14.next()).getValue();
                        r15.A01.A06(r15);
                    }
                }
            }
            if (this.A01) {
                r3.A04(this);
            }
        }
    }
}
