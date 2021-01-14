package X;

import android.util.Pair;
import java.util.List;

/* renamed from: X.2Yi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51342Yi implements AnonymousClass0SG {
    public final /* synthetic */ C51362Yk A00;

    public /* synthetic */ C51342Yi(C51362Yk r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        C51362Yk r4 = this.A00;
        Pair pair = (Pair) obj;
        List list = (List) pair.first;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        if (list.isEmpty()) {
            C02270Bi r1 = r4.A04;
            int i = 1;
            if (booleanValue) {
                i = 3;
            }
            r1.A08(Integer.valueOf(i));
        } else {
            r4.A04.A08(2);
        }
        r4.A03.A07(list);
    }
}
