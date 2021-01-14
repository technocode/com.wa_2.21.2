package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1h3  reason: invalid class name and case insensitive filesystem */
public class C33601h3 implements AnonymousClass11B {
    @Override // X.AnonymousClass11B
    public void A2D(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setItemAnimator(((AnonymousClass25I) obj2).A03);
    }

    @Override // X.AnonymousClass11B
    public boolean APd(Object obj, Object obj2, Object obj3, Object obj4) {
        return ((AnonymousClass25I) obj).A03 != ((AnonymousClass25I) obj2).A03;
    }

    @Override // X.AnonymousClass11B
    public void AQj(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setItemAnimator(null);
    }
}
