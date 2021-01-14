package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1h1  reason: invalid class name */
public class AnonymousClass1h1 implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AbstractC30661bi r0 = ((AnonymousClass25I) obj2).A04;
        if (r0 != null) {
            r0.A02(recyclerView);
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC30661bi r1 = ((AnonymousClass25I) obj).A04;
        AbstractC30661bi r0 = ((AnonymousClass25I) obj2).A04;
        if (r1 != r0) {
            return r1 == null || !r1.equals(r0);
        }
        return false;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        AbstractC30661bi r1 = ((AnonymousClass25I) obj2).A04;
        if (r1 != null) {
            r1.A02(null);
        }
    }
}
