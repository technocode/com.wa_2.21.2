package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1bd  reason: invalid class name and case insensitive filesystem */
public class C30611bd extends AbstractC16320pc {
    public final /* synthetic */ RecyclerView A00;

    public C30611bd(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A01() {
        RecyclerView recyclerView = this.A00;
        if (!recyclerView.A0i || !recyclerView.A0k) {
            recyclerView.A0c = true;
            recyclerView.requestLayout();
            return;
        }
        recyclerView.postOnAnimation(recyclerView.A13);
    }
}
