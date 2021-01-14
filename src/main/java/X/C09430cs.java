package X;

import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* renamed from: X.0cs  reason: invalid class name and case insensitive filesystem */
public class C09430cs implements AbstractC09420cr {
    public final /* synthetic */ FragmentTransitionSupport A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ ArrayList A04;
    public final /* synthetic */ ArrayList A05;
    public final /* synthetic */ ArrayList A06;

    @Override // X.AbstractC09420cr
    public void ALG(AbstractC09350ck r1) {
    }

    @Override // X.AbstractC09420cr
    public void ALH(AbstractC09350ck r1) {
    }

    @Override // X.AbstractC09420cr
    public void ALI(AbstractC09350ck r1) {
    }

    public C09430cs(FragmentTransitionSupport fragmentTransitionSupport, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.A00 = fragmentTransitionSupport;
        this.A01 = obj;
        this.A04 = arrayList;
        this.A02 = obj2;
        this.A05 = arrayList2;
        this.A03 = obj3;
        this.A06 = arrayList3;
    }

    @Override // X.AbstractC09420cr
    public void ALJ(AbstractC09350ck r5) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A0H(obj, this.A04, null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A0H(obj2, this.A05, null);
        }
        Object obj3 = this.A03;
        if (obj3 != null) {
            this.A00.A0H(obj3, this.A06, null);
        }
    }
}
