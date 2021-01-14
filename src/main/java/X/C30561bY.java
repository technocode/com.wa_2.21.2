package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1bY  reason: invalid class name and case insensitive filesystem */
public class C30561bY implements AbstractC15930oy {
    public final /* synthetic */ RecyclerView A00;

    public C30561bY(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(int i) {
        RecyclerView recyclerView = this.A00;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.A0g(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
