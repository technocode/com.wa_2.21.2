package X;

import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.gallerypicker.RecyclerFastScroller;

/* renamed from: X.2o7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C59682o7 implements AbstractC36671mc {
    public final /* synthetic */ RecyclerFastScroller A00;

    public /* synthetic */ C59682o7(RecyclerFastScroller recyclerFastScroller) {
        this.A00 = recyclerFastScroller;
    }

    @Override // X.AnonymousClass1D6
    public final void AI6(AppBarLayout appBarLayout, int i) {
        RecyclerFastScroller recyclerFastScroller = this.A00;
        int i2 = -i;
        if (recyclerFastScroller.A00 != i2) {
            recyclerFastScroller.A01();
            recyclerFastScroller.A00 = i2;
        }
    }
}
