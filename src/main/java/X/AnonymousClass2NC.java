package X;

import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2NC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2NC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ RecyclerView A00;

    public /* synthetic */ AnonymousClass2NC(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void onGlobalLayout() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A14.size() != 0) {
            AnonymousClass0VT r1 = recyclerView.A0S;
            if (r1 != null) {
                r1.A0c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView.A0N();
            recyclerView.requestLayout();
        }
    }
}
