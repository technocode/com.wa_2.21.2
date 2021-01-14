package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.1h0  reason: invalid class name and case insensitive filesystem */
public class C33581h0 implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AnonymousClass25I) obj2).A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                recyclerView.A0l((AbstractC16450pp) list.get(i));
            }
        }
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = ((AnonymousClass25I) obj).A09;
        List list2 = ((AnonymousClass25I) obj2).A09;
        if (list == list2) {
            return false;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return true;
        }
        return !list.equals(list2);
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AnonymousClass25I) obj2).A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                recyclerView.A0m((AbstractC16450pp) list.get(i));
            }
        }
    }
}
