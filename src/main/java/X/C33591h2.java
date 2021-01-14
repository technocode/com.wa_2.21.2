package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.1h2  reason: invalid class name and case insensitive filesystem */
public class C33591h2 implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<AbstractC16380pi> list = ((AnonymousClass25I) obj2).A08;
        if (list != null) {
            for (AbstractC16380pi r0 : list) {
                recyclerView.A0j(r0);
            }
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = ((AnonymousClass25I) obj).A08;
        List list2 = ((AnonymousClass25I) obj2).A08;
        if (list != list2) {
            return list == null || !list.equals(list2);
        }
        return false;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List<AbstractC16380pi> list = ((AnonymousClass25I) obj2).A08;
        if (list != null) {
            for (AbstractC16380pi r0 : list) {
                recyclerView.A0k(r0);
            }
        }
    }
}
