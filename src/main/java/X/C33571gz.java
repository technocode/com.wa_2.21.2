package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1gz  reason: invalid class name and case insensitive filesystem */
public class C33571gz implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setLayoutManager(new LinearLayoutManager(((AnonymousClass25I) obj2).A01));
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AnonymousClass25I) obj).A01 != ((AnonymousClass25I) obj2).A01;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setLayoutManager(null);
    }
}
