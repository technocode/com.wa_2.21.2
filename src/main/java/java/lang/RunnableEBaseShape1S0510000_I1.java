package java.lang;

import X.AbstractC229813y;
import X.AnonymousClass2FF;
import X.AnonymousClass2XR;
import X.C229513v;
import X.C229613w;
import X.C229713x;
import X.C75133cQ;
import X.C75173cU;
import X.C75193cW;
import java.io.IOException;

public class RunnableEBaseShape1S0510000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public final int A06;

    public RunnableEBaseShape1S0510000_I1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A05 = z;
    }

    public final void run() {
        switch (this.A06) {
            case 0:
                C229513v r0 = (C229513v) this.A00;
                boolean z = this.A05;
                ((AbstractC229813y) this.A01).AH6(r0.A00, r0.A01, (C229613w) this.A02, (C229713x) this.A03, (IOException) this.A04, z);
                return;
            case 1:
                ((AnonymousClass2XR) this.A00).A01((AnonymousClass2FF) this.A01, (C75133cQ) this.A02, (C75173cU) this.A03, (C75193cW) this.A04, this.A05);
                return;
            default:
                return;
        }
    }
}
